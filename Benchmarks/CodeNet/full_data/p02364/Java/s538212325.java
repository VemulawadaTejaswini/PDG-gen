import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int V, E;
		
		String line;
		try{
			line = br.readLine();
			String[] data = line.split(" ");
			V = Integer.parseInt(data[0]);
			E = Integer.parseInt(data[1]);
			
			int[][] graph = new int[V][V];
			
			for(int i=0; i<E; i++){
				data = br.readLine().split(" ");
				int s = Integer.valueOf(data[0]);
				int t = Integer.valueOf(data[1]);
				int w = Integer.valueOf(data[2]);
				
				graph[s][t] = w;
				graph[t][s] = w;
			}
			
			int mst = solve(V,E,graph);
			System.out.println(mst);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}  
	}
	
	private static int solve(int V, int E, int[][] graph){
		// create s set mstSet that keeps track of vertices already include in MST
		boolean[] mstSet = new boolean[V];
		
		
		// assign key values to all vertices in the graph, initial all key values as INFINITE
		int[] key = new int[V];
		for(int i=0; i<V; i++){
			key[i] = Integer.MAX_VALUE;
			mstSet[i] = false;
		}
		
		// assign 0 to the first vertex so that it will be picked first
		key[0] = 0;
		int[] parent = new int[V];
		parent[0] = -1;
		
		// while mstSet does not include all vertices
		/**
		 * 1. Pick a vertex u which is not there in the mstSet and has min key value
		 * 2. include u to the mstSet
		 * 3. update key values adjacent vertices of u
		 * **/
		
		
		int count = 0;
		int sum = 0;
		while(count < V){
			PairValue pair = minKey(key, mstSet);
			int u = pair.index;
			//System.out.println("u: "+u);
			sum += pair.weight;
			mstSet[u] = true;
			
			for(int i=0; i<V; i++){
				if(graph[u][i] != 0 && !mstSet[i] &&
						key[i] > graph[u][i]){
					key[i] = graph[u][i];
					parent[i]=u;
				}
			}
			count ++;
		}
		
				
		return sum;
	}
	
	// return min key index;
	private static PairValue minKey(int[] key, boolean[] mstSet){
		int min = Integer.MAX_VALUE;
		int index = -1;
		
		for(int i=0; i<key.length; i++){
			if(min > key[i] && !mstSet[i]){
				min = key[i];
				index = i;
			}
		}
		return new PairValue(index, min);
	}
}



class PairValue{
	int index, weight;
	public PairValue(int a, int b){
		index = a;
		weight = b;
	}
}