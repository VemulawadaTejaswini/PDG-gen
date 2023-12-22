import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int ans = (n / x) * t;
        if (n % x != 0) {
            ans += t;
        }
        System.out.println(ans);
    }
}