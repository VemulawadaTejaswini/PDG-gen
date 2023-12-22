import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        CP sc = new CP();
        String S = sc.nextLine(), T = sc.nextLine();
        int max = Integer.MIN_VALUE;
        String p = "";
        for (int i = 0; i < S.length() - T.length() + 1; i++) {
            String j = S.substring(i, i + T.length());
            if (max < charMatch(T, j)) {
                max = charMatch(T, j);
                p = j;
            }
        }
        System.out.println(T.length() - charMatch(T, p));
    }

    static int charMatch(String A, String B) {
        int c = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(i))
                c++;
        }
        return c;
    }

    /*****************************************************************************/
    static class CP {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        public CP() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        int nextInt() {
            return Integer.parseInt(NNNN());
        }

        long nextLong() {
            return Long.parseLong(NNNN());
        }

        double nextDouble() {
            return Double.parseDouble(NNNN());
        }

        String NNNN() {
            while (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        String nextLine() {
            String spl = "";
            try {
                spl = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return spl;
        }
    }
    /*****************************************************************************/
}