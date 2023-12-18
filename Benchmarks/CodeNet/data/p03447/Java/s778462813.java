import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Map<Integer,List<int[]>> map = new HashMap<>();
		int[] uft = new int[n];
		for(int i=0;i<n;i++) {
			uft[i] = i;
		}
		for(int i=0;i<m;i++) {
			int l = in.nextInt()-1;
			int r = in.nextInt()-1;
			int d = in.nextInt();
			union(uft,l,r);
			int[] tmp1 = {r,d};
			int[] tmp2 = {l,-d};
			if(map.containsKey(l)) map.get(l).add(tmp1);
			else {
				List<int[]> list = new ArrayList<>();
				list.add(tmp1);
				map.put(l, list);
			}
			if(map.containsKey(r)) map.get(r).add(tmp2);
			else {
				List<int[]> list = new ArrayList<>();
				list.add(tmp2);
				map.put(r, list);
			}
 		}
		in.close();
		
		Set<Integer> startSet = new HashSet<>();
		for(int i:map.keySet()) {
			startSet.add(find(uft,i));
		}
		
		int[] x = new int[n];
		int INF = 1000000007;
		for(int i=0;i<n;i++) {
			x[i] = INF;
		}
		Queue<Integer> que = new ArrayDeque<>();
		
		boolean flag = true;
		
		for(int start:startSet) {
			que.add(start);
			x[start] = 0;
			while(!que.isEmpty()) {
				int from = que.poll();
				List<int[]> toList = map.get(from);
				for(int[] tmp:toList) {
					int to = tmp[0];
					int dist = tmp[1];
					if(x[to]==INF) {
						x[to] = x[from] + dist;
						que.add(to);
					}else {
						if(x[to]!=x[from]+dist) {
							flag = false;
							break;
						}
					}
				}
				if(!flag) break;
			}
			if(!flag) break;
		}
		
		System.out.println(flag?"Yes":"No");
		
		
	}
	
	public static int find(int[] uft,int idx) {
		if(idx==uft[idx]) return idx;
		else return uft[idx] = find(uft,uft[idx]);
	}
	
	public static void union(int[] uft,int a,int b) {
		uft[find(uft,a)] = find(uft,b);
	}
	
}
