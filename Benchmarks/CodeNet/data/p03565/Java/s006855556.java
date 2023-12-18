
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    FastScanner in;
    PrintWriter out;

    public static void main(String[] args) {
        new Main().run();
    }

    void solve() {
        final String BADRESULT = "UNRESTORABLE";
        String S = in.nextToken();
        String T = in.nextToken();
        int type = 0;

        int startIndex = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i + T.length() > S.length()) {
                if (type == 0) {
                    out.println(BADRESULT);
                    return;
                } else {
                    break;
                }
            } else if (compare(T, S.substring(i, i + T.length())) == 2) {
                type = 2;
                startIndex = i;
                break;
            } else if (compare(T, S.substring(i, i + T.length())) == 1) {
                type = 1;
            }
        }
        if (type == 1) {
            startIndex = S.length() - T.length();
        }
        StringBuilder sb = new StringBuilder(S.substring(0, startIndex).replaceAll("\\?", "a"));
        sb.append(T);
        sb.append(S.substring(startIndex + T.length()).replaceAll("\\?", "a"));
        out.println(sb.toString());
    }

    int compare(String T, String sub) {
        int result = 1;
        for (int i = 0; i < T.length(); i++) {
            if (sub.charAt(i) == '?') {
                continue;
            } else if (T.charAt(i) == sub.charAt(i)) {
                result = 2;
            } else if (T.charAt(i) != sub.charAt(i)) {
                return 0;
            }
        }
        return result;
    }


    void run() {
        in = new FastScanner();
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }

    public class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }

        public long nextLong() {
            return Long.parseLong(nextToken());
        }

        public double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

}