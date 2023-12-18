import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);

        // ロード
        String[] NK = sc.nextLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);
        int[] A = new int[N];
        String[] numberLine = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(numberLine[i]);
        }

        // メイン処理
        /*
         * 1. 配列をソート
         * 2. {K未満の数のみ存在ならば"IMPOSSIBLE", Kと同じ値が存在するならば"POSSIBLE", Kより大きいものが存在するならば次のステップへ}
         * 3. 階差の計算とソートを繰り返し, 同じ数値のみになるまで行う
         * 4. 最終値が1ならば"POSSIBLE", 2以上ならば次のステップへ
         * 5. 「配列Aの最大値 % 最終値 == 0」がtrueならば"POSSIBLE", falseならば"IMPOSSIBLE"
         */
        // 1. 配列をソート
        Arrays.sort(A);

        // 2. {K未満の数のみ存在ならば"IMPOSSIBLE", Kと同じ値が存在するならば"POSSIBLE", Kより大きいものが存在するならば次のステップへ}
        if (K > A[N - 1]) {
            System.out.println("IMPOSSIBLE");
            sc.close();
            return;
        }
        if (Arrays.binarySearch(A, K) >= 0) {
            System.out.println("POSSIBLE");
            sc.close();
            return;
        }

        // 3. 階差の計算とソートを繰り返し, 同じ数値のみになるまで行う
        TreeSet<Integer> diff_UniqueSet = new TreeSet<>();
        // 初回
        for (int i = 0; i < (N - 1); i++) {
            diff_UniqueSet.add(Integer.valueOf(A[i + 1] - A[i]));
        }
        // 2回目以降
        Iterator<Integer> iter;
        int firstLowestValue;
        int secondLowestValue;
        while (diff_UniqueSet.size() != 1) {
            iter = diff_UniqueSet.iterator();
            firstLowestValue = iter.next().intValue();
            secondLowestValue = iter.next().intValue();
            diff_UniqueSet.add(secondLowestValue - firstLowestValue);
            diff_UniqueSet.remove(Integer.valueOf(secondLowestValue));
        }

        // 4. その値が1ならば"POSSIBLE", 2以上ならば次のステップへ
        int minConfig = diff_UniqueSet.first().intValue();
        if (minConfig == 1) {
            System.out.println("POSSIBLE");
            sc.close();
            return;
        }

        // 5. 「配列Aの最大値 % 最終値 == 0」がtrueならば"POSSIBLE", falseならば"IMPOSSIBLE"
        if ((A[N - 1] - K) % minConfig == 0) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }

        // scanner
        sc.close();
    }
}
