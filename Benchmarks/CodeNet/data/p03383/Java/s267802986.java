import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		char[][] c = new char[h][w];
		char[][] r = new char[w][h];
		
		for(int i=0; i<h; i++) {
			c[i] = sc.next().toCharArray();
			for(int j=0; j<w; j++) r[j][i] = c[i][j];
		}
		
		out.println(check(h, w, c) && check(w, h, r) ? "YES" : "NO");
		
		return;
	}

	private static boolean check(int n, int m, char[][] array) {
		for(int i=0; i<n; i++) Arrays.sort(array[i]);
		
		boolean[] used = new boolean[n];
		Arrays.fill(used, false);
		for(int i=0; i<n-1; i++) {
			if(used[i]) continue;
			for(int j=i+1; j<n; j++) {
				if(used[j]) continue;
				
				boolean flag = true;
				for(int k=0; k<m; k++) {
					if(array[i][k] != array[j][k]) {
						flag = false;
						break;
					}
				}
				if(flag) used[i] = used[j] = true;
			}
		}
		
		int count = 0;
		for(boolean b: used) if(!b) count++;
		
		return count <= 1;
	}

}
