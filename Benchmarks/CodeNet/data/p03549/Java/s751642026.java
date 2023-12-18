import java.util.*;
import java.io.*;

public class Main {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer stok;

    String nextToken() throws IOException {
        while (stok == null || !stok.hasMoreTokens()) {
            String s = br.readLine();
            if (s == null) {
                return null;
            }
            stok = new StringTokenizer(s);
        }
        return stok.nextToken();
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

    char nextChar() throws IOException {
        return (char) (br.read());
    }

    String nextLine() throws IOException {
        return br.readLine();
    }

    void solve() throws IOException {
        int n = nextInt();
        int m = nextInt();
        double[] p = new double[1000];
        long[] time = new long[1000];
        p[0] = 1.0 / (1 << m);
        time[0] = 100 * (n - m) + 1900 * m;
        double sump = p[0];
        double ans = time[0] * p[0];
        for (int i = 1; i < 1000; i++)
        {
            time[i] = time[i - 1] + 100 * (n - m) + 1900 * m;
            p[i] = (1.0 - sump) / (1 << m);
            sump += p[i];
            ans += time[i] * p[i];
        }
        long anss = (long) Math.round(ans);
        if (anss % 10 == 1) anss--;
        if (anss % 10 == 9) anss++;


        out.println(anss);

    }

    void run() throws IOException {
        // br = new BufferedReader(new FileReader("dragons.in"));
        //out = new PrintWriter("dragons.out");
        // br = new BufferedReader(new FileReader("input.txt"));
        // out = new PrintWriter("output.txt");
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        br.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        // Locale.setDefault(Locale.US);
        new Main().run();
    }
}