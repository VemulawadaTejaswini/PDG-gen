import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static long[][] comb = new long[51][51];
    public static void combTable() {
        for (int i = 0; i <= 50; ++i) {
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    comb[i][j] = 1;
                } else {
                    comb[i][j] = comb[i-1][j-1] + comb[i-1][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        combTable();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
        Long[] V = new Long[N];
        for (int i = 0; i < N; ++i) {
            V[i] = sc.nextLong();
        }
        Arrays.sort(V, Collections.reverseOrder());
        long maxv = V[0];
        int maxvLastIdx = 0;
        for (int i = 0; i < N; ++i) {
            if (V[i] == maxv) {
                maxvLastIdx = i;
            } else {
                break;
            }
        }
        double avg = 0.0;
        long cnt = 0;
        if (maxvLastIdx >= A - 1) {
            for (int i = A; i <= B; ++i) {
                cnt += comb[maxvLastIdx + 1][i];
            }
            avg = (double)maxv;
        } else {
            int x = 0, y = 0;
            int sum = 0;
            for (int i = 0; i < A; ++i) {
                if (V[A-1] == V[i]) {
                    ++y;
                }
                sum += V[i];
            }
            for (int i = 0; i < N; ++i) {
                if (V[A-1] == V[i]) {
                    ++x;
                }
            }
            cnt = comb[x][y];
            avg = (double)sum / (double)A;
        }
        System.out.printf("%.6f\n", avg);
        System.out.println(cnt);
    }
}
