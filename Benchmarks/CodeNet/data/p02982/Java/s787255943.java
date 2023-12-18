
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] arr = new int[n][d];
        for (int i = 0; i < n; i++) {
            int[] tmp = new int[d];
            for (int k = 0; k < d; k++) {
                tmp[k] = sc.nextInt();
            }
            arr[i] = tmp;
        }

        int res = 0;

        for (int i = 0; i < n; i++) {

            for (int k = i + 1; k < n; k++) {
                int tmp = 0;
                for (int t = 0; t < d; t++) {
                    int a = arr[i][t] - arr[k][t];
                    tmp += (a * a);
                }
                int tmpp = (int) Math.sqrt(tmp);
                if (tmp == tmpp * tmpp) {
                    res++;
                }
            }
        }

        out.println(res);
        out.flush();
    }

    //    public static void calcD(Map<Integer, Integer> dic, int index, )

    static class FastReader {
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
}