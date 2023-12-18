import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        int[] count = new int[13];
        count[0]++;
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            set.add(d);
            count[d]++;
        }
        int m = set.size();
        int max1 = -1, max2 = 0;
        for (int i = 0; i <= 12; i++) {
            if (count[i] > 1) {
                max1 = Math.max(max1, i == 0 ? 0 : Math.abs(i - 24 + i));
            }
        }
        if (max1 == -1) {
            max1 = Integer.MAX_VALUE;
        }
        for (int i = 0; i < 1 << m; i++) {
            int[] a = set.stream().mapToInt(Integer::intValue).toArray();
            for (int j = 0; j < m; j++) {
                if ((i & (1 << j)) != 0) {
                    a[j] = 24 - a[j];
                }
            }
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                for (int k = j + 1; k < m; k++) {
                    min = Math.min(min, Math.abs(a[j] - a[k]));
                }
            }
            max2 = Math.max(max2, min);
        }
        System.out.println(Math.min(max1, max2));
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