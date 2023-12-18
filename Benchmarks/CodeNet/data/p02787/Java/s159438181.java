import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int n = sc.nextInt();
        Magic[] magic = new Magic[n];

        for (int i = 0; i < n; i++) {
            magic[i] = new Magic(sc.nextInt(), sc.nextInt());
        }

        long[][] dp = new long[n + 1][h + 1];

        //  i = 使う魔法のindex, j = 与えるダメージの合計
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= h; j++) {
                // i種類目の魔法を使わない時、使う前の値と同じにする
                if (dp[i + 1][j] == 0) {
                    if (dp[i][j] == 0) {
                        dp[i + 1][j] = magic[i].consume;
                    } else {
                        dp[i + 1][j] = dp[i][j];
                    }
                } else if (dp[i][j] != 0) {
                    dp[i + 1][j] = Math.min(dp[i][j], dp[i + 1][j]);
                }
                // このindexはダメージのはみ出しを丸める
                int index = Math.min(j + magic[i].attack, h);
                // i種類目の魔法を使った場合と使わなかった場合の答えを比較する
                if (dp[i + 1][index] == 0) {
                    dp[i + 1][index] = dp[i + 1][j] + magic[i].consume;
                } else {
                    dp[i + 1][index] = Math.min(dp[i + 1][j] + magic[i].consume,
                            dp[i + 1][index]);
                }
            }
        }

        System.out.println(dp[n][h]);
    }

    private static class Magic {
        private int attack;
        private int consume;

        private Magic(int attack, int consume) {
            this.attack = attack;
            this.consume = consume;
        }
    }
}