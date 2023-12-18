import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] A = new int[H+2][W+2];
		char[] a = new char[W];
		for(int i = 1; i <= H; i++) {
			a = sc.next().toCharArray();
			for(int j = 1; j <= W; j++) {
				if(a[j-1] == '.')
					A[i][j] = 0;
				else
					A[i][j] = 100000000;
			}
		}
		int mark = 100000;
		int ans = 0;
		boolean ok = true;
		while(true) {
			for(int i = 1; i <= H; i++) {
				for(int j = 1; j <= W; j++) {
					if(A[i][j] == 0) {
						ok = false;
						if(A[i-1][j] > mark || A[i+1][j] > mark || A[i][j-1] > mark || A[i][j+1] > mark)
							A[i][j] = mark;
					}
				}
			}
			if(ok)
				break;
			ans++;
			mark--;
			ok = true;
		}
		System.out.println(ans);
	}

}