import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        int[] Q = new int[N];
        for (int i = 0; i < N; i++) {
            Q[P[i] - 1] = i;
        }

        int cnt = 1;
        int ret = 0;
        int prev = Q[0];
        for (int i = 1; i < N; i++) {
            if (Q[i] > prev) {
                cnt++;
            } else {
                ret = Math.max(ret, cnt);
                cnt = 1;
            }

            prev = Q[i];
        }

        System.out.println(N - ret);
    }
}