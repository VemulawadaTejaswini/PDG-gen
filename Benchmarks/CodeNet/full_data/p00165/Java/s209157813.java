import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final int MP = 999983;
        boolean[] prime = new boolean[MP * 2 + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= MP; i++) {
            if (prime[i]) {
                for (int j = i + i; j <= MP; j += i)
                    prime[j] = false;
            }
        }
        int sums[] = new int[MP * 2 + 1];
        for (int i = 1; i <= MP; i++) {
            sums[i] = sums[i - 1] + (prime[i] ? 1 : 0);
        }
        for (int i = MP + 1; i <= MP * 2; i++) {
            sums[i] = sums[MP];
        }
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                int m = sc.nextInt();
                int x = sums[p + m] - (p > m ? sums[p - m - 1] : 0);
                if (x == 0)
                    ans--;
                else
                    ans += (x-1);
            }
            System.out.println(ans);
        }
    }
}