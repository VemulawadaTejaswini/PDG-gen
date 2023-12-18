import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    final long MOD = (long)1e9 + 7;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] arr = new long[n+1];

        for (int i=1; i<=n; i++) {
            arr[i] = arr[i-1] + i;
        }

//        System.out.println(arr[n]);

        long ans = 0;

        for (int i=k; i<=n; i++) {
            long max = arr[n] - arr[n-i];
            long min = arr[i-1];
//            System.out.println(max);
//            System.out.println(min);
            ans += (max - min + 1);
            ans %= MOD;
        }

        System.out.println(ans % MOD + 1);

    }
}
