import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long sum = 0;
        
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <=K; j++) {
                for (int m = 1; m<=K; m++) {
                    sum+=gcd(gcd(i, j), m);
                }
            }
        }
        
        System.out.println(sum);
        sc.close();
    }
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}