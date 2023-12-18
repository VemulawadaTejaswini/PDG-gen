import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt(); in.nextLine();
		
		int[][] powAry = new int[10][10];
		for ( int i = 0; i < 10; i++ ) {
			for ( int j = 0; j < 10; j++ ) {
				powAry[i][j] = in.nextInt();
			} in.nextLine();
		}

		int[][] turnAry = new int[h][w];
		for ( int i = 0; i < h; i++ ) {
			for ( int j = 0; j < w; j++ ) {
				turnAry[i][j] = in.nextInt();
			} in.nextLine();
		}
		
		// Floyd-Warshall algo
		for ( int k = 0; k < 10; k++ ) {
			for ( int i = 0; i < 10; i++ ) {
				for ( int j = 0; j < 10; j++ ) {
					powAry[i][j] = Math.min(powAry[i][j], powAry[i][k]+powAry[k][j]);
				}
			}
		}
		
		int total = 0;
		for ( int i = 0; i < h; i++ ) {
			for ( int j = 0; j < w; j++ ) {
				if ( turnAry[i][j] != -1 && turnAry[i][j] != 1 ) {
					total += powAry[turnAry[i][j]][i];
				}
			}
		}
		
		System.out.println(total);
		
		
	}
}