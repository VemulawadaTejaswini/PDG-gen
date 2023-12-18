import java.util.Scanner;

public class Main {
	static int N;
	static long C, K;
	static long[] T;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = Integer.valueOf(in.nextInt()); // Number of passengers
		C = Long.valueOf(in.nextLong()); // Size of bus
		K = Long.valueOf(in.nextLong()); // Max wait time
		T = new long[N]; // Arrival timings
		for (int x = 0; x < N; x++) {
			T[x] = in.nextLong();
		}
		sort(0, N - 1);
	}
	
	public static void sort (int low, int high) {
		int l = low, h = high;
		long p = T[low + (high-low)/2];
		while (l < h) {
			while (T[l] < p) {
				l++;
			}
			while (T[h] > p) {
				h--;
			}
			if (l <= h) {
				long t = T[l];
				T[l] = T[h];
				T[h] = t;
				l++;
				h--;
			}
		}
		
		if (low < h) {
			sort(low, h);
		} else if (l < high) {
			sort(l, high);
		} else {
			printAns();
		}
	}
	
	public static void printAns() {
		int Ti = 0; // Current passenger
		int buses = 0;
		while (Ti != N){
			// UpperBound = T + K
			for (int x = Ti; x <= Ti + C; x++) {
				if (x == N || x == Ti + C || T[x] > T[Ti] + K) {
					buses++;
					Ti = x;
					break;
				}
			}
		}
		System.out.println(buses);
	}
}
