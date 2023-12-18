/*
 * 日本でよく使われる紙幣は、10000 円札、5000 円札、1000 円札です。以下、「お札」とはこれらのみを指します。
 * 
 * 青橋くんが言うには、彼が祖父から受け取ったお年玉袋にはお札が N 枚入っていて、合計で Y 円だったそうですが、嘘かもしれません。
 * このような状況がありうるか判定し、ありうる場合はお年玉袋の中身の候補を一つ見つけてください。なお、彼の祖父は十分裕福であり、お年玉袋は十分大きかったものとします。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            // 10000円札5000円札1000円札の枚数の配列num
            int[] num = new int[3];
            
            // 最も枚数が少ないように初期化
            num[0] = y/10000;
            num[1] = (y%10000)/5000;
            num[2] = (y%5000)/1000;
            
            // すべてのパターンの両替を考え、枚数の和がnであったらその組み合わせを出力してreturn
            for(int i=0; i<=num[0]; i++){
            	for(int j=0; j<=num[1] + 2*i; j++){
            		if(num[0]-i + num[1]+2*i-j + num[2]+5*j == n){
            			System.out.println(num[0]-i + " " + (num[1]+2*i-j) + " " + (num[2]+5*j));
                    	sc.close();
                    	return;
            		}
            	}
            }
            
            // 枚数の和がnになる組み合わせがなかったときは以下を出力
            System.out.println("-1 -1 -1");
            sc.close();
        }
    }
	