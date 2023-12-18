import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long A = scn.nextLong();
		long B = scn.nextLong();
		long C = scn.nextLong();
		long X = scn.nextLong();
		long Y = scn.nextLong();
		long ans = Long.MAX_VALUE;
		for(long i = 0;i <= Math.max(X, Y);i++) {
			ans = Math.min(ans, A * Math.max(0,X-i) + B * Math.max(0,(Y-i)) + C * 2 * i);
		}
		System.out.println(ans);
	}

}
