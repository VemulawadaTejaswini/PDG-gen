import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] x = new int[3];
		for (int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
		}
		if (x[0] % 2 == 0 || x[1] % 2 == 0 || x[2] % 2 == 0) {
			System.out.println(0);
		} else {
			System.out.println(Math.min(Math.min(x[0] * x[1], x[0] * x[2]), x[1] * x[2]));
		}
	}
}