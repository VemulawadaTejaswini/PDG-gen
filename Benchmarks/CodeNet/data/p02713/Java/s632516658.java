import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long ans = 0;
        for (long i = 1; i <= K; i++) {
            for (long j = 1; j <=K; j++) {
                for (long k = 1; k <=K; k++) {
                    ans += gcd(i,gcd(j, k));
                }
            }
        }
        System.out.println(ans);
    }

    public static final long gcd(long a, long b) {
        if( b == 0 ) return a;
        return gcd(b, a % b);
    }
}