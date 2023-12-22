import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // すぬけ君の数
        int K = sc.nextInt(); // お菓子の種類
        int[] d = new int[K]; // 何人お菓子をもっているか
        int[][] A = new int[K][N]; // 誰がお菓子をもっているか
        int[] sunuke = new int[N];

        for (int i = 0; i < K; i++) {
            d[i] = sc.nextInt();
            for (int j = 0; j < d[i]; j++) {
                A[i][sc.nextInt() - 1]++;
            }
        }
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] != 0) {
                    sunuke[j]++;
                }
            }
        }
        int ans = 0;

        for (int i = 0; i < N; i++) {
            if (sunuke[i] == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}