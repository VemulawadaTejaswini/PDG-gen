import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		double ans = 0;
		for(int i = 0; i < N; i++) {
			double x = scan.nextDouble();
			String s = scan.next();

			if(s.equals("JPY")) {
				ans += x;
			}
			if(s.equals("BTC")) {
				ans += x * 380000.0;
			}
		}

	}
}
