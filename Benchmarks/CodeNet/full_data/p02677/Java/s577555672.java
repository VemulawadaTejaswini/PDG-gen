
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();

		// 時針 - 分針
		// 角度
		double rad = Math.PI * 2 * ((double)h / 12.0 + ((double)m / 60.0) / 12.0 - (double)m / 60.0);

		double rsq = (double)(a * a + b * b) - (double)(2 * a * b) * Math.cos(rad);


		System.out.println(Math.sqrt(rsq));
	}
}