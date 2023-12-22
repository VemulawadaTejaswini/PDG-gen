/**
 * @author yuichirw
 *
 */
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int[][] puzzle = new int[9][9];
	
	static boolean read() {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				puzzle[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	
	static void solve() {
		boolean[][] ng = new boolean[9][9];
		int[] hist; int sum = 0;
		for(int i = 0; i < 9; i++) {
			hist = new int[9];
			for(int j = 0; j < 9; j++) {
				hist[puzzle[i][j]-1]++;
			}
			for(int j = 0; j < 9; j++) {
				if(hist[puzzle[i][j] - 1] >= 2) {
					ng[i][j] = true;
				}
			}
		}

		for(int j = 0; j < 9; j++) {
			hist = new int[9];
			for(int i = 0; i < 9; i++) {
				hist[puzzle[i][j]-1]++;
			}
			for(int i = 0; i < 9; i++) {
				if(hist[puzzle[i][j] - 1] >= 2) {
					ng[i][j] = true;
				}
			}
		}
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(ng[i][j]) {
					System.out.print("*" + puzzle[i][j]);
				} else {
					System.out.print(" " + puzzle[i][j]);
				}
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		n = sc.nextInt();
		while(n-- > 0 && read()) {
			
			solve();
			if(n != 0) System.out.println();
		}
	}

}