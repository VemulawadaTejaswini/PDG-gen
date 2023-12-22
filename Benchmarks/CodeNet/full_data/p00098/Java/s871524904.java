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
		int[][] tmpj = new int[n][n + 1];
		
		for (int i = 0; i < n; i++) {
			String[] nico = sc.nextLine().split(" ");
			
			tmpj[i][0] = 0;
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(nico[j]);

				tmpj[i][j + 1] = tmpj[i][j] + map[i][j];
			}
		}
		
		int max = Integer.MIN_VALUE;
		for (int si = 0; si < n; si++) {
			for (int ei = (si + 1); ei <= n; ei++) {

				for (int sj = 0; sj < n; sj++) {
					for (int ej = (sj + 1); ej <= n; ej++) {
						
						int sum = 0;
						for (int i = si; i < ei; i++) {
							sum = sum + tmpj[i][ej] - tmpj[i][sj];
						}
						if (max < sum) max = sum;
					}
				}
			}
		}
		
		System.out.println(max);
	}
}