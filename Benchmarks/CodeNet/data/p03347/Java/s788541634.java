
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long N1 = N;
        boolean ch = true;
        int ans = 0;
        long A = sc.nextLong();
        if (A != 0) {
            ch = false;
        }
        long B;
        for (long i = 2; i <= N; i++) {
            B = sc.nextLong();
            if (A == 0) {
                ans++;
            }
            if (Math.abs(A - B) > 1 || (B - A == -1 && B > 1)) {
                ch = false;
            }
            if ((Math.abs(A - B) == 0 && B > 1)||(B==2&&A-B==-1)) {
                N1++;
            }
            A = B;
        }
            System.out.println("-1");
    }
}