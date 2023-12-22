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
		//System.out.println(b);
		for (int i =0;i<b;i++) {
			g.connected(sc.nextInt(), sc.nextInt());
		}
		//g.display();
		int c = sc.nextInt();
		//System.out.println(c);
		for (int j =0;j<c;j++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			String reach = g.Reachh(m, n);
			//g.reset();
			//if (reach.equals("no") && g.Reachiable(n, m).equals("yes")) {
			//	System.out.println("yes");
			//}
			//else {
			System.out.println(reach);
			//}
		}
		sc.close();
	}
	static class Graph {
		public int[] mark;
		private int numEdge;
		private int[][] matrix;
		public Graph(int n) {
			this.matrix = new int[n][n];
			this.numEdge =0;
			this.mark =new int[n];
		}
		
		public int v() {
			return this.matrix.length;
		}
		
		public int e() {
			return this.numEdge;
		}
		
		public void setEdge(int i,int j) {
			this.matrix[i][j]=1;
			this.matrix[j][i]=1;
			this.numEdge++;
		}
		
		public void connected(int i,int j) {
			this.matrix[i][j]=1;
			this.matrix[j][i]=1;
			for (int a:this.getAdjecent(j)) {
				if (this.matrix[i][a]==0) {
					this.connected(i, a);
				}
			}
			for (int b:this.getAdjecent(i)) {
				if (this.matrix[j][b]==0) {
					this.connected(j, b);
				}
			}
		}

		public void delEdge(int i,int j) {
			this.matrix[i][j]=0;
			this.numEdge--;
		}
		
		public void setVisit(int ve) {
			this.mark[ve]=1;
		}
		
		public int getVisit(int ve) {
			return this.mark[ve];
		}
		
		public void reset() {
			this.mark=new int[this.v()];
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
		public void display() {
			System.out.print(" ");
			for (int i=0; i<this.v();i++) {
				System.out.print(" "+(i));
			}
			System.out.println();
			for (int i=0;i<this.v();i++) {
				System.out.print((i)+" ");
				for (int j=0;j<this.v();j++) {
					System.out.print(this.matrix[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		public String Reachiable(int v1,int v2) {
			if (this.getAdjecent(v1).isEmpty()) {
				return "no";
			}
			else {
				this.setVisit(v1);
				if (this.getAdjecent(v1).contains(v2)) {
					return "yes";
				}
				else {
					for (int i: this.getAdjecent(v1)) {
						if (this.getVisit(i)==0) {
							String k =Reachiable(i,v2);
						    if (k.equals("yes")) {
						    	return "yes";
						    }
						 }
					}
					return "no";
				}
			}
		}
		
		public String Reach(int v1,int v2) {
			Queue<Integer> q1 = new LinkedList<Integer>();
			q1.offer(v1);
			this.setVisit(v1);
			while (!q1.isEmpty()) {
				int m =q1.poll();
				if (m==v2) {
					return "yes";
				}
				else {
					for (int i:this.getAdjecent(m)) {
						if (this.getVisit(i)==0) {
							q1.offer(i);
							this.setVisit(i);
						}
					}
				}
			}
			return "no";
		}
		
		public String Reachh(int v1,int v2) {
			if (this.matrix[v1][v2]==1) {
				return "yes";
			}
			else {
				return "no";
			}
		}
	}
}
