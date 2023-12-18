import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long C = sc.nextLong();
        long[] x = new long[N + 1];
        int[] v = new int[N + 1];
        long[] sumLeft = new long[N + 1];
        long[] sumRight = new long[N + 1];
        long[] sumLeftMax = new long[N + 1];
        long[] sumRightMax = new long[N + 1];
        long[] sumLeftTurnMax = new long[N + 1];
        long[] sumRightTurnMax = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            x[i] = sc.nextLong();
            v[i] = sc.nextInt();
            sumLeft[i] = sumLeft[i - 1] + v[i];
        }
        for (int i = 1; i <= N; i++) {
            sumRight[i] = sumRight[i - 1] + v[N - i + 1];
        }

        for (int i = 1; i <= N; i++) {
            sumLeftMax[i] = Math.max(sumLeftMax[i - 1], sumLeft[i] - x[i]);
            sumRightMax[i] = Math.max(sumRightMax[i - 1], sumRight[i] - (C - x[N - i + 1]));
        }
        for (int i = 1; i <= N; i++) {
            sumLeftTurnMax[i] = Math.max(sumLeftTurnMax[i - 1], sumLeft[i] - 2 * x[i] + sumRightMax[N - i]);
            sumRightTurnMax[i] = Math.max(sumRightTurnMax[i - 1], sumRight[i] - 2 * (C - x[N - i + 1]) + sumLeftMax[N - i]);
        }
        long max = Math.max(Math.max(sumLeftMax[N], sumRightMax[N]), Math.max(sumLeftTurnMax[N], sumRightTurnMax[N]));
        System.out.println(max);
        sc.close();
    }
}
