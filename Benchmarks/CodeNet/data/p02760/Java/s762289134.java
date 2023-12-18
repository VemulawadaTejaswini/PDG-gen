import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    private static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(final String[] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out, true);

        int[] a = new int[9];
        for (int i = 0; i < 9; i++) {
            a[i] = in.nextInt();
        }

        int n = in.nextInt();
        Set<Integer> b = new HashSet<>();
        for (int i = 0; i < n; i++) {
            b.add(in.nextInt());
        }

        for (int i = 0; i < 9; i++) {
            if (b.contains(a[i])) {
                a[i] = -1;
            }
        }

        if ((a[0] + a[1] + a[2]) == -3 || (a[3] + a[4] + a[5]) == -3 || (a[6] + a[7] + a[8]) == -3
                || (a[0] + a[3] + a[6]) == -3 || (a[1] + a[4] + a[7]) == -3 || (a[2] + a[5] + a[8]) == -3
                || (a[0] + a[4] + a[8]) == -3 || (a[6] + a[4] + a[2]) == -3) {
            out.println("Yes");
        } else {
            out.println("No");
        }

    }
}
