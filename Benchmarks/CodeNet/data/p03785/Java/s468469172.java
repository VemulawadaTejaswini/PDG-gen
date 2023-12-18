import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.valueOf(in.nextInt()); // Number of passengers
		long C = Long.valueOf(in.nextLong()); // Size of bus
		long K = Long.valueOf(in.nextLong()); // Max wait time
		long[] T = new long[N]; // Arrival timings
		for (int x = 0; x < N; x++) {
			T[x] = in.nextLong();
		}
		
		for (int y = 0; y < N - 1; y++) {
			for (int x = 0; x < N - 1; x++) {
				if (T[x] > T[x + 1]) {
					long t1 = T[x];
					T[x] = T[x + 1];
					T[x + 1] = t1;
				}
			}
		}
		
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