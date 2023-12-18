import java.io.*;
import java.util.*;

public class Main {

    final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;
    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Main().run();
        // Sworn to fight and die
    }

    void init() throws FileNotFoundException {
        if (1 > 0) {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        } else {
            in = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
        }
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    public void run() {
        try {
            long t1 = System.currentTimeMillis();
            init();
            solve();
            out.close();
            long t2 = System.currentTimeMillis();
            System.err.println("Time = " + (t2 - t1));
        } catch (Exception e) {
            e.printStackTrace(System.err);
            System.exit(-1);
        }
    }

    public int check(int[] a, int start) {
        int current = start;
        for (int i = 0; i < a.length; i++) {
            if (current % a[i] != 0) {
                current = (current / a[i]) * a[i];
            }
        }
        if (current == 2) {
            return 1;
        } else {
            return -1;
        }
    }

    public void solve() throws IOException {
        int k = readInt();
        int[] a = new int[k];
        int max = -1;
        for (int i = 0; i < k; i++) {
            a[i] = readInt();
            max = Math.max(max, a[i]);
        }

        if (a[k - 1] > 2) {
            out.print(-1);
            return;
        }

        int l = 2;
        int r = 2;

        for (int i = k - 1; i >= 0; i--) {
            int x = l / a[i];

            if (l % a[i] != 0) {
                x++;
            }

            if (x * a[i] < l || x * a[i] > r) {
                out.print(-1);
                return;
            }

            int y = r / a[i];

            l = x * a[i];
            r = y * a[i] + (a[i] - 1);
        }
        out.print(l + " " + r);
    }
}