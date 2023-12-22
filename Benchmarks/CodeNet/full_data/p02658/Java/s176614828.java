import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextLong();
        }
        long ans = 1;
        long limit = 1;
        for (int i=0;i<18;i++) {
            limit*=10;
        }
        for (int i=0;i<n;i++) {
            try {
                ans *= a[i];
                if (ans > limit) {
                    System.out.println("-1");
                    return;
                }
            } catch (Exception e) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(ans);
    }
}
