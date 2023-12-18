import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TreeSet;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    public static void main(String[] args) throws Exception {
        Field f = System.out.getClass().getDeclaredField("autoFlush");
        f.setAccessible(true);
        f.set(System.out, false);
        execute(System.in, System.out);
    }

    public static void execute(InputStream in, OutputStream out) {
        ExtendedScanner s = new ExtendedScanner(in);
        Out o = new Out(out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] d = sc.ints(a, b);
        boolean ng = false;
        for (int x = 0; x < a; x++) {
            for (int y = 1; y < b - 1; y++) {
                int dy1 = d[x][y] - d[x][y - 1];
                int dy2 = d[x][y + 1] - d[x][y];
                ng |= dy1 < 0 || dy2 < 0 || dy1 < dy2;
            }
        }
        for (int x = 1; x < a - 1; x++) {
            for (int y = 0; y < b; y++) {
                int dx1 = d[x][y] - d[x - 1][y];
                int dx2 = d[x + 1][y] - d[x][y];
                ng |= dx1 < 0 || dx2 < 0 || dx1 < dx2;
            }
        }
        if (ng) {
            out.writeln("Impossible");
            return;
        }
        var planes = new TreeSet<IntPair3>((p1, p2) -> {
            if (p1.fst == p2.fst) {
                if (p1.snd == p2.snd) {
                    return p1.trd - p2.trd;
                } else {
                    return p1.snd - p2.snd;
                }
            } else {
                return p1.fst - p2.fst;
            }
        });
        if (a == 1 && b == 1) {
            planes.add(new IntPair3(0, 0, d[0][0]));
        } else if (a == 1) {
            for (int y = 0; y < b - 1; y++) {
                int x = 0;
                int dy = d[0][y + 1] - d[0][y];
                int c = d[0][y] - (y + 1) * dy;
                ng |= c < 0;
                planes.add(new IntPair3(x, dy, c));
            }
        } else if (b == 1) {
            for (int x = 0; x < a - 1; x++) {
                int dx = d[x + 1][0] - d[x][0];
                int y = 0;
                int c = d[x][0] - (x + 1) * dx;
                ng |= c < 0;
                planes.add(new IntPair3(dx, y, c));
            }
        } else {
            int[] dx8 = new int[]{0, 1, -1, 0, 1, -1, 1, -1};
            int[] dy8 = new int[]{1, 0, 0, -1, 1, -1, -1, 1};
            for (int x = 0; x < a; x++) for (int y = 0; y < b; y++) {
                for (int dr1 = 0; dr1 < 8; dr1++) {
                    int x1 = x + dx8[dr1];
                    int y1 = y + dy8[dr1];
                    if (x1 < 0 || x1 >= a || y1 < 0 || y1 >= b) continue;
                    for (int dr2 = dr1 + 1; dr2 < 8; dr2++) {
                        int x2 = x + dx8[dr2];
                        int y2 = y + dy8[dr2];
                        if (x2 < 0 || x2 >= a || y2 < 0 || y2 >= b) continue;
                        if (x == x1 && x == x2 || y == y1 && y == y2) continue;
                        var p0 = new IntPair3(x + 1, y + 1, d[x][y]);
                        var p1 = new IntPair3(x1 + 1, y1 + 1, d[x1][y1]);
                        var p2 = new IntPair3(x2 + 1, y2 + 1, d[x2][y2]);
                        var p = plane(p0, p1, p2);
                        if (p == null || p.trd < 0) continue;
                        boolean ok = true;
                        for (int xx = 0; xx < a; xx++) for (int yy = 0; yy < b; yy++) {
                            int v = p.fst * (xx + 1) + p.snd * (yy + 1) + p.trd;
                            ok &= v >= d[xx][yy];
                        }
                        if (ok) {
                            planes.add(p);
                        }
                    }
                }
            }
            int[][] min = new int[a][b];
            for (int[] e : min) Arrays.fill(e, 1000);
            for (var p : planes) {
                int cx = p.fst;
                int cy = p.snd;
                int c = p.trd;
                for (int x = 0; x < a; x++) for (int y = 0; y < b; y++) {
                    min[x][y] = Math.min(min[x][y], (x + 1) * cx + (y + 1) * cy + c);
                }
            }
            for (int x = 0; x < a; x++) {
                for (int y = 0; y < b; y++) {
                    if (min[x][y] != d[x][y]) {
                        if (x > 0 && y > 0) {
                            ng = true;
                        } else if (x == 0) {
                            F : for (int t = -1; t <= 1; t += 2) {
                                int x1 = x;
                                int y1 = y + t;
                                if (y1 < 0 || y1 >= b) continue;
                                for (int s = 0; s <= 100; s++) {
                                    int x2 = -1;
                                    int y2 = y;
                                    int c = d[x][y] - s;
                                    var p0 = new IntPair3(x + 1, y + 1, d[x][y]);
                                    var p1 = new IntPair3(x1 + 1, y1 + 1, d[x1][y1]);
                                    var p2 = new IntPair3(x2 + 1, y2 + 1, c);
                                    var p = plane(p0, p1, p2);
                                    if (p == null || p.trd < 0) continue;
                                    boolean ok = true;
                                    for (int xx = 0; xx < a; xx++) for (int yy = 0; yy < b; yy++) {
                                        int v = p.fst * (xx + 1) + p.snd * (yy + 1) + p.trd;
                                        ok &= v >= d[xx][yy];
                                    }
                                    if (ok) {
                                        planes.add(p);
                                        break F;
                                    }
                                }
                            }
                        } else {
                            F : for (int t = -1; t <= 1; t += 2) {
                                int x1 = x + t;
                                int y1 = y;
                                if (x1 < 0 || x1 >= a) continue;
                                for (int s = 0; s <= 100; s++) {
                                    int x2 = x;
                                    int y2 = -1;
                                    int c = d[x][y] - s;
                                    var p0 = new IntPair3(x + 1, y + 1, d[x][y]);
                                    var p1 = new IntPair3(x1 + 1, y1 + 1, d[x1][y1]);
                                    var p2 = new IntPair3(x2 + 1, y2 + 1, c);
                                    var p = plane(p0, p1, p2);
                                    if (p == null || p.trd < 0) continue;
                                    boolean ok = true;
                                    for (int xx = 0; xx < a; xx++) for (int yy = 0; yy < b; yy++) {
                                        int v = p.fst * (xx + 1) + p.snd * (yy + 1) + p.trd;
                                        ok &= v >= d[xx][yy];
                                    }
                                    if (ok) {
                                        planes.add(p);
                                        break F;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ng |= !check(planes, d);
        }
        if (ng) {
            out.writeln("Impossible");
            return;
        }
        var edges = new ArrayList<Edge>();
        int i = 2;
        for (var p : planes) {
            int xe = p.fst;
            int ye = p.snd;
            int ce = p.trd;
            edges.add(new Edge(0, i, ce));
            for (int x = 0; x < xe; x++) {
                edges.add(new Edge(i++, i, "X"));
            }
            for (int y = 0; y < ye; y++) {
                edges.add(new Edge(i++, i, "Y"));
            }
            edges.add(new Edge(i++, 1, 0));
        }
        out.writeln("Possible");
        out.write(i).writeSpace().writeln(edges.size());
        edges.forEach(out::writeln);
        out.write(1).writeSpace().writeln(2);
    }
    public static IntPair3 plane(IntPair3 a, IntPair3 b, IntPair3 c) {
        b.fst -= a.fst; b.snd -= a.snd; b.trd -= a.trd;
        c.fst -= a.fst; c.snd -= a.snd; c.trd -= a.trd;
        var op = outerProduct(b, c);
        int ca = op.fst;
        int cb = op.snd;
        int cc = op.trd;
        int d = -(ca * a.fst + cb * a.snd + cc * a.trd);
        if (cc == 0 || ((ca % cc) | (cb % cc) | (d % cc)) != 0) {
            return null;
        }
        ca /= -cc; cb /= -cc; d /= -cc;
        b.fst += a.fst; b.snd += a.snd; b.trd += a.trd;
        c.fst += a.fst; c.snd += a.snd; c.trd += a.trd;
        var plane = new IntPair3(ca, cb, d);
        return plane;
    }

    public static IntPair3 outerProduct(IntPair3 a, IntPair3 b) {
        int x = a.snd * b.trd - a.trd * b.snd;
        int y = a.trd * b.fst - a.fst * b.trd;
        int z = a.fst * b.snd - a.snd * b.fst;
        return new IntPair3(x, y, z);
    }

    public static boolean check(TreeSet<IntPair3> planes, int[][] d) {
        int a = d.length;
        int b = d[0].length;
        int[][] min = new int[a][b];
        for (int[] e : min) Arrays.fill(e, 1000);
        for (var p : planes) {
            int cx = p.fst;
            int cy = p.snd;
            int c = p.trd;
            for (int x = 0; x < a; x++) for (int y = 0; y < b; y++) {
                min[x][y] = Math.min(min[x][y], (x + 1) * cx + (y + 1) * cy + c);
            }
        }
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                System.err.print(min[x][y] + " ");
            }
            System.err.println();
        }
        for (int x = 0; x < a; x++) for (int y = 0; y < b; y++) {
            if (min[x][y] != d[x][y]) return false;
        }
        return true;
    }
}

class Edge {
    int from;
    int to;
    Object cost;
    Edge(int from, int to, Object cost) {
        this.from = from + 1;
        this.to = to + 1;
        this.cost = cost;
    }
    public String toString() {
        return from + " " + to + " " + cost;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class BasicScanner {
    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public BasicScanner(InputStream in) {this.in = in;}
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buf);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    private StringBuilder nextSequence() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb;
    }
    public char nextChar() {
        return (char) readByte();
    }
    public String next() {
        return nextSequence().toString();
    }
    public String next(int len) {
        return new String(nextChars(len));
    }
    public char[] nextChars() {
        final StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
        if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class Out {
    private final OutputStream out;
    private byte[] buf = new byte[1024];
    private int ptr = 0;
    private static final int AUTO_FLUSH_THRETHOLD = 1 << 17;

    public Out(OutputStream out) {
        this.out = out;
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (IOException e) {e.printStackTrace();}
    }

    public void close() {
        try {out.close();} catch (IOException e) {e.printStackTrace();}
    }

    public Out writeln() {return write('\n');}
    public Out writeln(Object o) {return write(o).write('\n');}
    public Out writeln(String s) {return write(s).write('\n');}
    public Out writeln(char[] c) {return write(c).write('\n');}
    public Out writeln(char   c) {return write(c).write('\n');}
    public Out writeln(byte   b) {return write(b).write('\n');}
    public Out writeln(int    x) {return write(x).write('\n');}
    public Out writeln(long   x) {return write(x).write('\n');}
    public Out writeln(double d) {return write(d).write('\n');}

    public Out writeSpace() {return write(' ');}
    
    public Out write(Object o) {
        return write(o.toString());
    }

    public Out write(String s) {
        try {
            Field strValueField = s.getClass().getDeclaredField("value");
            strValueField.setAccessible(true);
            byte[] b = (byte[]) strValueField.get(s);
            int l = s.length();
            if (l > AUTO_FLUSH_THRETHOLD) {
                flush();
                int i = 0;
                while (i + AUTO_FLUSH_THRETHOLD < l) {
                    out.write(b, i, AUTO_FLUSH_THRETHOLD);
                    out.flush();
                    i += AUTO_FLUSH_THRETHOLD;
                }
                ensureCapacity(l - i);
                System.arraycopy(b, i, buf, 0, l - i);
                ptr = l - i;
            } else {
                ensureCapacity(ptr + l);
                System.arraycopy(b, 0, buf, ptr, l);
                ptr += l;
            }
        } catch (Exception e) {e.printStackTrace();}
        return this;
    }

    public Out write(char[] c) {
        int l = c.length;
        if (l > AUTO_FLUSH_THRETHOLD) {
            flush();
            ensureCapacity(AUTO_FLUSH_THRETHOLD);
            int i = 0;
            while (i + AUTO_FLUSH_THRETHOLD < l) {
                for (int j = 0; j < AUTO_FLUSH_THRETHOLD; j++) {
                    buf[ptr++] = (byte) c[i + j];
                }
                flush();
                i += AUTO_FLUSH_THRETHOLD;
            }
            for (; i < l; i++) {
                buf[ptr++] = (byte) c[i];
            }
        } else {
            ensureCapacity(ptr + l);
            for (char ch : c) buf[ptr++] = (byte) ch;
        }
        return this;
    }

    public Out write(char c) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = (byte) c;
        return this;
    }

    public Out write(byte b) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = b;
        return this;
    }

    public Out write(int x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(long x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(double d) {
        return write(Double.toString(d));
    }

    private void ensureCapacity(int cap) {
        if (cap > AUTO_FLUSH_THRETHOLD) {
            flush();
        }
        if (cap >= buf.length) {
            int newLength = buf.length;
            while (newLength < cap) newLength <<= 1;
            byte[] newBuf = new byte[newLength];
            System.arraycopy(buf, 0, newBuf, 0, buf.length);
            buf = newBuf;
        }
    }
    private static int stringSize(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
    private static int stringSize(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends BasicScanner {
    public ExtendedScanner(InputStream in) {super(in);}
    public int[] ints(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> nextInt());
        return a;
    }
    public int[] ints(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> f.applyAsInt(nextInt()));
        return a;
    }
    public int[][] ints(final int n, final int m) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m));
        return a;
    }
    public int[][] ints(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m, f));
        return a;
    }
    public long[] longs(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> nextLong());
        return a;
    }
    public long[] longs(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> f.applyAsLong(nextLong()));
        return a;
    }
    public long[][] longs(final int n, final int m) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m));
        return a;
    }
    public long[][] longs(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m, f));
        return a;
    }
    public char[][] charArrays(final int n) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars());
        return c;
    }
    public char[][] charArrays(final int n, final int m) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars(m));
        return c;
    }
    public double[] doubles(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, $ -> nextDouble());
        return a;
    }
    public double[][] doubles(final int n, final int m) {
        final double[][] a = new double[n][];
        Arrays.setAll(a, $ -> doubles(m));
        return a;
    }
    public String[] strings(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next());
        return s;
    }
    public String[] strings(final int n, final int m) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next(m));
        return s;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntPair3 {
    public int fst, snd, trd;
    public IntPair3(final int fst, final int snd, final int trd) {this.fst = fst; this.snd = snd; this.trd = trd;}
    @Override @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof IntPair3)) return false;
        final IntPair3 p = (IntPair3) o;
        return this.fst == p.fst && this.snd == p.snd && this.trd == p.trd;
    }
    @Override
    public int hashCode() {return Objects.hash(this.fst, this.snd, this.trd);}
    @Override
    public String toString() {return "(" + this.fst + ", " + this.snd + ", " + this.trd + ")";}
}
