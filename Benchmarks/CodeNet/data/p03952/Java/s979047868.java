import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        if (x == 1 || x == 2 * n - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            if (n == 2) {
                IntStream.range(1, 2 * n).forEach(System.out::println);
            } else {
                int[] ans = new int[2 * n - 1];
                Set<Integer> use = IntStream.range(1, 2 * n).boxed().collect(Collectors.toSet());
                if (x == 2) {
                    ans[n - 2] = 3;
                    ans[n - 1] = 2;
                    ans[n] = 1;
                    ans[n + 1] = 4;
                    use.removeAll(Arrays.asList(1, 2, 3, 4));
                } else {
                    ans[n - 2] = x - 1;
                    ans[n - 1] = x;
                    ans[n] = x + 1;
                    ans[n + 1] = x - 2;
                    use.removeAll(Arrays.asList(x - 2, x - 1, x, x + 1));
                }
                int i = 0;
                for (int j : use) {
                    if (i >= 2 * n - 1) {
                        break;
                    }
                    ans[i] = j;
                    if (++i == n - 2) {
                        i += 4;
                    }
                }
                Arrays.stream(ans).forEach(System.out::println);
            }
        }
    }
}