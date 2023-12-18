
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            String s = sc.next();
            int count = 0;
            Queue<Integer> candidates = new ArrayDeque<>();
            for (int i = 2; i < s.length(); i++) {
                if (s.charAt(i-2) == 'A' &&
                        s.charAt(i-1) == 'B' &&
                        s.charAt(i) == 'C') {
                    StringBuilder sb = new StringBuilder(s);
                    sb.setCharAt(i-2, 'B');
                    sb.setCharAt(i-1, 'C');
                    sb.setCharAt(i, 'A');
                    s = sb.toString();
                    count ++;
                    if (i < s.length() - 2)
                        candidates.add(i);
                    if (i > 2)
                        candidates.add(i-3);
                }
            }
            while(candidates.size() > 0) {
                int index = candidates.poll();
                if (s.substring(index, index + 3).equals("ABC")) {
                    StringBuilder sb = new StringBuilder(s);
                    sb.setCharAt(index, 'B');
                    sb.setCharAt(index+1, 'C');
                    sb.setCharAt(index+2, 'A');
                    s = sb.toString();
                    count ++;
                    if (index < s.length()-4)
                        candidates.add(index+2);
                    if (index > 0)
                        candidates.add(index-1);
                }
            }
            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }
}