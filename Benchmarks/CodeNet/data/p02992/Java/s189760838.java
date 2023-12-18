import java.io.*;
import java.util.*;

class Solver {
  ModCalculator mc;
  final int n;
  final int k;
  
  Solver(int n, int k) {
    this.mc = new ModCalculator(1_000_000_007L);
    this.n = n;
    this.k = k;
  }
  
  public long solve() {
    Set<Integer> pointSet = new HashSet<>();
    for (int i = 1; i * i <= n; i++) {
      pointSet.add(i);
      pointSet.add(n / i);
    }
    List<Integer> pointList = new ArrayList<>();
    pointList.addAll(pointSet);
    Collections.sort(pointList);
    
    int t = pointList.size();
    List<Integer> rangeCount = new ArrayList<>();
    rangeCount.add(pointList.get(0));
    for (int i = 1; i < t; i++) {
      rangeCount.add(pointList.get(i) - pointList.get(i-1));
    }
    TreeMap<Integer, Integer> pointToIndex = new TreeMap<>();
    for (int i = 0; i < t; i++) {
      pointToIndex.put(pointList.get(i), i);
    }
    List<Integer> rangeTarget = new ArrayList<>();
    for (int i = 0; i < t; i++) {
      rangeTarget.add(pointToIndex.get(n / pointList.get(i)));
    }
    long[][] dp = new long[k][t];
    for (int i = 0; i < t; i++) {
      dp[0][i] = rangeCount.get(i);
    }
    
    for (int i = 1; i < k; i++) {
      long[] sum = new long[t];
      sum[0] = dp[i-1][0];
      for (int j = 1; j < t; j++) {
        sum[j] = mc.add(sum[j-1], dp[i-1][j]);
      }
      for (int j = 0; j < t; j++) {
        dp[i][j] = mc.mul(rangeCount.get(j), sum[rangeTarget.get(j)]);
      }
    }
    
    long answer = 0;
    for (int i = 0; i < t; i++) {
      answer = mc.add(answer, dp[k-1][i]);
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int k = reader.nextInt();
    out.println(new Solver(n, k).solve());
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

