import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			// アルバイトできる日、それぞれに日当のリストを持つ
			List<List<Integer>> jobs = new ArrayList<>(m);
			for(int i = 0 ; i < m ; i++) {
				jobs.add(new ArrayList<>());
			}

			// アルバイトを順番にループ
			// ギリギリ期日までに報酬が得られるものを全てListに積む
			for(int i = 0 ; i < n ; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				// 期日までに報酬が得られないものはスルー
				if(m < a) {
					continue;
				}
				List<Integer> rewardList = jobs.get(m - a);
				rewardList.add(b);
			}

			// 優先度付きキューを生成(報酬の大きいものを優先)
			PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
				return Integer.compare(o2, o1);
			});

			long value = 0;
			// 期日から1日ずつ前にループ
			for(ListIterator<List<Integer>> ite = jobs.listIterator(jobs.size()) ; ite.hasPrevious() ;) {
				// その日に可能なアルバイトをキューに積む
				for(Integer v : ite.previous()) {
					q.add(v);
				}
				// もっとも優先度の高い報酬を取り出す
				if(!q.isEmpty()) {
					value += q.poll();
				}
			}
			System.out.println(value);

		}
	}

}
