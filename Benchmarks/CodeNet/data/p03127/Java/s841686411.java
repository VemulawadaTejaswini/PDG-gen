import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        if(a == 0 || b == 0) return a + b;
        return (b > a) ? gcd(b % a, a) : gcd(a % b, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int A = sc.nextInt();
        int ans = gcd(A, sc.nextInt());
        for(int i = 0; i < N - 2; ++i) {
            ans = gcd(ans, sc.nextInt());
        }

        System.out.println(ans);
    }
}
