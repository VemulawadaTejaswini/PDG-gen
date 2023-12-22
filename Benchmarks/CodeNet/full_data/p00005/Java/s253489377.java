import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		int gcd = 0;
		int lcm = 0;

		while ((scan.hasNext())) {
			a = Integer.parseInt(scan.next());
			b = Integer.parseInt(scan.next());

			for (int i = 2; i <= Math.min(a, b); i++) {
				//Ååöñ
				if((a % i == 0) && (b % i == 0) && (a / i >= 1) && (b / i >= 1)){
					gcd = i;
				}
				// Å¬ö{
				lcm = a * b / gcd;
			}
			System.out.println(gcd+" "+lcm);
		}
	}
}