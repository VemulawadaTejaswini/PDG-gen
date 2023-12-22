import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		String ans = getAlpha(N);
		System.out.println(ans);
	}

	public static String getAlpha(long n) {
		String result = "";
		while (n > 0) {
			long remainder = n % 26;
			char digit = (char) (remainder + 96);
			result = digit + result;
			n = (n - remainder) / 26;
		}
		return result;
	}
}