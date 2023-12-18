/*
 * 黒板に N 個の整数が書かれています。i 番目の整数は Aiです。
 * 
 * これらの数に対して、高橋君は以下の操作を繰り返します。
 * 
 *     偶奇が等しい 2つの数 Ai,Ajを一組選び、それらを黒板から消す。
 *     その後、二つの数の和 Ai+Ajを黒板に書く。
 * 
 * 最終的に黒板に数が 1つだけ残るようにできるかどうか判定して下さい。
 */

import java.util.*;
	public class  Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            int n = Integer.parseInt(sc.next());
            int count = 0;
            
            for(int i=0; i<n; i++){
            	int a = Integer.parseInt(sc.next());
            	if(a%2==1){
            		count++;
            	}
            }
            // 出力
            if(count%2==0){
            	System.out.println("YES");
            }else{
            	System.out.println("NO");
            }
            sc.close();
        }
    }
	
