
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n];
		
		for( int i=0 ; i<n ; i++ ) {
			h[i] = sc.nextInt();
		}
		

		Map<Integer,Set<Integer>> route = new HashMap<Integer, Set<Integer>>(); 
		
		for( int i=0 ; i<m ; i++ ) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			addRoute(route, a, b);
			addRoute(route, b, a);
		}
		
		int c=0;
		for( int i=0 ; i<n ; i++ ) {
			Set<Integer> path = route.getOrDefault(i, Collections.emptySet());
			int cur = h[i];
			
			boolean isHigher = path.stream().allMatch((it)->cur > h[it]); 
			if( isHigher ) c++;
		}
		System.out.println(c);
	}

	private static void addRoute(Map<Integer, Set<Integer>> route, int a, int b) {
		Set<Integer> path = route.computeIfAbsent(a, k -> new HashSet<>());
		path.add(b);
		route.put(a, path);
	}
}