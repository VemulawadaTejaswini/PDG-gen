import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static final FastReader in = new FastReader();
    private static final PrintWriter out = new PrintWriter(System.out);
    static int memo[];

    static int rec(int indx, int arr[]) {
        if (indx == arr.length - 1) {
            return 0;
        }
        int v = Integer.MAX_VALUE, c = Integer.MAX_VALUE;
        if (memo[indx] != -1) {
            return memo[indx];
        }
        v = Math.abs(arr[indx ] - arr[indx+1] )+ rec(indx + 1, arr);
        if (indx + 2 < arr.length) {
            c = Math.abs(arr[indx] - arr[indx + 2]) + rec(indx + 2, arr);
        }
        return memo[indx] = Math.min(v, c);
    }

    public static void main(String[] args) {
        int n = in.nextInt();
        memo = new int[n];
        Arrays.fill(memo, -1);
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        out.println(rec(0, arr));
        out.flush();

    }


    static class FastReader {
        private static BufferedReader br;
        private static StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = null;
        }

        private static String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            return next();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

    }
}