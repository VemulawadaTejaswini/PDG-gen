import java.util.*;

public class Main {
    static int N;
    static int M;
    static int K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        int[][] black = new int[N+1][M+1];
        int v;
        for (int i = 0; i < N + 1; i++) {
            v  = M * i;
            if (v == K) {
                System.out.println("Yes");
                return;
            }
            black[i][0] = v;
            black[i][0] = M * i;
            for (int j = 1; j < M + 1; j++) {
                v = black[i][j - 1] + N - i - i;
                if (v == K) {
                    System.out.println("Yes");
                    return;
                }
                black[i][j] = v;
            }
        }
        System.out.println("No");
        return;
    }
}