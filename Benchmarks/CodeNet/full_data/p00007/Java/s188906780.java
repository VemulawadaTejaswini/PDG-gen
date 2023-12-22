import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println( calc_debt( sc.nextInt() ) );
		sc.close();
	}

	private static long calc_debt(int nextInt) {
		int n = nextInt;
		double d_t_thousands = 10.0000;

			for (int i = 0; i < n; i++) {
				d_t_thousands *= 1.05;
			}
		d_t_thousands = Math.ceil( d_t_thousands );
		long debt = (long)d_t_thousands * 10000;
		return debt;
	}

}
