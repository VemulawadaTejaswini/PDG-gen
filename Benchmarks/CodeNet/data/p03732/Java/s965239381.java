import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long w = sc.nextLong();

		List<Long>[] options = new ArrayList[4];
		for (int i = 0; i < 4; i++) {
			options[i] = new ArrayList<>();
		}

		long w1 = sc.nextLong();
		options[0].add(sc.nextLong());
		for (int i = 1; i < n; i++) {
			options[(int) (sc.nextLong() - w1)].add(sc.nextLong());
		}

		for (int i = 0; i < 4; i++) {
			options[i].sort(Comparator.reverseOrder());
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < options[i].size(); j++) {
				options[i].set(j, options[i].get(j - 1) + options[i].get(j));
			}
		}

		for (int i = 0; i < 4; i++) {
			options[i].add(0, 0L);
		}

		long answer = 0;
		for (int i = 0; i < options[0].size(); i++) {
			for (int j = 0; j < options[1].size(); j++) {
				for (int k = 0; k < options[2].size(); k++) {
					for (int l = 0; l < options[3].size(); l++) {
						if (w1 * i + (w1 + 1) * j + (w1 + 2) * k + (w1 + 3) * l > w) continue;
						answer = Math.max(answer, options[0].get(i) + options[1].get(j) + options[2].get(k) + options[3].get(l));
					}
				}
			}
		}

		System.out.println(answer);
	}
}
