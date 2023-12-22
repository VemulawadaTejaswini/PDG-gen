import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Main {
    final static long MOD07 = 1_000_000_007;
    final static long MOD09 = 1_000_000_009;

    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = fs.nextInt();
        long K = fs.nextLong() - 1;

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = fs.nextInt();
        }

        List<Integer> result = new ArrayList<>();

        long MAX =  10000000;
        long count = 0;

        int current = 0;
        while (count < MAX) {
            result.add(current);
            int next = A[current] - 1;
            current = next;
            count++;
        }

        int slow = 0;
        int fast = 1;

        int size = result.size();
        while (slow < size && fast < size && result.get(slow) != result.get(fast) && slow < MAX) {
            slow++;
            fast += 2;
        }

        if (K < slow || slow == size) {
            System.out.println(result.get((int) K) + 1);
            return;
        }

        int length = fast - slow;
        K -= slow;

        int res = (int) (K % length);
        out.println(result.get(res) + 1);

        out.flush();
    }

    static void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    // Execute func for all patterns can be represented with n bit.
    // O(n2^n)
    static void forAllBit(int n, Consumer<List<Boolean>> func) {
        for (int i = 0; i < (1 << n); i++) {
            List<Boolean> arg = new ArrayList();
            for (int j = 0; j < n; j++) {
                boolean isJthBitSet = ((i >> j) & 1) == 1;
                arg.add(isJthBitSet);
            }

            func.accept(arg);
        }
    }

    static class Pair<F extends Comparable<F>, S extends Comparable<S>> implements Comparable<Pair<F, S>> {
        F f;
        S s;

        Pair() {
        }

        Pair(F f, S s) {
            this.f = f;
            this.s = s;
        }

        Pair(Pair<F, S> p) {
            f = p.f;
            s = p.s;
        }

        @Override
        public int compareTo(Pair<F, S> p) {
            if (f.compareTo(p.f) != 0) {
                return f.compareTo(p.f);
            }
            return s.compareTo(p.s);
        }

        @Override
        public int hashCode() {
            return f.hashCode() ^ s.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.f == null || this.s == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            Pair p = (Pair) o;
            return this.f.equals(p.f) && this.s.equals(p.s);
        }

        @Override
        public String toString() {
            return "{" + f.toString() + ", " + s.toString() + "}";
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= ((int) Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void reverse(long[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            long temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static boolean isPrime(long n) {
        for (long i = 2; i <= ((long) Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }

    public static Map<Long, Long> primeFactor(long n) {
        Map<Long, Long> map = new HashMap<>();
        long num = n;
        for (long i = 2; i <= ((long) Math.sqrt(n)); i++) {
            while (num % i == 0L) {
                map.put(i, map.getOrDefault(i, 0L) + 1L);
                num /= i;
            }
        }
        if (num != 1) {
            map.put(num, 1L);
        }

        return map;
    }

    public static List<Long> divisors(long n) {
        List<Long> list = new ArrayList<>();
        for (long i = 1; i <= ((long) Math.sqrt(n)); i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        return list;
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}


class FastScanner {
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

    private boolean isPrintableChar(int c) {
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
