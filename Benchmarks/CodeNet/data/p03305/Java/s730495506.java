import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int s = in.nextInt();
		int t = in.nextInt();
		Map<Integer,List<int[]>> map_yen = new HashMap<>();
		Map<Integer,List<int[]>> map_snuke = new HashMap<>();
		for(int i=0;i<m;i++) {
			int[] tmp = new int[4];
			tmp[0] = in.nextInt();
			tmp[1] = in.nextInt();
			tmp[2] = in.nextInt();
			tmp[3] = in.nextInt();
			int[] yen1 = {tmp[0],tmp[1],tmp[2]};
			if(map_yen.containsKey(tmp[0])) map_yen.get(tmp[0]).add(yen1);
			else {
				List<int[]> list = new ArrayList<>();
				list.add(yen1);
				map_yen.put(tmp[0], list);
			}
			int[] yen2 = {tmp[1],tmp[0],tmp[2]};
			if(map_yen.containsKey(tmp[1])) map_yen.get(tmp[1]).add(yen2);
			else {
				List<int[]> list = new ArrayList<>();
				list.add(yen2);
				map_yen.put(tmp[1], list);
			}
			int[] snuke1 = {tmp[0],tmp[1],tmp[3]};
			if(map_snuke.containsKey(tmp[0])) map_snuke.get(tmp[0]).add(snuke1);
			else {
				List<int[]> list = new ArrayList<>();
				list.add(snuke1);
				map_snuke.put(tmp[0], list);
			}
			int[] snuke2 = {tmp[1],tmp[0],tmp[3]};
			if(map_snuke.containsKey(tmp[1])) map_snuke.get(tmp[1]).add(snuke2);
			else {
				List<int[]> list = new ArrayList<>();
				list.add(snuke2);
				map_snuke.put(tmp[1], list);
			}
		}
		
		long[] cost_yen = new long[n+1];
		for(int i=0;i<cost_yen.length;i++) cost_yen[i] = -1;
		PriorityQueue<int[]> p_que = new PriorityQueue<>((a,b)->((cost_yen[a[0]]+a[2])>(cost_yen[b[0]]+b[2])?1:-1));
		cost_yen[s] = 0;
		List<int[]> edges = map_yen.get(s);
		for(int i=0;i<edges.size();i++) p_que.add(edges.get(i));
		while(!p_que.isEmpty()) {
			int[] nearest_edge = p_que.poll();
			if(cost_yen[nearest_edge[1]]<0) {
				cost_yen[nearest_edge[1]] = cost_yen[nearest_edge[0]] + nearest_edge[2];
				if(map_yen.containsKey(nearest_edge[1])) {
					edges = map_yen.get(nearest_edge[1]);
					for(int i=0;i<edges.size();i++) {
						int[] edge = edges.get(i);
						if(cost_yen[edge[1]]<0) p_que.add(edge);
					}
				}
			}
		}
		
		long[] cost_snuke = new long[n+1];
		for(int i=0;i<cost_snuke.length;i++) cost_snuke[i] = -1;
		p_que.clear();
		cost_snuke[t] = 0;
		edges = map_snuke.get(t);
		for(int i=0;i<edges.size();i++) p_que.add(edges.get(i));
		while(!p_que.isEmpty()) {
			int[] nearest_edge = p_que.poll();
			if(cost_snuke[nearest_edge[1]]<0) {
				cost_snuke[nearest_edge[1]] = cost_snuke[nearest_edge[0]] + nearest_edge[2];
				if(map_snuke.containsKey(nearest_edge[1])) {
					edges = map_snuke.get(nearest_edge[1]);
					for(int i=0;i<edges.size();i++) {
						int[] edge = edges.get(i);
						if(cost_snuke[edge[1]]<0) p_que.add(edge);
					}
				}
			}
		}
		
		PriorityQueue<long[]> cost = new PriorityQueue<>((a,b)->a[1]>b[1]?1:-1);
		for(int i=1;i<=n;i++) {
			long[] tmp = {i,cost_yen[i] + cost_snuke[i]};
			cost.add(tmp);
		}
		long[] tmp = cost.poll();
		for(int i=0;i<n;i++) {
			while(i>=tmp[0]) tmp = cost.poll();
			System.out.println(1000000000000000L-tmp[1]);
		}
		in.close();
		
	}
	
}
