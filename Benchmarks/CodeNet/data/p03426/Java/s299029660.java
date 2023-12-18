import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Main {
    
    class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (a != pair.a) return false;
            return b == pair.b;
        }

        @Override
        public int hashCode() {
            int result = a;
            result = 31 * result + b;
            return result;
        }
    }

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int d = in.nextInt();
        int[][] grid = new int[n][m];
        HashMap<Integer, Pair> placeInGrid = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = in.nextInt();
                placeInGrid.put(grid[i][j], new Pair(i, j));
            }
        }
        int q = in.nextInt();
        HashMap<Pair, Integer> wayAns = new HashMap<>();
        HashMap<Integer, Integer> elemRoot = new HashMap<>();
        HashSet<Integer> roots = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num = grid[i][j];
                int root = -1;
                if (elemRoot.containsKey(num)) continue;
                int tmpNum = num;
                while (tmpNum - d > 0) {
                    tmpNum -= d;
                    if (elemRoot.get(tmpNum) != null) {
                        root = elemRoot.get(tmpNum);
                        break;
                    }
                }
                if (root == -1) root = tmpNum;
                elemRoot.put(root, root);
                roots.add(root);
                while (num != root && !elemRoot.containsKey(num)) {
                    elemRoot.put(num, root);
                    num -= d;
                }
            }
        }
        for (Integer root : roots) {
            wayAns.put(new Pair(root, root), 0);
            int energy = 0;
            int prev = root;
            int next = root + d;
            while (next <= n * m) {
                energy += dist(placeInGrid.get(prev), placeInGrid.get(next));
                wayAns.put(new Pair(root, next), energy);
                prev = next;
                next += d;
            }
        }
        for (int i = 0; i < q; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            int root = elemRoot.get(l);
            out.println(wayAns.get(new Pair(root, r)) - wayAns.get(new Pair(root, l)));
        }
    }
    
    int dist(Pair a, Pair b) {
        return Math.abs(a.a - b.a) + Math.abs(a.b - b.b );
    }

    Scanner in;
    PrintWriter out;

    void run() {
        try {
            in = new Scanner(new File("A.in"));
            out = new PrintWriter(new File("A.out"));

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