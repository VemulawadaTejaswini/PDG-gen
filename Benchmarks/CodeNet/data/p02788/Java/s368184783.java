import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			long d = sc.nextLong();
			long a = sc.nextLong();
			List<Enemy> list = new ArrayList<Enemy>();
			for (long i = 0; i < n; i++) {
				list.add(new Enemy(sc.nextInt(), sc.nextInt()));
			}
			Collections.sort(list, (Enemy e1, Enemy e2) -> {
				return e1.x - e2.x > 0L ? 1 : 0;
			});

			long cnt = 0;

			int lsize = list.size();
			for (int i = 0; i < lsize; i++) {
				Enemy e = list.get(i);
				if (e.h > 0) {
					long r = e.x + d * 2;
					long c = e.h / a + (e.h % a > 0L ? 1L : 0L);
					long damage = c * a;
					for (int j = i; j < lsize; j++) {
						Enemy ed = list.get(j);
						if (r < ed.x) break;
						if (e.x <= ed.x) {
							ed.h -= damage;
						}
					}
					cnt += c;
				}
			}

			System.out.println(cnt);

		}
	}

}

class Enemy {
	long x;
	long h;
	Enemy(long x, long h) {
		this.x = x;
		this.h = h;
	}
}
