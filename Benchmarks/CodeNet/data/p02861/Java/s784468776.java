import java.io.*;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        FastReader scan = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        Task solver = new Task();
        int t = 1;
        while (t --> 0) solver.solve(1, scan, out);
        out.close();
    }

    static class Task {
        static int n;
        static int[][] point;

        public void solve(int testNumber, FastReader scan, PrintWriter out) {
            n = scan.nextInt();
            point = new int[n][2];
            for(int i = 0; i < n; i++) {
                point[i][0] = scan.nextInt();
                point[i][1] = scan.nextInt();
            }
            boolean[] visited = new boolean[n];
            long fact = 1;
            for(int i = 1; i <= n; i++) fact *= i;
            double get = go(-1, -1, visited, false);
            out.println(get/fact);
        }

        static double go(int x, int y, boolean[] v, boolean b) {
            double res = 0;
            for(int i = 0; i < n; i++) {
                if(!v[i]) {
                    v[i] = true;
                    res += dist(x, y, point[i][0], point[i][1], b) + go(point[i][0], point[i][1], v, true);
                    //System.out.println(res);
                    v[i] = false;
                }
            }
            return res;
        }

        static double dist(int a, int b, int c, int d, boolean e) {
            if(!e) return 0;
            double x = Math.abs(a-c), y = Math.abs(b-d);
            return Math.sqrt(x*x+y*y);
        }
    }

    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static void shuffle(long[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            long temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}