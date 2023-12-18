import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
  final int cost, bitset;
  
  Node(int cost, int bitset) {
    this.cost = cost;
    this.bitset = bitset;
  }
  
  public int compareTo(Node node) {
    return this.cost - node.cost;
  }
}

class Solver {
  final char[] cs;
  
  Solver(char[] cs) {
    this.cs = cs;
  }
  
  public int solve() {
    int bitset = 0;
    Set<Integer> bitsetSet = new HashSet<>();
    for (int i = 0; i < cs.length; i++) {
      bitset = bitset ^ (1 << (cs[i] - 'a'));
      bitsetSet.add(bitset);
    }
    int goalBitset = bitset;
    if (goalBitset == 0) {
      return 1;
    }
    
    Set<Integer> visited = new HashSet<>();
    PriorityQueue<Node> queue = new PriorityQueue<>();
    queue.add(new Node(0, 0));
    while (!queue.isEmpty()) {
      Node node = queue.poll();
//      System.err.printf("%x, %d\n", node.bitset, node.cost);
      if (node.bitset == goalBitset) {
        return node.cost;
      }
      if (visited.contains(node.bitset)) {
        continue;
      }
      visited.add(node.bitset);
      for (int i = 0; i < 26; i++) {
        int nextBitset = node.bitset ^ (1 << i);
        if (bitsetSet.contains(nextBitset) && !visited.contains(nextBitset)) {
          queue.add(new Node(node.cost + 1, nextBitset));
        }
      }
    }
    
    throw new RuntimeException();
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    char[] cs = reader.nextCharArray();
    out.println(new Solver(cs).solve());
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
