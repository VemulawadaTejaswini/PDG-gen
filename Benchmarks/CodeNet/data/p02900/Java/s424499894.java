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
		long sum = 0;
		if(gcd == 1) {
			sum++;
		}
		else if(is_prime(gcd)) {
			sum++;
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
						//System.out.println(N);
					}
				}
			}
		 System.out.println(sum);
	}
	private static long gcd(long x, long y) {
		long tmp;
		if(x==y){
			return 1;
		}
		else {
			while ((tmp = x % y) != 0) {
				x = y;
				y = tmp;
			}
			return y;
		}
	}
	private static boolean is_prime(long num) {
		if (num < 2) return false;
	    else if (num == 2) return true;
	    else if (num % 2 == 0) return false; 
		double sqrtNum = Math.sqrt(num);
	    for (int i = 3; i <= sqrtNum; i += 2)
	    {
	        if (num % i == 0)
	        {
	            return false;
	        }
	    }
	    return true;
	}
}