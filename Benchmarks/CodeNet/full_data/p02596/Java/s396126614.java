import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        pw.println(solve());
        pw.close();
    }

    private static int solve() throws IOException {
        int K = readInt();
        if (K % 2 == 0 || K % 5 == 0) return -1;

        // 7 * (10*n-1)/9
        // K | 77..7 (n 7s)  <=> 9K | 7 * (10*n-1)
        if (K % 7 == 0) K /= 7;
        K *= 9;

        int ans = 1;
        int remainder = 10 % K;
        while (remainder != 1) {
            ans++;
            remainder = remainder * 10 % K;
        }

        return ans;
    }
}
