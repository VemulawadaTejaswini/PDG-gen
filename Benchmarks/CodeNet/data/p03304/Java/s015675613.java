import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double m = sc.nextDouble();
		double d = sc.nextDouble();
		double ans = (m - 1) * ((n - d) / n / n);
		if(d == 0) {
			System.out.printf("%.10f", ans);
		} else {
			System.out.printf("%.10f", ans * 2);
		}
	}
}

