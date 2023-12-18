import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		Map<Integer, List<Integer>> ent = new HashMap<>();
		for (int i = 0; i < N; i++) {
			int day = scan.nextInt();
			int sal = scan.nextInt();
			ent.computeIfAbsent(day, o -> new ArrayList<>()).add(sal);
		}

		PriorityQueue<Integer> part = new PriorityQueue<>(Comparator.reverseOrder());
		int sal = 0;
		for (int i = 1; i <= M; i++) {
			// 後方から可能なバイトを取得し、選択可能なバイトとしてキューに追加
			List<Integer> aList = ent.get(i);
			if (aList != null) {
				part.addAll(aList);
			}
			// 選択可能なバイトのうち、一番給料の良いバイトを選択
			Integer aPart = part.poll();
			if (aPart != null) {
				sal += aPart;
			}
		}
		System.out.println(sal);
	}
}
