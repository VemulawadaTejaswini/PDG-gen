import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] heights = new int[n+1];
			
			for(int i = 0 ; i < n ; i++) {
				heights[i] = sc.nextInt();
			}
			
//			int[][] paths = new int[n+1][n+1];
			
//			for(int i = 0 ; i < n ; i++ ) {
//				for(int j = 0 ; j < n ; j++ ) {
//					paths[i][j] = 0;
//				}
//			}
			
			List<HashSet<Integer>> paths = new ArrayList<HashSet<Integer>>(); 
			for(int i = 0 ; i < n ; i++ ) {
				paths.add(new HashSet<Integer>());
			}
			
			for(int i = 0 ; i < m ; i++ ) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
//				paths[a-1][b-1] = 1;
//				paths[b-1][a-1] = 1;
				paths.get(a-1).add(b-1);
				paths.get(b-1).add(a-1);
			}
			
			int total = 0;
			//
			for(int i = 0 ; i < n ; i++ ) {
				
				boolean isGood = true;
				HashSet<Integer> pathes = paths.get(i);
				
				for(int j = 0 ; j < n ; j++ ) {
					if (i == j )
						continue;
					
					if ( pathes.contains(j) && heights[i] <= heights[j] ) {
						isGood = false;
						break;
					}					
				}
				
				if ( isGood )
					total++;
			}
			
			System.out.println(total);

		}
	}
}