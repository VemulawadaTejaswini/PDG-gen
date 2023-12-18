import java.util.*;
public class Main {

    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        helper(0, 1, N, K);
        System.out.println(result);


    }

    private static void helper(int i, int ans, int N, int K) {
        if (i == N) {
            result = Math.min(ans, result);
            return;
        }

        helper(i + 1, ans + K, N, K);
        helper(i + 1, ans * 2, N, K);
    }

}
