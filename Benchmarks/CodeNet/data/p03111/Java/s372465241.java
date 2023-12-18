import java.util.Scanner;

public class Main {

    int N, A, B, C;
    int[] len;
    int min = Integer.MAX_VALUE;

    void solve() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        len = new int[N];

        for (int i = 0; i < N; i++) {
            len[i] = sc.nextInt();
        }
        calcMinMP(0, 0,0, 0, 0);
        System.out.print(min);
    }

    // Aの長さがlenA、 Bの長さがlenB、Cの長さがlenC、MP が curMP の時、
    // curIndex 以降の材料を使って算出した最小の MP をグローバル変数の curMP に入れる。
    void calcMinMP(int curIndex, int curMP, int lenA, int lenB, int lenC) {
        // 最後の len[i] まで処理したので、ここで最小値を計算してreturnする。脱出条件。
        if (curIndex == N) {
            if (Math.min(Math.min(lenA, lenB), lenC) > 0) {
                int MP = (Math.abs(A - lenA) - 10) + (Math.abs(B - lenB) - 10) + (Math.abs(C - lenC) - 10);
                min = Math.min(MP + curMP, min);
                return;
            }
            else {
                return;
            }
        }

        // まだ処理すべきlen[i]があるので、次に行く。
        calcMinMP(curIndex + 1, curMP + 10, lenA + len[curIndex], lenB, lenC);
        calcMinMP(curIndex + 1, curMP + 10, lenA, lenB + len[curIndex], lenC);
        calcMinMP(curIndex + 1, curMP + 10, lenA, lenB, lenC + len[curIndex]);
        calcMinMP(curIndex + 1, curMP, lenA, lenB, lenC);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}