import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Main{

	public static void main (String[] args) {

		Main main = new Main();
		main.solve();
	}

	private void solve() {

		Scanner scanner = new Scanner (System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();

		ArrayList <Long> list = new ArrayList <Long>();
		HashMap <Long, Integer> map = new HashMap <Long, Integer>();
		HashMap <Integer, Integer> map2 = new HashMap <Integer, Integer>();

		for (int index=0; index<N; index++) {
			Long cost = scanner.nextLong();
			list.add(cost);
			int amount = scanner.nextInt();
			map.put(cost, index);
			map2.put(index,amount);

		}

		Collections.sort(list);

		long money = 0;
		long drink = 0;

		for (int index=0; index<M; index++) {
			long cost = list.get(index);

			if (M-drink>map2.get(map.get(cost))) {
				drink+=map2.get(map.get(cost));
				money+=cost*(map2.get(map.get(cost)));
				map2.remove(map.get(cost));
			} else {
				money+=(M-drink)*cost;
				break;
			}
		}

		System.out.println(money);
	}
}