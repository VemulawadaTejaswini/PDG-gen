package petya.com;
	
import java.util.Scanner;

class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] map = new int[N];
		int min = Integer.MAX_VALUE;
		int minIndex = N;
		for (int i = 0; i < N; i++) {
			int Ai = sc.nextInt();
			min = Math.min(Ai, min);
			if (min == Ai)
				minIndex = i;
		}
		
		int right = (N - 1) - minIndex;
		int left = (N - 1) - right;
		
		int div = K - 1;
		
		int ans = (left / div) + (right / div);
		int amari = (left % div) + (right % div);
		ans += amari / div;
		ans += amari % div > 0 ? 1 : 0;
		
		System.out.println(ans);
	}
	
}