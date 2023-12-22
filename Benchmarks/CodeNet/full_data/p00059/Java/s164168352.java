import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextDouble()) {
			double[] p = new double[8];
			for (int i = 0; i < 8; i++)
				p[i] = sc.nextDouble();
			System.out.println((p[4]>p[2] || p[6]<p[0] || p[5]>p[3] || p[7]<p[1])?"NO":"YES");
		}
	}
}