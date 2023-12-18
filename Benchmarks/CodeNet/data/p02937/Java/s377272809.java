import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String t = scanner.nextLine();

		HashMap<String, ArrayList<Integer>> l = new HashMap<>();

		int i = 1;
		for (String c : s.split("")) {
			if (l.keySet().contains(c)) {
				l.get(c).add(i);
			} else {
				ArrayList<Integer> a = new ArrayList<>();
				a.add(i);
				l.put(c, a);
			}
          i++;
		}

		for (String c : t.split("")) {
			if (!l.keySet().contains(c)) {
				System.out.println("-1");
				System.exit(0);
			}
		}

		int N = 0;
		int current = 0;
		for (String c : t.split("")) {
			ArrayList<Integer> R = l.get(c);
			if (current >= R.get(R.size() - 1)) {
				current = R.get(0);
				N++;
				continue;
			}

			for (int r : R) {
				if (current < r) {
					current = r;
					break;
				}
			}
		}

		System.out.println(N * s.length() + current);

		scanner.close();
	}
}
