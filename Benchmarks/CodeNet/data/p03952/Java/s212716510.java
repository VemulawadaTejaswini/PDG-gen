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
            int[] ans = IntStream.range(1, 2 * n).toArray();
            if (n != 2) {
                if (x == 2) {
                    ans[n] = (ans[n - 2] ^= (ans[n] ^= ans[n - 2])) ^ ans[n];
                } else {
                    ans[n + 1] = (ans[n - 3] ^= (ans[n + 1] ^= ans[n - 3])) ^ ans[n + 1];
                }
            }
            Arrays.stream(ans).forEach(System.out::println);
        }
    }
}