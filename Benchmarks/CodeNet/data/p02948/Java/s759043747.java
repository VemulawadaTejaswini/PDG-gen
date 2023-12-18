import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

	static LinkedList<Integer> pool;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs;
		inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);
		ArrayList<LinkedList<Integer>> jobs = new ArrayList<>(m + 1); // 遅延日数ごとに仕事をグルーピングする
		for ( int i = 0; i <= m; i++ ) {
			LinkedList<Integer> a = new LinkedList<>();
			a.add(0); // ダミー要素
			jobs.add(a);
		}

		for ( int i = 0; i < n; i++ ) {
			inputs = br.readLine().split(" ");
			int d = Integer.parseInt(inputs[0]);
			int f = Integer.parseInt(inputs[1]);
			if ( d > m ) continue; // 遅延日数的に候補になりえない仕事は除外
			jobs.get(d).add(f);
		}

//		for ( int i = 0; i <= m; i++ ) {
//			System.out.println(i + " " + jobs.get(i));
//		}

		long total = 0;
		pool = new LinkedList<Integer>(); // job候補のプール
		pool.add(0); // ダミー
		
		// m日目をゼロとして考え後退していく days:残り日数
		for ( int today = 0; today <= m; today++ ) {

			pool = margeAndSort(jobs.get(today), m - today);
			int daypay = pool.pollLast();

			// System.out.println("days:" + today + " earn +=" + daypay);
			total += daypay;
		}

		System.out.println(total);
		br.close();
	}

	private static LinkedList<Integer> margeAndSort(LinkedList<Integer> targ, int size) {
		LinkedList<Integer> result = new LinkedList<>();
		Collections.sort(targ);

		while ( result.size() <= size && !(pool.size() == 0 && targ.size() == 0) ) {

			if ( pool.size() == 0 ) result.addFirst(targ.pollLast());
			else
			if ( targ.size() == 0 ) result.addFirst(pool.pollLast());
			else {
				if ( pool.getLast() < targ.getLast() ) result.addFirst(targ.pollLast());
				else result.addFirst(pool.pollLast());
			}
		}

		// System.out.println("result" + result);

		return result;
	}
}
