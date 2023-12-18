import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			long[] heights = new long[n];

			for(int i = 0 ; i < n ; i++) {
				heights[i] = sc.nextLong();
			}

			int[][] paths = new int[0][0];

//			for(int i = 0 ; i < m ; i++ ) {
//				int a = sc.nextInt();
//				int b = sc.nextInt();
//
//				paths[a][b] = 1;
//				paths[b][a] = 1;
//			}

//			int total = 0;
//			//
//			for(int i = 0 ; i < n ; i++ ) {
//
//				boolean isGood = true;
//
//				for(int j = 0 ; j < n ; j++ ) {
//					if ( paths[i][j] == 1 && heights[i] <= heights[j] ) {
//						isGood = false;
//					}					
//				}
//
//				if ( isGood )
//					total++;
//			}
//
//			System.out.println(total);

		}
	}
}