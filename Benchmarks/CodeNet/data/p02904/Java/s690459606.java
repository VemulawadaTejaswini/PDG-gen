import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            list.add(a[i]);
        }
        Set<List<Integer>> set = new HashSet<>();
        list.subList(0, k).sort(Comparator.naturalOrder());
        for (int i = k; i <= n; i++) {
            set.add(new ArrayList<>(list));
            if (i < n) {
                list.remove(lowerBound(list, a[i - k], i - k - 1, i));
                list.add(i - k, a[i - k]);
                list.remove(i);
                list.add(lowerBound(list, a[i], i - k, i), a[i]);
            }
        }
        System.out.println(set.size());
    }

    static <T extends Comparable<T>> int lowerBound(List<T> list, T value, int left, int right) {
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