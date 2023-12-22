import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main {
    private static void calc(List<Integer> numbers, int n, int[] results) {
        if (numbers.size() != 1) {
            int a = numbers.get(0);
            List<Integer> sublist = numbers.subList(1, numbers.size());
            for (int b: sublist) {
                int c = a - b;
                if (c < 0) {
                    c += n;
                }
                if (c > (n - 1) / 2) {
                    c = n - c;
                }
                results[c]++;
                c = b - a;
                if (c < 0) {
                    c += n;
                }
                if (c > (n - 1) / 2) {
                    c = n - c;
                }
                results[c]++;
            }
            calc(sublist, n, results);
        }
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            Set<Integer> numbers = new HashSet<Integer>((n - 1) / 2);
            for (int i = 1; i < n; i++) {
                numbers.add((i * i) % n);
            }
            int[] results = new int[(n - 1) / 2 + 1];
            calc(new ArrayList<Integer>(numbers), n, results);
            for (int i = 1; i < results.length; i++) {
                System.out.println(results[i]);
            }
        }
    }

    public static void main(String... arg) {
        solve();
    }
}