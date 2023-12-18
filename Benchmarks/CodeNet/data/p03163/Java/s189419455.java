import java.util.Scanner;

public class Main {

    static int N = 0;
    static int W = 0;
    static int[] wi;
    static int[] vi;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        W = Integer.parseInt(sc.next());
        wi = new int[N];
        vi = new int[N];
//        int[][] wivi = new int[W+1][N];

        for (int i = 0; i < N; i++) {

            wi[i] = Integer.parseInt(sc.next());
            vi[i] = Integer.parseInt(sc.next());
        }
        sc.close();

//        //dpとナップサックに関連付けをしたい
//        long[] dp = new long[W + 1];
//
//        dp[0] = 0;
//
//        for (int i = 0; i <= W; i++) {
//
//            long max = 0;
//
//            for (int j = 0; j < N; j++) {
//
//                wivi[i][j] = 0;
//
//                if (wi[j] <= i) {
//
//                    if(max < (dp[i - wi[j]] + vi[j]) && wivi[i - wi[j]][j] == 0) {
//
//                        max = (dp[i - wi[j]] + vi[j]);
//
//                        //wivi[i]を初期化
//                        for (int k = 0; k < N; k++) {
//
//                            wivi[i][k] = wivi[i - wi[j]][k];
//                        }
//
//                        //重複させないようにする
//                        wivi[i][j] = -1;
//                    };
//                }
//            }
//
//            dp[i] = max;
//        }

        System.out.println(knap(0,W));

    }

    //全探索する再帰
    public static long knap(int i,int j) {

        long res = 0;

        if (i == N) { //商品がもうないので0を代入する

            res = 0;
        } else if (j < wi[i]) { //容量不足なので入れない処理だけをする

            res = knap(i+1, j);
        } else { //入れると最大になるとは限らないので入れる時と入れない時の大きい方を取る

            res = Math.max(knap(i+1, j), knap(i+1, j-wi[i]) + vi[i]);
        }

        return res;
    }

}
