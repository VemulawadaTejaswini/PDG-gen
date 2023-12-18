import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    int h, w, d, q;
    int[][] ass;
    int[] ls, rs, xs, ys;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        h = sc.nextInt();
        w = sc.nextInt();
        d = sc.nextInt();
        ass = new int[h][w];
        xs = new int[h * w];
        ys = new int[h * w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ass[i][j] = sc.nextInt();
                int index = ass[i][j] - 1;
                xs[index] = j;
                ys[index] = i;
            }
        }
        q = sc.nextInt();
        ls = new int[q];
        rs = new int[q];
        for (int i = 0; i < q; i++) {
            ls[i] = sc.nextInt() - 1;
            rs[i] = sc.nextInt() - 1;
        }
        solve();
    }

    void solve() {
        int maxNum = h * w;
        /*
        int[][] costs = new int[maxNum][maxNum];
        for (int i = 0; i < maxNum; i++) {
            for (int j = 0; j )
        }
        */
        for (int i = 0; i < q; i++) {
            long cost = 0;
            int x = ls[i];
            while (x != rs[i]) {
                int newX = x + d;
                //System.out.printf("%d %d %d %d\n", xs[x], ys[x], xs[newX], ys[newX]);
                cost += Math.abs(xs[newX] - xs[x]) + Math.abs(ys[newX] - ys[x]);
                x = newX;
            }
            System.out.println(cost);
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
