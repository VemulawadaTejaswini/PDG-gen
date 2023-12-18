import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = b - a;
        int K = 0;
        for (int i = 1; i <= ans; i++) {
            K += i;
        }
        System.out.println(K - b);
    }
}