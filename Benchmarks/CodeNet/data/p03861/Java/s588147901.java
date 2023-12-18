	
	import java.math.BigInteger;
	import java.util.Scanner;
	
	class Main {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			long a = sc.nextLong();
			long b = sc.nextLong();
			long x = sc.nextLong();
			
			long cnt = 0;
			if (a % x == 0) cnt++;
			cnt += (b / x) - (a / x);
			System.out.println(cnt);
		}
	}