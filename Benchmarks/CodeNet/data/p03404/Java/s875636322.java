import java.awt.*;
import java.lang.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {
    public void solve() throws IOException {
        int a = nextInt(), b = nextInt();
        char ans[][] = new char[2][Math.max(a, b) * 2];
        int n = ans[0].length;

        if (a <= b) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    ans[0][i] = '.';
                    ans[1][i] = '.';
                } else {
                    ans[0][i] = '#';
                    ans[1][i] = '#';
                }
            }
            for (int i = 0; i < b - a; i++) {
                ans[1][2 * i + 1] = '.';
            }
        }
        if (b < a) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    ans[0][i] = '#';
                    ans[1][i] = '#';
                } else {
                    ans[0][i] = '.';
                    ans[1][i] = '.';
                }
            }
            for (int i = 0; i < a - b; i++) {
                ans[1][2 * i + 1] = '#';
            }
        }
        out.println(2 + " " + n);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                out.print(ans[i][j]);
            }
            out.println();
        }

    }

    BufferedReader br;
    StringTokenizer sc;
    PrintWriter out;

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        new Main().run();
    }

    void run() throws IOException {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
//            br = new BufferedReader(new FileReader("refrain.in"));
//            out = new PrintWriter(new File("refrain.out"));

            solve();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    String nextToken() throws IOException {
        while (sc == null || !sc.hasMoreTokens()) {
            try {
                sc = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                return null;
            }
        }
        return sc.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }
}