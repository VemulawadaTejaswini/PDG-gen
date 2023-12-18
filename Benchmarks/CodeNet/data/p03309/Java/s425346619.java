import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        long ans = 0;
        long Ans = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = A[i];
            A[i] = A[i] - (i + 1);
            ans += A[i];
        }
        ans = Math.abs(ans / N);
        for (int i = 0; i < N; i++) {
            Ans += Math.abs(B[i] - (ans + i + 1));
        }
        System.out.println(Ans);
    }
}