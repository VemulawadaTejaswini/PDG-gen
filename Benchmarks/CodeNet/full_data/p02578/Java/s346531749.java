import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    private static StringTokenizer st;

    private static int readInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
        return Integer.parseInt(st.nextToken());
    }

    private static int[] readIntArray(final int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = readInt();
        return a;
    }

    public static void main(String[] args) throws IOException {
        pw.println(solve(readIntArray(readInt())));
        pw.close();
    }

    private static long solve(int[] a) {
        int n = a.length;

        long res = 0;
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < max) {
                res += max - a[i];
            } else {
                max = a[i];
            }
        }

        return res;
    }
}