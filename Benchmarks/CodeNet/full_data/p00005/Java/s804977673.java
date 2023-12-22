import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int ab = 0;
		int r = 0;
		int gcd = 0;
		int lcm = 0;
		int temp = 0;
		while(stdin.hasNext()) {
			a = stdin.nextInt();
			b = stdin.nextInt();
			ab = a * b;

			if(a < b) {
				temp = a;
				a = b;
				b = temp;
			}
			if(a >= b) {
				do {
					r = a % b;
					if(r == 0) {
						break;
					} else {
						a = b;
						b = r;
					}
				}while(r != 1);
				gcd = b;
				lcm = ab / b;
				System.out.println(gcd + " " + lcm);

			}
		}
	}
}