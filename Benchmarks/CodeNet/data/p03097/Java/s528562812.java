import java.io.*;
import java.util.*;

class Solver {
  final int n, a, b;
  
  Solver(int n, int a, int b) {
    this.n = n;
    this.a = a;
    this.b = b;
  }
  
  private List<Integer> insert(List<Integer> path, int mask) {
    List<Integer> newPath = new ArrayList<>();
    for (int i = 0; i < path.size(); i += 2) {
      int v1 = path.get(i);
      int v2 = path.get(i + 1);
      newPath.add(v1);
      newPath.add(v1 ^ mask);
      newPath.add(v2 ^ mask);
      newPath.add(v2);
    }
    return newPath;
  }
  
  private List<Integer> buildPath(int a, int b) {
    List<Integer> path = Arrays.asList(a, b);
    for (int i = 0; i < n; i++) {
      int aBit = (a >> i) & 1;
      int bBit = (b >> i) & 1;
      if (aBit != bBit) {
        continue;
      }
      path = insert(path,  1 << i);
    }
    return path;
  }
  
  public List<String> solve() {
    List<Integer> path = buildPath(a, b);
    if (path.size() < (1 << n)) {
      return Arrays.asList("NO");
    }
    StringBuffer sb = new StringBuffer();
    sb.append(path.get(0));
    for (int i = 1; i < path.size(); i++) {
      sb.append(" ");
      sb.append(path.get(i));
    }
    return Arrays.asList("YES", sb.toString());
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int a = reader.nextInt();
    int b = reader.nextInt();
    for (String line : new Solver(n, a, b).solve()) {
      out.println(line);
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
