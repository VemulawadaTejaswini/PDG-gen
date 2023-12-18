import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		long n = Long.parseLong(tokens[0]);
		long m = Long.parseLong(tokens[1]);
		long d = Long.parseLong(tokens[2]);

		// scoreカウントに合致する数
		long count = 0;
		if (2 * d >= n) {
			count = n;
		} else {
			count += 2 * d;
			count += (n - d) - d;
		}
		double dcount = (double) count;
		long n2 = n * n;
		double dn2 = (double) n2;
		// System.out.println("count: " + count + ", n2: " + n2);

		double base = dcount / dn2;
		double result = base * (double) (m - 1);
		System.out.println(result);
		in.close();
	}

}