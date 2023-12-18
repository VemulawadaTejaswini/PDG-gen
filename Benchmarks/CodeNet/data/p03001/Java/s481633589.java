import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		double w = sc.nextInt();
		double h = sc.nextInt();
		double x = sc.nextInt();
		double y = sc.nextInt();
		if (x + x == w && y + y == h) {
			System.out.println(w /2.0 * h+ " " + 1);
		} else {
			System.out.println(w / 2.0 * h + " " + 0);
		}
	}
}
