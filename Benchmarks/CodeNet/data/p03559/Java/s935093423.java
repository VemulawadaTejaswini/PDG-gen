import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        new Main().compute();
    }
 
    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];
        int[] B = new int[N + 1];
        int[] C = new int[N + 1];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }
        A[N] = Integer.MAX_VALUE;
        B[N] = Integer.MAX_VALUE;
        C[N] = Integer.MAX_VALUE;
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        long[] BTC = new long[N + 1];
        for (int i = 0, j = 0; i < N; i++) {
            for (;; j++) {
                if (B[i] < C[j]) {
                    break;
                }
            }
            BTC[i] = N - j;
        }
        BTC[N] = 0;
        for (int i = N - 1; i >= 0; i--) {
            BTC[i] += BTC[i + 1];
        }
        long[] ATB = new long[N];
        for (int i = 0, j = 0; i < N; i++) {
            for (;; j++) {
                if (A[i] < B[j]) {
                    break;
                }
            }
            ATB[i] = BTC[j];
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += ATB[i];
        }
        System.out.println(ans);
    }
}