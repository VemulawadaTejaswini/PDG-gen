import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        boolean[] D = new boolean[10];
        Arrays.fill(D, true);
        for (int i = 0; i < K; i++) {
            D[sc.nextInt()] = false;
        }
        int ans = 0;
        for (int i = 1; i <= String.valueOf(N).length(); i++) {
            lavel:
            for (int j = N / (int) Math.pow(10, i - 1) % 10;; j++) {
                if (D[j]) {
                    ans += j * (int) Math.pow(10, i - 1);
                    break;
                }
                if (j == 9) {
                    j = -1;
                }
                if (i == String.valueOf(N).length() && j == -1) {
                    System.out.println(i);
                    j = 1;
                    for (int a = 1; a <= 9; a++) {
                        if (D[a]) {
                            ans += a * (int) Math.pow(10, i);
                            break lavel;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
