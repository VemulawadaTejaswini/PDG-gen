import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

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

        Map<Integer, Integer> digits = new TreeMap<>();
        boolean duplicate = false;
        for (int i = 0; i < m; i++) {
            int s = in.nextInt();
            int c = in.nextInt();
            if (digits.containsKey(s) && digits.get(s) != c) {
                duplicate = true;
                break;
            }
            digits.put(s, c);
        }

        if (duplicate) {
            out.println(-1);
        } else if (n > 1 && digits.get(1) != null && digits.get(1) == 0) {
            out.println(-1);
        } else {
            int answer = 0;
            for (Map.Entry<Integer, Integer> entry : digits.entrySet()) {
                answer += entry.getValue() * (int) Math.pow(10, (n - entry.getKey()));
            }
            if (!digits.containsKey(1)) {
                answer += (int) Math.pow(10, n - 1);
            }
            out.println(answer);
        }
    }
}
