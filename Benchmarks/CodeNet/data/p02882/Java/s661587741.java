import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());

		sc.close();

		double l = (double)a * b * b / (2 * x);

		if(l >= 1) {
			System.out.println(Math.toDegrees(Math.atan(l)));
		}else {
			double l2 = (double)b * 2 / a - (double) x * 2 / (a * a * a);
			System.out.println(Math.toDegrees(Math.atan(l2)));
		}


	}
}

