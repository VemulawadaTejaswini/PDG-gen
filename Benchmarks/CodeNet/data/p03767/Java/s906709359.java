import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        long[] arr = new long[3*n];
        for (int i=0; i<3*n; i++) {
            arr[i] = in.nextLong();
        }
        Arrays.sort(arr);
        long count = 0;
        int cn = 0;
        int i = (3 * n) - 2;
        while (cn < n) {
            cn++;
            count = count + arr[i];
            i = i - 2;
        }
        out.println(count);
        out.close();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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
}
