import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
    private BufferedReader in;
    private StringTokenizer tok;
    private PrintWriter out;

    //------------------------------------------------------------------------------
    public static void main(String[] args) {
        new Main().run();
    }

    private void solve() throws IOException {
        int n = readInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = readInt();
        }
        long ans = smart(n, a);
        out.println(ans);

//        Random rnd = new Random(322);
//        for (int it = 0; it < 10000; it++) {
//            n = 50;
//            a = new int[n];
//            for (int i = 0; i < n; i++) {
//                a[i] = rnd.nextInt(4);
//            }
//            long a1 = smart(n, a);
//            long a2 = stupid(n, a);
//            if (a1 != a2) {
//                throw new AssertionError();
//            }
//        }
//        System.err.println("OK");
    }

    long stupid(int n, int[] a) {
        long ans = 0;
        for (int L = 0; L < n; L++) {
            for (int R = L; R < n; R++) {
                int xor = 0;
                int sum = 0;
                for (int i = L; i <= R; i++) {
                    xor ^= a[i];
                    sum += a[i];
                }
                if (xor == sum) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private long smart(int n, int[] a) {
        List<Integer> notZeroes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                notZeroes.add(i);
            }
        }
//        System.err.println("notZeroes = " + notZeroes);
        long ans = 0;
        for (int L = 0; L < n; L++) {
            int now = a[L];
            int R = L + 1;
//            System.err.println("L = " + L);
            while (true) {
                int index = Collections.binarySearch(notZeroes, R);
                if (index < 0) {
                    index = -index - 1;
                }
                if (index >= notZeroes.size()) {
                    R = n;
                    break;
                }
                R = notZeroes.get(index);
                if ((now & a[R]) != 0) {
                    break;
                }
                now |= a[R];
                R++;
            }
//            System.err.println("  final R = " + R);
            ans += R - L;
        }
        return ans;
    }

    private void run() {
        try {
            initIO();
            solve();
            in.close();
            out.close();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private void initIO() throws IOException {
        try {
            in = new BufferedReader(new FileReader(new File("input.txt")));
            out = new PrintWriter(new File("output.txt"));
        } catch (Exception e) {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }
    }

    private String readString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    @SuppressWarnings("unused")
    private int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    @SuppressWarnings("unused")
    private long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    @SuppressWarnings("unused")
    private double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }
}
