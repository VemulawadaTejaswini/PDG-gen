import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] maxNum = new int[N];    //i番目より後の最大値

        maxNum[N - 1] = A[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            maxNum[i] = Math.max(maxNum[i + 1], A[i]);
        }

        int maxDiff = 0;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (maxDiff == maxNum[i] - A[i]) {
                cnt++;
            } else if (maxDiff < maxNum[i] - A[i]) {
                maxDiff = maxNum[i] - A[i];
                cnt = 1;
            }
        }

        out.println(cnt);
    }
}