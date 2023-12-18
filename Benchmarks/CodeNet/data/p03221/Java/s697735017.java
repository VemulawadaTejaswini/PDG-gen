import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
//		System.setIn(new FileInputStream("tc/2.txt"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		TreeMap<Long, Integer> order = new TreeMap<>();
		ArrayList<CP> data = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			int pref = sc.nextInt();
			int year = sc.nextInt();
			order.put(pref * 1000000l + year, pref);
			data.add(new CP(year, pref));
		}

		int[] preCount = new int[N + 1];
		for (long key : order.keySet()) {
			int pref = order.get(key);
			preCount[pref] = preCount[pref] + 1;
			order.put(key, preCount[pref]);
		}

		for (int i = 0; i < data.size(); i++) {
			CP a = data.get(i);
			int pref = a.pref;
			int year = a.year;
			int yRank = order.get(pref * 1000000l + year);
			String result = String.format("%06d", pref) + String.format("%06d", yRank);
			System.out.println(result);
		}
		sc.close();
	}

	static class CP {
		int year;
		int pref;

		public CP(int year, int pref) {
			super();
			this.year = year;
			this.pref = pref;
		}
	}

}
