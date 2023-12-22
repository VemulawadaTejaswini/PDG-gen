import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			double[] c = new double[8];
			for (int j = 0; j < 8; j++) {
				c[j] = scanner.nextDouble();
			}
			if (((c[3] - c[1]) / (c[2] - c[0])) == ((c[7] - c[5]) / (c[6] - c[4]))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}