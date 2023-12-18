import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int ans = Math.max(A, Math.max(C, B));
        int ch = Math.max(A, Math.max(C, B));
        for (int i = 0; i < K; i++) {
            ans = ans * 2;
        }
        if (ch == A) {
            System.out.println(ans + B + C);
        } else if (ch == B) {
            System.out.println(ans + A + C);
        } else {
            System.out.println(ans + A + B);
        }
    }
}