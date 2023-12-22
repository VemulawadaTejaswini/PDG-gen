import java.io.*;
import java.util.*;

public class Main {
  private static final int INF = 10_000_000;

  private static final UpdateRangeGetRangeSegmentTree.Operator<Integer, Integer> OPERATOR = new UpdateRangeGetRangeSegmentTree.Operator<>() {
    @Override
    public Integer multiplyLazyValue(Integer lazy, int count) {
      return lazy;
    }

    @Override
    public Integer applyOffset(Integer lazy, int offset) {
      return lazy + offset;
    }

    @Override
    public Integer mergeLazyValue(Integer oldLazy, Integer newLazy) {
      return newLazy;
    }

    @Override
    public Integer apply(Integer value, Integer lazy) {
      return lazy;
    }

    @Override
    public Integer mergeValue(Integer smallIndexValue, Integer largeIndexValue) {
      return Math.min(smallIndexValue, largeIndexValue);
    }

    @Override
    public Integer getUnitValue() {
      return INF;
    }
  };

  private static List<Integer> solve(int h, int w, int[][] abs) {
    Integer[] initialValues = new Integer[w + 1];
    Arrays.fill(initialValues, Integer.valueOf(0));
    initialValues[0] = INF;

    UpdateRangeGetRangeSegmentTree<Integer, Integer> segmentTree = new UpdateRangeGetRangeSegmentTree<>(OPERATOR, initialValues);
    List<Integer> answers = new ArrayList<>();
    for (int i = 0; i < h; i++) {
      int a = abs[i][0];
      int b = abs[i][1];
      int answer = segmentTree.getRange(0, a);
      if (b + 1 < w + 1) {
        answer = Math.min(answer, segmentTree.getRange(b + 1, w + 1));
      }
      if (answer < INF) {
        answers.add(answer + i + 1);
      } else {
        answers.add(-1);
      }
      int v = segmentTree.get(a - 1) - a + 1;
      segmentTree.update(a, b + 1, v);
    }
    return answers;
  }

  private static void execute(ContestReader reader, ContestWriter out) {
    int h = reader.nextInt();
    int w = reader.nextInt();
    int[][] abs = reader.nextInt(h, 2);
    out.printList(solve(h, w, abs));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    ContestWriter out = new ContestWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class UpdateRangeGetRangeSegmentTree<T, S> {
  public interface Operator<T, S> {
    T multiplyLazyValue(T lazy, int count);
    T applyOffset(T lazy, int offset);
    T mergeLazyValue(T oldLazy, T newLazy);
    S apply(S value, T lazy);
    S mergeValue(S smallIndexValue, S largeIndexValue);
    S getUnitValue();
  }
  
  private final Operator<T, S> operator;
  private final int n;
  private final T[] lazies;
  private final S[] values;
  
  public UpdateRangeGetRangeSegmentTree(Operator<T, S> operator, S[] initialValues) {
    this.operator = operator;
    
    int tempN = 1;
    while (tempN < initialValues.length) {
      tempN *= 2;
    }
    n = tempN;
    lazies = createTArray(2 * n -1);
    values = createSArray(2 * n -1);
    for (int i = 0; i < initialValues.length; i++) {
      values[i + n - 1] = initialValues[i];
    }
    for (int i = initialValues.length; i < n; i++) {
      values[i + n - 1] = this.operator.getUnitValue();
    }
    for (int i = n - 2; i >= 0; i--) {
      values[i] = this.operator.mergeValue(values[2 * i + 1], values[2 * i + 2]);
    }
  }

  @SuppressWarnings("unchecked")
  private T[] createTArray(int size) {
    return (T[])(new Object[size]);    
  }
  
  @SuppressWarnings("unchecked")
  private S[] createSArray(int size) {
    return (S[])(new Object[size]);    
  }
  
  private void eval(int k, int l, int r) {
    if (lazies[k] == null) {
      return;
    }
    values[k] = operator.apply(values[k], operator.multiplyLazyValue(lazies[k], r - l));
    if (r - l > 1) {
      lazies[2 * k + 1] = operator.mergeLazyValue(lazies[2 * k + 1], lazies[k]);
      lazies[2 * k + 2] = operator.mergeLazyValue(lazies[2 * k + 2], operator.applyOffset(lazies[k], (r - l) / 2));
    }
    lazies[k] = null;
  }
  
  private void update(int a, int b, T lazy, int k, int l, int r) {
    eval(k, l, r);
    if (b <= l || r <= a) {
      return;
    }
    if (a <= l && r <= b) {
      lazies[k] = operator.mergeLazyValue(lazies[k], lazy);
      eval(k, l, r);
    } else {
      update(a, b, lazy, 2 * k + 1, l, (l + r) / 2);
      update(a, b, operator.applyOffset(lazy, (r - l) / 2), 2 * k + 2, (l + r) / 2, r);
      values[k] = operator.mergeValue(values[2 * k + 1], values[2 * k + 2]);
    }
  }
  
  public void update(int a, int b, T lazy) {
    update(a, b, lazy, 0, 0, n);
  }
  
  public void update(int a, T lazy) {
    update(a, a + 1, lazy);
  }
  
  private S getRange(int a, int b, int k, int l, int r) {
    if (b <= l || r <= a) {
      return operator.getUnitValue();
    }
    eval(k, l, r);
    if (a <= l && r <= b) {
      return values[k];
    }
    S vl = getRange(a, b, 2 * k + 1, l, (l + r) / 2);
    S vr = getRange(a, b, 2 * k + 2, (l + r) / 2, r);
    return operator.mergeValue(vl, vr);
  }
  
  public S getRange(int a, int b) {
    return getRange(a, b, 0, 0, n);
  }
  
  public S get(int a) {
    return getRange(a, a + 1);
  }

  private void dump(Object[] objects) {
    int sum = 0;
    for (int i = 0; sum + (1 << i) <= 2 * n - 1; sum += 1 << i, i++) {
      for (int j = sum; j < sum + (1 << i); j++) {
        System.err.print(objects[j]);
        System.err.print(" ");
      }
      System.err.println();
    }
    System.err.println();
  }
  
  public void dump() {
    System.err.println("values: ");
    dump(values);
    System.err.println("lazies: ");
    dump(lazies);
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
