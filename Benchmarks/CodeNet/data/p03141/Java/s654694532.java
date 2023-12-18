import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.InputStream;

import java.io.PrintWriter;

import java.util.Arrays;

@SuppressWarnings("unchecked")
class DishT implements Comparable<DishT> {
    int t;
    int a;
    int pos;

    DishT(int t, int a, int pos) {
        this.t = t;
        this.a = a;
        this.pos = pos;
    }

    // 高橋
    // 降順
    @Override
    public int compareTo(DishT d) {
        int ret = 0;
        if (this.t < d.t) ret = 1;
        else if (d.t < this.t) ret = -1;
        else if (this.a < d.a) ret = 1;
        else if (d.a < this.a) ret = -1;
        return ret;
    }
}

class DishA implements Comparable<DishA> {
    int t;
    int a;
    int pos;

    DishA(int t, int a, int pos) {
        this.t = t;
        this.a = a;
        this.pos = pos;
    }

    // 青木
    // 降順
    @Override
    public int compareTo(DishA d) {
        int ret = 0;
        if (this.a < d.a) ret = 1;
        else if (d.a < this.a) ret = -1;
        else if (this.t < d.t) ret = 1;
        else if (d.t < this.t) ret = -1;
        return ret;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        final int N = nextInt();

        DishT[] T = new DishT[N];
        DishA[] A = new DishA[N];

        for (int i = 0; i < N; i++) {
            int t = nextInt();
            int a = nextInt();
            T[i] = new DishT(t, a, i);
            A[i] = new DishA(t, a, i);
        }

        Arrays.sort(T);
        Arrays.sort(A);

        boolean done[] = new boolean[N];

        int cnt = 0;
        int tidx = 0;
        int aidx = 0;
        long ans = 0;

        while (cnt < N) {
            boolean flg = true;
            while (flg) {
                if (N <= cnt) break;

                if (!done[T[tidx].pos]) {
                    ans += T[tidx].t;
                    done[T[tidx].pos] = true;
                    flg = false;
                    cnt++;
                }

                tidx++;
            }

            flg = true;
            while (flg) {
                if (N <= cnt) break;

                if (!done[A[aidx].pos]) {
                    ans -= T[aidx].a;
                    done[A[aidx].pos] = true;
                    flg = false;
                    cnt++;
                }

                aidx++;
            }
        }

        out.println(ans);

        out.flush();
    }

    // FastScanner start
    static final InputStream in = System.in;
    static final byte[] buffer = new byte[1024];
    static int ptr = 0;
    static int buflen = 0;
    static boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    static int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    static boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    static String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    static long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if(b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    static int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
    static double nextDouble() {
        return Double.parseDouble(next());
    }
    // FastScanner end
}
