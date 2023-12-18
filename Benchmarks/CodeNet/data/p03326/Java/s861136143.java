import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // long startTime = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] x = new long[N];
        long[] y = new long[N];
        long[] z = new long[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            z[i] = sc.nextLong();
        }
        sc.close();

        long max = 0;

        long v1 = calc(N, M, x, y, z, true, true, true);
        max = Math.max(max, v1);
        long v2 = calc(N, M, x, y, z, true, true, false);
        max = Math.max(max, v2);
        long v3 = calc(N, M, x, y, z, true, false, true);
        max = Math.max(max, v3);
        long v4 = calc(N, M, x, y, z, false, true, true);
        max = Math.max(max, v4);
        long v5 = calc(N, M, x, y, z, true, false, false);
        max = Math.max(max, v5);
        long v6 = calc(N, M, x, y, z, false, false, true);
        max = Math.max(max, v6);
        long v7 = calc(N, M, x, y, z, false, true, false);
        max = Math.max(max, v7);
        long v8 = calc(N, M, x, y, z, false, false, false);
        max = Math.max(max, v8);

        System.out.println(max);

        // System.out.println(System.currentTimeMillis() - startTime);

    }

    public static long calc(int N, int M, long[] x, long y[], long z[], boolean xMinus, boolean yMinus,
            boolean zMinus) {
        List<Long> sortList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            long t = ((xMinus) ? -x[i] : x[i]) + ((yMinus) ? -y[i] : y[i]) + ((zMinus) ? -z[i] : z[i]);
            sortList.add(t);
        }
        // ソート
        sortList.sort(Comparator.reverseOrder());

        // M番目までの値を計算
        int count = 0;
        for (int i = 0; i < M; i++) {
            count += sortList.get(i);
        }

        return count;
    }
}
