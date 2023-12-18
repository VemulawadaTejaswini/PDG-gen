import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
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

        int n = in.nextInt();
        int m = in.nextInt();

        int[] digits = new int[3];
        Arrays.fill(digits, -1);

        boolean hasDuplicate = false;
        for (int i = 0; i < m; i++) {
            int s = in.nextInt();
            int c = in.nextInt();
            if (digits[s - 1] != -1 && digits[s - 1] != c) {
                hasDuplicate = true;
                break;
            }
            digits[s - 1] = c;
        }

        boolean hasLeadingZeros = digits[0] == 0 || (digits[0] | digits[1]) == 0
                || (digits[0] | digits[1] | digits[2]) == 0;
        if (hasDuplicate || hasLeadingZeros) {
            out.println(-1);
        } else {
            if (digits[0] == -1) {
                digits[0] = 1;
            }
            if (digits[1] == -1) {
                digits[1] = 0;
            }
            if (digits[2] == -1) {
                digits[2] = 0;
            }

            int answer = digits[0] * 100 + digits[1] * 10 + digits[2];
            out.println(answer);
        }
    }
}
