import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        boolean[] sieve = sieve(100000 + 10);

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = 0;
            for (int j = l; j <= r; j += 2) {
                if (sieve[j] == true && sieve[(j + 1) / 2] == true) {
                    ans += 1;
                }
            }
            System.out.println(ans);
        }
    }

    public static boolean[] sieve(int n) {
        final boolean[] sieve = new boolean[n+1];
        sieve[0] = false;
        sieve[1] = false;
        sieve[2] = true;
        for (int i = 3; i <= n; i += 2) {
            sieve[i] = true;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (sieve[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    sieve[j] = false;
                }
            }
        }

        return sieve;
    }
}
