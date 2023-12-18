import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 999999999;
        for (int i = 0; i <=N; i++) {
            int A = N - i;
            ans = Math.min(ans, i / 10000 + i / 1000 % 10 + i / 100 % 10 + i / 10 % 10 + i % 10 + A / 10000 + A / 1000 % 10 + A / 100 % 10 + A / 10 % 10 + A % 10);
        }
        System.out.println(ans);
    }
}