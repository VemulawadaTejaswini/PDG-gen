import java.util.*;

public class Main {
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a[][] = new int[n][n];
		
		for (int i = 0; i < n; i ++) {
			int u = scanner.nextInt() - 1;
			int k = scanner.nextInt();
			
			for (int j = 0; j < k; j ++) {
				a[u][scanner.nextInt() - 1] = 1;
			}
		}

		scanner.close();
		
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n - 1; j ++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(a[i][n - 1]);
		}
	}
} 

