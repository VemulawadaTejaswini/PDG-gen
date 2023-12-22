import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static HashMap<String, Integer> map;
	static ArrayList<String> favs;
	static final int WEEKTIME = 7 * 24 * 60;

	static int solve() {
		boolean[] used = new boolean[WEEKTIME];
		for (String f : favs) {
			int t = map.get(f);
			for (int i = 0; i < 30; ++i) {
				if (used[t]) return -1;
				used[t] = true;
				++t;
				if (t >= WEEKTIME) t -= WEEKTIME;
			}
			map.remove(f);
		}
		ArrayList<Integer> programs = new ArrayList<Integer>(map.values());
		Collections.sort(programs);
		int ret = favs.size();
		for (int p : programs) {
			boolean ok = true;
			int t = p;
			for (int i = 0; i < 30; ++i) {
				if (used[t]) {
					ok = false;
					break;
				}
				++t;
				if (t >= WEEKTIME) t -= WEEKTIME;
			}
			if (ok) {
				++ret;
				t = p;
				for (int i = 0; i < 30; ++i) {
					used[t] = true;
					++t;
					if (t >= WEEKTIME) t -= WEEKTIME;
				}
			}
		}
		return ret;
	}

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			map = new HashMap<String, Integer>();
			for (int i = 0; i < N; ++i) {
				String name = sc.next();
				int weekday = sc.nextInt();
				int time = sc.nextInt();
				int weektime = weekday * 24 * 60 + (time / 100) * 60 + time % 100;
				weektime += WEEKTIME - 6 * 60;
				weektime %= WEEKTIME;
				map.put(name, weektime);
			}
			int P = sc.nextInt();
			favs = new ArrayList<String>(P);
			for (int i = 0; i < P; ++i) {
				favs.add(sc.next());
			}
			System.out.println(solve());
		}
	}

}