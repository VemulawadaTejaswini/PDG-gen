import java.io.*;
import java.util.*;

public class Main implements Runnable {

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    void init() throws FileNotFoundException {
        try {
            in = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
        } catch (Exception e) {
            String filename = "";
            if (filename.isEmpty()) {
                in = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(System.out);
            } else {
                in = new BufferedReader(new FileReader(filename + ".in"));
                out = new PrintWriter(filename + ".out");
            }
        }
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            try {
                tok = new StringTokenizer(in.readLine(), " :");
            } catch (Exception e) {
                return null;
            }
        }
        return tok.nextToken();
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    int[] readIntArray(int size) throws IOException {
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = readInt();
        }
        return res;
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    <T> List<T>[] createGraphList(int size) {
        List<T>[] list = new List[size];
        for (int i = 0; i < size; i++) {
            list[i] = new ArrayList<>();
        }
        return list;
    }

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 1l * 200 * 1024 * 1024).start();
    }

    long timeBegin, timeEnd;

    void time() {
        timeEnd = System.currentTimeMillis();
        System.err.println("Time = " + (timeEnd - timeBegin));
    }

    long memoryTotal, memoryFree;

    void memory() {
        memoryFree = Runtime.getRuntime().freeMemory();
        System.err.println("Memory = " + ((memoryTotal - memoryFree) >> 10)
                + " KB");
    }

    public void run() {
        try {
            timeBegin = System.currentTimeMillis();
            memoryTotal = Runtime.getRuntime().freeMemory();
            init();
            solve();
            out.close();
            if (System.getProperty("ONLINE_JUDGE") == null) {
                time();
                memory();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    int[][] dp;

    int get(int i, int j) {
        if (i > j) return 0;
        return dp[i][j];
    }

    int INF = 100000;

    boolean isOpen(char x) {
        return x == '[' || x == '(';
    }

    boolean isClose(char x) {
        return x == ']' || x == ')';
    }

    char op(char x) {
        switch (x) {
            case '[':
                return ']';
            case ']':
                return '[';
            case '(':
                return ')';
            case ')':
                return '(';
        }
        throw new RuntimeException();
    }

    String recover(int first, int last) {
        if (first > last) return "";

        if (isOpen(a[first])) {
            if (dp[first][last] == get(first + 1, last) + 1) {
                return a[first] + recover(first + 1, last) + op(a[first]);
            }
            if (a[last] == op(a[first]) && dp[first][last] == get(first + 1, last - 1)) {
                return a[first] + recover(first + 1, last - 1) + a[last];
            }
        }
        if (isClose(a[last])) {
            if (dp[first][last] == get(first, last - 1) + 1) {
                return op(a[last]) + recover(first, last - 1) + a[last];
            }
        }
        for (int x = first; x < last; x++) {
            if (dp[first][last] == get(first, x) + get(x + 1, last)) {
                return recover(first, x) + recover(x + 1, last);
            }
        }
        throw new RuntimeException();
    }

    char[] a;

    private void solve() throws IOException {
        int n = readInt();
        String s = readString();
        if (s == null) {
            out.println();
            return;
        }
        a = s.toCharArray();
        dp = new int[n][n];
        for (int[] x : dp) {
            Arrays.fill(x, INF);
        }

        for (int len = 0; len <= n; len++) {
            for (int first = 0; first < n; first++) {
                int last = first + len;
                if (last >= n) break;

                if (isOpen(a[first])) {
                    dp[first][last] = Math.min(get(first + 1, last) + 1, dp[first][last]);

                    if (a[last] == op(a[first])) {
                        dp[first][last] = Math.min(dp[first][last], get(first + 1, last - 1));
                    }
                }
                if (isClose(a[last])) {
                    dp[first][last] = Math.min(get(first, last - 1) + 1, dp[first][last]);
                }
                for (int x = first; x < last; x++) {
                    dp[first][last] = Math.min(dp[first][last], get(first, x) + get(x + 1, last));
                }
            }
        }
        out.println(recover(0, n - 1));
    }


}