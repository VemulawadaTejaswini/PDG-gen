import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
	    StringBuilder out;

		int a = sc.nextInt();
		int b = sc.nextInt();

		int gcd = getGCD(a, b);
		System.out.println(gcd);

	}


	static int getGCD(int a, int b) {

		int gcd = 0;
		int x = Math.max(a, b);
		int y = Math.min(a, b);
		int rest = x % y;

		if(rest == 0) {
			return y;
		}

		for(int i = rest; i > 0; i--) {

			if(y % i == 0 && rest % i == 0) {
				return i;
			}
		}

		return 0;
	}
}
