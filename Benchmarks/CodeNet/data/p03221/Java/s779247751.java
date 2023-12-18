import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[m];
		int[] y = new int[m];
		Map<Integer, Integer> yTree = new TreeMap<Integer, Integer>();

		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
			y[i] = sc.nextInt();
			yTree.put(y[i], p[i]);
		}

		int[] pCount = new int[n];

		for (int yi : yTree.keySet()) {
			yTree.put(yi, ++pCount[yTree.get(yi) - 1]);
		}

		for (int i = 0; i < m; i++) {
			System.out.println(String.format("%06d%06d", p[i], yTree.get(y[i])));
		}

	}
}