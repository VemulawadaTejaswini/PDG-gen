import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int min = Integer.MAX_VALUE;
		Set<Integer> monsters = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			if (a < min) {
				min = a;
			}
			monsters.add(a);
		}

		while (min != 1 && 1 < monsters.size()) {
			List<Integer> listMonsters = new ArrayList<Integer>(monsters);
			monsters.clear();

			for (int i = 0; i < listMonsters.size() - 1; i++) {
				int mi = listMonsters.get(i);
				for (int j = i+1; j < listMonsters.size(); j++) {
					int mj = listMonsters.get(j);

					int next = mi < mj ? mj % mi : mi % mj;
					int next2 = mi < mj ? mi  : mj;
					if (next2 % next != 0) {
						monsters.add(next2);
					}

					if (next != 0) {
						monsters.add(next);
						if (next < min) {
							min = next;
						}
					}
				}
			}
		}

		System.out.println(min);

	}

}
