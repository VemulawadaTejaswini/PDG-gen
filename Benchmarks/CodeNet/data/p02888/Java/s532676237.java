
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final long[] bars = new long[1001];

        for (int i = 0; i < n; i++) {
            bars[scanner.nextInt()]++;
        }

        final Set<Set<Integer>> checked = new HashSet<>();
        long answer = 0;
        for (int i = 1; i < 1001; i++) {
            if (bars[i] == 0) {
                continue;
            }

            for (int j = i + 1; j < 1001; j++) {
                for (int k = Math.abs(i - j) + 1; k < i + j && k < 1001; k++) {
                    if (bars[k] == 0 || k == i||k == j) {
                        continue;
                    }

                    final Set<Integer> tmp = new HashSet<>();
                    tmp.add(i);
                    tmp.add(k);
                    tmp.add(j);
                    if (checked.contains(tmp)) {
                        continue;
                    }

                    checked.add(tmp);
                    answer += bars[i] * bars[j] * bars[k];
                }
            }
        }
        System.out.println(answer);
    }
}
