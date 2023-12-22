/**
 * @author yuichirw
 *
 */
import java.util.*;
public class Main {
	static int n;
	static int[][] f;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		f = new int[10][10];
		for(int i = 0; i < 10; i++) for(int j = 0; j < 10; j++) f[i][j] = sc.nextInt(); 
		return true;
	}
	
	static void solve() {
		int k;
		int[][] ans = new int[10][10];
		for(int i = 1; i < 9; i++) {
			for(int j = 1; j < 9; j++) {
				if(f[i][j] == 1) {
					if(f[i-1][j] == 1 && f[i+1][j] == 1 &&
							f[i][j-1] == 1 && f[i][j+1] == 1) {
						ans[i][j] = 1;
					}
				} else {
					k = f[i-1][j] + f[i+1][j] + f[i][j-1] + f[i][j+1];
					if(k == 3) ans[i][j] = 1;
				}
			}
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 9) {
					System.out.print("" + ans[i][j] + "\n");
				} else {
					System.out.print("" + ans[i][j] + " ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		n = sc.nextInt();
		while(n-- > 0 && read()) {
			solve();
		}
	}
}