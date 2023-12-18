import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ansT = 1;
		long ansA = 1;
		for (int i = 0; i < n; i++) {
			long t = sc.nextLong();
			long a = sc.nextLong();

			long mt = (long) Math.ceil((double) ansT / t);
			long ma = (long) Math.ceil((double) ansA / a);
			long m = Math.max(mt, ma);

			ansT = m * t;
			ansA = m * a;
		}
		sc.close();

		System.out.println(ansT + ansA);
	}
}
