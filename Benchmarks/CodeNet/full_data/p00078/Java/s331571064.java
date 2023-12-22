import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			int n = Integer.parseInt(sc.nextLine());
			if (n == 0) break;
			
			int[][] map = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					map[i][j] = 0;
				}
			}
			
			int y = n / 2 + 1;
			int x = n / 2;
			
			for (int i = 0; i < (n * n); i++) {
				if (map[y][x] == 0) {
					map[y][x] = (i + 1);
					
					x++;
				} else {
					x--;
					i--;
				}
				y++;
				
				if (x > n) x = 0;
				if (x < 0) x = n;
				if (y > n) y = 0;
			}
			
			DecimalFormat df = new DecimalFormat("####");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(df.format(map[i][j]));
				}
				System.out.println();
			}
		}
	}
}