import java.io.*;
import java.util.*;

public class Main {

    public void solve() {
        int w = in.nextInt(), h = in.nextInt();
        int[] a = new int[w + 1], b = new int[h];
        for (int i = 0; i < w; i++) {
            a[i] = in.nextInt();
        }
        a[w] = Integer.MAX_VALUE / 2;
        for (int i = 0; i < h; i++) {
            b[i] = in.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        long ans = 0;
        int connA = 0, connB = 0;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            while (connB < h && j < h && b[j] < a[i]) {
                connB++;
                ans += 1L * (w + 1 - connA) * b[j];
                j++;
            }

            if (connA < w) {
                connA++;
                ans += 1L * (h + 1 - connB) * a[i];
            }
        }
        out.println(ans);
    }

    public void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    FastScanner in;
    PrintWriter out;

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
