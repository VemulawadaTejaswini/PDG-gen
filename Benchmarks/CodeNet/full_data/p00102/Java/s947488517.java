/**
 * @author yuichirw
 *
 */
import java.util.*;
public class Main {
	
	static int		n;
	static int[][] 	mat;
	static Scanner 	sc = new Scanner(System.in);
	
	static boolean read() {
		n = sc.nextInt();
		if(n == 0) return false;
		mat = new int[n+1][n+1];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	
	static void solve() {
		int sum;
		for(int i = 0; i < n; i++) {
			sum = 0;
			for(int j = 0; j < n; j++) {
				sum += mat[i][j];
			}
			mat[i][n] = sum;
		}
		
		for(int j = 0; j < n; j++) {
			sum = 0;
			for(int i = 0; i < n; i++) {
				sum += mat[i][j];
			}
			mat[n][j] = sum;
		}
		
		sum = 0;
		for(int i = 0; i < n; i++) {
			sum += mat[i][n];
		}
		mat[n][n] = sum;
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= n; j++) {
				System.out.printf("%5d", mat[i][j]);
			}
			System.out.printf("\n");
		}
	}
	
	public static void main(String[] args) {
		while(read()) {
			solve();
		}
	}

}