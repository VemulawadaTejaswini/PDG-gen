import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author SimplyDivine
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int w = in.nextInt();
            int wt[] = new int[n + 1];
            int v[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                wt[i] = in.nextInt();
                v[i] = in.nextInt();
            }
            int dp[][] = new int[n + 1][w + 1];
            //for(int i=0;i<n;i++)dp[i][0] = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= w; j++) {
                    if (wt[i] > j) {
                        //if(i==0)dp[i][j]=0;
                        //else
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        //if(i==0)dp[i][j] = v[i];
                        //else
                        dp[i][j] = Math.max(dp[i - 1][j - wt[i]] + v[i], dp[i - 1][j]);
                    }
                }
            }
            out.println(dp[n][w]);
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream i) {
            br = new BufferedReader(new
                    InputStreamReader(i));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

