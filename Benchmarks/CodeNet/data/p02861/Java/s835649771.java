import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Zahyo p[] = new Zahyo[n];
		for (int i = 0; i < n; i++) {
			p[i] = new Zahyo(i, sc.nextInt(), sc.nextInt());
		}
		double totalLength = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				totalLength += length(p[i], p[j]);
			}
		}
		totalLength = totalLength * 2 * factorial(n - 1);
		double aveLength = totalLength / factorial(n);
		System.out.println(aveLength);

		sc.close();
	}

	private static double factorial(int i) {
		if (i <= 2) {
			return i;
		} else {
			return i * factorial(i - 1);
		}
	}

	private static double length(Zahyo p1, Zahyo p2) {
		double len = 0;
		len = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
		return len;
	}

	static class Zahyo {
		int id;
		int x;
		int y;

		public Zahyo(int id, int x, int y) {
			this.id = id;
			this.x = x;
			this.y = y;
		}
	}

}
