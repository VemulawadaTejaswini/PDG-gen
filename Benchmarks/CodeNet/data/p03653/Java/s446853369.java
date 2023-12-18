import java.io.InputStream;
import java.io.IOException;
import java.lang.NumberFormatException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    FastScanner fs = new FastScanner();
    final int X = fs.nextInt();
    final int Y = fs.nextInt();
    final int Z = fs.nextInt();
    final int N = X+Y+Z;
    final int A = 0;
    final int B = 1;
    final int C = 2;
    final int[][] D = new int[N][3];
    for (int i=0;i<N;i++) {
      D[i][A] = fs.nextInt();
      D[i][B] = fs.nextInt();
      D[i][C] = fs.nextInt();
    }
    Arrays.sort(D,Comparator.comparingInt(d -> d[A]-d[B]));
    PriorityQueue<Integer> pql = new PriorityQueue<>(Comparator.comparingInt(i -> D[i][B]-D[i][C]));
    PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.comparingInt(i -> D[i][A]-D[i][C]));
    long[] l = new long[N];
    long[] r = new long[N];
    for (int i=0;i<Y;i++) {
      pql.offer(i);
      l[Y-1] += (long)D[i][B];
    }
    for (int k=Y;k<Y+Z;k++) {
      pql.offer(k);
      int i = pql.poll();
      l[k] = l[k-1]-(long)D[i][B]+(long)D[i][C]+(long)D[k][B];
    }
    for (int i=N-1;i>Y+Z-1;i--) {
      pqr.offer(i);
      r[Y+Z] += (long)D[i][A];
    }
    for (int k=Y+Z-1;k>Y-1;k--) {
      pqr.offer(k);
      int i = pqr.poll();
      r[k] = r[k+1]-(long)D[i][A]+(long)D[i][C]+(long)D[k][A];
    }
    long ans = 0L;
    for (int k=Y;k<Y+Z;k++) ans = Math.max(ans,l[k]+r[k+1]);
    System.out.println(ans);
  }
}
class FastScanner {
  private final InputStream ins = System.in;
  private final byte[] buf = new byte[1024];
  private int ptr = 0;
  private int len = 0;
  private boolean hasNextByte() {
    if (ptr < len) return true;
    ptr = 0;
    try {
      len = ins.read(buf);
    } catch (IOException e) {
      e.printStackTrace();
    }
    if (len < 1) return false;
    return true;
  }
  private int read() {
    if (hasNextByte()) {
      return buf[ptr++];
    } else {
      return -1;
    }
  }
  private static boolean isPrintable(int c) {
    return 32 < c && c < 127;
  }
  private void skipUnprintable() {
    while (hasNextByte() && !isPrintable(buf[ptr])) ptr++;
  }
  public boolean hasNext() {
    skipUnprintable();
    return hasNextByte();
  }
  public String nextString() {
    if (!hasNext()) throw new NoSuchElementException();
    StringBuilder sb = new StringBuilder();
    int b = read();
    while (isPrintable(b)) {
      sb.appendCodePoint(b);
      b = read();
    }
    return sb.toString();
  }
  public long nextLong() {
    if (!hasNext()) throw new NoSuchElementException();
    long n = 0L;
    boolean negative = false;
    int b = read();
    if (b == '-') {
      negative = true;
      b = read();
    }
    if (b < '0' || '9' < b) throw new NumberFormatException();
    while (true) {
      if (b == -1 || !isPrintable(b)) return negative ? -n : n;
      if (b < '0' || '9' < b) throw new NumberFormatException();
      n *= 10;
      n += b - '0';
      b = read();
    }
  }
  public int nextInt() {
    if (!hasNext()) throw new NoSuchElementException();
    int n = 0;
    boolean negative = false;
    int b = read();
    if (b == '-') {
      negative = true;
      b = read();
    }
    if (b < '0' || '9' < b) throw new NumberFormatException();
    while (true) {
      if (b == -1 || !isPrintable(b)) return negative ? -n : n;
      if (b < '0' || '9' < b) throw new NumberFormatException();
      n *= 10;
      n += b - '0';
      b = read();
    }
  }
}