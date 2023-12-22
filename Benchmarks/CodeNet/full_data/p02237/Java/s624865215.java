import java.util.Scanner;

class Graph{
	int n;
	int[][] A;
	
	Graph(int n){
		this.n=n;
		A=new int[n+1][n+1];
	}
	
	void setAdjList(int u,int v){ A[u][v]=1; }
	int getAdjList(int u,int v){ return A[u][v]; }
	
}
	

class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		Graph G=new Graph(n);
		
		for(int i=1;i<=n;i++){
			int u=scan.nextInt();
			int m=scan.nextInt();
			for(int j=0;j<m;j++)
				G.setAdjList(u,scan.nextInt());
		}
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-1;j++)
				System.out.print(G.getAdjList(i,j)+" ");
			System.out.println(G.getAdjList(i,n));
		}
		
	}
}
