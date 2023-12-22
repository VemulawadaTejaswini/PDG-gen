import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int[] cost = new int[N];
		int[][] A = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			cost[i] = sc.nextInt();
			for(int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<(Math.pow(2, N)); i++) {
			int[] study = new int[M];
			Arrays.fill(study, X);
			
			int sum = 0;
			
			String s = "-";
			for (int j=0; j<N; j++) {
				if ((1&i>>j) == 1) {
					sum += cost[j];
					for(int k = 0; k < M; k++) {
						study[k] -= A[j][k];
					}
				}
				boolean flag = true;
				for(int k = 0; k < M; k++) {
					if(study[k]>0)flag = false;
				}
				if(flag)min = Math.min(min, sum);
			}
		}
		
		System.out.println((min != Integer.MAX_VALUE)?min:-1);
		sc.close();
	}
}