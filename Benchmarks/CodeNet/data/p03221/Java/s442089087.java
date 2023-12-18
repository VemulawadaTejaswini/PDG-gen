
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int[] pList = new int[m];
		int[] yList = new int[m];
		Map<Integer, Integer> yearTree = new TreeMap<Integer, Integer>();


		for (int i = 0; i < m; i++) {
			int pi = scanner.nextInt();
			int yi = scanner.nextInt();
			pList[i] = pi;
			yList[i] = yi;
			yearTree.put(yi, pi);
		}

		int[] pCounter = new int[n];
		Map<Integer, Integer> yearNums = new TreeMap<Integer, Integer>();
		for (int yi : yearTree.keySet()) {
			yearNums.put(yi, ++pCounter[yearTree.get(yi)-1]);
		}

		for (int i = 0; i < m; i++) {
			System.out.println(String.format("%06d", pList[i]) + String.format("%06d", yearNums.get(yList[i])));
		}

	}

}
