import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= K; j++) {
                int a = gcd(i,j);
                for (int k = 1; k <= K; k++) {
                    total += gcd(a,k);
                }
            }
        }
        System.out.println(total);
    }
    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
