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
        long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long first = 0;
        if (n[0] % 2L == 1L) {
            first = n[0];
            n[0]++;
        }
        long last = 0;
        if (n[1] % 2L == 0L) {
            last = n[1];
            n[1]--;
        }
        long msb = (((n[1] + 1 - n[0]) / 2)  % 2 == 1) ? 1 : 0;
        System.out.println(first ^ last ^ msb);
    }

}
