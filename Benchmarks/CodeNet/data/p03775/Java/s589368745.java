import java.util.*;
public class Main {

	public static int digits(long n) {
		int digit = 0;
		while(n > 0) {
			digit++;
			n /= 10;
		}
		return digit;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int ans = 10;
		for(int i = 1; i <= Math.sqrt(N); i++) {
			if(N % i == 0)
				ans = Math.min(ans, Math.max(digits(N/i), digits(i)));
		}
		System.out.println(ans);
	}

}