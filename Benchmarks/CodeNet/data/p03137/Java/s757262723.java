import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // コマ数
        int M = sc.nextInt();  // 座標数

        int[] X = new int[M]; // 座標
        for (int i = 0; i < M; i++) {
            X[i] = sc.nextInt();
        }
        Arrays.sort(X);

        Integer[] distances = new Integer[M - 1];
        for (int i = 0; i <= M - 2; i++) {
            distances[i] = X[i + 1] - X[i];
        }
        Arrays.sort(distances, Comparator.reverseOrder());

        if (N >= M) {
            System.out.print(0);
            return;
        }

        int distanceToMove = X[M - 1] - X[0];
        for (int i = 0; i < N - 1; i++) {
            distanceToMove -= distances[i];
        }
        System.out.print(distanceToMove);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}