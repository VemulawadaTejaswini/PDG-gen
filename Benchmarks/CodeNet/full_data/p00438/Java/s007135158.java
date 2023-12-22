import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private int[][] map;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run(){
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if ((a|b) == 0) break;
			
			map = new int[a][b];
			
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					map[i][j] = -1;
				}
			}
			
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				
				map[x - 1][y - 1] = 0;
			}
			
			map[0][0] = 1;
			
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (map[i][j] == -1) {
						if (i == 0) {
							if (j != 0) {
								map[i][j] = map[i][j - 1];
							}
						}
						if (j == 0) {
							if (i != 0) {
								map[i][j] = map[i - 1][j];
							}
						}
						
						if (i > 0 && j > 0) {
							map[i][j] = map[i][j - 1] + map[i - 1][j];
						}
					}
				}
			}
			/*
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}*/
			
			System.out.println(map[a - 1][b - 1]);
		}
	}

}