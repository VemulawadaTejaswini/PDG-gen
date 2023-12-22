import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] a = new int[n][m];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				a[i][j] = scan.nextInt();
			}
		}
		int[] b = new int[m];
		for(int j = 0; j < m; j++){
			b[j] = scan.nextInt();
		}
		for(int i = 0; i < n; i++){
			int num = 0;
			for(int j = 0; j < m; j++){
				num += a[i][j] * b[j];
			}
			System.out.println(num);
		}
	}
}