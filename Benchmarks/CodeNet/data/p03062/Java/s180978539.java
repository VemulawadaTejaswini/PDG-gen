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
        int N = Integer.parseInt(scanner.nextLine());
        long[] n = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong).toArray();
        boolean allp = Arrays.stream(n).filter(x -> x < 0).count() % 2 == 0;
        long min = Arrays.stream(n).map(Math::abs).min().orElse(0);
        long total = Arrays.stream(n).map(Math::abs).sum();
        System.out.println(allp ? total : total - 2 * min);
    }

}
