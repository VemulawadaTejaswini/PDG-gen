import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), q = sc.nextInt();
		int[][] map = new int[n][n];
		int x, y;
		for(int i = 0; i < m; i++) {
			x = sc.nextInt()-1;
			y = sc.nextInt()-1;
			map[x][y]++;
		}
		
		int[] ans = new int[q];
		for (int i = 0; i < q; i++) {
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;
			
			int count = 0;
			for (int j = x; j <= y; j++) {
				for (int k = x; k <= y; k++) {
					count += map[j][k];
				}
			}
			
			ans[i] = count;
		}
		
		for (int ansCount : ans) {
			System.out.println(ansCount);
		}
	}
}