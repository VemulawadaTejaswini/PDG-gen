import java.util.Scanner;

public class Main {

    static long MAX = 1_000_000_000_000_000_000L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= a[i];
        }
        if(ans > MAX) ans = -1;
        System.out.println(ans);
        sc.close();

    }

}
