import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; ++i) {
            int num = sc.nextInt() - 1;
            A[num]++;
        }
        Arrays.sort(A);
        sc.close();

        int cnt = 0;
        for (int i = 0; i < N; ++i) {
            if (A[i] > 0) {
                cnt++;
            }
        }

        // 0を除く最小の数字の個数を書き替える
        // 実際の種類cntと目標の種類Kの差の回数
        int ans = 0;
        if (cnt > K) {
            for (int i = (N - cnt); i < (N - cnt) + (cnt - K); ++i) {
                ans += A[i];
            }
        }
        System.out.println(ans);
    }
}