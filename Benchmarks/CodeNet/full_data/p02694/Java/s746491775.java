import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		double n = 100;
		long r = 0;
		for ( r=0;;r++) {
			if (n > x) break;
			n *= 1.01;
			n = (long)n;
		}
		System.out.println(r);
	}
}
