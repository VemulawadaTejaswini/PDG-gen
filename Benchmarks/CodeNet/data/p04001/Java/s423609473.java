
import java.util.*;

public class Main {
	static long sum=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		// String→long 変換
		long n = Long.parseLong(s);
		
		// nの桁数を求める
		int digit = String.valueOf(n).length();
		
		calc(n,digit,0);
		
		System.out.println(sum);
	}
	
	static void calc(long n, int digit, long tmp_sum) {
		if(digit==1) {
			sum += (tmp_sum + n);
			return;
		}
		
		int real_digit = String.valueOf(n).length();
		
		calc((long)(n/Math.pow(10,(real_digit-digit+1))),
				digit-1,(long)(tmp_sum+n%Math.pow(10,(real_digit-digit+1))));
		calc(n,digit-1,tmp_sum);
	}
	
}
