import java.util.Scanner;

public class Main {
    static public void main(String[] args){
        Scanner in = new Scanner(System.in);

        long N = in.nextInt();
        long M = in.nextInt();
        String S = in.next();
        String T = in.next();

        long L = lcm(N, M);
        long ln = L/N;
        long lm = L/M;

        for (int n = 0; n < N; n++) {
            for (int m = 0; m < M; m++) {
                if (n * (int) ln == m * (int) lm) {
                    if (S.charAt(n) != T.charAt(m)){
                        System.out.println("-1");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(L);
    }

    private static long gcd(long m, long n){
        if (m < n) return gcd(n, m);
        if (n == 0) return m;
        return gcd(n, m%n);
    }

    private static long lcm(long m, long n){
        return m * n / gcd(m, n);
    }
}