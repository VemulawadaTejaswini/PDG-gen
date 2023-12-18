/*
 * 高橋君は 1 辺の長さが N の 3 枚の鏡を正三角形状に組み合わせました。 三角形の頂点をそれぞれ a,b,c とします。
 * 
 * 高橋君は、辺 ab 上の頂点 a から X の点から、辺 bc と平行に不思議な光を発射しました。
 * 不思議な光は、普通の光と同じように真っすぐ進み、鏡に当たると反射するのですが、不思議な光がすでに通った点に当たったときにも反射をします。
 * 例えば、N=5,X=2 のとき、不思議な光の軌跡は図の黄色い矢印のようになります。
 * 
 * このように不思議な光を発射した時、不思議な光は必ず発射した点に戻ってくることが証明できます。 このとき、光の軌跡の長さが全体でいくらになるかを求めて下さい。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            int ret = n;
            
            n -= x;
            
            while(n != x){
            	if(n>x){
            		n -= x;
            		ret += 2 * x;
            	}else{
            		x -= n;
            		ret += 2 * n;
            	}
            }
            
            //出力
            System.out.println(ret + x);
            sc.close();
        }
    }
	