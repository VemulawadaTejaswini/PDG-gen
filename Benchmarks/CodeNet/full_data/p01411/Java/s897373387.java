import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int H, N, P, M, K;
 
    public static void main(String[] args) throws Exception {
        H = sc.nextInt();
        N = sc.nextInt();
        P = sc.nextInt() - 1;
        M = sc.nextInt();
        K = sc.nextInt();
        int[] bridge = new int[H];
        Arrays.fill(bridge, -1);
        for (int i = 0; i < M; ++i) {
            int A = sc.nextInt() - 1;
            int B = sc.nextInt() - 1;
            bridge[A] = B;
        }
        double[][] prob = new double[K + 1][N];
        prob[0][P] = 1.0;
        int rest = H - M;
        for (int i = H - 1; i >= 0; --i) {
            if (bridge[i] != -1) {
                for (int j = 0; j <= K; ++j) {
                    swap(prob[j], bridge[i], bridge[i] + 1);
                }
            } else {
                double[][] next = new double[K + 1][N];
                for (int j = 0; j <= K; ++j) {
                    double select = 1.0 * (K - j) / rest;
                    for (int k = 0; k < N; ++k) {
                        next[j][k] += prob[j][k] * (1.0 - select);
                    }
                    if (j < K) {
                        next[j + 1][0] += select * (prob[j][0] * (N - 2) / (N - 1) + prob[j][1] / (N - 1));
                        for (int k = 1; k < N - 1; ++k) {
                            next[j + 1][k] += select * (prob[j][k] * (N - 3) / (N - 1) + prob[j][k - 1] / (N - 1) + prob[j][k + 1] / (N - 1));
                        }
                        next[j + 1][N - 1] += select * (prob[j][N - 1] * (N - 2) / (N - 1) + prob[j][N - 2] / (N - 1));
                    }
                }
                prob = next;
                --rest;
            }
        }
        double ans = 0;
        for (int i = 0; i < N; ++i) {
            ans = Math.max(ans, prob[K][i]);
        }
        System.out.println(ans);
    }
 
    static void swap(double[] a, int i, int j) {
        double tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
 
}