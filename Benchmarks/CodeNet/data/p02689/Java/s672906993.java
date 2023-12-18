import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] heights = new int[n];
			
			for(int i = 0 ; i < n ; i++) {
				heights[i] = sc.nextInt();
			}
			
			int[][] paths = new int[n][n];
			
//			for(int i = 0 ; i < n ; i++ ) {
//				for(int j = 0 ; j < n ; j++ ) {
//					paths[i][j] = 0;
//				}
//			}
			
			for(int i = 0 ; i < m ; i++ ) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				paths[a-1][b-1] = 1;
				paths[b-1][a-1] = 1;
			}
			
//			for(int i = 0 ; i < n ; i++ ) {
//				for(int j = 0 ; j < n ; j++ ) {
//					System.out.print(paths[i][j]);
//				}
//				System.out.println();
//			}	
			
			int total = 0;
			//
			for(int i = 0 ; i < n ; i++ ) {
				
				boolean isGood = true;
				
				for(int j = 0 ; j < n ; j++ ) {
					if ( paths[i][j] == 1 && heights[i] <= heights[j] ) {
						isGood = false;
					}					
				}
				
				if ( isGood )
					total++;
			}
			
			System.out.println(total);

		}
	}
}