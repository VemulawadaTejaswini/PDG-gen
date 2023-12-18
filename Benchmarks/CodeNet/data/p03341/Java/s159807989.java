import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
        char[] s = readString().toCharArray();
        int[] cntW = new int[n];
        int[] cntE = new int[n];
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                cntW[i] += cntW[i - 1];
                cntE[i] += cntE[i - 1];
            }
            if (s[i] == 'W') {
                cntW[i]++;
            } else {
                cntE[i]++;
            }
        }
//        System.err.println(Arrays.toString(cntE));
//        System.err.println(Arrays.toString(cntW));
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int t = f(cntW, 0, i - 1) + f(cntE, i + 1, n - 1);
//            System.err.println("i = " + i + ", t = " + t);
            min = Math.min(min, t);
        }
        out.println(min);
    }

    private int f(int[] arr, int L, int R) {
        if (L > R) {
            return 0;
        }
        int ans = arr[R];
        if (L > 0) ans -= arr[L - 1];
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
