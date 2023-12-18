/*
 * 1 以上 N 以下の整数のうち、10 進法での各桁の和が A 以上 B 以下であるものの総和を求めてください。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            //入力
            int n = Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());

            //解の和sum
            int sum = 0;
            // 各位の和のtemp、sumone
            int sumone = 0;

            for(int i=1; i<=n; i++){
            	sumone = i/10000 + (i/1000)%10 + (i/100)%10 + (i/10)%10 + i%10;
            	
            	if(a <= sumone &&  sumone <= b){
            		sum += i;
           		}
            }

            //出力
            System.out.println(sum);
            sc.close();
        }
    }
