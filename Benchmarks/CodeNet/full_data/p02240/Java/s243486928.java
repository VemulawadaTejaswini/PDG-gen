import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	public static void main(String[] wjy) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Graph g= new Graph(a);
		int b = sc.nextInt();
		for (int i =0;i<b;i++) {
			g.setEdge(sc.nextInt(), sc.nextInt());
		}
		g.ConBFS();
		int c = sc.nextInt();
		for (int j =0;j<c;j++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			String reach = g.reac(m, n);
			System.out.println(reach);
		}
		sc.close();
	}
	static class Graph {
		public int[] island;
		public int[] mark;
		private int[][] matrix;
		public Graph(int n) {
			
			this.island = new int[n];
			this.matrix = new int[n][n];
			this.mark =new int[n];
		}
		
		public int v() {
			return this.matrix.length;
		}
		
		public void setEdge(int i,int j) {
			this.matrix[i][j]=1;
			this.matrix[j][i]=1;
		}
		
		
		public void setVisit(int ve) {
			this.mark[ve]=1;
		}
		
				
		public void setIsland(int a,int islandNum) {
			this.island[a] = islandNum; 
		}
		
		public void BFS(int a,int k) {
			Queue<Integer> q = new LinkedList<Integer>();
			q.offer(a);
		    this.setVisit(a);
		    this.setIsland(a, k);
		    while (!q.isEmpty()) {
		    	int m = q.poll();
		    	for (int i:this.getAdjecent(m)) {
		    		if (this.mark[i] ==0) {
		    			q.offer(i);
		    			this.setVisit(i);
		    			this.setIsland(i, k);
		    		}
		    	}
		    }
		}
		
		public void ConBFS() {
			int k=1;
			for (int i=0;i<this.v();i++) {
				if (this.mark[i]==0) {
					this.BFS(i, k);
					k++;
				}
			}
		}
		
		public ArrayList<Integer> getAdjecent(int ve){
			ArrayList<Integer> adj = new ArrayList<Integer>();
			for (int i =0;i<this.v();i++) {
				if (this.matrix[ve][i]==1) {
					adj.add(i);
				}
			}
			return adj;
		}
	
		public String reac(int v1,int v2) {
			if (this.island[v1]==this.island[v2]) {
				return "yes";
			}
			else {
				return "no";
			}
		}
	}
}
