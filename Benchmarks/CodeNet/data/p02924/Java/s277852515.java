import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long ans = 0;
        for (int i = 1; i <= N - 1; i++) {
            ans += i;
        }
        System.out.print(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}