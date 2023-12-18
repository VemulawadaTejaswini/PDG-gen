import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        long ans = 0;

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                long abGcd = gcd(i, j);
                for (int l = 1; l <= k; l++) {
                    ans += gcd(abGcd, l);
                }
            }
        }

        System.out.println(ans);

    }

    private static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}