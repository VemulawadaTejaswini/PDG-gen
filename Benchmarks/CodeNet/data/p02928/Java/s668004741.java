import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long K = scan.nextLong();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        long[] sumA = new long[N];
        long[] sumB = new long[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i] > A[j]) {
                    if (i < j) {
                        sumA[i] += 1;
                    }
                    sumB[i] += 1;
                }
            }
        }
        long MOD = 1000000007;
        long answer = 0;
        for (int i = 0; i < N; i++) {
            answer += K * sumA[i];
            answer %= MOD;
            if (1 < K) {
                long x = (K - 1) * K / 2;
                x %= MOD;
                answer += sumB[i] * x;
                answer %= MOD;
            }
        }
        System.out.println(answer);
    }
}
