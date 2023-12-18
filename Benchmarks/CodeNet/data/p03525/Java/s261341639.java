import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        set.add(0);
        int[] count = new int[13];
        count[0]++;
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            set.add(d);
            count[d]++;
        }
        int max = 0;
        for (int i = 0; i <= 12; i++) {
            if (count[i] > 1) {
                set.add(24 - i);
            }
        }
        int m = set.size();
        for (int i = 0; i < 1 << m; i++) {
            Set<Integer> a = new HashSet<>();
            int index = 0;
            for (int j : set) {
                if ((i & (1 << index++)) != 0) {
                    a.add(j);
                } else {
                    a.add(24 - j);
                }
            }
            if (a.size() != set.size()) {
                continue;
            }
            List<Integer> b = new ArrayList<>(a);
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                for (int k = j + 1; k < m; k++) {
                    min = Math.min(min, Math.abs(b.get(j) % 24 - b.get(k) % 24));
                }
            }
            max = Math.max(max, min);
        }
        System.out.println(max);
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}