import java.awt.Point;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		TreeMap<Long, Integer> order = new TreeMap<>();
		Point[] data = new Point[M];
		for (int i = 0; i < M; i++) {
			int pref = sc.nextInt();
			int year = sc.nextInt();
			order.put(pref * 1000000l + year, pref);
			data[i] = new Point(pref, year);
		}
		int[] preCount = new int[N + 1];

		for (long key : order.keySet()) {
			int pref = order.get(key);
			preCount[pref] = preCount[pref] + 1;
			order.put(key, preCount[pref]);
		}

		for (int i = 0; i < M; i++) {
			int pref = data[i].x;
			int year = data[i].y;
			int yRank = order.get(pref * 1000000l + year);
			String result = String.format("%06d", pref) + String.format("%06d", yRank);
			System.out.println(result);
		}
		sc.close();
	}

}
