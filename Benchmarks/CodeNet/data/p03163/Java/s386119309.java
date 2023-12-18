package atCoder;

import java.util.Scanner;

public class Main {

    static int N = 0;
    static int W = 0;
    static int[] wi;
    static int[] vi;
    static long memo[][]; //関数の結果を保存するための配列

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        W = Integer.parseInt(sc.next());
        wi = new int[N];
        vi = new int[N];
        memo = new long[N+1][(N+1)*W];

        for (int i = 0; i < N; i++) {

            wi[i] = Integer.parseInt(sc.next());
            vi[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        System.out.println(knap(0,W));

    }

    //全探索する再帰
    public static long knap(int i,int j) {

        if (memo[i][j] != 0) {

            return memo[i][j];
        }

        long res = 0;

        if (i == N) { //商品がもうないので0を代入する

            res = 0;
        } else if (j < wi[i]) { //容量不足なので入れない処理だけをする

            res = knap(i+1, j);
        } else { //入れると最大になるとは限らないので入れる時と入れない時の大きい方を取る

            res = Math.max(knap(i+1, j), knap(i+1, j-wi[i]) + vi[i]);
        }

        return memo[i][j] = res;
    }

}
