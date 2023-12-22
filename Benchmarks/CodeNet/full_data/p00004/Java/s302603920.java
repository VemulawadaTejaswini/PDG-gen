import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextDouble()) {
			double[] n = new double[6];
			for (int i = 0; i < 6; ++i) {
				n[i] = s.nextDouble();
			}
			System.out.println(n[0]);
			double d = n[0] * n[4] - n[1] * n[3];
			System.out.printf("%f %f\n", (n[2] * n[4] - n[1] * n[5]) / d, (n[0] * n[5] - n[2] * n[3]) / d);
		}

	}
}