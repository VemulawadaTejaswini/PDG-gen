import java.io.*;
import java.util.*;

class Edge implements Comparable<Edge> {
  final int src, dst;
  final long cost;

  Edge(int src, int dst, long cost) {
    this.src = src;
    this.dst = dst;
    this.cost = cost;
  }

  public int compareTo(Edge edge) {
    return Long.compare(this.cost, edge.cost);
  }
}

class Solver {
  final int n;
  final long d;
  final long[] as;

  Solver(int n, long d, long[] as) {
    this.n = n;
    this.d = d;
    this.as = as;
  }

  public long solve() {
    List<Edge> edges = new ArrayList<>();
    {
      int minCostIndex = 0;
      for (int i = 1; i < n; i++) {
        long cost1 = d + as[i - 1] + as[i];
        long cost2 = d * (i - minCostIndex) + as[minCostIndex] + as[i];
        if (cost1 < cost2) {
          minCostIndex = i - 1;
          edges.add(new Edge(i - 1, i, cost1));
        } else {
          edges.add(new Edge(minCostIndex, i, cost2));
        }
      }  
    }
    {
      int minCostIndex = n - 1;
      for (int i = n - 2; i >= 0; i--) {
        long cost1 = d + as[i + 1] + as[i];
        long cost2 = d * (minCostIndex - i) + as[minCostIndex] + as[i];
        if (cost1 < cost2) {
          minCostIndex = i + 1;
          edges.add(new Edge(i + 1, i, cost1));
        } else {
          edges.add(new Edge(minCostIndex, i, cost2));
        }
      }
    }
    Collections.sort(edges);
    UnionFind unionFind = new UnionFind(n);
    long answer = 0;
    for (Edge edge : edges) {
      if (unionFind.sameGroup(edge.src, edge.dst)) {
        continue;
      }
      unionFind.merge(edge.src, edge.dst);
      answer += edge.cost;
    }
    return answer;
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
  
  public void dump() {
    Map<Integer, Set<Integer>> rootToSetMap = new HashMap<>();
    for (int i = 0; i < parents.length; i++) {
      int root = getRoot(i);
      if (rootToSetMap.get(root) == null) {
        rootToSetMap.put(root, new HashSet<>());
      }
      rootToSetMap.get(root).add(i);
    }
    for (Map.Entry<Integer, Set<Integer>> entry : rootToSetMap.entrySet()) {
      System.err.printf("%d: %s\n", entry.getKey(), entry.getValue());
    }
  }
}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    int n = reader.nextInt();
    long d = reader.nextLong();
    long[] as = reader.nextLong(n);
    out.println(new Solver(n, d, as).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    ContestWriter out = new ContestWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestWriter extends PrintWriter {
  ContestWriter(PrintStream printStream) {
    super(printStream);
  }

  public void printList(List<? extends Object> list) {
    for (Object object : list) {
      println(object);
    }
  }

  public void printListOneLine(List<? extends Object> list) {
    List<String> stringList = new ArrayList<>();
    for (Object object : list) {
      stringList.add(object.toString());
    }
    println(String.join(" ", stringList));
  }
}

class ContestReader {
  private static final int BUFFER_SIZE = 1024;
  
  private final InputStream stream;
  private final byte[] buffer;
  private int pointer;
  private int bufferLength;
  
  ContestReader(InputStream stream) {
    this.stream = stream;
    this.buffer = new byte[BUFFER_SIZE];
    this.pointer = 0;
    this.bufferLength = 0;
  }
  
  private boolean hasNextByte() {
    if (pointer < bufferLength) {
      return true;
    }
    
    pointer = 0;
    try {
      bufferLength = stream.read(buffer);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return bufferLength > 0;
  }
  
  private int readByte() {
    if (hasNextByte()) {
      return buffer[pointer++];
    } else {
      return -1;
    }
  }
  
  private static boolean isPrintableChar(int c) {
    return 33 <= c && c <= 126;
  }
  
  public boolean hasNext() {
    while (hasNextByte() && !isPrintableChar(buffer[pointer])) {
      pointer++;
    }
    return hasNextByte();
  }
  
  public String next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    StringBuilder sb = new StringBuilder();
    while(true) {
      int b = readByte();
      if (!isPrintableChar(b)) {
        break;
      }
      sb.appendCodePoint(b);
    }
    return sb.toString();
  }
  
  public String nextLine() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    StringBuilder sb = new StringBuilder();
    while(true) {
      int b = readByte();
      if (!isPrintableChar(b) && b != 0x20) {
        break;
      }
      sb.appendCodePoint(b);
    }
    return sb.toString();
  }
  
  public char nextChar() {
    return next().charAt(0);
  }
  
  public int nextInt() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    
    int n = 0;
    boolean minus = false;
    
    {
      int b = readByte();
      if (b == '-') {
        minus = true;
      } else if ('0' <= b && b <= '9') {
        n = b - '0';
      } else {
        throw new NumberFormatException();
      }
    }
    
    while(true){
      int b = readByte();
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      } else if (b == -1 || !isPrintableChar(b)) {
        return minus ? -n : n;
      } else {
        throw new NumberFormatException();
      }
    }
  }
  
  public long nextLong() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    
    long n = 0;
    boolean minus = false;
    
    {
      int b = readByte();
      if (b == '-') {
        minus = true;
      } else if ('0' <= b && b <= '9') {
        n = b - '0';
      } else {
        throw new NumberFormatException();
      }
    }
    
    while(true){
      int b = readByte();
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      } else if (b == -1 || !isPrintableChar(b)) {
        return minus ? -n : n;
      } else {
        throw new NumberFormatException();
      }
    }
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
  
  public String[] nextLine(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLine();
    }
    return array;
  }
  
  public char[] nextChar(int n) {
    char[] array = new char[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextChar();
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
  
  public String[][] next(int n, int m) {
    String[][] matrix = new String[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = next();
      }
    }
    return matrix;
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
  
  public char[][] nextChar(int n, int m) {
    char[][] matrix = new char[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextChar();
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

class MyAssert {
  public static void myAssert(boolean flag, String message) {
    if (!flag) {
      throw new RuntimeException(message);
    }
  }
 
  public static void myAssert(boolean flag) {
    myAssert(flag, "");
  }
}
