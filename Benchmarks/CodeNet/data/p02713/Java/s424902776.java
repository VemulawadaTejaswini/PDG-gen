import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int ans = 0;
        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                for (int c = 1; c <= k; c++) {
                    ans += gcd(a, b, c);
                }
            }
        }

        System.out.println(ans);
    }

    public static int gcd(int a, int b, int c) {
        return gcd(a, gcd(b, c));
    }

    public static int gcd(int x, int y) {
        int ret = 0;
        if (x % y == 0) return y;
        else {
            int z = x % y;
            ret = gcd(y, z);
        }
        return ret;
    }
}