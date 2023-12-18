/*
 * スケートリンクで、一人の大人の司会と N 人の子供がゲームを行います。 ゲームは K ラウンドからなり、ラウンド i では司会が次のように言います。
 * 
 *     Ai 人組を作って！
 * 
 * すると、まだ脱落していない子供たちは Ai 人からなるグループをできるだけ多く組みます。 一人につき一つのグループにしか入れません。 グループに入れなかった子供たちは脱落し、その他は次のラウンドに進みます。 
 * ラウンドで誰も脱落しないこともありえます。
 * 
 * 最後まで、つまりラウンド K のあとまで残ったのは 2 人で、彼らが勝者となりました。
 * 
 * あなたは A1, A2, ..., AK の値を聞き、N の値は知りませんが、推定してみたくなりました。
 * 
 * ゲームの開始前にいた子供たちの人数として考えられる最小の値と、最大の値を求めてください。もしくは、考えられる N の値は存在しないと判定してください。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int k = Integer.parseInt(sc.next());
            int[] ak = new int[k];
            
            for(int i=0; i<k; i++){
            	ak[i] = Integer.parseInt(sc.next());
            }
            sc.close();
            
            int min = 2;
            int max = 3;
            for(int i=k-1; i>=0; i--){
            	if((max-1)/ak[i] <= (min-1)/ak[i]){
            		System.out.println(-1);
            		return;
            	}
            	min = ak[i] * ((min-1)/ak[i] + 1);
            	max = ak[i] * ((max-1)/ak[i] + 1);
            }
            
            //出力
            System.out.println(min + " " + (max-1));
        }
    }
	