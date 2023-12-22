import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][]G = new int[n][n];
		for(int i = 0; i < n; i++) {
			int u = scan.nextInt() - 1;
			int k = scan.nextInt();
			for(int j = 0; j < k; j++) {
				G[u][scan.nextInt() - 1] = 1;
			}
		}
		scan.close();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j == n - 1) {
					System.out.println(G[i][j]);
				}else {
					System.out.print(G[i][j] +" ");
				}
			}
		}
	}
}
