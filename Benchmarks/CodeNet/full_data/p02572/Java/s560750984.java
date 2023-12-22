import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int mod = (int)1e9 + 7, res = 0;
        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; ++i) {
            nums[i] = scanner.nextInt() % mod;
        }
        for (int i = 0; i < N; ++i) {
            for (int j = i + 1; j < N; ++j) {
                res += (nums[i] * nums[j] % mod);
            }
            res %= mod;
        }
        System.out.println(res);
    }

}
