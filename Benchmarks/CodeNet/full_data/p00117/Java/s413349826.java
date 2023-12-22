/* A reward a Carpenter */
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line = in.readLine();		
		int n = Integer.parseInt(line);
		node[] nodes1 = new node[n];
		node[] nodes2 = new node[n];
		for(int i=0; i<n; i++){
			nodes1[i] = new node();
			nodes2[i] = new node();
		}

		line = in.readLine();
		int m = Integer.parseInt(line);

		for(int i=0; i<m; i++){
			line = in.readLine();
			String[] dst = line.trim().split(",");
			int from = Integer.parseInt(dst[0])-1;
			int to = Integer.parseInt(dst[1])-1;
			int fee1 = Integer.parseInt(dst[2]);
			int fee2 = Integer.parseInt(dst[3]);
			
			nodes1[from].add_edge(to, fee1);
			nodes1[to].add_edge(from, fee2);
			nodes2[from].add_edge(to, fee1);
			nodes2[to].add_edge(from, fee2);
		}

		line = in.readLine();
		String dst[] = line.split(",");
		int start = Integer.parseInt(dst[0])-1;
		int goal  = Integer.parseInt(dst[1])-1;
		int money = Integer.parseInt(dst[2]);
		int cost  = Integer.parseInt(dst[3]);
		
		int min_cost_to = get_min_cost(nodes1, start, goal);
		int min_cost_from = get_min_cost(nodes2, goal, start);
		
		int reward = money - cost - min_cost_to - min_cost_from;
		System.out.println(reward);
	}
	
	public int get_min_cost(node[] nodes, int s, int g){
		nodes[s].cost = 0;
		while(true){
			node done = null;			
			for(int i=0; i<nodes.length; i++){
				if(nodes[i].visited == true || nodes[i].cost < 0){
					continue;
				}
				
				if(done == null || nodes[i].cost < done.cost){
					done = nodes[i];
				}
			}
			
			if(done == null){
				break;
			}
			
			done.visited = true;
			
			for(int i=0; i<done.edge_to.size(); i++){
				int to = done.edge_to.get(i);
				int cost = done.cost + done.edge_cost.get(i);
				if(nodes[to].cost < 0 || cost < nodes[to].cost){
					nodes[to].cost = cost;
				}				
			}			
		}
		
		return nodes[g].cost;
	}	
}

class node{
	List<Integer> edge_to;
	List<Integer> edge_cost;
	
	int cost;
	boolean visited;
	
	public node(){
		cost = -1;
		this.visited =false;
		edge_to = new ArrayList<Integer>();
		edge_cost = new ArrayList<Integer>();
	}
	
	public void add_edge(int to, int cost){
		edge_to.add(to);
		edge_cost.add(cost);
	}
}