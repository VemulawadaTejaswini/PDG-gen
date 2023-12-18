import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        // write your code here

        FastScanner sc = new FastScanner();

        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            Integer v = map.get(a[i]);
            if (v == null) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], ++v);
            }
        }

        long sum = 0;

        HashMap<Integer, Long> result = new HashMap<>();

        for (Integer key: map.keySet()
        ) {
            int t = map.get(key);
            if (t < 2) {
                result.put(key, 0L);
                continue;
            }
            long v = nCk(t, 2);
            result.put(key, v);
            sum += v;
        }

        for (int i = 0; i < n; i++) {
            int v = map.get(a[i]);
            if (v == 1) {
                System.out.println(sum);
            } else {
                if (v == 2) {
                    System.out.println(sum - 1);
                } else {
                    long t = nCk(v - 1, 2);
                    System.out.println(sum - result.get(a[i]) + t);
                }
            }
        }
    }

    //return nCk mod M (M must be prime number) O(min(k,n-k)*logM)
    public static long nCk(int n,int k) {
        long ret = 1;
        long bunshi = 1;
        int min = Math.min(k, n-k);
        for(int i=1;i<=min;i++) {
            ret *= i;
        }
        for(int i=n-min+1;i<=n;i++) {
            bunshi *= i;
        }
        return bunshi / ret;
    }

    private static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
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

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
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
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}