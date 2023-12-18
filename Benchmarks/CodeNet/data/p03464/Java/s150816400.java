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
        int left = max;
        int right = 1000 * 1000 * 1000 + 1;
        int found = -1;

        for (int z = 0; z < 100; z++) {
            int mid = (left + right) / 2;

            if (check(a, mid) == 1) {
                found = mid;
                break;
            } else {
                left = mid + 1;
            }
        }

        left = max;
        right = 1000 * 1000 * 1000 + 1;

        for (int z = 0; z < 100; z++) {
            int mid = (left + right) / 2;

            if (check(a, mid) == 1) {
                found = mid;
                break;
            } else {
                right = mid - 1;
            }
        }

        if (found == -1) {
            out.print(-1);
            return;
        }

        int foundMin = -1;
        left = max;
        right = found;

        for (int z = 0; z < 100; z++) {
            int mid = (left + right) / 2;

            if (check(a, mid) == 1) {
                right = mid;
                foundMin = right;
            } else {
                left = mid + 1;
            }
        }

        int foundMax = -1;
        left = found;
        right = 1000 * 1000 * 1000 + 1;

        for (int z = 0; z < 100; z++) {
            int mid = (left + right) / 2;

            if (check(a, mid) == 1) {
                left = mid;
                foundMax = left;
            } else {
                right = mid - 1;
            }
        }

        if (check(a, foundMax + 1) == 1) {
            foundMax++;
        }

        if (check(a, foundMin - 1) == 1) {
            foundMin--;
        }

        out.print(foundMin + " " + foundMax);

    }
}