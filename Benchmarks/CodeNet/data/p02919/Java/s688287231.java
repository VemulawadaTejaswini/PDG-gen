import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt() - 1;
            q[p[i]] = i;
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 0, n, n));
        long ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            int j = lowerBound(list, q[i]);
            long l2 = list.get(j - 2);
            long l1 = list.get(j - 1);
            long l = q[i];
            long r = q[i] + 1;
            long r1 = list.get(j);
            long r2 = list.get(j + 1);
            ans += ((l1 - l2) * (r1 - l) + (r - l1) * (r2 - r1)) * (i + 1);
            list.add(j, q[i]);
        }
        System.out.println(ans);
    }

    static <T extends Comparable<T>> int lowerBound(List<T> list, T value) {
        int left = -1;
        int right = list.size();
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (list.get(mid).compareTo(value) < 0) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
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