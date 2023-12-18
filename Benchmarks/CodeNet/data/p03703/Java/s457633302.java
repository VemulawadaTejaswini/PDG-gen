import java.io.*;
import java.util.*;

class SegmentationTree {
  final int n;
  final int[] values;
  
  SegmentationTree(int n) {
    this.n = n;
    this.values = new int[2 * n - 1];
  }
  
  public void increment(int index) {
    index += n - 1;
    while (true) {
      values[index]++;
      if (index == 0) {
        return;
      }
      index = (index - 1) / 2;
    }
  }
  
  private int rangeSum(int b, int k, int l, int r) {
    if (b <= l) {
      return 0;
    }
    if (r <= b) {
      return values[k];
    }
    int vl = rangeSum(b, 2 * k + 1, l, (l + r) / 2);
    int vr = rangeSum(b, 2 * k + 2, (l + r) / 2, r);
    return vl + vr;
  }
  
  public int rangeSum(int b) {
    return rangeSum(b, 0, 0, n);
  }
}

class Solver {
  final int n;
  final long k;
  final long[] as;
  long[] bs;
  long[] sumBs;
  int[] compressedSumBs;
  
  Solver(int n, long k, long[] as) {
    this.n = n;
    this.k = k;
    this.as = as;
  }
  
  public long solve() {
    bs = new long[n];
    for (int i = 0; i < n; i++) {
      bs[i] = as[i] - k;
    }
    
    sumBs = new long[n + 1];
    sumBs[0] = 0;
    for (int i = 1; i <= n; i++) {
      sumBs[i] = sumBs[i-1] + bs[i-1];
    }
    
    Set<Long> valueSet = new HashSet<>();
    for (long v : sumBs) {
      valueSet.add(v);
    }
    List<Long> sortedValueList = new ArrayList<>();
    for (long v : valueSet) {
      sortedValueList.add(v);
    }
    Collections.sort(sortedValueList);
    Map<Long, Integer> compressValueMap = new HashMap<>();
    for (int i = 0; i < sortedValueList.size(); i++) {
      compressValueMap.put(sortedValueList.get(i), i);
    }
    compressedSumBs = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      compressedSumBs[i] = compressValueMap.get(sumBs[i]);
    }
    
    int segmentationTreeSize = 1;
    while (segmentationTreeSize < compressValueMap.size()) {
      segmentationTreeSize *= 2;
    }
    
    SegmentationTree segmentationTree = new SegmentationTree(segmentationTreeSize);
    long answer = 0;
    for (int i = 0; i <= n; i++) {
      answer += segmentationTree.rangeSum(compressedSumBs[i] + 1);
      segmentationTree.increment(compressedSumBs[i]);
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long k = reader.nextLong();
    long[] as = reader.nextLongArray(n);
    out.println(new Solver(n, k, as).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestReader {
  private BufferedReader reader;
  private StringTokenizer tokenizer;
  
  ContestReader(InputStream in) {
    reader = new BufferedReader(new InputStreamReader(in));
  }
  
  public String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }
  
  public int nextInt() {
    return Integer.parseInt(next());
  }
  
  public long nextLong() {
    return Long.parseLong(next());
  }
  
  public double nextDouble() {
    return Double.parseDouble(next());
  }
  
  public String[] nextArray(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
  }
  
  public int[] nextIntArray(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLongArray(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDoubleArray(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public int[][] nextIntMatrix(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLongMatrix(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDoubleMatrix(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
}

class ModCalculator {
  private final long mod;
  
  ModCalculator(long mod) {
    this.mod = mod;
  }
  
  public long add(long a, long b) {
    return (a + b) % mod;
  }
  
  public long mul(long a, long b) {
    return (a * b) % mod;
  }
  
  public long pow(long a, long b) {
    if (b == 0) {
      return 1;
    }
    long v = pow(mul(a, a), b / 2);
    if (b % 2 == 1) {
      return mul(v, a);
    } else {
      return v;
    }
  }
  
  public long inverse(long a) {
    return pow(a, mod - 2);
  }
  
  public long div(long a, long b) {
    return mul(a, inverse(b));
  }
}
 
class ModCombinationCache {
  private final ModCalculator modCalculator;
  private final long[] factorialCache;
  private final long[] factorialInverseCache;
  
  public ModCombinationCache(int n, ModCalculator modCalculator) {
    this.modCalculator = modCalculator;
    factorialCache = new long[n];
    factorialCache[0] = 1;
    for (int i = 1; i < n; i++) {
      factorialCache[i] = modCalculator.mul(factorialCache[i-1], i);
    }
    
    factorialInverseCache = new long[n];
    for (int i = 0; i < n; i++) {
      factorialInverseCache[i] = modCalculator.inverse(factorialCache[i]);
    }
  }
  
  public long getFactorial(int n) {
    return factorialCache[n];
  }
  
  public long getCombination(int n, int k) {
    return modCalculator.mul(factorialCache[n], modCalculator.mul(factorialInverseCache[k], factorialInverseCache[n-k]));
  }
}

class Algorithm {
  private static void swap(Object[] list, int a, int b) {
    Object tmp = list[a];
    list[a] = list[b];
    list[b] = tmp;
  }
  
  public static <T extends Comparable<? super T>> boolean nextPermutation(T[] ts) {
    int rightMostAscendingOrderIndex = ts.length - 2;
    while (rightMostAscendingOrderIndex >= 0 &&
        ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostAscendingOrderIndex + 1]) >= 0) {
      rightMostAscendingOrderIndex--;
    }
    if (rightMostAscendingOrderIndex < 0) {
      return false;
    }
    
    int rightMostGreatorIndex = ts.length - 1;
    while (ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostGreatorIndex]) >= 0) {
      rightMostGreatorIndex--;
    }
    
    swap(ts, rightMostAscendingOrderIndex, rightMostGreatorIndex);
    for (int i = 0; i < (ts.length - rightMostAscendingOrderIndex - 1) / 2; i++) {
      swap(ts, rightMostAscendingOrderIndex + 1 + i, ts.length - 1 - i);
    }
    return true;
  }
  
  public static void shuffle(int[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      int temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void shuffle(long[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      long temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void sort(int[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
  
  public static void sort(long[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
}

class UnionFind {
  int[] parents;
  int[] ranks;

  UnionFind(int n) {
    parents = new int[n];
    ranks = new int[n];

    for (int i = 0; i < n; i++) {
      parents[i] = i;
    }
  }

  public int getRoot(int index) {
    if (parents[index] == index) {
      return index;
    } else {
      parents[index] = getRoot(parents[index]);
      return parents[index];
    }
  }

  public boolean sameGroup(int a, int b) {
    return getRoot(a) == getRoot(b);
  }

  public void merge(int a, int b) {
    int rootA = getRoot(a);
    int rootB = getRoot(b);
    if (rootA == rootB) {
      return;
    }
    if (ranks[rootA] < ranks[rootB]) {
      parents[rootA] = rootB;
    } else if (ranks[rootB] < ranks[rootA]) {
      parents[rootB] = rootA;
    } else {
      parents[rootA] = rootB;
      ranks[rootB]++;
    }
  }
}
