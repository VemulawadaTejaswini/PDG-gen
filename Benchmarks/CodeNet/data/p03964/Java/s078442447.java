import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int min = 2;
			int minT = 1, minA = 1;
			for (int i = 0; i < n; i++) {
				int t = scanner.nextInt();
				int a = scanner.nextInt();
				min = (min - 1 + t + a) / (t + a) * (t + a);
				int newT = min / (t + a) * t;
				if (newT < minT) {
					newT = (minT - 1 + t) / t * t;
					min = newT / t * (t + a);
				}
				int newA = min / (t + a) * a;
				if (newA < minA) {
					newA = (minA - 1 + a) / a * a;
					min = newA / a * (t + a);
					newT = min - newA;
				}
				minT = newT;
				minA = newA;
			}
			System.out.println(min);
		}
	}
}
