import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {
    static int[] w = new int[100010];
    static int[] v = new int[100010];
    static private long MOD = 1000000007;

    static int calcNumOfCombination(int n, int r) {
        int num = 1;
        for (int i = 1; i <= r; i++) {
            num = num * (n - i + 1) / i;
        }
        return num;
    }

    static long lcm(long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return (long) (c / b);
    }

    static long f(long n, Map<Long, Long> map) {
        if (n < 2)
            return 1;
        else if (map.containsKey(n)) {
            return map.get(n);
        } else {
            map.put(n, n * f(n - 2, map));
            return map.get(n);
        }

    }

    static long factorialUsingRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int a = fs.nextInt();
        int b = fs.nextInt();
        int m = fs.nextInt();
        int[] reizou = new int[a];
        int[] renzi = new int[b];
        int[][] waribiki = new int[m][3];

        for (int i = 0; i < a; i++) {
            reizou[i] = fs.nextInt();
        }
        for (int i = 0; i < b; i++) {
            renzi[i] = fs.nextInt();
        }
        for (int i = 0; i < m; i++) {
            waribiki[i][0] = fs.nextInt();
            waribiki[i][1] = fs.nextInt();
            waribiki[i][2] = fs.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < m; k++) {
                    int hiki = 0;
                    int val=reizou[i] + renzi[j];
                    if (waribiki[k][0] == i+1 && waribiki[k][1] == j+1) {
                        hiki = waribiki[k][2];
                    }
                    min = Math.min(val-hiki, min);
                }
            }
        }
        System.out.println(min);
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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
