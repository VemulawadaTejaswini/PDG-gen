import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        if (A > B) {
            long tmp = B;
            B = A;
            A = tmp;
        }

        long gcd = gcd(A, B);
        int N = (int) Math.sqrt((double) gcd);

        int ans = 1;
        for (int i = 2; i <= N; i++) {
            if (gcd % i == 0) {
                ans++;
                while (gcd % i == 0) {
                    gcd = gcd / i;
                }
            }
        }
        if (gcd != 1) {
            ans++;
        }

        System.out.println(ans);
    }

    static long gcd(long x, long y) {
        return y > 0 ? gcd(y, x % y) : x;
    }
 
}