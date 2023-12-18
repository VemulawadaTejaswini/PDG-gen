import java.util.Scanner;
import java.util.Arrays;

class Main {
    static final long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int minFactor[] = new int[a[n - 1] + 100];
        for (int i = 2; i < minFactor.length; i++) {
            if (minFactor[i] != 0)
                continue;
            for (int j = i; j < minFactor.length; j += i) {
                minFactor[j] = i;
            }
        }

        long lcm = 1;
        int totalCount[] = new int[a[n - 1] + 100];

        for (int i = 0; i < n; i++) {
            int target = a[i];
            while (target >= 2) {
                int div = minFactor[target];
                int count = 0;
                while (target % div == 0) {
                    count++;
                    target /= div;
                }
                totalCount[div] = Math.max(totalCount[div], count);
            }
        }

        for (int i = 0; i < totalCount.length; i++) {
            for (int j = 0; j < totalCount[i]; j++) {
                lcm = (lcm * i) % mod;
            }
        }

        long answer = 0;

        for (int i = 0; i < n; i++) {
            answer = (answer + (lcm * (pow(a[i], mod - 2)) % mod) % mod);
        }

        System.out.println(answer % mod);
        sc.close();

    }

    public static long pow(long a, long n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return a;
        if (n % 2 == 0)
            return pow((a * a) % mod, n / 2);
        return (a * pow((a * a) % mod, (n - 1) / 2)) % mod;
    }
}
