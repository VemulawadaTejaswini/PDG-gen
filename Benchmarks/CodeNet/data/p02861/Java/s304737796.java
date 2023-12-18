import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, int[]> zahyo = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int[] point = { a, b };
			zahyo.put(i, point);
		}
		// 距離の計算
		double len = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				len = len + Math.sqrt((zahyo.get(i)[0] - zahyo.get(j)[0]) * (zahyo.get(i)[0] - zahyo.get(j)[0]) + //
						(zahyo.get(i)[1] - zahyo.get(j)[1]) * (zahyo.get(i)[1] - zahyo.get(j)[1]));
			}
		}
		int add = 0;
		for (int i = 1; i < n; i++) {
			add = add + i;
		}
		System.out.println(len * (n - 1) / add);
	}

}