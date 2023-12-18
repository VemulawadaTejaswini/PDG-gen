import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;


	public static void main(String[] args) {

		long ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();


		//-------------------------------------------------------------------------------------

		if(a >= b) {
			double tmp = (a * n) / b;
			double tmp2 = n / b;
			ans = (long) Math.floor(tmp) - a * (long) Math.floor(tmp2);
		} else {
//			long loop = (long) Math.floor((double) b / (double) a);
			long dp = 0;
			for(long x = 1; x <= n; x++) {
				double tmp = (a * x) / b;
				double tmp2 = x / b;
				if (dp < (long) Math.floor(tmp) - a * (long) Math.floor(tmp2)) {
					dp = (long) Math.floor(tmp) - a * (long) Math.floor(tmp2);
				}
			}

			ans = dp;
		}
		//-------------------------------------------------------------------------------------

//		for(int i = 0; i < n; i++) {
//			System.out.println(ans[i]);
//		}

//		if(f) {
//			System.out.println("OK");
//		} else {
//			System.out.println("NG");
//		}

		System.out.println(ans);

		sc.close();
	}
}