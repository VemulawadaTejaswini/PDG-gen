import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int h[] = new int[N];
		for(int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		
		int cost[] = new int[N];
		for(int i = 0; i <= K; i++) {
			cost[i] = Math.abs(h[i] - h[0]);
		}
		
		for(int i = K + 1; i < N; i++) {
			int temp = Integer.MAX_VALUE;
			for(int j = 1; j <= K; j++) {
				temp = Math.min(temp, cost[i - j] + Math.abs(h[i] - h[i - j]));
			}
			cost[i] = temp;
			//System.out.println(cost[i]);
		}
		System.out.println(cost[N - 1]);
	}
}
