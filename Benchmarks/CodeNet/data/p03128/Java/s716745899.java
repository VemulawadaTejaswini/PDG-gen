import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int[] priorities = new int[] {1, 7, 4, 5, 3, 2, 9, 6, 8};
        int[] uses = new int[] {2, 5, 5, 4, 5, 6, 3, 7, 6};
        int[] counts = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int min = 6;
        List<Integer> a = new ArrayList<>();
        for (int i = 0, j; i < m; i++) {
            min = Math.min(min, uses[j = scanner.nextInt() - 1] - 1);
            a.add(j);
        }

        int rem = n;
        loop: while (true) {
            for (int i = 1; i <= 9; i++) {
                int num = priorities[i - 1], use = uses[num - 1];
                if (a.contains(num)) {
                    if (rem % use <= min && rem % use != 0) {
                        counts[num - 1] = rem / use - 1;
                        if ((rem = rem % use + use) == 0)
                            break loop;
                    } else {
                        counts[num - 1] = rem / use;
                        if ((rem %= use) == 0)
                            break loop;
                    }
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = counts.length; i > 0; i--)
            for (int i1 = 0; i1 < counts[i - 1]; i1++)
                ans.append(i);

        System.out.println(ans);
    }
}