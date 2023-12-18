/*
 * 1 以上 9 以下の数字のみからなる文字列 S が与えられます。 この文字列の中で、あなたはこれら文字と文字の間のうち、いくつかの場所に + を入れることができます。 一つも入れなくてもかまいません。
 * ただし、+ が連続してはいけません。
 * 
 * このようにして出来る全ての文字列を数式とみなし、和を計算することができます。
 * 
 * ありうる全ての数式の値を計算し、その合計を出力してください。
 */

import java.util.*;
	public class Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            long s = Long.parseLong(sc.next());
            int sLen = String.valueOf(s).length();
            
            // 出力
            System.out.println(makeSum(s, sLen));

            sc.close();
        }
		
		public static long makeSum(long s, int sLen){
			long ret = 0;
			
            for(int i=0; i<sLen-1; i++){
            	ret += Integer.parseInt(String.valueOf(s).substring(0, i+1)) * Math.pow(2, sLen-i-2) + makeSum(Integer.parseInt(String.valueOf(s).substring(i+1)), sLen-i-1);
            }
            
            return ret+s;
        }
    }
	