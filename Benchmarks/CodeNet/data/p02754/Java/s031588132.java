import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long b = sc.nextLong();
        long r = sc.nextLong();
        long br = b + r;

        long ans = n / br * b;
        long rem = n % br;
        ans += Math.min(rem, b);

        System.out.println(ans);
    }
}