import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        // 何度でも同じ魔法が使えるので, 基本同じ魔法しか使わない(はず)
        // 魔法の種類がN(<=10^3).
        // 普通に全ての魔法について, その魔法が最も効率の高い魔法であるという前提の元,
        // 攻撃を行う。すると, 最後の一撃に関してだけは, それよりも効率のいい一撃が存在する
        // 可能性があることに気がつく。
        // そのような魔法は, 残りの体力以上の攻撃力を持つ最も魔力の小さな攻撃である
        // (その中には当該魔法も含む)
        // 攻撃力の降順に魔法をソートしておくと,
        // dp[i] := iまでの魔法の中で最も魔力の小さなもの
        // を計算しておくことでこれを高速に導出できる.

        int[] idx = IntStream.range(0, N)
                .boxed().sorted(Comparator.comparing(i -> A[i]))
                .mapToInt(i -> i).toArray();
        int[] dp = new int[N+1];
        dp[N] = Integer.MAX_VALUE;
        for (int i = N - 1; i >= 0; i--) {
            dp[i] = Math.min(B[idx[i]], dp[i+1]);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int count = (H / A[i]);
            int residue = (H % A[i]);
            if (residue > 0) {
                int j = binarySearch(idx, A, residue, -1, N - 1);
                min = Math.min(min, dp[j] + count * B[i]);
            } else {
                min = Math.min(min, count * B[i]);
            }
        }

        System.out.println(min);
    }

    private static int binarySearch(int[] idx, int[] A, int N, int left, int right) {
        if (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (A[idx[mid]] >= N) return binarySearch(idx, A, N, left, mid);
            else return binarySearch(idx, A, N, mid, right);
        } else {
            return right;
        }
    }
}
