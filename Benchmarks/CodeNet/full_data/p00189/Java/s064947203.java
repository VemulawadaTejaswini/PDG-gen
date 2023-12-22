import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = Integer.parseInt(sc.nextLine());
			
			if(n == 0){
				break;
			}
			
			int[][] adj = new int[10][10];
			for(int i = 0; i < 10; i++){
				for(int j = 0; j < 10; j++){
					adj[i][j] = -1;
				}
			}
			
			
			int town_max = 0;
			for(int i = 0; i < n; i++){
				String[] strs = sc.nextLine().split(" ");
				int start = Integer.parseInt(strs[0]);
				int end = Integer.parseInt(strs[1]);
				int cost = Integer.parseInt(strs[2]);
				
				if(town_max < start){
					town_max = start;
				}else if(town_max < end){
					town_max = end;
				}
				
				adj[start][end] = adj[end][start] = cost;
			}
			
			int min_num = 0;
			int min_cost = Integer.MAX_VALUE;
			
			for(int i = 0; i <= town_max; i++){
				int c = digstra(i, adj, town_max + 1);
				if(c < min_cost){
					min_num = i;
					min_cost = c;
				}
			}
			
			
			System.out.println(min_num + " " + min_cost);
		}
		
	}
	
	public static int digstra(int start,int[][] adj, int nodes){
		int[] costs = new int[nodes];
		for(int i = 0; i < nodes; i++){
			if(i == start){
				costs[i] = 0;
			}else{
				costs[i] = Integer.MAX_VALUE;
			}
		}
		
		HashSet<Integer> arrived = new HashSet<Integer>(nodes);
		HashSet<Integer> unreached = new HashSet<Integer>(nodes);
		
		for(int i = 0; i < nodes; i++){
			unreached.add(i);
		}
		
		while(!unreached.isEmpty()){
			int min_cost = Integer.MAX_VALUE;
			int min_node = -1;
			
//			for(int i = 0; i < nodes; i++){
//				System.out.print("[" + i + "] = " + costs[i] + ", ");
//			}
//			System.out.println();
			
			for(Iterator<Integer> ite = unreached.iterator(); ite.hasNext();){
				int node = ite.next();
				
				if(costs[node] < min_cost){
					min_cost = costs[node];
					min_node = node;
				}
			}
			
			unreached.remove(min_node);
			arrived.add(min_node);
			
			for(int i = 0; i < nodes; i++){
				if(adj[min_node][i] != -1){
					if((min_cost + adj[min_node][i]) < costs[i]){
						costs[i] = min_cost + adj[min_node][i];
					}
				}
			}
		}
		
		int sum = 0;
		for(int i = 0; i < nodes; i++){
			sum += costs[i];
		}
		
		return sum;
	}
	
}