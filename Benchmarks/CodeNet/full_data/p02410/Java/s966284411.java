import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();

		int[][] a = new int[m][n];
		int [] b = new int[n];
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = scan.nextInt();
			}
		}
	
		for(int k = 0; k < n; k++){
			b[k] = scan.nextInt();
		}
		
		for(int s = 0; s < m; s++){
			int total = 0;
			for(int t = 0; t < n; t++){
				total = total + a[s][t] * b[t];
			}
			System.out.println(total);
		}
	}
}