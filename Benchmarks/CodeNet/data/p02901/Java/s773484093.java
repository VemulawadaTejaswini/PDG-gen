import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static class Kagi {
		@Override
		public String toString() {
			return "Kagi [price=" + price + ", canOpen=" + canOpen + "]";
		}

		int price;
		Set<Integer> canOpen;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			List<Kagi> kagiList = new ArrayList<>();
			for (int i = 0; i < m; i++) {
				Kagi kagi = new Kagi();
				kagi.price = sc.nextInt();
				kagi.canOpen = new HashSet<>();
				int syurui = sc.nextInt();
				for (int j = 0; j < syurui; j++) {
					kagi.canOpen.add(sc.nextInt());
				}
				kagiList.add(kagi);
			}
			// 条件を満たすカギの選び方を調査。

			List<List<Kagi>> useKeyList = new ArrayList<>();
			List<Kagi> wkKagiList = new ArrayList<>();
			makeList(useKeyList, kagiList, wkKagiList, 0);
			int result = -1;
			for (List<Kagi> keyList : useKeyList) {
				Set<Integer> canOpenSet = new HashSet<>();
				int wkPrise = 0;
				for (Kagi kagi : keyList) {
					canOpenSet.addAll(kagi.canOpen);
					wkPrise = wkPrise + kagi.price;
				}
				if (canOpenSet.size() == n) {
					if (result == -1 || wkPrise < result) {
						result = wkPrise;
					}
				}
			}
			// 出力(整数)
			System.out.println(result);
		}
	}

	private static void makeList(List<List<Kagi>> a, List<Kagi> kagiList, List<Kagi> wk, int idx) {
		if (idx == kagiList.size()) {
			a.add(new ArrayList<>(wk));
		} else {
			wk.add(kagiList.get(idx));
			makeList(a, kagiList, wk, idx + 1);
			wk.remove(wk.size() - 1);
			makeList(a, kagiList, wk, idx + 1);
		}
	}

}