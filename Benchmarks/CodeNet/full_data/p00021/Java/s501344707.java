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
			double s1 = (c[3] - c[1]) / (c[2] - c[0]);
			double s2 = (c[7] - c[5]) / (c[6] - c[4]);
			if ((c[0] == c[2] && c[4] == c[6]) || (c[1] == c[3] && c[5] == c[7])) {
				System.out.println("YES");
			} else if (s1 == s2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}