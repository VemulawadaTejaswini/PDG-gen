import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static final int INF = (int) (1e9 + 10);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt(), m = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> a = new LinkedList<>(), b = new LinkedList<>();
        while (n-- > 0) a.add(sc.nextInt());
        while (m-- > 0) b.add(sc.nextInt());
        a.add(INF);
        b.add(INF);
        int ans = 0;
        while (a.peek() <= k || b.peek() <= k) {
            ans++;
            if (a.peek() <= b.peek())
                k -= a.remove();
            else k -= b.remove();

        }
        out.println(ans);
        out.flush();
        out.close();
    }

    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        Scanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public int[] nextIntArray(int n) throws IOException {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextInt();
            return ans;
        }
    }
}
