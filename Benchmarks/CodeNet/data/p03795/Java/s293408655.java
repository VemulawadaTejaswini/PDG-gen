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
        if (n <= 1) return 1;

        return (n % 1000000007) * (getPower(((n + 1000000007) - 1) % 1000000007) % 1000000007);
    }
}
