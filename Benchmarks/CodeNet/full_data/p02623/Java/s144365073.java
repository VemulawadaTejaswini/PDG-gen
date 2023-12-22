/*
Written by Kabir Kanha Arora
@kabirkanha
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long K = scanner.nextLong();
        long[] arr_A = new long[N];
        long[] arr_B = new long[M];
        for (int i = 0; i < N; ++i) {
            arr_A[i] = scanner.nextLong();
        }
        for (int i = 0; i < M; ++i) {
            arr_B[i] = scanner.nextLong();
        }
        int cnt_A = 0;
        int cnt_B = 0;
        long sum_A = 0;
        long sum_B = 0;
        for (int i = 0; i < N; ++i) {
            if (sum_A + arr_A[i] > K)
                break;
            sum_A += arr_A[i];
            cnt_A++;
        }
        for (int i = 0; i < M; ++i) {
            if (sum_B + arr_B[i] > K)
                break;
            sum_B += arr_B[i];
            cnt_B++;
        }
        long tot_sum = sum_A + sum_B;
        int tot_cnt = cnt_A + cnt_B;
//        System.out.println(tot_cnt);
        for (int i = cnt_A - 1, j = cnt_B - 1; tot_sum > K; ) {
            tot_cnt--;
            if (i == 0) {
                tot_sum -= arr_B[j];
                --j;
            } else if (j == 0) {
                tot_sum -= arr_A[i];
                --i;
            } else {
                if (arr_A[i] > arr_B[j]) {
                    tot_sum -= arr_A[i];
                    --i;
                } else {
                    tot_sum -= arr_B[j];
                    --j;
                }
            }
        }
        System.out.println(tot_cnt);
    }
}
