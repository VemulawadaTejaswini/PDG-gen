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

        int minA = Integer.MAX_VALUE;
        int maxA = Integer.MIN_VALUE;
        int maxDiff = 0;   //高橋くんの最大稼ぎ
        int cnt = 0;       //高橋くんが最大稼ぎ出来る区間数
        for (int i = 0; i < N; i++) {
            boolean change = false;

            if (A[i] <= minA) {
                minA = A[i];
                maxA = minA;
                change = true;
            }

            if (A[i] >= maxA) {
                maxA = A[i];
                change = true;
            }

            if (maxDiff < maxA - minA) {
                maxDiff = maxA - minA;
                cnt = 1;
            } else if ((maxDiff == maxA - minA) && change) {
                cnt++;
            }
        }

        out.println(cnt);
    }
}