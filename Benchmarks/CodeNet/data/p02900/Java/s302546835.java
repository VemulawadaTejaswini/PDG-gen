import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x=Math.max(a, b);
		long y = Math.min(a, b);
		long tmp;
		boolean flg = false;
	    while ((tmp = x % y) != 0) {
	    	x = y;
	        y = tmp;
	    }
		long sum = 0;
		for(int i = 1; i <= Math.sqrt(y); i++) {
			flg = true;;
			if(a%i==0&&b%i==0) {
				for(int j = 2; j <= Math.sqrt(i); j++) {
					if(i%j == 0) {
						flg = false;
						break;
					}
				}
			if(flg)sum++;
			flg = true;
			}
			if(a%(y/i)==0&&b%(y/i)==0&&y!=1) {
				for(int l = 2;i<=Math.sqrt(y/i);l++)
			        {
			         if((y/i)%i==0) 
			         {
			           flg = false;
			           break;
			         }
			       }
			       if(flg) sum++;
			     	 flg = true;
			}
		}
		System.out.println(sum);
	}
}