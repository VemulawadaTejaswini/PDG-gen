import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			System.out.println( break_glass(sc.nextDouble()) );
		}

	}
	private static int break_glass(double nextDouble) {
		double v = nextDouble;
		int N = 2;

			do {
				double t = Math.sqrt(5 * (N - 1) / 4.9);

					if ( 9.8 * t >= v ) {
						break;
					}

					N++;
			}while(true);

		return N;
	}

}

