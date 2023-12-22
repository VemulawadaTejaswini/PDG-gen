import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.InputStream;
import java.util.Comparator;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/main/java/E7";

    FastScanner in;
    PrintWriter out;

    final int MOD = 1000000007;
    final ModLib ml = new ModLib(MOD);

    public void solve() {
        int N = in.nextInt();
        int K = in.nextInt();
        Long[] a = new Long[N];
        boolean allMinus = true;
        for (int i = 0; i < N; i++) {
            a[i] = in.nextLong();
            allMinus &= a[i] < 0;
        }
        Arrays.sort(a, Comparator.comparingLong(l -> -Math.abs(l)));
        long res = 1;
        if (allMinus) {
            for (int i = 0; i < K; i++) {
                if (K % 2 == 0) {
                    res = ml.mult(res, ml.add(a[i], MOD));
                } else {
                    res = ml.mult(res, ml.add(a[N - i - 1], MOD));
                }
            }
            System.out.println(res);
            return;
        }

        int minus = 0;
        long minMinus = 0;
        long minPlus = 0;
        for (int i = 0; i < K; i++) {
            res = ml.mult(res, ml.add(a[i], MOD));
            if (a[i] == 0) {
                System.out.println("0");
                return;
            }
            if (a[i] < 0) {
                minus++;
                minMinus = ml.add(a[i], MOD);
            } else {
                minPlus = a[i];
            }
        }
        if (minus % 2 == 0) {
            System.out.println(res);
            return;
        }

        long maxMinus = 0;
        long maxPlus = 0;
        boolean hasZero = false;
        for (int i = K; i < N; i++) {
            if (a[i] == 0) {
                hasZero = true;
            } else if (a[i] < 0 && maxMinus == 0) {
                maxMinus = ml.add(a[i], MOD);
            } else if (a[i] > 0 && maxPlus == 0){
                maxPlus = a[i];
            }
        }
        if (maxMinus == 0 && maxPlus == 0) {
            System.out.println(hasZero ? "0" : res);
        } else if (maxMinus == 0) {
            System.out.println(ml.mult(res, ml.div(maxPlus, minMinus)));
        } else if (maxPlus == 0) {
            System.out.println(ml.mult(res, ml.div(maxMinus, minPlus)));
        } else {
            if ((maxMinus - MOD) * (minMinus - MOD) >= maxPlus * minPlus) {
                System.out.println(ml.mult(res, ml.div(maxMinus, minPlus)));
            } else {
                System.out.println(ml.mult(res, ml.div(maxPlus, minMinus)));
            }
        }
    }


    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }
}

class ModCombination {
    private final ModLib modLib;

    private final long[] fact;
    private final long[] invfact;

    private ModCombination(ModLib modLib, long[] fact, long[] invfact) {
        this.modLib = modLib;
        this.fact = fact;
        this.invfact = invfact;
    }

    public static ModCombination create(int size, ModLib modLib) {
        long[] fact = new long[size];
        fact[0] = 1;
        for (int i = 0; i < size - 1; i++) {
            fact[i+1] = modLib.mult(fact[i], i + 1);
        }
        long[] invfact = new long[size];
        invfact[size-1] = modLib.div(1, fact[size-1]);
        for (int i = size - 2; i >= 0; i--) {
            invfact[i] = modLib.mult(invfact[i+1], i + 1);
        }
        return new ModCombination(modLib, fact, invfact);
    }

    public long fact(int x) {
        return fact[x];
    }

    public long invfact(int x) {
        return invfact[x];
    }

    public long permutation(int a, int b) {
        if (b > a) {
            return 0;
        }
        return modLib.mult(fact[a], invfact[a-b]);
    }

    public long comb(int a, int b) {
        if (b > a) {
            return 0;
        }
        return modLib.mult(fact[a], modLib.mult(invfact[b], invfact[a-b]));
    }
}

class ModLib {
    final long mod;

    public ModLib(long mod) {
        this.mod = mod;
    }

    public long add(long a, long b) {
        return (a + b) % mod;
    }

    public long sub(long a, long b) {
        return (a - b + mod) % mod;
    }

    public long mult(long a, long b) {
        return ((a % mod) * (b % mod)) % mod;
    }

    public long pow(long a, long x) {
        long res = 1;
        for ( ; x > 0; x >>= 1) {
            if (x % 2 == 1) res = mult(res, a);
            a = mult(a, a);
        }

        return res;
    }

    public long div(long a, long b) {
        return mult(a, pow(b, mod - 2));
    }
}


class FastScanner {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream) {
        this.stream = stream;
        // stream = new FileInputStream(new File("dec.in"));
    }

    int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    public int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    public long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    public double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    public String next() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    public String nextLine() {
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndline(c));
        return res.toString();
    }

    public int[][] nextPackedIntArrays(int packN, int size) {
        int[][] res = new int[packN][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < packN; j++) {
                res[j][i] = nextInt();
            }
        }
        return res;
    }
}
