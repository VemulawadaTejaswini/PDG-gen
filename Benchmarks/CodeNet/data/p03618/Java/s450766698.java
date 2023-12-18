import java.io.*;
import java.util.StringTokenizer;

public class ReverseCompareG19B {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        String s = in.nextLine();
        long[] num = new long[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 97]++;
        }
        long result = s.length() * (s.length() - 1) / 2 + 1;
        for (int i = 0; i < 26; i++) {
            result -= num[i] * (num[i] - 1) / 2;
        }
        System.out.println(result);
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            st = null;
            try {
                return br.readLine();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}
