import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		NavigableSet<Integer> taroAll = new TreeSet<Integer>();
		NavigableSet<Integer> hanaAll = new TreeSet<Integer>();
		NavigableSet<Integer> taro;
		NavigableSet<Integer> hana;
		while ((n = in.nextInt()) != 0) {
			taro = taroAll.headSet(Integer.valueOf(n * 2), true);
			hana = hanaAll.headSet(Integer.valueOf(n * 2), true);
			taro.clear();
			for (int i = 1; i <= n; i++) {
				Integer card = Integer.valueOf(in.nextInt());
				taro.add(card);
				hana.add(Integer.valueOf(i));
				hana.add(Integer.valueOf(i + n));
			}
			hana.removeAll(taro);
			Integer table = null;
			NavigableSet<Integer> pc = taro;
			while (!taro.isEmpty() && !hana.isEmpty()) {
				if (table == null) {
					table = pc.pollFirst();
				} else {
					table = pc.higher(table);
					if (table != null) {
						pc.remove(table);
					}
				}
				pc = (pc == taro) ? hana : taro;
			}
			System.out.println(hana.size());
			System.out.println(taro.size());

		}
	}
}