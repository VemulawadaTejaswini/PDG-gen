import java.util.Scanner;

public class Main {
	static int[][] matrix;
	static int[][] time;
	static int t;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			int u = sc.nextInt() - 1;
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				matrix[u][sc.nextInt() - 1] = 1;
			}
		}
		time = new int[n][2];
		
		// 1番は開始時間1
		t = 0;
		for(int i = 0; i < n; i++) {
			dfs(i);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%1$d %2$d %3$d", i+1, time[i][0], time[i][1]);
			System.out.println();
		}
		
	}
	
	public static void dfs(int i) {
		// already visited
		if (time[i][0] > 0)
			return;
			
		time[i][0] = ++t;
			
		for (int j = 0; j < matrix[i].length; j++) {
			// linked
			if (matrix[i][j] == 1) {
				dfs(j);		
			}
		}
		
		// all search
		time[i][1] = ++t;
	}
}