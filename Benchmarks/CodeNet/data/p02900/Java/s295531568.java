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
		long gcd = gcd(a,b);
		long tmp;
		boolean flg = false;
		long sum = 0;
		if(gcd == 1) {
			sum++;
		}
		else {
			sum++;
			long N = gcd;
			for(long i = 2; i <= N; i++) {
				if(N%i==0) {
					//System.out.println(i);
					sum++;
				}
				while(N%i==0) {
					N = N/i;
				}
			}
			
		}
		 System.out.println(sum);
	}
	private static long gcd(long x, long y) {
		long tmp;
		while ((tmp = x % y) != 0) {
	    	x = y;
	        y = tmp;
	    }
		//System.out.println(y);
		return y;
	}
}