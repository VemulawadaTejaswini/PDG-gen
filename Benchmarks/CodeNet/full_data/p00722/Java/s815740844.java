import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] createPrimes(int n) {
        int[] ans = new int[n+1];
        Arrays.fill(ans, 1);
        ans[0] = ans[1] = 0;

        int max = (int)Math.sqrt(n) + 1;

        for (int i = 2; i < n/2 + 1; i++) {
            ans[i*2] = 0;
        }

        for (int i = 3; i <= max; i += 2) {
            for (int j = 2; j < n / i; j++) {
                ans[i*j] = 0;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, d, n;
        int m = (int)Math.pow(10, 6);
        int[] primes = createPrimes(m);

//        int[] subarray = new int[50]; // to debug


//        System.arraycopy(primes, 0, subarray, 0, 50);
//        System.out.println(Arrays.toString(subarray));

        while (true) {
            a = Integer.parseInt(sc.next());
            d = Integer.parseInt(sc.next());
            n = Integer.parseInt(sc.next());
            int c = 0;

            if (a == 0) break;

            int i = 0;
            while (true) {
                if (primes[a + i * d] == 1)
                    c++;
                if (c == n) {
                    System.out.println(a + i * d);
                    break;
                }
                i++;
            }







        }
    }
}