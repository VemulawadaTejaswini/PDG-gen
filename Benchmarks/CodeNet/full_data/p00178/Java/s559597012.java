/**
 * @author yuichirw
 *
 */
import java.util.*;
import static java.lang.Math.*;

public class Main {
	static boolean[][] blocks;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		int n, d, p, q, t, u;
		n = sc.nextInt();
		blocks = new boolean[10][7];
		
		if (n == 0) return false;
		while(n-- > 0) {
			d = sc.nextInt(); p = sc.nextInt(); q = sc.nextInt();
			if(d == 2) {
				for(t = 9; t >= 0; t--) if(!blocks[t][q]) break;
				for(int i = 0; i < p; i++) blocks[t-i][q] = true;
			} else {
				t = 9; u = 0;
				for(int i = 0; i < p; i++) {
					for(u = 9; u >= 0; u--) {
						if(!blocks[u][q+i]) break;
					}
					t = max(t, u);
				}
				for(int i = 0; i < p; i++) blocks[t][q+i] = true;
			}
		}
		return true;
	}
	
	static int solve() {
		int ans;
		boolean tetris;
		
		ans = 0;
		for(int i = 0; i < 10; i++) {
			tetris = true;
			for(int j = 1; j < 6; j++) {
				if(!blocks[i][j]) {
					tetris = false;
					break;
				}
			}
			if(!tetris) {
				for(int j = 1; j < 6; j++) {
					if(blocks[i][j]) ans++;
				}
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}

}