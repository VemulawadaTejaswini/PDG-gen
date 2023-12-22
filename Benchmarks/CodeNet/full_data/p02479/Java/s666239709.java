import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();

		System.out.printf("%f %f\n",
				r * r * Math.PI,
				2 * r * Math.PI);
	}
}