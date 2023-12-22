import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int width = sc.nextInt();
			calcArea(width);
		}
	}

	public static void calcArea(int width) {
		int sum = 0, d = width;

		for (int i = 1; d * i <= 600 - d; i++) {
			sum += Math.pow(d * i, 2) * d;
		}
		System.out.println(sum);
	}
}