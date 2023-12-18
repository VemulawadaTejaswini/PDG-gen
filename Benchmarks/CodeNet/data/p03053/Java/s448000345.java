import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] A = new char[H+2][W+2];
		char[] a = new char[W];
		for(int i = 1; i <= H; i++) {
			a = sc.next().toCharArray();
			for(int j = 1; j <= W; j++)
				A[i][j] = a[j-1];
		}
		int ans = 0;
		boolean ok = true;
		while(true) {
			for(int i = 1; i <= H; i++) {
				for(int j = 1; j <= W; j++) {
					if(A[i][j] == '.') {
						ok = false;
						if(A[i-1][j] == '#' || A[i+1][j] == '#' || A[i][j-1] =='#' || A[i][j+1] == '#')
							A[i][j] = '?';
					}
				}
			}
			for(int i = 1; i <= H; i++) {
				for(int j = 1; j <= W; j++) {
					if(A[i][j] == '?')
						A[i][j] = '#';
				}
			}
			if(ok)
				break;
			ans++;
			ok = true;
		}
		System.out.println(ans);
	}

}