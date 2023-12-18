import java.util.Arrays;
import java.util.Scanner;

class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		long[] map = new long[N];
		for (int i = 0; i < N; i++) {
			long hi = sc.nextLong();
			map[i] = hi;
		}
		
		Arrays.sort(map);
		
		long min = Integer.MAX_VALUE;
		for (int i = 0; i <= N - K; i++) {
			long sub = map[i + K - 1] - map[i];
			min = Math.min(min, sub);
		}
		
		System.out.println(min);
	}
	
}