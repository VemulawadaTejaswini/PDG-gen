import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int h = Integer.parseInt(st.nextToken());
 		int w = Integer.parseInt(st.nextToken());
 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
 		int ch = Integer.parseInt(st1.nextToken())-1;
 		int dh = Integer.parseInt(st1.nextToken())-1;
 		StringTokenizer st2 = new StringTokenizer(bf.readLine());
 		int cw = Integer.parseInt(st2.nextToken())-1;
 		int dw = Integer.parseInt(st2.nextToken())-1;
		long[] dij = new long[h*w];
		Arrays.fill(dij,  Integer.MAX_VALUE);
 		char[][] grid = new char[h][w];
 		for(int j =0 ;j<h;j++)
 			grid[j] = bf.readLine().trim().toCharArray();
 		Map<Integer, Map<Integer, Integer>> graph = new HashMap<Integer, Map<Integer, Integer>>();
 		for(int j = 0;j<h*w;j++){
 			graph.put(j, new HashMap<Integer, Integer>());
 		}
 		for(int j =0 ;j<h;j++){
 			for(int k = 0;k<w;k++){
 				if (grid[j][k] == '.'){
 					for(int row = j-2;row<=j+2;row++){
 						for(int col = k-2;col <=k+2;col++){
 							if (row >=0 && row < h && col >=0 && col < w && grid[row][col] == '.'){
 								if (Math.abs(row-j)+Math.abs(col-k) == 1)
 									graph.get(j*w+k).put(row*w+col, 0);
 								else if (Math.abs(row-j)+Math.abs(col-k) > 1)
 									graph.get(j*w+k).put(row*w+col, 1);
 							}
 						}
 					}
 				}
 			}
 		}
 		
 		PriorityQueue<Node> pq = new PriorityQueue<Node>();
 		Set<Integer> seen = new HashSet<Integer>();
		pq.add(new Node(ch*w+dh, 0));
		dij[ch*w+dh] = 0;
		while(!pq.isEmpty()){
			Node no = pq.remove();
			while(seen.contains(no.getNode()) && !pq.isEmpty()){
				no = pq.remove();
			}
			for(int j : graph.get(no.getNode()).keySet()){
				if (!seen.contains(j)){
					if (dij[no.getNode()] + graph.get(no.getNode()).get(j) <= dij[j]){
						dij[j] = dij[no.getNode()] + graph.get(no.getNode()).get(j);
						pq.add(new Node(j, dij[j]));
					}
				}
			
			}
			seen.add(no.getNode());
		}
 		
 		out.println(dij[cw*w+dw] == Integer.MAX_VALUE ? -1 : dij[cw*w+dw]);
	 		
 		out.close();
 		
 		
 		
 	}
	static class Node implements Comparable<Node>{
		private int node;
		private long val;
		public Node(int node, long val){
			this.node = node;
			this.val = val;
		}
		public int getNode() {
			return node;
		}
		public void setNode(int node) {
			this.node = node;
		}
		public long getVal() {
			return val;
		}
		public void setVal(long val) {
			this.val = val;
		}
		public int compareTo(Node other){
			if (val > other.val)
				return 1;
			else if (val < other.val)
				return -1;
			else if (node > other.node)
				return 1;
			else if (node < other.node)
				return -1;
			else return 0;
		}
		
	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


