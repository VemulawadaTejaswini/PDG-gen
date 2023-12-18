import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 100000;
        int c = 0;
        for (int i = 0; i <=N; i++) {
            int t = i;
            while (t > 0) {
                c += t % 6;
                t /= 6;
            }
            t = N - i;
            while (t > 0) {
                c += t % 9;
                t /= 9;
            }
            ans = Math.min(c, ans);
            c = 0;
        }
        System.out.println(ans);
    }
}