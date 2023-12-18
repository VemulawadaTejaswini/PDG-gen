import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int[] C = new int[N];
		int[][] A = new int[N][M];
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
			for(int j = 0; j < M; j++)
				A[i][j] = sc.nextInt();
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < 1<<N; i++) {
			int temp = 0;
			boolean ok = true;
			int[] u = new int[M];
		    for(int j = 0; j < N; j++) {
		        if ((1 & i >> j) == 1) {
		        	temp += C[j];
		        	for(int k = 0; k < M; k++)
		        		u[k] += A[j][k];
		        }
		    }
		    for(int j = 0; j < M; j++) {
		    	if(u[j] < X) {
		    		ok = false;
		    		break;
		    	}
		    }
		    if(ok)
		    	ans = Math.min(ans, temp);
		}
		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
	}

}