import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double[] a = new double[n];

		int i;
		double s = 0;
		for(i = 0; i < n; i++) {
			s += (double)1/in.nextInt();
		}

		System.out.println((double)1 / s);
	}
}