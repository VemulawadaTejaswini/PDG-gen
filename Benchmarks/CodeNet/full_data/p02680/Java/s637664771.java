import java.io.*;
import java.util.*;

class Line {
  final int min, max, v;

  Line(int min, int max, int v) {
    this.min = min;
    this.max = max;
    this.v = v;
  }
}

class Range implements Comparable<Range> {
  final int min, max;

  Range(int min, int max) {
    this.min = min;
    this.max = max;
  }

  public int compareTo(Range range) {
    return this.min - range.min;
  }
}

class Solver {
  final int n, m;
  final int[][] abcs, defs;

  List<Integer> xList, yList;
  Map<Integer, Integer> xMap, yMap;
  boolean[][] xBlockers, yBlockers;
  boolean[][] visited;

  Solver(int n, int m, int[][] abcs, int[][] defs) {
    this.n = n;
    this.m = m;
    this.abcs = abcs;
    this.defs = defs;
  }

  private long dfsWithStack(int startXIndex, int startYIndex) {
    long areaSum = 0;
    Deque<Integer> xIndexStack = new ArrayDeque<>();
    Deque<Integer> yIndexStack = new ArrayDeque<>();
    xIndexStack.addLast(startXIndex);
    yIndexStack.addLast(startYIndex);
    while (!xIndexStack.isEmpty()) {
      int xIndex = xIndexStack.pollLast();
      int yIndex = yIndexStack.pollLast();
      if (xIndex < 0 || xIndex >= xList.size() - 1 || yIndex < 0 || yIndex >= yList.size() - 1) {
        return -1;
      }
      if (visited[xIndex][yIndex]) {
        continue;
      }
      visited[xIndex][yIndex] = true;
      long xMax = xList.get(xIndex + 1);
      long xMin = xList.get(xIndex);
      long yMax = yList.get(yIndex + 1);
      long yMin = yList.get(yIndex);
      areaSum += (xMax - xMin) * (yMax - yMin);
      if (!xBlockers[xIndex][yIndex]) {
        xIndexStack.addLast(xIndex - 1);
        yIndexStack.addLast(yIndex);
      }
      if (!xBlockers[xIndex + 1][yIndex]) {
        xIndexStack.addLast(xIndex + 1);
        yIndexStack.addLast(yIndex);
      }
      if (!yBlockers[xIndex][yIndex]) {
        xIndexStack.addLast(xIndex);
        yIndexStack.addLast(yIndex - 1);
      }
      if (!yBlockers[xIndex][yIndex + 1]) {
        xIndexStack.addLast(xIndex);
        yIndexStack.addLast(yIndex + 1);
      }
    }
    return areaSum;
  }

  private long dfs(int xIndex, int yIndex) {
    if (xIndex < 0 || xIndex >= xList.size() - 1 || yIndex < 0 || yIndex >= yList.size() - 1) {
      return -1;
    }
    if (visited[xIndex][yIndex]) {
      return 0;
    }
    visited[xIndex][yIndex] = true;
    long xMax = xList.get(xIndex + 1);
    long xMin = xList.get(xIndex);
    long yMax = yList.get(yIndex + 1);
    long yMin = yList.get(yIndex);
    long area = (xMax - xMin) * (yMax - yMin);
    if (!xBlockers[xIndex][yIndex]) {
      long v = dfs(xIndex - 1, yIndex);
      if (v < 0) {
        return v;
      }
      area += v;
    }
    if (!xBlockers[xIndex + 1][yIndex]) {
      long v = dfs(xIndex + 1, yIndex);
      if (v < 0) {
        return v;
      }
      area += v;
    }
    if (!yBlockers[xIndex][yIndex]) {
      long v = dfs(xIndex, yIndex - 1);
      if (v < 0) {
        return v;
      }
      area += v;
    }
    if (!yBlockers[xIndex][yIndex + 1]) {
      long v = dfs(xIndex, yIndex + 1);
      if (v < 0) {
        return v;
      }
      area += v;
    }
    return area;
  }

