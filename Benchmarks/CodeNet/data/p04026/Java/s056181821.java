/*
 * 文字列 t について、t の長さが 2 以上であり、かつ t の中の文字のうち過半数が同じ文字であるとき、t をアンバランスであると呼ぶことにします。
 * 例えば、voodoo や melee はアンバランスであり、noon や a はアンバランスではありません。
 * 
 * 小文字のアルファベットからなる文字列 s が与えられます。s にアンバランスな (連続する) 部分文字列が存在するか判定してください。
 * 存在する場合は、s の中でそのような部分文字列が存在する位置を一つ示してください。
 */

import java.util.*;
	public class Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            String s = sc.next();
            int n = String.valueOf(s).length();

            for(int i=0; i<n-2; i++){
            	if(s.substring(i, i+1).equals(s.substring(i+1,i+2))){
            		System.out.println((i+1) + " " + (i+2));
            		sc.close();
            		return;
            	}else if(s.substring(i, i+1).equals(s.substring(i+2,i+3))){
            		System.out.println((i+1) + " " + (i+3));
            		sc.close();
            		return;
            	}
            }
            if(s.substring(n-2, n-1).equals(s.substring(n-1,n))){
        		System.out.println((n-1) + " " + n);
        		sc.close();
        		return;
        	}
            
            // 出力
            System.out.println("-1 -1");

            sc.close();
        }
    }
	