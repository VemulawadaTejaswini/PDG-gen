import java.util.Scanner;

public class Main {

	// c < d
	public static long eukleides(long c, long d){
		if(d % c == 0){
			return c;
		}

		long mod = d % c;

		return eukleides(mod, c);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextInt();
		long d = scan.nextInt();
		if(c > d){
			long temp = c;
			c = d;
			d = temp;
		}

		long gcd = eukleides(c, d);
		long lcm = (c * d) / gcd;
		long answer = b - b / c - b / d + b / lcm;
		answer -= a - 1 - (a - 1) / c - (a - 1) / d + (a - 1) / lcm;

		System.out.println(answer);

	}
}

