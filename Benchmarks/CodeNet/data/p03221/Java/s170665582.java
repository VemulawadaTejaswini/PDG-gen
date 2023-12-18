import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
//		System.setIn(new FileInputStream("tc/1.txt"));
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int M = sc.nextInt();
		TreeMap<String, Integer> order = new TreeMap<>();
		ArrayList<CP> data = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			int pref = sc.nextInt();
			int year = sc.nextInt();
			order.put(String.format("%07d",pref) + "_" + String.format("%10d",year), pref);
			data.add(new CP(year, pref));
		}

		int curPref = -1;
		int count = 0;
		for (String key : order.keySet()) {
			int pref = order.get(key);
			if (curPref == -1 || pref != curPref) {
				curPref = pref;
				count = 0;
			}
			count++;
			order.put(key, count);
		}

		for (int i = 0; i < data.size(); i++) {
			CP a = data.get(i);
			int pref = a.pref;
			int year = a.year;
			int yRank = order.get(String.format("%07d",pref) + "_" + String.format("%10d",year));
			String result = String.format("%06d%06d", pref, yRank);
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
