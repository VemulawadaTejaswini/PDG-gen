import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();

        List<Map.Entry<Integer, Integer>> strings = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String next = in.next();

            int exceedingRight = 0;
            int left = 0;
            char[] ch = next.toCharArray();
            for (char c : ch) {
                if (c == '(') {
                    left++;
                } else {
                    if (left == 0) {
                        exceedingRight++;
                    } else {
                        left--;
                    }
                }
            }

            strings.add(new AbstractMap.SimpleEntry<>(exceedingRight, left));
        }

        List<Integer> indices = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            indices.add(i);
        }
        indices.sort(Comparator.comparingInt(i -> strings.get(i).getKey()));
        if (strings.get(indices.get(0)).getKey() != 0) {
            out.println("No");
            return;
        }
        int first = indices.get(0);
        int leftZeroCount = (int) indices.stream().filter(i -> strings.get(i).getKey() == 0).count();

        indices.sort(Comparator.comparingInt(i -> strings.get(i).getValue()));
        if (strings.get(indices.get(0)).getValue() != 0) {
            out.println("No");
            return;
        }

        int rightFirst = indices.get(0);
        int rightZeroCount = (int) indices.stream().filter(i -> strings.get(i).getValue() == 0).count();
        if (first == rightFirst && n > 1 && leftZeroCount == 1 && rightZeroCount == 1) {
            out.println("No");
            return;
        }

        int totalLeft = strings.stream().mapToInt(Map.Entry::getKey).sum();
        int totalRight = strings.stream().mapToInt(Map.Entry::getValue).sum();
        out.println(totalLeft == totalRight ? "Yes" : "No");
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
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

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
