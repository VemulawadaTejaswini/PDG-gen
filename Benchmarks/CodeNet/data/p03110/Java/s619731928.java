import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		double ans = 0;
		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			String u = sc.next();
			if (u.equals("JPY")) {
				ans += x;
			} else {
				ans += x * 380000.0;
			}
		}
		System.out.println(ans);
		sc.close();

	}
}