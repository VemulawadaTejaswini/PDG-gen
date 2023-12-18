import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer gcd = null;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (gcd == null) {
                gcd = a;
            } else {
                gcd = gcd(gcd, a);
            }
        }

        System.out.println(gcd);
    }

    private static int gcd(int b, int a) {
        if (b % a == 0) return a;
        return gcd(a, b%a);
    }
}
