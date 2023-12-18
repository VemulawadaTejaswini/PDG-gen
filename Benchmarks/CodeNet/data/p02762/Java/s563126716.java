import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt(); //friends
			int k = sc.nextInt(); //block

			Map<Integer, List<Integer>> friendsMap = new HashMap<>();
			Map<Integer, List<Integer>> blockMap = new HashMap<>();

			for( int i = 0 ; i < m ; i++ ) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				putRelation(friendsMap, a, b);
				putRelation(friendsMap, b, a);
			}

			for(int i = 0 ; i < k ; i++ ) {
				int c = sc.nextInt();
				int d = sc.nextInt();
				putRelation(blockMap, c, d);
				putRelation(blockMap, d, c);
			}

			//
			for(int i = 0 ; i < n ; i++ ) {
				//find friends Cluster
				// initial
				HashSet<Integer> currentCluster = new HashSet<>(friendsMap.get(i+1));
				HashSet<Integer> candidates = new HashSet<>();
				
				
				// add myself
				currentCluster.add(i+1);
				// merge
				for(;;) {
					List<Integer> nextCluster = new ArrayList<Integer>();
					for(Integer f : currentCluster) {
						for(Integer ff : friendsMap.get(f)) {
							if ( !currentCluster.contains(ff) ) {
								candidates.add(ff);
								nextCluster.add(ff);
							}
						}
					}
					currentCluster.addAll(nextCluster);
					
					if ( nextCluster.size() == 0 ) {
						break;
					}
				}
				
				List<Integer> blocks = blockMap.get(i+1);
				int count = 0;
				for(Integer f : candidates) {
					if (blocks != null &&  blocks.contains(f) ) {
					}
					else {
						count++;
					}
				}
				System.out.println(count);
			}
			

		}
	}

	private static void putRelation(Map<Integer, List<Integer>> map, int key, int value) {
		if ( !map.containsKey(key) ) {
			map.put(key, new ArrayList<Integer>());
		}
		map.get(key).add(value);

	}
}