import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//参加者
		int N = sc.nextInt();
		//スタート時点のポイント
		int K = sc.nextInt();
		//正解の回数
		int Q = sc.nextInt();

		int[] array = new int[Q];
		Map<Integer, Integer> map = new HashMap<>();

		for (int index = 0; index < Q; index++) {
			//正解者
			int A = sc.nextInt();
			//正解者の順番
			array[index] = A;
		}

		for (int index = 1; index <= N; index++) {
			//昇順と持ち点
			map.put(index, K);
		}

		for (int i = 0; i < Q; i++) {
			for (Integer key : map.keySet()) {
				if (key != array[i]) {
					int h = map.get(key) - 1;
					map.replace(key, h);
				}
			}
		}
		for (Integer val : map.values()) {
			if (0 >= val) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}