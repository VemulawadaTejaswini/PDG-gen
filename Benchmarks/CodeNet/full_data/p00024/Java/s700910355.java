import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double min_v;
		double t;
		try {
			while (true) {
				min_v = scn.nextFloat();
				t = min_v / 9.8f;
				double y = 4.9 * t * t;
				int n = (int) Math.ceil(y / 5 + 1);
				System.out.println(n);
			}
		} catch (Exception e) {

		}
	}
}