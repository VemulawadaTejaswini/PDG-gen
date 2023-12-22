import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			ArrayList<Pos> ps = new ArrayList<Pos>();
			for (int i = 0; i < N; ++i) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				ps.add(new Pos(x, y));
			}
			Collections.sort(ps);
			HashSet<Pos> set = new HashSet<Pos>(ps);
			int ans = 0;
			for (int i = 0; i < N; ++i) {
				Pos p1 = ps.get(i);
				for (int j = i + 1; j < N; ++j) {
					Pos p2 = ps.get(j);
					if (p1.x == p2.x || p1.y > p2.y) continue;
					int sq = (p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y);
					if (sq <= ans) continue;
					Pos p3 = new Pos(p2.x - (p2.y - p1.y), p2.y + (p2.x - p1.x));
					if (!set.contains(p3)) continue;
					Pos p4 = new Pos(p1.x - (p2.y - p1.y), p1.y + (p2.x - p1.x));
					if (!set.contains(p4)) continue;
					ans = sq;
				}
			}
			System.out.println(ans);
		}
	}

	static class Pos implements Comparable<Pos> {
		int x, y;

		Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int compareTo(Pos o) {
			if (this.x != o.x) return this.x - o.x;
			return this.y - o.y;
		}

		public int hashCode() {
			return (this.x << 16) ^ this.y;
		}

		public boolean equals(Object obj) {
			Pos o = (Pos) obj;
			return this.x == o.x && this.y == o.y;
		}

	}

}