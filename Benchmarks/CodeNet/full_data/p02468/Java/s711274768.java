import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        long m = sc.nextLong();
        long n = sc.nextLong();

        long ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= m;
                ans %= 1000000007;
            }
            m *= m;
            m %= 1000000007;
            n >>= 1;
        }

        System.out.println(ans);
    }
}

