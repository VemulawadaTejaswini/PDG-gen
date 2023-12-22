

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public final class Main {

    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        final int n = fs.nextInt();
        final int m = fs.nextInt();
        final int mines = fs.nextInt();
        final int[] rows = new int[n + 1];
        final int[] cols = new int[m + 1];
        final List<int[]> bombs = new ArrayList<>();
        int maxR = 0;
        int maxC = 0;
        for (int i = 0; i < mines; i++) {
            final int x = fs.nextInt();
            final int y = fs.nextInt();
            maxR = Math.max(maxR, ++rows[x]);
            maxC = Math.max(maxC, ++cols[y]);
            bombs.add(new int[] { x, y });
        }
        int res = 0;
        for (int[] bomb : bombs) {
            res = Math.max(res, rows[bomb[0]] + cols[bomb[1]] - 1);
        }
        if (res < (maxR + maxC)) {
            System.out.println(res);
        } else {
            System.out.println(Math.max(res, maxR + maxC - 1));
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    //noinspection CallToPrintStackTrace
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++) { a[i] = nextInt(); }
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
