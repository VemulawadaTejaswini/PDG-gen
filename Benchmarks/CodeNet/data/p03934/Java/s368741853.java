import java.io.*;
import java.util.*;

/*
class RangeValueManager {
  TreeMap<Long, Long> 
}
*/

class UpdateRangeGetRangeSegmentTree<T, S> {
  public interface Operator<T, S> {
    T multiplyLazyValue(T lazy, int count);
    T getUnitLazy();
    T mergeLazyValue(T lazy1, T lazy2);
    S apply(S value, T lazy);
    S mergeValue(S smallValue, S largeValue);
    S getUnitValue();
  }
  
  private final Operator<T, S> operator;
  private final int n;
  private final List<T> lazies;
  private final List<S> values;
  
  public UpdateRangeGetRangeSegmentTree(Operator<T, S> operator, S[] initialValues) {
    this.operator = operator;
    
    int tempN = 1;
    while (tempN < initialValues.length) {
      tempN *= 2;
    }
    n = tempN;
    lazies = new ArrayList<>();
    values = new ArrayList<>();
    for (int i = 0; i < 2 * n - 1; i++) {
      lazies.add(this.operator.getUnitLazy());
      values.add(null);
    }
    for (int i = 0; i < initialValues.length; i++) {
      values.set(i + n - 1, initialValues[i]);
    }
    for (int i = initialValues.length; i < n; i++) {
      values.set(i + n - 1, this.operator.getUnitValue());
    }
    for (int i = n - 2; i >= 0; i--) {
      values.set(i, this.operator.mergeValue(values.get(2 * i + 1), values.get(2 * i + 2)));
    }
  }
  
  private void eval(int k, int l, int r) {
    if (lazies.get(k).equals(operator.getUnitLazy())) {
      return;
    }
    values.set(k, operator.apply(values.get(k), operator.multiplyLazyValue(lazies.get(k), r - l)));
    if (r - l > 1) {
      lazies.set(2 * k + 1, operator.mergeLazyValue(lazies.get(2 * k + 1), lazies.get(k)));
      lazies.set(2 * k + 2, operator.mergeLazyValue(lazies.get(2 * k + 2), lazies.get(k)));
    }
    lazies.set(k, operator.getUnitLazy());
  }
  
  private void update(int a, int b, T lazy, int k, int l, int r) {
    eval(k, l, r);
    if (b <= l || r <= a) {
      return;
    }
    if (a <= l && r <= b) {
      lazies.set(k, operator.mergeLazyValue(lazies.get(k), lazy));
      eval(k, l, r);
    } else {
      update(a, b, lazy, 2 * k + 1, l, (l + r) / 2);
      update(a, b, lazy, 2 * k + 2, (l + r) / 2, r);
      values.set(k, operator.mergeValue(values.get(2 * k + 1), values.get(2 * k + 2)));
    }
  }
  
  public void update(int a, int b, T lazy) {
    update(a, b, lazy, 0, 0, n);
  }
  
  private S getRange(int a, int b, int k, int l, int r) {
    if (b <= l || r <= a) {
      return operator.getUnitValue();
    }
    eval(k, l, r);
    if (a <= l && r <= b) {
      return values.get(k);
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
  
  public void dump() {
    for (int i = 0; i < 2 * n - 1; i++) {
      System.err.print(values.get(i));
      System.err.print(" ");
    }
    System.err.println();
    for (int i = 0; i < 2 * n - 1; i++) {
      System.err.print(lazies.get(i));
      System.err.print(" ");
    }
    System.err.println();
  }
}

class Solver {
  private static final UpdateRangeGetRangeSegmentTree.Operator<Long, Long> operator = new UpdateRangeGetRangeSegmentTree.Operator<Long, Long>() {
    private Long zero = Long.valueOf(0);
    private Long inf = Long.valueOf(Long.MAX_VALUE);
    
    public Long mergeValue(Long v1, Long v2) {
      return Math.max(v1, v2);
    }
    
    public Long apply(Long value, Long lazy) {
      return lazy;
    }
    
    public Long getUnitValue() {
      return zero;
    }
    
    public Long mergeLazyValue(Long lazy1, Long lazy2) {
      return lazy2;
    }
    
    public Long multiplyLazyValue(Long lazy, int count) {
      return lazy;
    }
    
    public Long getUnitLazy() {
      return zero;
    }
  };
  
  final int n, q;
  final long[][] abs;
//  UpdateRangeGetRangeSegmentTree<Long, Long> segmentTree;
  TreeMap<Integer, Long> map;
  
  
  Solver(int n, int q, long[][] abs) {
    this.n = n;
    this.q = q;
    this.abs = abs;
  }
  
  private void serve(int aIndex, long b) {
    if (b <= 0) {
      return;
    }
    
    Map.Entry<Integer, Long> floorEntry = map.floorEntry(aIndex);
    long aValue = floorEntry.getValue();
    int minIndex = floorEntry.getKey();
    long nextValue = map.lowerEntry(minIndex).getValue();
    long capacity = (nextValue - aValue) * (aIndex - minIndex + 1);
    if (b >= capacity) {
      map.remove(minIndex);
      if (map.get(aIndex + 1) == null) {
        map.put(aIndex + 1, aValue);
      }
      serve(aIndex, b - capacity);
    } else {
      int mod = (int)(b % (aIndex - minIndex + 1));
      if (mod > 0) {
        map.put(minIndex, b / (aIndex - minIndex + 1) + 1 + aValue);
      }
      map.put(minIndex + mod, b / (aIndex - minIndex + 1) + aValue);
      if (map.get(aIndex + 1) == null && b / (aIndex - minIndex + 1) > 0) {
        map.put(aIndex + 1, aValue);
      }
    }
  }
  
  public List<Long> solve() {
    map = new TreeMap<>();
    map.put(0, 30_000_000_000_000L);
    map.put(1, 0L);
    map.put(n + 1, -1L);
    
    for (long[] ab : abs) {
      serve((int)ab[0], ab[1]);
    }
    List<Long> answers = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      answers.add(map.floorEntry(i).getValue());
    }
    return answers;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int q = reader.nextInt();
    long[][] abs = reader.nextLong(q, 2);
    for (long answer : new Solver(n, q, abs).solve()) {
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
