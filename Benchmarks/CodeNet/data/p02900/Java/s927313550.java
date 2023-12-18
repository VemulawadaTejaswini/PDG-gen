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
			long y = gcd;
			 for (int i = 2; gcd > i; i++) {
				 int j = 0;
		            while ((y % i) == 0) {
		                //System.out.println(i);
		                y = y / i;
		                if(j==0)sum++;
		                j++;
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
		return y;
	}
}