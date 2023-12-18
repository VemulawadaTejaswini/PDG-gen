
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        try {
            //			solveA();
            //			solveB();
//			solveC();
            solveD();
            // solveE();
            // solveF();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }

    }

    private void solveA() {
        int age = 0;

        age = Integer.parseInt(next());
        switch (age) {
            case 1:
                out.println("Hello World");
                break;
            case 2:
                int numA = nextInt();
                int numB = nextInt();
                out.println(numA + numB);
                break;
        }

    }

    private void solveB() {
        int numN = Integer.parseInt(next());
        int numT = Integer.parseInt(next());

        int[][] wk = new int[numN][2];

        for (int i = 0; i < wk.length; i++) {
            for (int j = 0; j < 2; j++) {
                wk[i][j] = nextInt();
            }
        }

        Arrays.sort(wk, (x, y) -> Integer.compare(x[1], y[1]));

        int cnt = 9999999;
        for (int i = 0; i < wk.length; i++) {
            if (wk[i][1] <= numT) {
                cnt = Math.min(wk[i][0], cnt);
            } else {
                break;
            }
        }

        out.println(cnt != 9999999 ? cnt : "TLE");
    }

    private void solveC() {
        int numN = Integer.parseInt(next());

        long[][] wk = new long[numN][3];

        for (int i = 0; i < numN; i++) {
            for (int j = 0; j < 3; j++) {
                wk[i][j] = nextLong();
            }
        }

        int referenceIndex = 0;
        //Hが-のものは0にされてしまっているため、Hが0でないものを基準にする必要がある。
        while (wk[referenceIndex][2] == 0) {
            referenceIndex++;
        }

        long h = -1;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                boolean isRes = true;
                //0でないものを選択しているので、maxが不要
                h = Math.abs(wk[referenceIndex][0] - i) + Math.abs(wk[referenceIndex][1] - j) + wk[referenceIndex][2];
                for (int k = 0; k < numN; k++) {
                    //Hが-のものは0に合わせてあるためmaxを入れないといけない
                    if (wk[k][2] != Math.max(h - Math.abs(wk[k][0] - i) - Math.abs(wk[k][1] - j), 0)) {
                        isRes = false;
                        break;
                    }
                }
                if (isRes) {
                    out.println(i + " " + j + " " + h);
                    return;
                }
            }
        }

    }

    private void solveD() {
        int n = nextInt();
        int m = nextInt();

//        Map<Integer, Integer> map = primeFactorMap(m);
        int gcd = getGcd(m / n, m / n + m % n);
        out.println(gcd);
    }

    private int getGcd(int a, int b) {
        if (b == 0)
            return a;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int mod = max % min;
        return getGcd(min, mod);
    }

    private Map<Integer, Integer> primeFactorMap(int n) {
        final Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        if (n < 2) {
            return map;
        }

        while (n != 1 && n % 2 == 0) {
            map.put(2, map.getOrDefault(2, 0) + 1);
            n >>= 1;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }

        if (n != 1) {
            map.put(n, 1);
        }
        return map;
    }

    private void solveE() {
        int numN = Integer.parseInt(next());

        out.println("");
    }

    private void solveF() {
        int numN = Integer.parseInt(next());

        out.println("");
    }

    private final PrintWriter out = new PrintWriter(System.out);
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

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public int nextInt() {
        return Integer.parseInt(next());
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
}