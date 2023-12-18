import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, Integer> hmapEven = new HashMap<>();
		HashMap<Integer, Integer> hmapOdd = new HashMap<>();
		HashMap<Integer, Integer> hmapCnt = new HashMap<>();
		int N = sc.nextInt();

		int[] v = new int[N];
		for (int i = 0; i < N; i++) {
			v[i] = sc.nextInt();

			if (i % 2 == 0) {
				hmapEven.put(v[i], 0);
			}
			if(i % 2 == 1) {
				hmapOdd.put(v[i], 0);
			}

			hmapCnt.put(v[i], 0);
		}

		int maxEven = 0, maxOdd = 0, cnt = 0;
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				hmapEven.put(v[i], hmapEven.get(v[i]) + 1);
				maxEven = Math.max(maxEven, hmapEven.get(v[i]));
			} else if (i % 2 == 1) {
				hmapOdd.put(v[i], hmapOdd.get(v[i]) + 1);
				maxOdd = Math.max(maxOdd, hmapOdd.get(v[i]));
			}
			cnt++;
		}

		//System.out.println(hmapEven.size() + " " + hmapOdd.size());

		if (hmapCnt.size() == 1) {
			System.out.println(cnt / 2);
		} else {
			System.out.println(cnt - maxEven - maxOdd);
		}

	}
}