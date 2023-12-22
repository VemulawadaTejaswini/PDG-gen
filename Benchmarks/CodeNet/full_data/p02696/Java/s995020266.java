import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        long ans = 0;
        for (long i = 1; i <= n; i++) {
            long tmp1 = (a * i) / b;
            long tmp2 = a * (i / b);
            long tmp3 = tmp1 - tmp2;
            ans = Math.max(ans, tmp3);
        }
        System.out.println(ans);
    }
}