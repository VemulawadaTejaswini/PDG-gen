import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private int[][] paper = new int[10][10];

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) Arrays.fill(paper[i], 0);
		
		while (scan.hasNext()) {
			String str = scan.nextLine();
			int x = Integer.parseInt(str.substring(0, 1));
			int y = Integer.parseInt(str.substring(2, 3));
			int s = Integer.parseInt(str.substring(4, 5));
			
			try {
				if (s == 3) {
					large(x,y);
				}else if (s == 2) {
					medium(x, y);
				}else {
					small(x, y);
				}
			}catch (ArrayIndexOutOfBoundsException e) {
				
			}
		}
		int count = 0, max = -1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (paper[i][j] == 0) count++;
				max = Math.max(max, paper[i][j]);
			}
		}
		System.out.println(count);
		System.out.println(max);
	}
	
	private void large(int x, int y) {
		medium(x, y);
		paper[x][y - 2]++;
		paper[x][y + 2]++;
		paper[x - 2][y]++;
		paper[x + 2][y]++;
	}
	
	private void medium(int x, int y) {
		small(x, y);
		paper[x - 1][y - 1]++;
		paper[x - 1][y + 1]++;
		paper[x + 1][y - 1]++;
		paper[x + 1][y + 1]++;
	}
	
	private void small(int x, int y) {
		paper[x][y - 1]++;
		paper[x][y + 1]++;
		paper[x - 1][y]++;
		paper[x + 1][y]++;
	}
	
	private void debug() {
		System.out.println();
	}

}