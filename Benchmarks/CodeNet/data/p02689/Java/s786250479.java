import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer N = Integer.parseInt(scanner.next());
		Integer M = Integer.parseInt(scanner.next());

		List<Integer> HList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			HList.add(Integer.parseInt(scanner.next()));
		}

		Map<Integer, Set<Integer>> map = new HashMap<>();
		for (int i = 1; i <= N; i++) {
			map.put(i, new HashSet<>());
		}

		for (int i = 0; i < M; i++) {
			Integer A = Integer.parseInt(scanner.next());
			Integer B = Integer.parseInt(scanner.next());

			map.get(A).add(B);
			map.get(B).add(A);
		}

		int cnt = 0;
		for (int i = 1; i <= N; i++) {
			Integer height = HList.get(i-1);
			boolean flg = true;
			for (Integer j : map.get(i)) {
				if (height <= HList.get(j-1)) {
					flg = false;
					break;
				}
			}
			if (flg) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}