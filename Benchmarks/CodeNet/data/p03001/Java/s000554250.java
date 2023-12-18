import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		double W = sc.nextInt();
		double H = sc.nextInt();

		double x = sc.nextInt();
		double y = sc.nextInt();

		if (x * 2 == W && y * 2 == H) {
			System.out.println((W * H) / 2 + " " + 1);
		} else {
			System.out.print((W * H) / 2 + " " + 0);
		}
	}
}