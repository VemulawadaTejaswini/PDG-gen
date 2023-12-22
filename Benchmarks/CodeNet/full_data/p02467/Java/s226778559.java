import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> pf = new ArrayList<Integer>();
	public static void main(String[] args) {
		primeFactorize( sc.nextInt() );
	}

	private static void primeFactorize(int nextInt) {
		int n = nextInt;
		int p = 2;

		while(n > 1) {

			while(true) {

					if ( n % p == 0 ) {
						n /= p;
						pf.add(p);
					}else {
						break;
					}

			}

			p++;
		}

		System.out.printf("%d:", nextInt);

			for (int i : pf) {
				System.out.printf(" %d", i);
			}
	}

}
