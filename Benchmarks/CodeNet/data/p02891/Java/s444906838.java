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
            return s.length() / 2 * k;
        }

        // 異なるが1つでもある場合
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
            if (k == 1) {
                for (int i = 0; i < ranlength.size(); i++) {
                    ans += ranlength.get(i) / 2;
                }
                return ans;
            }

            // 最初と最後が繋がる場合、最後の値以外をまず加算する
            for (int i = 0; i < ranlength.size() - 1; i++) {
                ans += ranlength.get(i) / 2;
            }

            // 最初の値を最後の値との合算値に置き換える
            System.err.println(ranlength);
            ranlength.set(0, ranlength.get(0) + ranlength.get(ranlength.size() - 1));
            System.err.println(ranlength);

            // 置き換えた値で各要素の連結個数/2を加算する
            long tmp = 0;
            for (int i = 0; i < ranlength.size(); i++) {
                tmp += ranlength.get(i) / 2;
            }

            // K-1回だけ加算する
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
