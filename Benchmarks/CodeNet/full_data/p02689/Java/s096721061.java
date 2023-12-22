import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

        int n = in.nextInt();
        int m = in.nextInt();

        int[] h = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            h[i] = in.nextInt();
        }

        List<Set<Integer>> obs = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            obs.add(new HashSet<>());
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            obs.get(a).add(b);
            obs.get(b).add(a);
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            boolean good = true;
            for (int o : obs.get(i)) {
                if (h[i] <= h[o]) {
                    good = false;
                    break;
                }
            }

            if (good) {
                answer++;
            }
        }

        out.println(answer);
    }
}
