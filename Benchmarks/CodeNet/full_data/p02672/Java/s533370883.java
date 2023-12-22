import java.io.*;
import java.util.*;

class Main {
  private static void run(Judge judge, boolean wrapper) {
    judge = wrapper ? new JudgeWrapper(judge) : judge;
    Solver solver = new Solver(judge);
    solver.run();
  }
 
  private static void runOnline(boolean wrapper) {
    run(new OnlineJudge(), wrapper);
  }
 
  private static void runOffline(boolean wrapper) { 
    // TODO: Set problem instance secret.
    OfflineJudge judge = new OfflineJudge("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
    run(judge, wrapper);
  }
 
  public static void main(String[] args) {
    // Switch OnlineJudge, OfflineJudge
    runOffline(true);
//    runOnline(false);
  }
}

class Candidate implements Comparable<Candidate> {
  final int charIndex;
  final int count;

  Candidate(int charIndex, int count) {
    this.charIndex = charIndex;
    this.count = count;
  }
  
  public int compareTo(Candidate candidate) {
    return this.count - candidate.count;
  }
}

class Solver {
  private static final int MAX_LENGTH = 128;
  private static final String ALPHABETS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

  final Judge judge;
  int totalLength;

  Solver(Judge judge) {
    this.judge = judge;
  }

  private int putQuery(String password) {
    judge.putQuery("? " + password);
    return Integer.parseInt(judge.next());
  }

  private String merge(String s1, String s2) {
    String merged = "";
    while (s1.length() > 0 && s2.length() > 0) {
      String password = merged + s1.charAt(0) + s2;
      int editDistance = putQuery(password);
      if (editDistance + password.length() == totalLength) {
        merged += s1.charAt(0);
        s1 = s1.substring(1);
      } else {
        merged += s2.charAt(0);
        s2 = s2.substring(1);
      }
    }
    return merged + s1 + s2;
  }

  public void run() {
    totalLength = 0;
    Comparator<String> shortStringFirstComparator = new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s1.length() - s2.length();
      }
    };
    PriorityQueue<String> queue = new PriorityQueue<>(shortStringFirstComparator);
    for (int i = 0; i < ALPHABETS.length(); i++) {
      String s = ALPHABETS.substring(i, i + 1);
      int count = MAX_LENGTH - putQuery(s.repeat(MAX_LENGTH));
      if (count > 0) {
        totalLength += count;
        queue.add(s.repeat(count));
      }
    }
    while (queue.size() >= 2) {
      queue.add(merge(queue.poll(), queue.poll()));
    }
    judge.putQuery("! " + queue.poll());
  }
}

class OfflineJudge implements Judge {
  private final char[] secretCharArray;
  private final String secretString;
  private final Deque<String> deque;
  int count = 0;

  public OfflineJudge(String secret) {
    secretString = secret;
    secretCharArray = secret.toCharArray();
    deque = new ArrayDeque<>();
  }

  @Override
  public String next() {
    return deque.pollFirst();
  }

  private int calculateEditDistance(char[] cs) {
    int[][] dptable = new int[cs.length + 1][secretCharArray.length + 1];
    for (int i = 0; i <= cs.length; i++) {
      dptable[i][0] = i;
    }
    for (int j = 0; j <= secretCharArray.length; j++) {
      dptable[0][j] = j;
    }
    for (int i = 1; i <= cs.length; i++) {
      for (int j = 1; j <= secretCharArray.length; j++) {
        int v = dptable[i - 1][j] + 1;
        v = Math.min(v, dptable[i][j - 1] + 1);
        if (cs[i - 1] == secretCharArray[j - 1]) {
          v = Math.min(v, dptable[i - 1][j - 1]);
        } else {
          v = Math.min(v, dptable[i - 1][j - 1] + 1);
        }
        dptable[i][j] = v;
      }
    }
    return dptable[cs.length][secretCharArray.length];
  }

  @Override
  public void putQuery(String query) {
    String[] tokens = query.split(" ");
    if (tokens[0].equals("!")) {
      if (tokens[1].equals(secretString)) {
        System.err.println("AC");
      } else {
        System.err.println("WA");
      }
    } else {
      if (count >= 850) {
        throw new RuntimeException();
      }
      count++;
      char[] cs = tokens[1].toCharArray();
      deque.addLast("" + calculateEditDistance(cs));
    }
  }
}

interface Judge {
  String next();
  void putQuery(String query);
}

class JudgeWrapper implements Judge {
  Judge judge;
  
  JudgeWrapper(Judge judge) {
    this.judge = judge;
  }
  
  @Override
  public void putQuery(String query) {
    System.err.println("Query: " + query);
    judge.putQuery(query);
  }

  @Override
  public String next() {
    String judgeResponse = judge.next();
    System.err.println("Judge: " + judgeResponse);
    return judgeResponse;
  }
}

class OnlineJudge implements Judge {
  final ContestReader reader;
  
  OnlineJudge() {
    reader = new ContestReader(System.in);
  }

  @Override
  public String next() {
    return reader.next();
  }

  @Override
  public void putQuery(String query) {
    System.out.println(query);
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
