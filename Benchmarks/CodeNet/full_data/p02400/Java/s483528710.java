import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double ans1 = r * r * Math.PI;
		double ans2 = r * 2 * Math.PI;

		System.out.printf("%.6f %.6f", ans1, ans2);
	}

}