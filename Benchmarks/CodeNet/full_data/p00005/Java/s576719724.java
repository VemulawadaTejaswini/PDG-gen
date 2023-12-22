import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long[] ab = new long[2];
		long a,b;
		long gcd = 0;
		long lcm = 0;

		while ((scan.hasNext())) {
			a = Integer.parseInt(scan.next());
			b = Integer.parseInt(scan.next());

			ab[0] = a;
			ab[1] = b;

			java.util.Arrays.sort(ab);

			while(ab[0] != 0){
				long pool = ab[0];
				ab[0] = ab[1] % ab[0];
				ab[1] = pool;
			}
			gcd = ab[1];


			// Å¬ö{
			lcm = a * b / gcd;
			System.out.println(gcd+" "+lcm);
		}
	}
}