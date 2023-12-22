import java.util.Scanner;

public class Main {

	static final int mmax = (int)1.0e9;

	static void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		while(0 < n + m){
			int[][] costs = new int[m][m];
			int[][] times = new int[m][m];
			for(int i = 0; i < m; i++)
				for(int j = 0; j < m; j++) costs[i][j] = times[i][j] = i==j? 0 : mmax;
			for(int i = 0; i < n; i++){
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int cost = sc.nextInt();
				int time = sc.nextInt();
				costs[a][b] = costs[b][a] = cost;
				times[a][b] = times[b][a] = time;
			}

			//Warshall-Floyd Algorithm
			for(int k = 0; k < m; k++)
				for(int i = 0; i < m; i++)
					for(int j = i+1; j < m; j++){
						costs[i][j] = costs[j][i] = Math.min(costs[i][j], costs[i][k] + costs[k][j]);
						times[i][j] = times[j][i] = Math.min(times[i][j], times[i][k] + times[k][j]);
					}
			int k = sc.nextInt();
			for(int i = 0; i < k; i++){
				int p = sc.nextInt() - 1;
				int q = sc.nextInt() - 1;
				int r = sc.nextInt();
				if(r == 0) System.out.println(costs[p][q]);
				else System.out.println(times[p][q]);
			}
			n = sc.nextInt();
			m = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		doIt();
	}
}