import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine() == true) {
			String line = sc.nextLine();
			int[][] map = new int[10][10];
			
			for (int i = 0; i < map.length; i++) {
				map[0][i] = line.charAt(i) - '0';
			}
			
			for (int j = 1; j < map.length; j++) {
				for (int i = 0; i < (map.length - j); i++) {
					map[j][i] = map[j - 1][i] + map[j - 1][i + 1];
				}
			}

			System.out.println(map[9][0]);
		}
	}
}