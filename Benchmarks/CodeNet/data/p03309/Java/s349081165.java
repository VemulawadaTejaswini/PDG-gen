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
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            A[i] = A[i] - (i + 1);
        }
        Arrays.sort(A);
        int b = A[N / 2];
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += Math.abs(A[i] - b);
        }
        System.out.println(ans);
    }
}