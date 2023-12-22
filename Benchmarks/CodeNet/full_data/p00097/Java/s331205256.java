import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int[][][] map = new int[101][10][1000];
		for (int n = 0; n < map.length; n++) {
			for (int i = 0; i < map[0].length; i++) {
				for (int j = 0; j < map[0][0].length; j++) {
					map[n][i][j] = 0;
				}
			}
		}
		
		map[0][1][0] = 1;
		
		for (int n = 1; n < map.length; n++) {
			for (int i = 1; i < map[0].length; i++) {
				for (int j = 0; j < map[0][0].length; j++) {
					if (j < n) map[n + 1][i][j] = map[n][i][j];
					else map[n + 1][i][j] = map[n][i - 1][j - n] + map[n][i][j];
				}
			}
		}
		
		while (sc.hasNextLine() == true) {
			String[] nico = sc.nextLine().split(" ");
			int n = Integer.parseInt(nico[0]);
			int s = Integer.parseInt(nico[1]);
			if ((n == 0) && (s == 0)) break;
			
			System.out.println(map[100][n][s]);
		}
	}
}