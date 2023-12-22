import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long ans = 1;
        boolean flg = false;
        long max = 1000000000;
        max *= 1000000000;
        for (int i = 0; i < n; i++) {
            ans *= a[i];

            if (ans > max || ans < 0) {
                flg = true;
            }
        }

        if (ans == 0) ans = 0;
        else if (flg) ans = -1;

        System.out.println(ans);
    }
}