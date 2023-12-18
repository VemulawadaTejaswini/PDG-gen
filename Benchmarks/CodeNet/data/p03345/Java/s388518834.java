import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long k = sc.nextLong();

		boolean can = true;
		for (int i = 1; i <= k; i++) {
			long tmpa = a;
			long tmpb = b;
			long tmpc = c;
			a = tmpb + tmpc;
			b = tmpa + tmpc;
			c = tmpa + tmpb;
			if (x < a || x < b || x < c) {
				can = false;
				break;
			}
		}

		if (can) {
			System.out.println(a - b);
		} else {
			System.out.println("Unfair");
		}



		sc.close();
	}

}
