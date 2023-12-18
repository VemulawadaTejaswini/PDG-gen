import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long n = sc.nextLong();

        long ans = 0;

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                for (int k=1; k<=n; k++) {
                    long tmp = gcd(i, j);
                    ans += gcd(tmp, k);
                }
            }
        }

        System.out.println(ans);
    }

    long gcd(long a, long b) {
        long tmp;
        while ((tmp=a%b)!=0) {
            a = b;
            b = tmp;
        }
        return b;
    }

}
