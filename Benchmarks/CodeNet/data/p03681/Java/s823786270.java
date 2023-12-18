import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if(Math.abs(n - m) > 1) {
            System.out.println(0);
            return;
        }
        long nn = 1;
        for (int i = 1; i <= n; i++) {
            nn = (nn * i) % 1000000007;
        }
        long mm = 1;
        for (int i = 1; i <= m; i++) {
            mm = (mm * i) % 1000000007;
        }
        long ans = 0;
        if(n == m) {
            ans = (nn * mm * 2) % 1000000007;
        } else {
            ans = (nn * mm) % 1000000007;
        }
        System.out.println(ans);
    }
}