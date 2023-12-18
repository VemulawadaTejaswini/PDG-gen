import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        long[] nums = new long[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).sum();
        }
        Arrays.sort(nums);
        long ans = 0;
        for (int i = 0; i < M; i++) {
            ans += nums[N - 1 - i];
        }
        System.out.println(ans);
    }

}