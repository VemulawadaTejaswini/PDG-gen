import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
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
        long a = readLong();
        long b = readLong();
        long c = readLong();
        int x = readInt();
        int y = readInt();
        long ans = Long.MAX_VALUE;
        for (int cntC = 0; cntC <= 4 * (x + y); cntC++) {
            int cntA = Math.max(0, x - cntC / 2);
            int cntB = Math.max(0, y - cntC / 2);
            ans = Math.min(ans, cntC * c + cntA * a + cntB * b);
        }
        out.println(ans);
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
