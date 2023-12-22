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
        int N = readInt();
        int K = readInt();

        int[] a = new int[N];
        int max = 0, sum = 0;
        for (int i = 0; i < N; i++) {
            a[i] = readInt();
            if (max < a[i]) max = a[i];
            sum += a[i];
        }

        if (K == 0) return max;
        if (K >= sum - N) return 1;
        // Now 0 < K  < sum - N

        int low = 1;
        int high = max;
        // K cuts can make the longest log as small as
        // high but not as small as low.
        while (low + 1 < high) {
            int mid = (low + high) / 2;
            int c = 0;
            for (int i = 0; i < N; i++) {
                c += (a[i] + mid - 1) / mid - 1;
            }
            if (c <= K) high = mid;
            else low = mid;
        }
        return high;
    }
}
