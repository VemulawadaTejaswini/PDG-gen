import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
	
		int size = Integer.parseInt(line);
		Node[] nodes = new Node[size];
		for(int i=0; i<size; i++){
			line = in.readLine();
			String[] tmp = line.split(" ");
			int id = Integer.parseInt(tmp[0])-1;
			nodes[id] = new Node();
			int n_to = Integer.parseInt(tmp[1]);
			for(int j=2; j<2+n_to; j++){
				int to = Integer.parseInt(tmp[j])-1;
				nodes[id].add_edge(to, 1);
			}
		}
		
		line = in.readLine();
		size = Integer.parseInt(line);
		for(int i=0; i<size; i++){
			Node[] clone = deepClone(nodes);
			line = in.readLine();
			String[] tmp = line.split(" ");
			int s = Integer.parseInt(tmp[0])-1;
			int g = Integer.parseInt(tmp[1])-1;
			int ttl = Integer.parseInt(tmp[2]);
			int total = calcCost(clone, s, g);
			if(ttl >= total && total != -1){
				System.out.println(total);
			}else{
				System.out.println("NA");
			}
		}
	}
	
	public int calcCost(Node[] nodes, int s, int g){
		List<Node> que = new ArrayList<Node>();
		nodes[s].cost = 1;
		que.add(nodes[s]);
		Node done = null;
		while(que.size()!=0){
			done = que.get(0);
			que.remove(0);
			done.visited = true;
			for(int i=0; i<done.edge_to.size(); i++){
				int cost = done.cost + done.edge_cost.get(i);
				int to = done.edge_to.get(i);
				if(nodes[to].cost < 0 || cost < nodes[to].cost){
					nodes[to].cost = cost;
					if(!que.contains(nodes[to])){
						que.add(nodes[to]);
					}
				}
			}
		}
		return nodes[g].cost;
	}
	
	public Node[] deepClone(Node[] nodes){
		int m = nodes.length;
		Node[] clone = new Node[m];
		for(int i=0; i<m; i++){
			clone[i] = new Node(nodes[i]);
		}
		return clone;
	}
}

class Node{
	int cost;
	boolean visited;
	List<Integer> edge_to;
	List<Integer> edge_cost;
	
	public Node(){
		this.cost = -1;
		this.visited = false;
		this.edge_cost = new ArrayList<Integer>();
		this.edge_to = new ArrayList<Integer>();
	}
	
	public Node(Node n){
		this.cost = n.cost;
		this.visited = n.visited;
		this.edge_to = new ArrayList<Integer>(n.edge_to);
		this.edge_cost = new ArrayList<Integer>(n.edge_cost);
	}
	
	public void add_edge(int to, int cost){
		this.edge_cost.add(cost);
		this.edge_to.add(to);
	}
}