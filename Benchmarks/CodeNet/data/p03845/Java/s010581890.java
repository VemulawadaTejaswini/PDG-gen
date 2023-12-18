import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] T = new int[N];					
		for(int i = 0; i < N; i++) {
			T[i] = scan.nextInt();
		}		
		
		int M = scan.nextInt();
		int[] P = new int[M];
		int[] X = new int[M];	
		
		for(int i = 0; i < M; i++) {
			P[i] = scan.nextInt();
			X[i] = scan.nextInt();
		}
		
		for(int i = 0; i < M; i++) {
			int sum = 0;
			for(int j = 0; j < N; j++) {
				sum += T[j];
			}
			int num = T[P[i] - 1] - X[i];
			int ans = sum - num;
			System.out.println(ans);
		}
		
	}
}