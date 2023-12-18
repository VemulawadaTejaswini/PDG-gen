import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long ans = 0;
        if (N * 2 <= M) {
            M = M - 2 * N;
            ans = N;
        } else {
            for (int i = 0;; i++) {
                if (M >= 2 && N >= 1) {
                    N--;
                    M -= 2;
                } else {
                    ans = i;
                    System.out.println("a");
                    break;
                }
            }
        }
        int i;
        for (i = 0;; i++) {
            if (M >= 4) {
                M -= 4;
            } else {
                break;
            }
        }
        ans += i;
        System.out.println(ans);

    }
}
