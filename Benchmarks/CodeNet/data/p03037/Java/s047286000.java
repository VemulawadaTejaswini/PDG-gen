import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int cardNum = sc.nextInt(); // カード N 枚 ：(0 ~ N-1)
        int gateNum = sc.nextInt(); // ゲート M 個 ：(0 ~ M-1)
        int[] left = new int[gateNum];
        int[] right= new int[gateNum];
        for (int i = 0; i < gateNum; i++) {
            // 問題文上のインデックスをプログラミング上のインデックスに合わせる。
            left[i] = sc.nextInt() - 1;
            right[i] = sc.nextInt() - 1;
        }

        List<List<Integer>> allowedCardsList = new ArrayList<>();
        for (int i = 0; i < gateNum; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = left[i]; j <= right[i]; j++) {
                tmp.add(j);
            }
            allowedCardsList.add(tmp);
        }

        List<Integer> result = allowedCardsList.get(0);
        for (int i = 1; i < gateNum; i++) {
            result = getMutuals(result, allowedCardsList.get(i));
            if (result.size() == 0) {
                break;
            }
        }
        int ans = result.size();
        System.out.print(ans);
    }

    List<Integer> getMutuals (List<Integer> x, List<Integer> y) {
        List<Integer> result = new ArrayList<>();
        for (int xElm : x) {
            if (y.contains(xElm)) {
                result.add(xElm);
            }
        }
        return result;
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}