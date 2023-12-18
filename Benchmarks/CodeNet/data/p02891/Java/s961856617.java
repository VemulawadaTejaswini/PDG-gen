import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Long k = Long.parseLong(sc.nextLine());

        long ans = solve(s, k);
        System.out.println(ans);
    }

    static long solve(String s, long k) {
        // 全部同じ文字の場合は置き換える数 * K回
        if (isAllSameChar(s)) {
            return s.length() * k / 2;
        }

        // 異なる文字が1つでもある場合
        List<Long> ranlength = new ArrayList<>();
        long ranl = 1;

        // 元文字列で何回置き換える必要があるか計算する
        // ex) issii -> 122 = 2回
        for (int i = 1; i <= s.length(); i++) {
            if (i == s.length()) {
                ranlength.add(ranl);
                break;
            }
            if (s.charAt(i) == s.charAt(i - 1)) {
                ranl++;
            } else {
                ranlength.add(ranl);
                ranl = 1;
            }
        }

        // 先頭と最後が同じ文字の場合、置き換える数が変わる
        long ans = 0;
        if (isSameFirstAndLastChar(s)) {
            // @formatter:off
            /**
             * 最初と最後が同じ文字の場合、Kの回数次第で連結部が変わる
             * ただし、中間部分は数列の繰り返しになる
             * issii
             * 12       2
             *
             * issiiissii
             * 12 32    2
             *
             * issiiissiiissii
             * 12 32 32 2
             *
             * K=3のissiiissiiissiiの場合...
             * ①最初と最後の部分は元々のランレングス圧縮したリストの各値を/2した合計
             * 12       2
             * -> (1/2 + 2/2 + 2/2)
             * -> 2 回数
             *
             * ②真ん中部分(ex K=3)は同じ値が連続するので、元リストの先頭を置換して計算
             *    32 32
             * -> (3/2 + 2/2 + 3/2 + 2/2)
             * -> 4 回数
             *
             * ①②を合算して6回が答えになる
             */
            // @formatter:on
            // 置換前の状態は全部足してOK
            for (int i = 0; i < ranlength.size(); i++) {
                ans += ranlength.get(i) / 2;
            }

            // 最初の値を最後の値との合算値に置き換える
            ranlength.set(0, ranlength.get(0) + ranlength.get(ranlength.size() - 1));

            // 中間の部分の計算。0番目～length-1番目までを加算
            long tmp = 0;
            for (int i = 0; i < ranlength.size() - 1; i++) {
                tmp += ranlength.get(i) / 2;
            }

            // 中間部分をK-1回分加算する。置換前の要素で1回足しているので、-1.
            ans += tmp * (k - 1);

        } else {

            // 元の文字列を何回置き換えるか計算し、それをK倍したのが答え
            // ex) abbc 3 ->(121 = 1回) * 3 = 3回
            for (int i = 0; i < ranlength.size(); i++) {
                ans += ranlength.get(i) / 2;
            }
            ans *= k;
        }

        return ans;
    }

    private static boolean isAllSameChar(String s) {
        char bef = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (bef != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSameFirstAndLastChar(String s) {
        return s.charAt(0) == s.charAt(s.length() - 1);
    }
}
