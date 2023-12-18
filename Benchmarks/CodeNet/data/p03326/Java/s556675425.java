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

        // x+y+zの最大となるiを求める.
        int idx = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            long t = x[i] + y[i] + z[i];
            if (max < t) {
                max = t;
                idx = i;
            }
        }

        // 最大となるiの場合の各要素の負数チェック
        boolean xMinus = false;
        boolean yMinus = false;
        boolean zMinus = false;
        if (x[idx] < 0) {
            xMinus = true;
        }
        if (y[idx] < 0) {
            yMinus = true;
        }
        if (z[idx] < 0) {
            zMinus = true;
        }

        // i番目を除くx+y+xをソートするための準備
        List<Long> sortList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (i == idx) {
                continue;
            }
            long t = ((xMinus) ? -x[i] : x[i]) + ((yMinus) ? -y[i] : y[i]) + ((zMinus) ? -z[i] : z[i]);
            sortList.add(t);
        }
        // ソート
        sortList.sort(Comparator.reverseOrder());

        // M-1番目までの値を計算
        long count = ((xMinus) ? -x[idx] : x[idx]) + ((yMinus) ? -y[idx] : y[idx]) + ((zMinus) ? -z[idx] : z[idx]);
        for (int i = 0; i < (M - 1); i++) {
            count += sortList.get(i);
        }

        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);

    }

}
