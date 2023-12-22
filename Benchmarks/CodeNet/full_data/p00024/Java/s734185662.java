import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double v = sc.nextDouble();
			double N = 2;
			double t = Math.sqrt(50 * (N - 1)) / 7;
			double u = 9.8 * t;
			while(u < v) {
				N += 1.0;
				t = Math.sqrt(50 * (N - 1)) / 7;
				u = 9.8 * t;
			}
			System.out.println((int)N);
		}
		sc.close();
	}
}
