
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();

        Set<String> dic = new HashSet<>();
        char prev = 'a';
        for (int i = 0; i < n; i++) {
            String t = sc.next();
            if (dic.contains(t)) {
                out.println("No");
                out.flush();
                return;
            }
            dic.add(t);

            if (0 < i) {
                if (prev != t.charAt(0)) {
                    out.println("No");
                    out.flush();
                    return;
                }
            }
            prev = t.charAt(t.length()-1);
        }

        out.println("Yes");
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