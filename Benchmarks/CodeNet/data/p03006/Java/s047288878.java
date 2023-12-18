import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Ball[] arr = new Ball[n];
		for (int i = 0; i < n; i++) {
			Ball b = new Ball();
			b.x = sc.nextLong();
			b.y = sc.nextLong();
			arr[i] = b;
		}
		sc.close();

		Arrays.parallelSort(arr);

		int max = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				long p = arr[i].x - arr[j].x;
				long q = arr[i].y - arr[j].y;
				int cnt = 0;
				Set<Integer> set1 = new HashSet<Integer>();
				Set<Integer> set2 = new HashSet<Integer>();
				for (int k = 0; k < n - 1; k++) {
					if (set1.contains(k)) {
						continue;
					}
					for (int k2 = k + 1; k2 < n; k2++) {
						if (set2.contains(k2)) {
							continue;
						}
						long dx = arr[k].x - arr[k2].x;
						long dy = arr[k].y - arr[k2].y;
						boolean flgX = false;
						boolean flgY = false;
						if (dx == 0 && p == 0) {
							flgX = true;
						} else {
							if (dx == 0 || p == 0) {
							} else {
								if ((dx % p == 0 && ((dx > 0) == (p > 0)))) {
									flgX = true;
								}
							}
						}
						if (dy == 0 && q == 0) {
							flgY = true;
						} else {
							if (dy == 0 || q == 0) {
							} else {
								if ((dy % q == 0 && ((dy > 0) == (q > 0)))) {
									flgY = true;
								}
							}
						}
						if (flgX && flgY) {
							cnt++;
							set1.add(k);
							set2.add(k2);
						}
					}
				}
				max = Math.max(max, cnt);
			}
		}
		System.out.println(n - max);
	}

	static class Ball implements Comparable<Ball>{
		long x, y;
		public int compareTo(Ball o) {
			if (o.x == x) {
				return 0;
			} else if (o.x < x) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}
