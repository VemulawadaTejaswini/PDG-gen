import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long s = Long.parseLong(sc.next());

		long lower = 0;
		long upper = 0;
		for(int i = 10; i <= Math.pow(10, 11); i *= 10) {
			long temp = function(i, n);
			if(temp >= s) {
				lower = i / 10;
				upper = i;
				break;
			}
		}


		boolean flag = false;
		for(int b = 2; b < Math.pow(10, 11); b++) {
			if(function(b, n) == s) {
				System.out.println(b);
				flag = true;
				break;
			}
		}

		if(!flag) System.out.println(-1);
	}

	public static long function(long b, long n) {
		if(n < b) {
			return n;
		}else {
			return function(b, (long)(n/b))+(n%b);
		}
	}

//	public static long sumDigit(long value) {
//		if(value <= 9) {
//			return value;
//		}else {
//			double divTen = value / 10;
//			long intValue = (long)divTen;
//			int digit = (int)((divTen - intValue) * 10);
//			return sumDigit(intValue) + digit;
//		}
//	}

}
