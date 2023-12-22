import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a;
		double sum;
		
		while (sc.hasNext()) {
			a = sc.nextDouble();
			sum = a;
			for (int i = 0; i < 9; i++) {
				if (i % 2 == 0) {
					a *= 2.0;
					sum += a;
				} else {
					a /= 3.0;
					sum += a;
				}
			}
			System.out.println(sum);
		}
	}
}