import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        long[][] nums = new long[N][3];
        for (int i = 0; i < N; i++) {
            nums[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        }
        long ans = Long.MIN_VALUE;
        for (int i = 0; i < 8; i++) {
            int x = (i & 4) > 0 ? 1 : -1;
            int y = (i & 2) > 0 ? 1 : -1;
            int z = (i & 1) > 0 ? 1 : -1;
            Arrays.sort(nums, Comparator.comparingLong(n -> -1 * (n[0] * x + n[1] * y + n[2] * z)));
            long xm = Math.abs(Arrays.stream(nums).mapToLong(n -> n[0]).limit(M).sum());
            long ym = Math.abs(Arrays.stream(nums).mapToLong(n -> n[1]).limit(M).sum());
            long zm = Math.abs(Arrays.stream(nums).mapToLong(n -> n[2]).limit(M).sum());
            ans = Math.max(ans, xm + ym + zm);
        }
        System.out.println(ans);
    }

}