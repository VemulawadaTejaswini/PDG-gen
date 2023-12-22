import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[][][] drops = {
		{ {0, -1}, {-1, 0}, {0, 0}, {1, 0}, {0, 1} }, //little
		{ {-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {0, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1} },// middle 
		{ {-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {0, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}, {0, -2}, {-2, 0}, {2, 0}, {0, 2} }, //big
	};
	
	public static void main(String[] args) {
		int[][] paper = new int[10][10];
		while(sc.hasNextLine()) {
			String[] parsed = sc.nextLine().split(",");
			int x = Integer.parseInt(parsed[0]), y = Integer.parseInt(parsed[1]), size = Integer.parseInt(parsed[2]);
			for(int i = 0; i < drops[size - 1].length; i++) {
				int dx = x + drops[size - 1][i][0], dy = y + drops[size - 1][i][1];
				if(inField(dx, dy)) paper[dy][dx]++;
			}
		}
		int deep = 0, no = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(paper[i][j] == 0) {
					no++;
				} else {
					deep = Math.max(deep, paper[i][j]);
				}
			}
		}
		System.out.println(no);
		System.out.println(deep);
	}
	
	static boolean inField(int x, int y) {
		if(x < 0 || x >= 10 || y < 0 || y >= 10) {
			return false;
		} else {
			return true;
		}
	}
}