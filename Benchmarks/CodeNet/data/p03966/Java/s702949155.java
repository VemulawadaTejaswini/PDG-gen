/*
 * シカのAtCoDeerくんは選挙速報を見ています。選挙には二人の候補高橋くんと青木くんが出ています。速報では、現在の二人の得票数の比が表示されていますが、得票数そのものは表示されていません。
 * AtCoDeerくんは N 回画面を見て、 i(1≦i≦N) 回目に見たときに表示されている比は Ti:Ai でした。
 * ここで、AtCoDeerくんが選挙速報の画面を1回目に見た段階で既にどちらの候補にも少なくとも一票は入っていたことがわかっています。
 * N 回目に画面を見たときの投票数(二人の得票数の和)として考えられるもののうち最小となるものを求めてください。ただし、得票数が途中で減ることはありません。
 */

import java.util.*;
	public class Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            
            long t = 1;
            long a = 1;
            
            // 
            for(int i=0; i<n; i++){
            	// 
            	int ti = Integer.parseInt(sc.next());
                int ai = Integer.parseInt(sc.next());
                long temp = (long)Math.max(ceil(t, ti), ceil(a, ai));
                t = temp * ti;
                a = temp * ai;
            }
            
            System.out.println(t + a);
            sc.close();
		}
		
		public static long ceil(long a, long b){
			long ret = a/b;
			
            if(a%b != 0){
            	ret ++;
            }
            
            return ret;
		}
    }
	