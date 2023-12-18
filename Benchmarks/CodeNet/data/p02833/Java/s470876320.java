import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		long N = in.nextLong();

		if(N % 2 == 1) {
			System.out.println(0);
			return;
		}

		String strN = String.valueOf(N);
		final int NumOfDigits = strN.length();

		long answer = 0;

		for(int digit = NumOfDigits; digit > NumOfDigits-1; digit--) {
			int idx = NumOfDigits - digit;
			int num = Integer.valueOf(strN.substring(idx, idx+1));
			answer += num * (digit - 1);

			for(int d = digit-1; d > 1; d--) {
				long a = (num) * 9;
				answer += a;

				int idx2 = NumOfDigits - d;
				int num2 = Integer.valueOf(strN.substring(idx2, idx2+1));
				int b = num2 * (d - 1);
				answer += b;
			}
		}

//		answer += Integer.valueOf(strN.substring(0, 1)) * (NumOfDigits-1);

		System.out.println(answer);

	}

//	public static int work() {
//		long ret
//		for(int digit = NumOfDigits-1; digit > 1; digit--) {
//			answer += 9 * (digit - 1);
//		}
//	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}