/*
 * H 行 W 列のマス目があり、i 行目の j 列目のマスをマス (i,j) と呼びます。
 * 
 * このマス目には 1 から H×W までの整数が重複なく書かれており、マス (i,j) に書かれている整数は Ai,j です。
 * 
 * 魔法少女であるあなたは、魔力 |x−i|+|y−j| を消費することでマス (i,j) に置かれた駒をマス (x,y) に瞬間移動させることができます。
 * 
 * あなたは、魔法少女としての能力を計るために、Q 回の実技試験を受けなければなりません。
 * 
 * i 回目の実技試験は、以下の手順で行われます。
 * 
 *     初めに、駒が整数 Li の書かれているマスに置かれている。
 * 
 *     駒の置かれているマスに書かれている整数を x とする。x が Ri でない限り、駒を x+D の書かれているマスに移動することを繰り返す。x=Ri となったら終了する。
 * 
 *     ただし、Ri−Li が D の倍数であることは保証される。
 * 
 * それぞれの実技試験に対し、あなたの消費する魔力の総和を求めてください。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            int h = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            int[][] location = new int[h*w][2];
            for(int i=0; i<h*w; i++){
            	int a = Integer.parseInt(sc.next())-1;
            	location[a][0] = i/w;
            	location[a][1] = i%w;
            }
            int q = Integer.parseInt(sc.next());
            
            for(int i=0; i<q; i++){
            	// 入力
            	int l = Integer.parseInt(sc.next())-1;
            	int r = Integer.parseInt(sc.next())-1;
            	long sum = 0;
                while(l!=r){
                	sum += (long)(Math.abs(location[l][0] - location[l+d][0]) + Math.abs(location[l][1] - location[l+d][1]));
                	l += d;
                }
             // 出力
                System.out.println(sum);
            }
            
            sc.close();
        }
    }
