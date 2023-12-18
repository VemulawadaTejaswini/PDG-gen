import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] F = new int[N][10 + 1];
		int[][] P = new int[N][10 + 1];
		
		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= 10; j++) {
				F[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 10; j++) {
				P[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		for (int i = 0; i < (1 << 10); i++) {
			int c = 0;
			for (int j = 0; j < 10; j++) {
				if ((i & (1 << j)) != 0 && F[0][j] == 1) {
					c++;
				}
			}
			max = Math.max(P[0][c], max);
		}
		System.out.println(max);
	}
}