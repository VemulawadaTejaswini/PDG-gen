
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	private static Set<Integer> heihosu;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int d = sc.nextInt();

			int[][] x = new int[n][d];
			for (int i = 0; i < n; i++) {
				for(int j = 0; j < d; j++) {
					x[i][j] = sc.nextInt();
				}
			}

			setHeihosu();

			int result = 0;
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (calc(x[i], x[j])) {
						result++;
					}
				}
			}
			System.out.println(result);
		}
	}

	private static boolean calc(int[] a, int[] b) {
		int tmp = 0;
		for (int i = 0; i < a.length; i++) {
			tmp += (a[i] - b[i]) * (a[i] - b[i]);
		}

		return heihosu.contains(tmp);
	}

	private static void setHeihosu() {
		heihosu = new HashSet<Integer>();
		for (int i = 0; i < 1000; i++) {
			heihosu.add(i * i);
		}
	}
}
