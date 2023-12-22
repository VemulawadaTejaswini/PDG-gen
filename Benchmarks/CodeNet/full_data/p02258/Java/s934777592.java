import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max_profit = -9999999;
		
		int N = sc.nextInt();
		int[] R = new int[N];
		for (int i = 0; i < N; i++) {
			R[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				int tmp = R[j] - R[i];
				max_profit = Math.max(max_profit, tmp);
			}
		}
		
		System.out.println(max_profit);
	}
}