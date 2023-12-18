import java.util.*;

public class Main {

    public static void main(String[] args) {
        int tt = gcd(4,2);


        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        long result = 0;

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= k; l++) {

                    int ijGcd = gcd(i, j);
                    int gcd3Result = gcd(ijGcd, l);
                    result += gcd3Result;

                }

            }

        }

        System.out.println(result);
    }

    private static int gcd(int big, int small) {
        if (big < small) {
            int tmp = small;
            small = big;
            big = tmp;
        }

        int gcd = small;
        for (int i = 0; i < small; i++) {
            int amari = big % gcd;
            if (amari == 0) {
                break;
            }
            gcd = amari;
        }
        return gcd;
    }
}