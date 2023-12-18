import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
	static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		//		HashSet<Integer> set = new HashSet<Integer>();
		//		for (int i = 0; i < N; i++) {
		//
		//		}

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < M * 2; i++) {
			int next = sc.nextInt();
			if (!map.containsKey(next)) {
				map.put(next, 1);
			} else {
				int value = map.get(next);
				map.put(next, ++value);
			}
		}
		for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}
	}
}
