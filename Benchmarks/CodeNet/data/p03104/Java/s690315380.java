import java.util.Scanner;

public class Main {

    private static long f(long n) {
        // nが偶数のとき
        if (n % 2 == 0) {
            // 1 xor 1 xor ...  xor 1 の1が偶数個
            if ((n / 2) % 2 == 0) {
                return n;
            }
            // 奇数個
            return 1 ^ n;
        }
        // nが奇数のとき
        return f(n - 1) ^ n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(f(a - 1) ^ f(b));
    }

}
