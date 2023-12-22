import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class Main {

    private static final long MOD = 1000000007;

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            _Scanner sc = new _Scanner(in);
            
            // 21:56-
            
            Map<X, Integer> map = new LinkedHashMap<>();
            List<X> list = new ArrayList<>();
            int n = sc.nextInt();
            long ans = 0L;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a == 0 && b == 0) {
                    ans++;
                    continue;
                }
                int gcm = gcd(a, b);
                X x = new X((int) Math.signum(a * b), Math.abs(a / gcm), Math.abs(b / gcm));
                if (x.a == 0) x.sig = 1;
                if (x.b == 0) x.sig = -1;
                list.add(x);
                map.merge(x, 1, Integer::sum);
            }

            long[] pows = new long[n + 1];
            pows[0] = 1;
            for (int i = 1; i < pows.length; i++) pows[i] = (pows[i - 1] * 2) % MOD;

            long total = 1;
            for (X x : list) {
                int a = map.getOrDefault(x, 0);
                int b = map.getOrDefault(new X(-x.sig, x.b, x.a), 0);
                map.put(x, 0);
                map.put(new X(-x.sig, x.b, x.a), 0);

                total = (total * (pows[a] + pows[b] - 1)) % MOD;
            }

            total = (MOD + total - 1) % MOD;
            total = (total + ans) % MOD;

            out.println(total);
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    private static class X {
    	int sig, a, b;

        public X(int sig, int a, int b) {
            this.sig = sig;
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            X x = (X) o;
            return sig == x.sig &&
                    a == x.a &&
                    b == x.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(sig, a, b);
        }

        @Override
        public String toString() {
            return "X{" +
                    "sig=" + sig +
                    ", a=" + a +
                    ", b=" + b +
                    '}';
        }
    }

    

    private static void reverse(int[] vs) {
        for (int i = 0; i < vs.length / 2; i++) {
            swap(vs, i, vs.length - 1 - i);
        }
    }

    static class _Scanner {
        InputStream is;
        _Scanner(InputStream is) {
            this.is = is;
        }
        byte[] bb = new byte[1 << 15];
        int k, l;
        byte getc() {
            try {
                if (k >= l) {
                    k = 0;
                    l = is.read(bb);
                    if (l < 0) return -1;
                }
                return bb[k++];
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        byte skip() {
            byte b;
            while ((b = getc()) <= 32)
                ;
            return b;
        }

        int nextInt() {
            int n = 0;
            int sig = 1;
            for (byte b = skip(); b > 32; b = getc()) {
                if (b == '-') {
                    sig = -1;
                } else {
                    n = n * 10 + b - '0';
                }
            }
            return sig * n;
        }

        long nextLong() {
            long n = 0;
            long sig = 1;
            for (byte b = skip(); b > 32; b = getc()) {
                if (b == '-') {
                    sig = -1;
                } else {
                    n = n * 10 + b - '0';
                }
            }
            return sig * n;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();
            for (int b = skip(); b > 32; b = getc()) {
                sb.append(((char) b));
            }
            return sb.toString();
        }
    }

    private static void shuffle(int[] ar) {
        Random rnd = new Random();
        for (int i = 0; i < ar.length; i++) {
            int j = i + rnd.nextInt(ar.length - i);
            swap(ar, i, j);
        }
    }

    private static void shuffle(Object[] ar) {
        Random rnd = new Random();
        for (int i = 0; i < ar.length; i++) {
            int j = i + rnd.nextInt(ar.length - i);
            swap(ar, i, j);
        }
    }

    private static void swap(int[] ar, int i, int j) {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }

    private static void swap(Object[] ar, int i, int j) {
        Object t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }


}
