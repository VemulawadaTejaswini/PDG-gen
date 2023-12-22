import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long mod = 1000000007;
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        
        long[] sum = new long[n+1];
        for (int i = 0; i < n; i++) {
            sum[n-1-i] += sum[n-i] + a[n-1-i];
            sum[n-1-i] %= mod;
        }
        
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i] * sum[i+1];
            result %= mod;
        }
        System.out.println(result);
    }
}
