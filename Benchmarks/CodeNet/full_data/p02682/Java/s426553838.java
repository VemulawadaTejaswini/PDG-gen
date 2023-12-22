import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long b = scn.nextLong();
		long c = scn.nextLong();
		long k = scn.nextLong();
		System.out.println(Ret(a, b, c, k));
	}

	public static long Ret(long a, long b, long c, long k) {
		long ans = 0;
		while (a != 0) {
			ans = ans + 1;
			k = k - 1;
			a = a - 1;
			if (k <= 0) {
				return ans;
			}
		}
		k = k - b;
		while (k > 0) {
			ans = ans - 1;
			k = k - 1;
		}
		return ans;
	}

}