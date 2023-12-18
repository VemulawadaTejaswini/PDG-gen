import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long c = sc.nextLong();

		long[] poss = new long[n];
		long[] cals = new long[n];

		for(int i = 0; i < n; i++) {
			poss[i] = sc.nextLong();
			cals[i] = sc.nextLong();
		}

		long max = 0;
		long sum = 0;
		long cal;
		for(int i = 0; i < n; i++) {
			sum = cals[i];
			cal = sum;
			if(poss[i] < c - poss[i]) {
				cal -= poss[i];
			} else {
				cal -= (c - poss[i]);
			}
			max = Math.max(max, cal);
			int j = 0;
			while(j < n-1) {
				int idx;
				if(i+j+1 < n) {
					idx = i + j + 1;
				} else {
					idx = i + j - n + 1;
				}
				sum += cals[idx];
				cal = sum;
				if(i < idx) {
					cal -= Math.abs(poss[i] - poss[idx]);
					if(poss[i] < c - poss[idx]) {
						cal -= poss[i];
					} else {
						cal -= (c - poss[idx]);
					}
				} else {
					cal -= (c - poss[i]) + poss[idx];
					if(poss[idx] < c - poss[i]) {
						cal -= poss[idx];
					} else {
						cal -= (c - poss[i]);
					}
				}
				max = Math.max(max, cal);
				j++;
			}
		}
		System.out.println(max);

	}
}
