import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }


    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int A = scanner.nextInt(), B = scanner.nextInt(), Q = scanner.nextInt();
        scanner.nextLine();
        TreeSet<Long> shrine = new TreeSet<>();
        TreeSet<Long> temple = new TreeSet<>();
        for (int i = 0; i < A; i++) {
            shrine.add(Long.parseLong(scanner.nextLine()));
        }
        for (int i = 0; i < B; i++) {
            temple.add(Long.parseLong(scanner.nextLine()));
        }
        for (int i = 0; i < Q; i++) {
            long q = Long.parseLong(scanner.nextLine());
            long ans = Long.MAX_VALUE;
            {
                Long l1 = shrine.floor(q);
                Long l2 = temple.floor(q);
                if (l1 != null && l2 != null) {
                    ans = Math.min(ans, q - Math.min(l1, l2));
                }
            }
            {
                Long r1 = shrine.ceiling(q);
                Long r2 = temple.ceiling(q);
                if (r1 != null && r2 != null) {
                    ans = Math.min(ans, Math.max(r1, r2) - q);
                }
            }
            {
                Long l = shrine.floor(q);
                Long r = temple.ceiling(q);
                if (l != null && r != null) {
                    ans = Math.min(ans, r - l + Math.min(r - q, q - l));
                }
            }
            {
                Long l = temple.floor(q);
                Long r = shrine.ceiling(q);
                if (l != null && r != null) {
                    ans = Math.min(ans, r - l + Math.min(r - q, q - l));
                }
            }
            System.out.println(ans);
        }
    }

}
