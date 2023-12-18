import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int cardNum = sc.nextInt(); // カード N 枚 ：(0 ~ N-1)
        int gateNum = sc.nextInt(); // ゲート M 個 ：(0 ~ M-1)
        int[] left = new int[gateNum];
        int[] right = new int[gateNum];
        for (int i = 0; i < gateNum; i++) {
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }

        int curStart = 1;
        int curEnd = cardNum;
        for (int i = 0; i < gateNum; i++) {
            int start = left[i];
            int end = right[i];

            // 共通部分なし
            if(end < curStart || curEnd < start) {
                System.out.print(0);
                return;
            }
            else {
                if (curStart < start) {
                    curStart = start;
                }
                if (end < curEnd) {
                    curEnd = end;
                }
            }
        }
        int ans = curEnd - curStart + 1;
        System.out.print(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}