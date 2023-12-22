import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static boolean[][] cant;
	static int a;
	static int b;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			a = stdIn.nextInt();
			b = stdIn.nextInt();
			if(a == 0 && b == 0) {
				break;
			}
			cant = new boolean[b + 1][a + 1];
			int n = stdIn.nextInt();
			for (int i = 0; i < n; i++) {
				int x = stdIn.nextInt();
				int y = stdIn.nextInt();
				cant[b + 1 - y][x] = true;
			}
			int ans = dfs(1, 1);
			System.out.println(ans);
		}
	}
	
	public static int dfs(int x, int y) {
		if(x > b || x < 1 || y > a || y < 1 ) {
			return 0;
		}
		if(cant[x][y]) {
			return 0;
		}
		if(b == x && a == y) {
			return 1;
		}
		int c = dfs(x+1,y);
		int d = dfs(x,y+1);
		return c+d;
		
	}
}