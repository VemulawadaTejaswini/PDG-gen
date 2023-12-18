import java.util.*;
import java.io.*;

public class Main {

    static int n;
    static int m_a, m_b;
    static final int INF = 1145141919;
    static int[] a;
    static int[] b;
    static int[] c;
    static int[][][] dp = new int[41][401][401];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m_a = Integer.parseInt(st.nextToken());
        m_b = Integer.parseInt(st.nextToken());
        a = new int[n];
        b = new int[n];
        c = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
            c[i] = Integer.parseInt(st.nextToken());
        }
        long sum = min_cost(0, 0, 0);
        System.out.println(sum == INF ? -1 : sum);
    }

    static int min_cost(int index, int c_a, int c_b) {
        int ret;
        if (dp[index][c_a][c_b] != 0) {
            return dp[index][c_a][c_b];
        } else if (index == n) {
            ret = INF;
        } else if (!(c_b == 0 ) && m_a * c_b == m_b * c_a) {
            ret = 0;
        } else {
            ret = Math.min(min_cost(index + 1, c_a + a[index], c_b + b[index]) + c[index], min_cost(index + 1, c_a, c_b));
        }
        dp[index][c_a][c_b] = ret;
        return dp[index][c_a][c_b];
    }

}
