import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = solve(n, k);
        System.out.println(ans);
    }

    static int solve(int N, int K) {
        int ans = 0;
        int tmp = 0;
        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                // a + b で条件を満たさない場合は次の数を探索
                if ((a + b) < K || (a + b) % K != 0) {
                    continue;
                }

                if (2 * a % K == 0 && (a + b) % K == 0) {
                    tmp++;
                }
            }

            ans += tmp * tmp;
            tmp = 0;
        }
        return ans;
    }
}

