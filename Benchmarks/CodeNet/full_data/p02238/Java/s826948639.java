
import java.util.Scanner;

public class Main{
	static int[][] graph; //the graph
	static int time;
	static int[] depth,find;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){//adds values one at a time and updates everything accordingly
			int n= sc.nextInt();
			if(n==0)break;
			time = 1;
			graph = new int[n+1][n+1];
			depth = new int[n+1];
			find = new int [n+1];
			visited = new boolean[n+1]; //set if node is visited
			for(int i=0;i<n;i++) {
				int s = sc.nextInt();
				int k = sc.nextInt();
				for(int j=0;j<k;j++) {
					graph[s][sc.nextInt()] =1;
				}
			}
			for(int i=1;i<=n;i++)//Updates visit list, adds time
				visit(i);
			for(int i=1;i<=n;i++)//Prints out new graph
				System.out.println(i+" "+depth[i]+" "+find[i]);
		}
	}
	static void visit(int node) {
		if(!visited[node]) {
			visited[node] = true;
			depth[node] = time++; //Adds one to the time of the current node
			for(int i=1;i<depth.length;i++) {
				if(graph[node][i]==1)
					visit(i);
			}
			find[node] = time++;//next one
		}
	}
	
}
