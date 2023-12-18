import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M;

		N = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			if (map.containsKey(S)) {
				map.put(S, map.get(S) + 1);
			} else {
				map.put(S, 1);
			}
		}

		M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			String S = sc.next();
			if (map.containsKey(S)) {
				map.put(S, map.get(S) - 1);
			} else {
				map.put(S, -1);
			}
		}

		int max = 0;
		for(String string : map.keySet()) {
			max = Math.max(max, map.get(string));
		}

		System.out.println(max);
	}
}