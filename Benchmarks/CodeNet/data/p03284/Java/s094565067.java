import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();

		int m = (n % k == 0) ? 0 : 1;
		System.out.println(m);
	}
}

