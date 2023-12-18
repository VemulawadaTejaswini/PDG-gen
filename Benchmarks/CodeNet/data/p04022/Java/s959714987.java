import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final long[] ss;
  List<Long> primes;
  Map<Long, Long> primeRootMap;
  
  Solver(int n, long[] ss) {
    this.n = n;
    this.ss = ss;
  }
  
  private boolean isPrime(long v) {
    for (long p : primes) {
      if (v % p == 0) {
        return false;
      }
      if (p * p > v) {
        return true;
      }
    }
    return true;
  }
  
  
  private long normalize(long v) {
    for (long p : primes) {
      long p3 = p * p * p;
      while (v % p3 == 0) {
        v /= p3;
      }
      if (p3 > v) {
        return v;
      }
    }
    return v;
  }
  
  private long calculateOppositve(long v) {
    long opposite = 1;
    for (long p : primes) {
      long p2 = p * p;
      if (v % p2 == 0) {
        opposite *= p;
        v /= p2;
      }
      if (v < p * p * p) {
        break;
      }
    }
    if (primeRootMap.get(v) != null) {
      opposite *= primeRootMap.get(v);
    } else {
      opposite *= v;
      opposite *= v;
    }
    return opposite;
  }
  
  public int solve() {
    primes = new ArrayList<>();
    for (long i = 2; i < 100_000; i++) {
      if (isPrime(i)) {
        primes.add(i);
      }
    }
    
    primeRootMap = new HashMap<>();
    for (long p : primes) {
      primeRootMap.put(p * p, p);
    }
    
    Map<Long, Integer> counters = new HashMap<>();
    for (long s : ss) {
      long normS = normalize(s);
      counters.put(normS, counters.getOrDefault(normS, 0) + 1);
    }
    
    int answer = 0;
    for (Map.Entry<Long, Integer> entry : counters.entrySet()) {
      long s1 = entry.getKey();
      long c1 = entry.getValue();
      if (s1 == 1) {
        answer++;
        continue;
      }
      long s2 = calculateOppositve(s1);
      long c2 = counters.getOrDefault(s2, 0);
      if (c2 == 0) {
        answer += c1;
      } else if (s1 < s2) {
        answer += Math.max(c1, c2);
      }
    }
    
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    long[] ss = reader.nextLong(n);
    out.println(new Solver(n, ss).solve());
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
