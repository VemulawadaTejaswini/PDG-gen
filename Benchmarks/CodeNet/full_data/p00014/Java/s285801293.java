import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			Integral( sc.nextInt() );
		}
	}

	private static void Integral(int nextInt) {
		int d = nextInt;
		long a = 0;
			for (int i = 1; i < 600 / d; i++) {
				a += f( i * d ) * d;
			}
		System.out.println(a);
	}

	private static long f(long i) {
		return i * i;
	}

}
