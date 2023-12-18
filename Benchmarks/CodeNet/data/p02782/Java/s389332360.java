import java.io.*;
import java.util.*;

class Solver {
  final int r1, c1, r2, c2;
  ModCalculator mc;
  long[] factorialInverseCache, factorialCache;
  
  Solver(int r1, int c1, int r2, int c2) {
    this.r1 = r1;
    this.c1 = c1;
    this.r2 = r2;
    this.c2 = c2;
  }
  
  private long getC(int n, int k) {
    return mc.mul(factorialCache[n], mc.mul(factorialInverseCache[k], factorialInverseCache[n-k]));
  }
  
  public long solve() {
    mc = new ModCalculator(1_000_000_007L);
    
    factorialCache = new long[r2 + c2 + 1];
    factorialInverseCache = new long[r2 + c2 + 1];
    factorialCache[0] = 1;
    factorialInverseCache[0] = 1;
    for (int i = 1; i <= r2 + c2; i++) {
      factorialCache[i] = mc.mul(i, factorialCache[i - 1]);
      factorialInverseCache[i] = mc.inverse(factorialCache[i]);
    }
    
    
    long answer = 0;
    long pathCount = getC(r1 + c1, r1);
    answer = mc.add(answer, pathCount);
    for (int i = r1 + c1 + 1; i <= r2 + c2; i++) {
//      System.err.println(answer);
      
      pathCount = mc.mul(pathCount, 2);
      if (i - r1 <= c2) {
        pathCount = mc.add(pathCount, getC(i - 1, r1 - 1));
      } else {
        pathCount = mc.sub(pathCount, getC(i - 1, c2));
      }
      if (i - c1 <= r2) {
        pathCount = mc.add(pathCount, getC(i - 1, c1 - 1));
      } else {
        pathCount = mc.sub(pathCount, getC(i - 1, r2));
      }
//      System.err.printf("pathCount: %d\n", pathCount);
      
      answer = mc.add(answer, pathCount);
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int r1 = reader.nextInt();
    int c1 = reader.nextInt();
    int r2 = reader.nextInt();
    int c2 = reader.nextInt();
    out.println(new Solver(r1, c1, r2, c2).solve());
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
  
  public String[] next(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
  }
  
  public int[] nextInt(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLong(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDouble(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public char[] nextCharArray() {
    return next().toCharArray();
  }
  
  public int[][] nextInt(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLong(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDouble(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
  
  public char[][] nextCharArray(int n) {
    char[][] matrix = new char[n][];
    for (int i = 0; i < n; i++) {
      matrix[i] = next().toCharArray();
    }
    return matrix;
  }
}

class ModCalculator {
  private final long mod;
//  private final ModCombinationCache modCombinationCache;
  
  ModCalculator(long mod) {
    this.mod = mod;
//    this.modCombinationCache = new ModCombinationCache();
  }
  
  public long add(long a, long b) {
    return (a + b) % mod;
  }
  
  public long sub(long a, long b) {
    return (a - b + mod) % mod;
  }
  
  public long mul(long a, long b) {
    a %= mod;
    b %= mod;
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
  
  /*
  public long getF(int n) {
    return modCombinationCache.getF(n);
  }
  
  public long getP(int n, int r) {
    return modCombinationCache.getP(n, r);
  }
  
  public long getC(int n, int k) {
    return modCombinationCache.getC(n, k);
  }
  
  class ModCombinationCache {
    private final List<Long> factorialCache;
    private final List<Long> factorialInverseCache;
    
    public ModCombinationCache() {
      factorialCache = new ArrayList<>();
      factorialCache.add(1L);
      factorialInverseCache = new ArrayList<>();
      factorialInverseCache.add(1L);
    }
    
    private void resize(int n) {
      for (int i = factorialCache.size() - 1; i < n; i++) {
        long v = mul(factorialCache.get(i), i + 1);
        factorialCache.add(v);
        factorialInverseCache.add(inverse(v));
      }
    }
    
    long getF(int n) {
      resize(n);
      return factorialCache.get(n);
    }
    
    long getP(int n, int r) {
      resize(n);
      return mul(factorialCache.get(n), factorialInverseCache.get(n - r));
    }
    
    long getC(int n, int k) {
      resize(n);
      return mul(factorialCache.get(n), mul(factorialInverseCache.get(k), factorialInverseCache.get(n-k)));
    }
  }
  */
}
