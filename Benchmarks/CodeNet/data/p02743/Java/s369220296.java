import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		if ( a+b>=c ) {
			System.out.println("No");
			System.exit(0);
		}

		long n = (long)Math.pow(c-a-b,2);
		long m = a*b;
		if ( m < n/4 || (m=n/4 && n%4>0) ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}