import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n >= k) {
            int t1 = n % k;
            int t2 = Math.abs(t1 - k);
            System.out.println(Math.min(t1, t2));
            return;
        }
        int ans = Math.min(n - k, k - n);
        System.out.println(ans);
    }
}
