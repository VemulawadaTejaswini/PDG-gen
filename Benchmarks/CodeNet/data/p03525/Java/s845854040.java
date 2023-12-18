import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        int[] count = new int[25];
        count[0]++;
        set.add(0);
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            set.add(d);
            count[d]++;
        }
        int m = 0;
        for (int i = 0; i < 25; i++) {
            if (count[i] == 1) {
                m++;
            }
            if (count[i] > 2) {
                System.out.println(0);
                return;
            }
            if (i > 12) {
                count[i] = count[24 - i];
            }
        }
        if (count[0] > 1 || count[12] > 1) {
            System.out.println(0);
            return;
        }
        int max = 0;
        for (int i = 0; i < 1 << m; i++) {
            List<Integer> list = new ArrayList<>();
            int index = 0;
            for (int j : set) {
                if (count[j] > 1) {
                    list.add(j);
                    list.add(24 - j);
                } else if ((i & index++) == 0) {
                    list.add(j);
                } else {
                    list.add(24 - j);
                }
            }
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < list.size(); j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    int a = Math.abs(list.get(j) - list.get(k));
                    min = Math.min(min, Math.min(a, 24 - a));
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