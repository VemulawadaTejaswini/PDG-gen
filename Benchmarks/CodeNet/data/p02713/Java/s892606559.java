import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                for (int m = 1; m <= k; m++) {
                    sum += gcd(gcd(i,j), m);
                }
            }
        }
        System.out.println(sum);
    }
    // GCD
    public static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}