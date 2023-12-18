
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        String s = in.nextToken();
        String t = in.nextToken();
        int start = -1;
        for (int i = 0; i <= s.length() - t.length(); i++) {
            boolean works = true;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i + j) != t.charAt(j) && s.charAt(i + j) != '?') {
                    works = false;
                }
            }
            if (works) start = i;
        }
        if (start == -1) {
            System.out.println("UNRESTORABLE");
            return;
        }
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            r.append(s.charAt(i));
            if (s.charAt(i) == '?') r.setCharAt(i, 'a');
        }
        for (int i = 0; i < t.length(); i++) {
            r.setCharAt(i + start, t.charAt(i));
        }
        System.out.println(r.toString());
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
