// 整数全体をある数で割った余りで分類
// 余りが同じ整数はすべて同じ(合同≡)とみなす
// 加法、減法、乗法を行っても合同を保つことから
// (1) a + b ≡ 0 mod K
// (2) b + c ≡ 0 mod K
// (3) c + a ≡ 0 mod K
// (1) - (2) + (3) 2a ≡ 0 mod K
// Kが偶数の場合、mod K / 2 もゼロと合同になる
// Kが8の場合、mod 4 もゼロとなるものも対象となる
// Kで割った余りはKより小さい
// Kで割った余りの数が等しくなるものがいくつあるか数え
// a mod Kで全探索する
// 10の5乗を3回かけても15乗はlongの19乗で事足りる
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Main {
    static final int MAX_N = 200001;
    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        final String[] sl = s.split(" ");
        int N = Integer.parseInt(sl[0]);
        int K = Integer.parseInt(sl[1]);

        long[] A = new long[MAX_N];
        Arrays.fill(A, 0L);

        // a b c は 1 から
        for (int i = 1; i <= N; i++) A[i % K]++;

        long ans = 0L;

        // 余りはゼロから
        // a mod K 全探索
        for (int ma = 0; ma < K; ma++) {
            // b と c は a から見て 等価
            int mbmc = (K - ma) % K;

            if (2 * mbmc % K != 0) continue;

            ans += A[ma] * A[mbmc] * A[mbmc];
        }

        System.out.println(ans);
    }
}
