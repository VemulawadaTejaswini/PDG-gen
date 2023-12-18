import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] D = new int[N];
        int[] A = new int[1000000];
        int max = 0;
        for (int i = 0; i < N; i++) {
            D[i] = scanner.nextInt();
            A[D[i]]++;
            max = Math.max(D[i], max);
        }
        int ans = 1;
        for (int j = 0; j < max+1; j++) {
            if (A[j] == 0) {
                System.out.println(0);
                return;
            }
        }
        for (int j = max; j != 0; j--) {
            ans = ((ans % 998244353) * (power(j,  A[j]) % 998244353)) % 998244353;
        }
        System.out.println(ans);
    }

    static int power(int a, int n) {
        //　結果の初期値
        int result = 1;
        // nが１の場合に計算
        if (1 <= n) {
            // aをn回掛ける
            for (int i = 0; i < n; ++i) {
                result = ((result % 998244353) * (a % 998244353)) % 998244353;
            }
        }
        // 結果を戻す
        return result;
    }
}
