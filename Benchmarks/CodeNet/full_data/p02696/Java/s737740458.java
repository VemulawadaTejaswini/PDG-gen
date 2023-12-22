import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		
		long ma = 0;
		for (long i = 1; i<=n; i++) {
			double x=0.0;
			double y=0.0;
			x=a*i/b;
			y=i/b;
			long s = (long) (Math.floor(x) - a*Math.floor(y)) ;
			if (s > ma) {
				ma = s;
			}
		}
		System.out.println(ma);
 	
	
	}
}