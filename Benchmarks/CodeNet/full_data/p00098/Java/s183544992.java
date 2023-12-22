import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());

		int[][] map = new int[n][n];
		for (int i = 0; i < n; i++) {
			String[] nico = sc.nextLine().split(" ");
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(nico[j]);
			}
		}
		
		int[][][] tmp = new int[n][n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					tmp[i][j][k] = 0;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int sj = 0; sj <= j; sj++) {
					if (j > 0) tmp[i][sj][j] = tmp[i][sj][j - 1] + map[i][j];
					else tmp[i][sj][j] = map[i][j];
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for (int si = 0; si < n; si++) {
			for (int ei = (si + 1); ei <= n; ei++) {

				for (int sj = 0; sj < n; sj++) {
					for (int ej = sj; ej < n; ej++) {
						
						int sum = 0;
						for (int i = si; i < ei; i++) {
							sum = sum + tmp[i][sj][ej];
						}
						if (max < sum) max = sum;
					}
				}
			}
		}
		
		System.out.println(max);
	}
}