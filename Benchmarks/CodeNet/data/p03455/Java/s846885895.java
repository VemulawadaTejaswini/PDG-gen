import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int in[][] = new int[N][3];
        for (int i = 0; i < in.length; i++) {
            in[i][0] = sc.nextInt();
            in[i][1] = sc.nextInt();
            in[i][2] = sc.nextInt();
        }

        boolean movable = true;
        int bt = 0;       // 前回時刻
        int bx = 0 ;      // 前回x座標
        int by = 0 ;      // 前回y座標
        int at = 0;       // 経過時刻
        int ax = 0 ;      // 経過x座標
        int ay = 0 ;      // 経過y座標

        for (int i = 0; i < N; i++) {

            at = in[i][0];
            ax = in[i][1];
            ay = in[i][2];

            // パリティチェック
            if (!(at%2 == (ax+ay)%2)) {
                movable = false;
                break;
            }

            // 移動可否チェック
            // 前回時刻 -> 経過時刻のターン数で移動可能か
            if((at - bt) < Math.abs(ax - bx) + Math.abs(ay - by)) {
                movable = false;
                break;
            }

            bt = at;
            bx = ax;
            by = ay;
        }
        System.out.println(movable ? "YES" : "NO");
    }
}