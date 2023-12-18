import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (max >= ((N - 1) - i)) {
                break;
            }
            int moveCount = 0;
            for (int j = i; j <= N - 2; j++) {
                if (H[j] >= H[j + 1]) {
                    moveCount++;
                }
                else {
                    break;
                }
            }
            max = Math.max(max, moveCount);
        }
        System.out.print(max);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}