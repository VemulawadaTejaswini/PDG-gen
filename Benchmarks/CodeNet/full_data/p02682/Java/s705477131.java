import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();

        long ans;
        if (a >= k) {
            ans = k;
            System.out.println(ans);
        } else if (a + b >= k) {
            ans = k - (k - a);
            System.out.println(ans);
        } else {
            ans = a + -1 * (k - a - b);
            System.out.println(ans);
        }
    }
}
