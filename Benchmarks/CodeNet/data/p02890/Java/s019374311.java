

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        Integer[] a = new Integer[n];
        Arrays.fill(a, 0);

        for (int i = 0; i < n; i++) {
            int x = std.nextInt() - 1;
            a[x]++;
        }

        Arrays.sort(a);
        Integer[] sorted = a;
        int[] s = new int[n + 1];
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] + sorted[i];
        }

        // 1 ~ n takes
        int ans = n;
        for (int k = 1; k <= n; k++) {
            final int kIndex = k;
            while (true) {
                Function<Integer, Boolean> f = integer -> {
                    int i = ~Arrays.binarySearch(sorted, integer, (l1, r1) -> l1.compareTo(r1) >= 0 ? 1 : -1);
                    int sum = integer * (n - i) + s[i];
                    return (sum >= integer * kIndex);
                };

                if (f.apply(ans)) {
                    break;
                } else {
                    ans--;
                }
            }

            System.out.println(ans);
        }

    }
}
