import java.util.Scanner;

/**
 * Created by User on 2017/02/18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(getPower(n));

    }

    public static long getPower(int n) {
        long ans = n;
        while (n > 1) {
            n = ((n + 1000000007) - 1) % 1000000007;
            ans = (ans % 1000000007) * (n % 1000000007);
        }
        return ans;
    }
}
