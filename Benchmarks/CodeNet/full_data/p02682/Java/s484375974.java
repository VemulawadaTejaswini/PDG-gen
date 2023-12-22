import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long b = scn.nextLong();
		long c = scn.nextLong();
		long k = scn.nextLong();
		long ans = 0;
		if (k < a) {
			ans = k;
		} else {
			k = k - a;
			ans = ans + a;
		}
			k = k - b;
		if (k <= c) {
			ans = ans - k;
		}
		System.out.println(ans);
	}
}