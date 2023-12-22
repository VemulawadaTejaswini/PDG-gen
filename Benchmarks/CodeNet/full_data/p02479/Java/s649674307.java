import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		double l = 2 * Math.PI * r;
		double s = Math.PI * r * r;
		System.out.printf("%.6f %.6f\n", s, l);
	}

}