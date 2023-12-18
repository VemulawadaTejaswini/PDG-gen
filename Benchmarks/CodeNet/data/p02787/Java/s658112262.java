import java.io.*;
import java.util.*;
 
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
        static int h, n;
        static Monster[] m;
        
        public void solve(int testNumber, FastReader scan, PrintWriter out) {
            h = scan.nextInt();
            n = scan.nextInt();
            m = new Monster[n];
            for(int i = 0; i < n; i++) m[i] = new Monster(scan.nextInt(), scan.nextInt());
            long[] dp = new long[h+1];
            Arrays.fill(dp, Integer.MAX_VALUE/10);
            dp[h] = 0;
            for(int i = h; i >= 0; i--) {
                for(int j = 0; j < n; j++) {
                    int next = Math.max(0, i - m[j].a);
                    dp[next] = Math.min(dp[next], dp[i] + m[j].b);
                }
            }
            out.println(dp[0]);
        }
        
        static class Monster {
            int a, b;
            public Monster(int cc, int dd) {
                a = cc;
                b = dd;
            }
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