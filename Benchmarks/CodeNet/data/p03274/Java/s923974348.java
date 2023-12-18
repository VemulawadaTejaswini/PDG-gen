import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		long[] x = new long[N];
		
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
		}
		
		long min = 100000000 * 3;
		
		for(int i = 0; i < N - K + 1; i++) {
			if(x[i + K - 1] >= 0 && x[i] <= 0) {
				if(x[i + K - 1] + x[i] > 0) {
					min = Math.min(x[i + K - 1] - x[i] - x[i], min);
				} else {
					min = Math.min(x[i + K - 1] - x[i] + x[i + K - 1], min);
				}
			} else if(x[i + K - 1] < 0) {
				min = Math.min(min, -x[i]);
			} else if(x[i] > 0) {
				min = Math.min(min, x[i + K - 1]);
			}
		}
		System.out.println(min);
	}
}
