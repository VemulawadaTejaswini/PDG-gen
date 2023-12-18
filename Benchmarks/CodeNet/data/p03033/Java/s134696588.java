import java.io.*;
import java.util.*;

class BlockRange {
  final int blockStartCompressTime;
  final int blockEndCompressTime;
  final int originalX;
  
  BlockRange(int blockStartCompressTime, int blockEndCompressTime, int originalX) {
    this.blockStartCompressTime = blockStartCompressTime;
    this.blockEndCompressTime = blockEndCompressTime;
    this.originalX = originalX;
  }
}

class Solver {
  final int n, q;
  final int[] ss, ts, xs, ds;
  
  Solver(int n, int q, int[] ss, int[] ts, int[] xs, int[] ds) {
    this.n = n;
    this.q = q;
    this.ss = ss;
    this.ts = ts;
    this.xs = xs;
    this.ds = ds;
  }
  
  
  // 座標平面 (t, x)
  // 人は半直線 x = t - Di (t >= Di)
  // 工事は線分 (Si - 0.5, Xi) - (Ti - 0.5, Xi)
  // 人の半直線はどの線分と交わるか？交わった際の t の変域を求めよ、交わらなければ -1
  // 工事と人が交点を持つならば
  // (Si - Xi - 0.5, 0) - (Ti - Xi - 0.5, 0) と (Di, 0) が共有点をもつ
  // [Si - Xi, Ti - Xi)
  
  public int[] solve() {
    Set<Integer> interestedStartTimes = new HashSet<>();
    for (int i = 0; i < n; i++) {
      interestedStartTimes.add(ss[i] - xs[i]);
      interestedStartTimes.add(ts[i] - xs[i] - 1);
    }
    for (int i = 0; i < q; i++) {
      interestedStartTimes.add(ds[i]);
    }
    
    List<Integer> sortedInterestedStartTimes = new ArrayList<>();
    for (int time : interestedStartTimes) {
      sortedInterestedStartTimes.add(time);
    }
    Collections.sort(sortedInterestedStartTimes);
    Map<Integer, Integer> originalTimeToCompressTimeMap = new HashMap<>();
    for (int i = 0; i < sortedInterestedStartTimes.size(); i++) {
      originalTimeToCompressTimeMap.put(sortedInterestedStartTimes.get(i), i);
    }
    
    PriorityQueue<BlockRange> pendingBlockRange = new PriorityQueue<>(new Comparator<BlockRange>(){
      public int compare(BlockRange br1, BlockRange br2) {
        return Integer.compare(br1.blockStartCompressTime, br2.blockStartCompressTime);
      }
    });
    PriorityQueue<BlockRange> woringBlockRange = new PriorityQueue<>(new Comparator<BlockRange>(){
      public int compare(BlockRange br1, BlockRange br2) {
        return Integer.compare(br1.originalX, br2.originalX);
      }
    });
    for (int i = 0; i < n; i++) {
//      System.err.printf("%3d %3d %3d %3d %3d %3d %3d %3d\n", i, ss[i], ts[i], xs[i], ss[i] - xs[i], ts[i] - xs[i] - 1, originalTimeToCompressTimeMap.get(ss[i] - xs[i]), originalTimeToCompressTimeMap.get(ts[i] - xs[i] - 1));
      pendingBlockRange.add(new BlockRange(originalTimeToCompressTimeMap.get(ss[i] - xs[i]), originalTimeToCompressTimeMap.get(ts[i] - xs[i] - 1), xs[i]));
    }
    
    int[] compressTimeToFirstBlockMap = new int[sortedInterestedStartTimes.size()];
    Arrays.fill(compressTimeToFirstBlockMap, -1);
    for (int i = 0; i < sortedInterestedStartTimes.size(); i++) {
      while (!pendingBlockRange.isEmpty() && pendingBlockRange.peek().blockStartCompressTime == i) {
        woringBlockRange.add(pendingBlockRange.poll());
      }
      while (!woringBlockRange.isEmpty() && woringBlockRange.peek().blockEndCompressTime < i) {
        woringBlockRange.poll();
      }
      if (!woringBlockRange.isEmpty()) {
        compressTimeToFirstBlockMap[i] = woringBlockRange.peek().originalX;
      }
//      System.err.printf("%d %d %d\n", i, sortedInterestedStartTimes.get(i), compressTimeToFirstBlockMap[i]);
    }
    
    
    int[] answers = new int[q];
    for (int i = 0; i < q; i++) {
      answers[i] = compressTimeToFirstBlockMap[originalTimeToCompressTimeMap.get(ds[i])];
    }
    return answers;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int q = reader.nextInt();
    int[] ss = new int[n];
    int[] ts = new int[n];
    int[] xs = new int[n];
    for (int i = 0; i < n; i++) {
      ss[i] = reader.nextInt();
      ts[i] = reader.nextInt();
      xs[i] = reader.nextInt();
    }
    int[] ds = new int[q];
    for (int i = 0; i < q; i++) {
      ds[i] = reader.nextInt();
    }
    
    int[] answers = new Solver(n, q, ss, ts, xs, ds).solve();
    for (int answer : answers) {
      out.println(answer);
    }
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
