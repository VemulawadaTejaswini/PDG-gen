import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Pair> p = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			p.add(new Pair(Long.parseLong(str[0]), Long.parseLong(str[1])));
		}

		Collections.sort(p);
		HashMap<Pair, Integer> map = new HashMap<>();

		for (int i = 0; i < n - 1; i++) {
			long xx = p.get(i + 1).x - p.get(i).x;
			long yy = p.get(i + 1).y - p.get(i).y;

			if (xx < 0) {
				xx *= -1;
			}

			if (yy < 0) {
				yy *= -1;
			}

			Pair pp = new Pair(xx, yy);
			if (map.containsKey(pp)) {
				map.put(pp, map.get(pp) + 1);
			} else {
				map.put(pp, 1);
			}
		}

		int max = 0;
		for (Pair pp : map.keySet()) {
			max = Math.max(max, map.get(pp));
		}

		System.out.println(n - max);
	}
}

class Pair implements Comparable<Pair> {
	long x;
	long y;

	public Pair(long x, long y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		return String.valueOf(x).hashCode() + String.valueOf(y).hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (((Pair) o).x == this.x && ((Pair) o).y == this.y) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Pair p) {
		if (this.x > p.x) {
			return 1;
		} else if (this.x < p.x) {
			return -1;
		} else {
			if (this.y > p.y) {
				return 1;
			} else if (this.y < p.y) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}