import java.util.*;
import java.io.*;

public class Main {
    /*
    論理部分の説明のため, mod (10^9+7) の操作を省きました.大きなテストケースではWAが出ます
	元の回答は以下のURLから参照できます
    https://beta.atcoder.jp/contests/abc113/submissions/3539300
    */
    
    //配列参照.範囲外参照については1を返すこととする
    public static long access(long[] array, int index){
    	if(index<0 || index>=array.length) return 1;
    	else return array[index];
    }
    
    public static long solve(int H, int W, int K){
    	//"0本目からあみだくじをh段たどるとw本目にたどり着くようなh段のあみだくじの書き方"でDP
        long[][] dp = new long[H+1][W];
        //0段(横線を書けない)では明らかに0本目にたどり着くだけです
    	Arrays.fill(dp[0], 0); dp[0][0]=1;
    	
        /* 補題.
         * 特に制約がない時,x+1本の棒の間(つまり間隔がx箇所)に
         * あみだくじが成立するように1段分の横線を書く方法は何通りあるでしょうか?
         *　
         * 一番左に横線を引かない場合,残りx本の間に自由に線を引けます.
         * 一番左に横線を引くとその隣には引けず,残りx-1本の間に自由に引けます.
         * よって　f(x+1) = f(x) + f(x-1) となり,これはいわゆるフィボナッチ数列です.
         *
         * ここではf(8)くらいまでしか使わないので直接埋め込んでしまうことにしました
         */
    	long[] simpleBar = new long[]{1,2,3,5,8,13,21,34,55};
    	
        //1段ごとにDPを進めていきましょう
    	for(int h=1;h<=H;h++){
    		for(int w=0;w<W;w++){
                /* 真下に進む場合.
                 *         !
                 * |   |   |   |   |   |   |
                 * | ? | x | x | ? | ? | ? |
                 * |   |   |   |   |   |   |
                 *         !
                 * 左からw本目(0-indexed)から真下に進むような1段の書き方を考えます.
                 * 考えている縦線の両隣の空間には横線を書き込めません.
                 * またその左右に (w-1)個の空間と (W-w-2)個の空間が生まれます.
                 * これらの書き込み方は独立に決められるので,
                 * 上部のたどり着き方1通りに対し下部のたどり着き方は
                 * f(w-1)*f(W-w-2)で与えられます. なお, f(-1)=1 の処理に注意してください
                 */
    			dp[h][w] += dp[h-1][w] * access(simpleBar,w-1) * access(simpleBar,W-w-2);
                /* 左下に進む場合.
                 *         !
                 * |   |   |   |   |   |   |
                 * | x |---| x | ? | ? | ? |
                 * |   |   |   |   |   |   |
                 *     !
                 * 左からw本目(0-indexed)から左下に進むような1段の書き方を考えます.
                 * 考えている縦線の左に線を引き,その両隣には書けません.
                 * 左右に (w-2)個の空間と (W-w-2)個の空間が生まれます.
                 * 以下,真下のケースと同様に処理しましょう
                 */
    			if(w>0) {
    				dp[h][w-1] += dp[h-1][w] * access(simpleBar,w-2) * access(simpleBar,W-w-2);
    			}
                /* 右下に進む場合.
                 *         !
                 * |   |   |   |   |   |   |
                 * | ? | x |---| x | ? | ? |
                 * |   |   |   |   |   |   |
                 *             !
                 * 左からw本目(0-indexed)から右下に進むような1段の書き方を考えます.
                 * 考えている縦線の右に線を引き,その両隣には書けません.
                 * 左右に (w-1)個の空間と (W-w-3)個の空間が生まれます.
                 * 以下,真下のケースと同様に処理しましょう
                 */
    			if(w<W-1){
    			    dp[h][w+1] += dp[h-1][w] * access(simpleBar,w-1) * access(simpleBar,W-w-3);
    			} 
    		}
    		/*
             //この部分を有効化するとDPの推移を確認できます
            for(int h=0;h<=H;h++){
              System.out.println(Arrays.toString(dp[h]));
            }
            
            */
    	}
    	return dp[H][K];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt()-1; //縦線を 0-indexed で扱いたいので調整しておきました
        System.out.println(solve(H,W,K));
        
    }
}
