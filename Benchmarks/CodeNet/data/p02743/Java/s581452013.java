

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();

		double sqrta = Math.sqrt(a);
		if (sqrta * sqrta > a)
			sqrta--;

		double sqrtb = Math.sqrt(b);
		if (sqrtb * sqrtb > b)
			sqrtb--;

		double sqrtc = Math.sqrt(c);
		if (sqrtc * sqrtc > c)
			sqrtc--;

		if (sqrta + sqrtb < sqrtc) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
