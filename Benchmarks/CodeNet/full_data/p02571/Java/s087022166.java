import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastInput in = new FastInput();
        PrintWriter out = new PrintWriter(System.out);

        String s = in.next(), t = in.next();
        int res = t.length();

        for (int i = 0; i + t.length() <= s.length(); i++) {
            int same = 0;
            for (int j = 0; j < t.length(); j++)
                if (t.charAt(j) == s.charAt(i + j))
                    same++;
            res = Math.min(res, t.length() - same);
        }
        out.println(res);
        out.close();
    }

    static class FastInput {
        BufferedReader br;
        StringTokenizer st;

        public FastInput() {
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
