
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt(), x = sc.nextInt() - 1, y = sc.nextInt() - 1;
        int ans[] = new int[n-1];
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int dist = j - i;
                dist = Math.min(dist, Math.abs(i - x) + Math.abs(j - y) + 1);
                dist = Math.min(dist, Math.abs(j - x) + Math.abs(i - y) + 1);
                ans[dist-1] ++;
            }
        for (int cnt : ans)
            out.println(cnt);
        out.flush();
        out.close();
    }


    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        boolean ready() throws IOException {
            return br.ready();
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        Scanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        int nextChar() throws IOException {
            return next().charAt(0);
        }

        int[] nextIntArray(int n) throws IOException {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt();
            return ans;
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

    }
}
