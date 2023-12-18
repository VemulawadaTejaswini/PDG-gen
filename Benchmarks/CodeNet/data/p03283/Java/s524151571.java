import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), q = sc.nextInt();
		int[][] tr = new int[n][n];
		int x, y;
		for(int i = 0; i < m; i++) {
			x = sc.nextInt()-1;
			y = sc.nextInt()-1;
			tr[x][y]++;
		}
		for(int i = 1; i < n; i++) {
			for(int k = 0; k+i < n; k++) {
				tr[k][k+i] += tr[k][k+i-1] + tr[k+1][k+i] - tr[k+1][k+i-1];
			}
		}
		for(int i = 0; i < q; i++) {
			x = sc.nextInt()-1;
			y = sc.nextInt()-1;
			System.out.println(tr[x][y]);
		}
	}
}
