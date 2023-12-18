import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long sum = 0;
		for(int i = 1; i <= k; i++) {
			for(int j = i; j <= k; j++) {
				for(int n = j; n <= k; n++) {
					//System.out.println("Debug");
					if(i==j&&j==n) {
						sum+=solve(i,j,n);
					}
					else if(i!=j&&j!=n&&n!=i) {
						sum+=solve(i,j,n)*6;
					}
					else{
						sum+=solve(i,j,n)*3;
					}
				}
			}
		}
		System.out.println(sum);
	}
	private static long solve(long i, long j, long n) {
		long tmp;
		long a = i;
		long b = j;
		long gcd;
		while((tmp = b % a) != 0) {
			b=a;
			a=tmp;
		}
		gcd = a;
		long c;
		if(n<gcd) {
			a = n;
			c = gcd;
		}
		else {
			a = gcd;
			c = n;
		}
		while((tmp = c % a) != 0) {
			c=a;
			a=tmp;
		}
		//System.out.println(a);
		return a;
	}
}