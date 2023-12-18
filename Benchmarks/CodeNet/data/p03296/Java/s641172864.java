
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            if (i != 0 && a[i - 1] == a[i]) {
                a[i] = N + 1;
                ans++;
            }
        }
        System.out.println(ans);
    }
}