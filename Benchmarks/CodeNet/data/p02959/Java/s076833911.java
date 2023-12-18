import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        long ans = 0;
        // 勇者でループを組む
        for (int i = 0; i < N; i++) {
            if (A[i] >= B[i]) { // モンスター >= 勇者
                ans += B[i];
            }
            else { // モンスター < 勇者
                ans += A[i];
                int leftB = B[i] - A[i];
                if (A[i + 1] >= leftB) { // 次の街のモンスター >= 勇者の残り
                    ans += leftB;
                    A[i + 1] -= leftB;
                }
                else { // 次の街のモンスター < 勇者の残り
                    ans += A[i + 1];
                    A[i + 1] = 0;
                }
            }
        }
        System.out.print(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

