import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] x = new int[2];
		int gcd = 1;
		int lcm;
		int temp;
		while (scan.hasNext()) {
			for (int i = 0; i < x.length; i++) {
				x[i] = scan.nextInt();
			}
			if (x[0] > x[1]) {
				temp = x[1];
			} else {
				temp = x[0];
			}
			for (int i = 1; i < temp; i++) {
				if (x[0] % i == 0 && x[1] % i == 0) {
					gcd = i;
				}
			}
			x[0] /= gcd;
			x[1] /= gcd;
			lcm = x[0] * x[1] * gcd;
			System.out.println(gcd + " " + lcm);
		}
	}
}