import java.util.*;

public class Main {
	int[][] ab;
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] h = new int[n];
		for(int i = 0; i < n; i++) h[i] = scan.nextInt();
		int[][] ab = new int[m][2];
		int out = n;
		boolean[] isDeleted = new boolean[n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < 2; j++) {
				ab[i][j] = scan.nextInt() - 1;
			}
			if(h[ab[i][0]] > h[ab[i][1]]) {
				if(!isDeleted[ab[i][1]]) {
					out--;
					isDeleted[ab[i][1]] = true;
				}
			} else if(h[ab[i][0]] < h[ab[i][1]]) {
				if(!isDeleted[ab[i][0]]) {
					out--;
					isDeleted[ab[i][0]] = true;
				}
			} else {
				if(!isDeleted[ab[i][0]]) {
					out--;
					isDeleted[ab[i][0]] = true;
				}
				if(!isDeleted[ab[i][1]]) {
					out--;
					isDeleted[ab[i][1]] = true;
				}
			}
		}
		System.out.println(out);
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
