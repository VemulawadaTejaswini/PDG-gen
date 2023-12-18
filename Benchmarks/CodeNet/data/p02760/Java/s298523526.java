import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[3][3];
		for (int i = 0; i < 3; i++)
			Arrays.setAll(a[i], idx -> sc.nextInt());
		
		boolean[][] opened = new boolean[3][3];
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			open(a, opened, b);
		}
		
		String ans = isBingo(opened) ? "Yes" : "No";
		System.out.println(ans);
		
		sc.close();
	}
	
	
	static boolean isBingo(boolean[][] opened) {
		outer:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < opened[i].length; j++) {
				if (!opened[i][j]) continue outer;
			}
			return true;
		}
	
		outer:
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < opened[i].length; j++) {
				if (!opened[j][i]) continue outer;
			}
			return true;
		}
		
		
		boolean flg = true;
		for (int i = 0; i < 3; i++) {
			if (!opened[i][i]) flg = false;
		}
		if (flg) return true;
		
		flg = true;
		for (int i = 0; i < 3; i++) {
			if (!opened[i][2 - i]) flg = false;
		}
		return flg;
	}
	
	static void open(int[][] a, boolean[][] opened, int b) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == b) {
					opened[i][j] = true;
					return;
				}
			}
		}
	}
}


