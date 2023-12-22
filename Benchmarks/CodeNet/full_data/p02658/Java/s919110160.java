
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long ans = 1;
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 0) {
                System.out.println(0);
                System.exit(0);
            }
        }

        for (int i = 0; i < n; i++) {
            ans *= a[i];
        }

        if (ans <= (long) Math.pow(10, 18)) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}