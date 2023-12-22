import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int[] A = new int[M];
		int[] B = new int[M];
		int tmpa = 0;
		int tmpb = 0;
		Map<Integer, Set<Integer>> map = new HashMap<>(); 
		for(int i = 0; i< M; i++) {
			tmpa = s.nextInt();
			tmpb = s.nextInt();
			map.computeIfAbsent(tmpa, m -> new HashSet<>()).add(tmpb);
			map.computeIfAbsent(tmpb, m -> new HashSet<>()).add(tmpa);
		}
		
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		
		Deque<int[]> q = new ArrayDeque<>();
		q.add(new int[] {1, 0}); // 現在地、前の部屋
		
		boolean[] used = new boolean[N + 1];
		used[0] = used[1] = true;
		while(!q.isEmpty()) {
			int[] current = q.poll();
			for(Integer next : map.getOrDefault(current[0], Collections.emptySet())) {
				if(!used[next]) {
					used[next] = true;
					q.add(new int[] {next, current[0]});
					result.put(next, current[0]);
				}
			}
		}
		
		for(boolean b : used) {
			if(!b) {
				System.out.println("No");
			}
		}
		
		System.out.println("Yes");
		for(int i = 2; i < N + 1; i++) {
			System.out.println(result.get(i));
		}
    }
}