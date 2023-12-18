import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		int count = 0;
		while (x < y) {
			x *= 2;
			count++;
		}
		System.out.println(count);

	}

}
