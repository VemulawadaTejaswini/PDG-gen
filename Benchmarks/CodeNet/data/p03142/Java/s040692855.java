import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Map<Integer,List<Integer>> map = new HashMap<>();
		int[] num_parent = new int[n+1];
		for(int i=0;i<n+m-1;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			num_parent[b]++;
			if(map.containsKey(a)) {
				map.get(a).add(b);
			}else {
				List<Integer> list = new ArrayList<>();
				list.add(b);
				map.put(a, list);
			}
		}
		int[] ans = new int[n+1];
		Queue<Integer> que = new ArrayDeque<>(n+m-1);
		for(int i=1;i<n+1;i++) {
			if(num_parent[i]==0) {
				que.add(i);
				num_parent[i]++;
			}
		}
		while(!que.isEmpty()) {
			int parent = que.poll();
			num_parent[parent]--;
			if(num_parent[parent]==0) {
				if(map.containsKey(parent)) {
					List<Integer> list = map.get(parent);
					for(int node : list) {
						ans[node] = parent;
						que.add(node);
					}
				}
			}
			
		}
		for(int i=1;i<n+1;i++) {
			System.out.println(ans[i]);
		}
		in.close();
		
	}

}
