import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		long b = sc.nextInt();
		long n = sc.nextInt();
		
		int ma = 0;
		for (int i = 1; i<=n; i++) {
			double x=0.0;
			double y=0.0;
			x=a*i/b;
			y=i/b;
			int s = (int) (Math.floor(x) - a*Math.floor(y)) ;
			if (s > ma) {
				ma = s;
			}
		}
		System.out.println(ma);
 	
	
	}
}
