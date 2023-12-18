import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            int ans = 0;
            int x = 0;
            for (int j = 1; j <= N; j++) {
                if (i == j) continue;
                ans += Math.abs(x - A[j]);
                x = A[j];
            }
            ans += Math.abs(x);
            System.out.println(ans);
        }
    }
}
