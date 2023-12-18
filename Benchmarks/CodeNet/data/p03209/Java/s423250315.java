import java.util.*;

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
    // long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
    static long[] L;
    static long[] P;
    static void solve(Scanner scanner) {
        long[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        int N = (int) n[0];
        long X = n[1];
        L = new long[N + 1];
        P = new long[N + 1];
        L[0] = 1;
        P[0] = 1;
        for (int i = 1; i < N + 1; i++) {
            L[i] = 2 * L[i - 1] + 3;
            P[i] = 2 * P[i - 1] + 1;
        }

        System.out.println(dfs(N, X));
    }

    static long dfs(int n, long x) {
        if (n == 0) {
            return (x > 0) ? 1 : 0;
        }
        if (x <= L[n - 1] + 1) {
            return dfs(n - 1, x - 1);
        }
        return P[n - 1] + 1 + dfs(n - 1, x - 2 - L[n - 1]);
    }

}