  public String solve() {
    if (n < 2 || m < 2) {
      return "INF";
    }
    Set<Integer> xSet = new HashSet<>();
    Set<Integer> ySet = new HashSet<>();
    for (int[] abc : abcs) {
      int a = abc[0];
      int b = abc[1];
      int c = abc[2];
      xSet.add(a);
      xSet.add(b);
      ySet.add(c);
    }
    for (int[] def : defs) {
      int d = def[0];
      int e = def[1];
      int f = def[2];
      xSet.add(d);
      ySet.add(e);
      ySet.add(f);
    }
    xList = new ArrayList<>();
    yList = new ArrayList<>();
    xList.addAll(xSet);
    yList.addAll(ySet);
    xSet = null;
    ySet = null;
    Collections.sort(xList);
    Collections.sort(yList);
    xMap = new HashMap<>();
    yMap = new HashMap<>();
    for (int i = 0; i < xList.size(); i++) {
      xMap.put(xList.get(i), i);
    }
    for (int i = 0; i < yList.size(); i++) {
      yMap.put(yList.get(i), i);
    }

    List<List<Range>> xRangeMatrix = new ArrayList<>();
    for (int i = 0; i < xList.size(); i++) {
      xRangeMatrix.add(new ArrayList<>());
    }
    List<List<Range>> yRangeMatrix = new ArrayList<>();
    for (int i = 0; i < yList.size(); i++) {
      yRangeMatrix.add(new ArrayList<>());
    }
    for (int[] def : defs) {
      int d = def[0];
      int e = def[1];
      int f = def[2];
      xRangeMatrix.get(xMap.get(d)).add(new Range(yMap.get(e), yMap.get(f)));
    }
    for (int[] abc : abcs) {
      int a = abc[0];
      int b = abc[1];
      int c = abc[2];
      yRangeMatrix.get(yMap.get(c)).add(new Range(xMap.get(a), xMap.get(b)));
    }
    xBlockers = new boolean[xList.size()][yList.size() - 1];
    for (int i = 0; i < xRangeMatrix.size(); i++) {
      Collections.sort(xRangeMatrix.get(i));
      int maxBlockedIndex = -1;
      for (Range range : xRangeMatrix.get(i)) {
        for (int j = Math.max(maxBlockedIndex, range.min); j < range.max; j++) {
          xBlockers[i][j] = true;
          maxBlockedIndex = j;
        }
      }
    }
    yBlockers = new boolean[xList.size() - 1][yList.size()];
    for (int i = 0; i < yRangeMatrix.size(); i++) {
      Collections.sort(yRangeMatrix.get(i));
      int maxBlockedIndex = -1;
      for (Range range : yRangeMatrix.get(i)) {
        for (int j = Math.max(maxBlockedIndex, range.min); j < range.max; j++) {
          yBlockers[j][i] = true;
          maxBlockedIndex = j;
        }
      }
    }

    int startXIndex = -1;
    for (int i = 1; i < xList.size(); i++) {
      if (xList.get(i - 1) < 0 && 0 <= xList.get(i)) {
        startXIndex = i - 1;
        break;
      }
    }
    if (startXIndex < 0) {
      return "INF";
    }

    int startYIndex = -1;
    for (int i = 1; i < yList.size(); i++) {
      if (yList.get(i - 1) < 0 && 0 <= yList.get(i)) {
        startYIndex = i - 1;
        break;
      }
    }
    if (startYIndex < 0) {
      return "INF";
    }

    visited = new boolean[xList.size() - 1][yList.size() - 1];
//    long answer = dfs(startXIndex, startYIndex);
    long answer = dfsWithStack(startXIndex, startYIndex);
    if (answer < 0) {
      return "INF";
    }
    return Long.toString(answer);
  }
}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int[][] abcs = reader.nextInt(n, 3);
    int[][] defs = reader.nextInt(m, 3);
    out.println(new Solver(n, m, abcs, defs).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    ContestWriter out = new ContestWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ContestWriter extends PrintWriter {
  ContestWriter(PrintStream printeStream) {
    super(printeStream);
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
