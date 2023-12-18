import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long ans = 1;

        for (int i = 0; i < n; i++) {
            ans = lcm(ans, sc.nextLong());
        }

        System.out.println(ans);
    }

    private static long lcm(long a, long b) {
        if (Math.max(a, b) % Math.min(a, b) == 0) {
            return Math.max(a, b);
        }
        return a * b / gcd(a, b);
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