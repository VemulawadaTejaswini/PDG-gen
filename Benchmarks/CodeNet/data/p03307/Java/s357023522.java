import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = koujo(N, 2);
        System.out.println(N * 2 / ans);
    }

    int koujo(int n, int m) {
        if (m > n) {
            return koujo(m, n);
        }
        if (m == 0) {
            return n;
        }
        return koujo(m, n % m);
    }
}
