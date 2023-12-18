import java.io.*;
import java.util.*;

public class Main {

    void solve() {
        int h = in.nextInt();
        int w = in.nextInt();
        int[][] costs = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                costs[i][j] = in.nextInt();
            }
        }
        int[] calculated = new int[10];
        calculated[1] = 0;
        for (int i = 0; i < 10; i++) {
            if (i != 1) {
                int best = optimizeCost(i, costs);
                calculated[i] = best;
            }
        }
        int ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int wallCell = in.nextInt();
                if (wallCell == -1 || wallCell == 1) continue;
                ans += calculated[wallCell];
            }
        }
        out.println(ans);

    }

    int optimizeCost(int num, int[][] costs) {
        int[] d = new int[10];
        boolean[] marked = new boolean[10];
        Arrays.fill(d, Integer.MAX_VALUE);

        d[num] = 0;
        int minIndex = -1;
        while (minIndex < Integer.MAX_VALUE){
            minIndex = Integer.MAX_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 10; i++) {
                if (!marked[i] && d[i] < min) {
                    min = d[i];
                    minIndex = i;
                }
            }
            if (minIndex != Integer.MAX_VALUE) {
                for (int i = 0; i < 10; i++) {
                    int tmp = min + costs[minIndex][i];
                    if (tmp < d[i])
                        d[i] = tmp;
                }
                marked[minIndex] = true;
            }
        }
        return d[1];
    }

    Scanner in;
    PrintWriter out;

    void run() {
        try {
            in = new Scanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new Scanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public Scanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        private boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private int skip() {
            int b;
            while ((b = read()) != -1 && isSpaceChar(b)) ;
            return b;
        }

        private int read() {
            int res = -1;
            try {
                res = br.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return res;
        }

        char[] nextCharArray(int size) {
            char[] buf = new char[size];
            int b = skip(), p = 0;
            while (p < size && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = read();
            }
            return size == p ? buf : Arrays.copyOf(buf, p);
        }

        char[][] nextCharMap(int n, int m) {
            char[][] map = new char[n][];
            for (int i = 0; i < n; i++) {
                map[i] = nextCharArray(m);
            }
            return map;
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}