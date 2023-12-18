import java.util.Scanner;

public class Main {
    private final static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ar = new long[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextLong();
        }
        long res = 0;
        for (int i = 0; i <= 60; i++) {
            int zero = 0;
            int one = 0;
            for (int j = 0; j < n; j++) {
                if(ar[j] % 2 == 0)
                    zero += 1;
                else
                    one += 1;
                ar[j] = ar[j] / 2;
            }
            res += (zero * one * (1 << i)) % mod;
        }
        System.out.println(res % mod);
    }
}