import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n =  Integer.parseInt(sc.next());
		int x =  Integer.parseInt(sc.next());
		int y =  Integer.parseInt(sc.next());
		int[][] to = new int[n][n];
		int[] ans = new int[n];


		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n ; j++){
				to[i][j] = Math.abs(j - i);
			}
		}
		to[x-1][y-1] = 1;
		to[y-1][x-1] = 1;


//		for(int k = 0; k < n ; k++) {
			for(int i = 0; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					to[i][j] = Math.min(to[i][j], to[i][x-1] + to[x-1][j]);
				}
			}
			
			for(int i = 0; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					to[i][j] = Math.min(to[i][j], to[i][y-1] + to[y-1][j]);
				}
			}
//		}

		for(int i = 0; i < n ; i++) {
			for(int j = i+1; j < n ; j++){
				ans[to[i][j]]++;
			}
		}

		PrintWriter out = new PrintWriter(System.out);
		for(int i = 1 ; i < n ; i++) {
			out.println(ans[i]);
		}
		out.flush();
	}
}
