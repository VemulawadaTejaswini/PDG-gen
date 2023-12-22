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
			
			
			List<HashSet<Integer>> paths = new ArrayList<HashSet<Integer>>(); 
			for(int i = 0 ; i < n ; i++ ) {
				paths.add(new HashSet<Integer>());
			}
			
			Set<String> pathSet = new HashSet<>();
			
			for(int i = 0 ; i < m ; i++ ) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				
//				paths[a-1][b-1] = 1;
//				paths[b-1][a-1] = 1;
//				paths.get(a-1).add(b-1);
//				paths.get(b-1).add(a-1);
				
				pathSet.add(a + "_" + b);
				pathSet.add(b + "_" + a);
			}
			
			int total = 0;
			//
			for(int i = 0 ; i < n ; i++ ) {
				
				boolean isGood = true;
				HashSet<Integer> pathes = paths.get(i);
				
				for(int j = 0 ; j < n ; j++ ) {
					if (i == j )
						continue;
					
					if ( pathSet.contains(i + "_" + j) && heights[i] <= heights[j] ) {
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