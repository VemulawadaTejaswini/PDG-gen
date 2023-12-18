import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long x = scan.nextLong();

		List<Long> srimeList = new ArrayList<>(N);
		for (long i = 0; i < N; i++) {
			srimeList.add(scan.nextLong());
		}

		int start = 0;
		for (; start < N; start++) {
			if (srimeList.get(start) <= x) {
				break;
			}
		}
		if (start == N) {
			long min = Long.MAX_VALUE;
			for(int i= 0; i < N; i++) {
				if(srimeList.get(i) < min) {
					min = srimeList.get(i);
					start = i;
				}
			}
		}

		long[] cost = new long[N];
		cost[start] = srimeList.get(start);
		for (int i = start + 1; i < N; i++) {
			if (srimeList.get(i) < cost[i - 1] + x) {
				cost[i] = srimeList.get(i);
			} else {
				for (int j = i - 1;; j--) {
					if (cost[j] <= x) {
						if (cost[j] + x * (i - j) <= srimeList.get(i)) {
							cost[i] = cost[j] + x * (i - j);
						} else {
							cost[i] = srimeList.get(i);
						}
						break;
					}
				}
			}
		}

		if (srimeList.get(0) <= x) {
			cost[0] = srimeList.get(0);
		} else {
			for (int j = N - 1;; j--) {
				if (cost[j] <= x) {
					if (cost[j] + x * (N - j) <= srimeList.get(0)) {
						cost[0] = cost[j] + x * (N - j);
					} else {
						cost[0] = srimeList.get(0);
					}
					break;
				}
				if(j == 0) {
					break;
				}
			}
		}

		for (int i = 1; i < start; i++) {
			if (srimeList.get(i) < cost[i - 1] + x) {
				cost[i] = srimeList.get(i);
			} else {
				for (int j = i - 1;; j--) {
					if (cost[j] <= x) {
						if (cost[j] + x * (i - j) <= srimeList.get(i)) {
							cost[i] = cost[j] + x * (i - j);
						} else {
							cost[i] = srimeList.get(i);
						}
						break;
					}
				}
			}
		}

		long max = -1;
		for (int i = 0; i < N; i++) {
			if(cost[i] > max) {
				max = cost[i];
			}
		}
		if(max > x) {
			System.out.println(max + N - 1);
		} else {
			long sum = 0;
			for(int i = 0; i < N; i++) {
				sum += cost[i];
			}
			System.out.println(sum);
		}
	}

}
