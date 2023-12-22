import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	private int n;
	private int[][] map;
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		while (sc.hasNextLine() == true) {
			n = Integer.parseInt(sc.nextLine());
			if (n == 0) break;
	
			map = new int[n][n];
			for (int i = 0; i < n; i++) {
				String line = sc.nextLine();
				
				for (int j = 0; j < n; j++) {
					if (line.charAt(j) == '*') map[i][j] = 1;
					else map[i][j] = 0;
				}
			}
			
			int max = 0;
			for (int i = 0; i < n; i++) {
				if ((i + max) >= n) break;
				for (int j = 0; j < n; j++) {
					if ((j + max) >= n) break;
					
					if (map[i][j] == 1) continue;
					
					int tmp = check(i, j);
					if (max < tmp) max = tmp;
				}
			}
			System.out.println(max);
		}
	}
	
	private int check(int x, int y) {
		int w = 1;
		while (w < n) {
			for (int i = 0; i < w; i++) {
				if ((x + i) == n) return (w - 1);
				for (int j = 0; j < w; j++) {
					if ((y + j) == n) return (w - 1);
					if (map[x + i][y + j] == 1) return (w - 1);
				}
			}
			w++;
		}
		
		return w;
	}
}