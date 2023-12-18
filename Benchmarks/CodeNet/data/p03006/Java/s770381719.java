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

		int ans = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				long xx = p.get(j).x - p.get(i).x;
				long yy = p.get(j).y - p.get(i).y;

				int res = 0;
				for (int ii = 0; ii < n; ii++) {
					for (int jj = 0; jj < n; jj++) {
						if (ii == jj)
							continue;
						if (xx == p.get(jj).x - p.get(ii).x && yy == p.get(jj).y - p.get(ii).y) {
							res++;
						}
					}
				}
				ans = Math.min(ans, n - res);
			}
		}
		System.out.println(ans);
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