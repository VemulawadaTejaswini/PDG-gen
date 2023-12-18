

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    //商品数n
    static int n = sc.nextInt();
    //ナップサック容量w これを超えないようにする
    static int w = sc.nextInt();
    //重さの配列
    static long weight[] = new long[n];
    //価値の配列
    static long value[] = new long[n];
    //dpの配列
    static long dp[][] = new long[110][100100];

    public static void main(String[] args) {
        for (int i = 0; i < n; i++){
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        for (int i = 0; i < 110; i++){
            for (int j = 0; j < 100100; j++){
                dp[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++){
            for (int sum_w = 0; sum_w <= w; sum_w++){
                if (sum_w - weight[i] >= 0)
                    dp[i + 1][sum_w] = chmax(dp[i + 1][sum_w], dp[i][(int)(sum_w - weight[i])] + value[i]);
                dp[i + 1][sum_w] = chmax(dp[i + 1][sum_w], dp[i][sum_w]);
            }
        }
        System.out.println(dp[n][w]);

    }
    static long chmax(long a, long b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
}
