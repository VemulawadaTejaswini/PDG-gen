import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] a = new int[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
            sum += a[i];
        }
        if (sum < K) {
            System.out.println(N);
            return;
        }
        Arrays.sort(a);
        boolean[][] L = new boolean[N+2][K+1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(L[i], false);
        }
        L[0][0] = true;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                if (!L[i-1][j]) {
                    continue;
                }
                L[i][j] = true;
                if (j+a[i-1] <= K) {
                    L[i][j + a[i - 1]] = true;
                }
            }
        }
        for (int j = 0; j <= K; j++) {
            L[N+1][j] = L[N][j];
        }
        boolean[][] R = new boolean[N+2][K+1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(R[i], false);
        }
        R[N+1][0] = true;
        for(int i = N; 1 <= i; i--) {
            for(int j = 0; j <= K; j++) {
                if (!R[i+1][j]) {
                    continue;
                }
                R[i][j] = true;
                if (j+a[i-1] <= K) {
                    R[i][j+a[i-1]] = true;
                }
            }
        }
        for (int j = 0; j <= K; j++) {
            R[0][j] = R[1][j];
        }
        int[][] countR = new int[N+2][K+1];
        for(int i = 0; i <= N; i++) {
            countR[i][0] = 1;
            for (int j = 1; j <= K; j++) {
                if (!R[i][j]) {
                    countR[i][j] = countR[i][j-1];
                } else {
                    countR[i][j] = countR[i][j-1]+1;
                }
            }
        }
        for(int j = 0; j <= K; j++) {
            countR[N+1][j] = countR[N][j];
        }
        long need = 0;
        for(int i = 1; i <= N; i++) {
            if (K <= a[i-1]) {
                need += 1;
                continue;
            }
            for(int j = 0; j < K; j++) {
                if(!L[i-1][j]) {
                    continue;
                }
                if (K-j-a[i-1]-1 < 0) {
                    if (0 < countR[i+1][K-j-1]) {
                        need += 1;
                        break;
                    }
                } else if (0 < countR[i+1][K-j-1]-countR[i+1][K-j-a[i-1]-1]) {
                    need += 1;
                    break;
                }
            }
        }
        System.out.println(N-need);
    }
}
