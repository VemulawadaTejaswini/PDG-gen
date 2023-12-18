import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        long[] x = new long[N];
        for (int i = 0; i < N; i++) {
            x[i] = (long) sc.nextInt();
        }
        // 入力完了

        // 無条件で最初は一番遠い場所へ行く
        long enegyCount = 0;
        long dushCount = 0;
        long goCount = 0;
        long backCount = 0;

        long pickCount = 0;
        long dustCount = 0;

        for (int i = N - 1; i > 0; i--) {
            // iまで行って拾う
            pickCount++;
            dushCount++;
            goCount += x[i];
            // 比較する
            long direct = kk11(x[i], dushCount) + X;
            long pick = kk11(x[i - 1], dushCount + 1) + kk11(x[i] - x[i - 1], dushCount);

            if (direct < pick) {
                enegyCount += direct - X;
                dustCount++;
                dushCount = 0;

                if (i == 1) {
                    goCount += x[0];
                    pickCount++;
                    dustCount++;
                    enegyCount += kk11(x[0], 1);

                    break;
                }
            } else {
                goCount -= x[i - 1];

                pickCount++;
                if (i == 1) {
                    goCount += x[0];
                    enegyCount += pick;
                    dustCount++;
                    break;
                }
                // pickの方が少ない場合拾う。
                i--;

            }
        }
        long operation = (pickCount + dustCount) * X;

        System.out.println(enegyCount + operation + goCount);

    }

    // 原点との距離と持っているゴミの数で帰宅までのエネルギーを計算
    public static long kk11(long distance, long dushNum) {
        return distance * (long) Math.pow(dushNum + 1, 2);
    }
}