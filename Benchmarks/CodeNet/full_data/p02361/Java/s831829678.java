import java.io.*;
import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new aoj105().doIt();		
	}
	class aoj105{
		Scanner sc = new Scanner(System.in);
	    void dijkstra(int s,int cost[][],int d[],boolean used[],int V){
	        for(int i = 0;i < V;i++){
	            d[i] = Integer.MAX_VALUE;
	            used[i] = false;
	        }
	        d[s] = 0;
	        while(true){
	            int v = -1;
	            for(int u = 0;u < V;u++){
	                if(!used[u] && (v == -1 || d[u] < d[v]))v = u;
	            }
	            if(v == -1)break;
	            used[v] = true;
	            for(int u = 0;u < V;u++){
	                if(d[v] != Integer.MAX_VALUE && cost[v][u] != Integer.MAX_VALUE){
	                    if(d[u] > d[v] + cost[v][u]){
	                        d[u] = d[v] + cost[v][u];
	                    }
	                }
	            }
	        }
	    }
	    void doIt() { 
	        while(true){
	            int V = sc.nextInt();
	            int E = sc.nextInt();
	            int r = sc.nextInt();
	            int cost[][] = new int [V][V];
	            int d[] = new int[V];
	            boolean used[] = new boolean[V];
	            for(int i = 0;i < V;i++){
	                for(int j = 0;j < V;j++){
	                    cost[i][j] = Integer.MAX_VALUE;
	                }
	            }
	            for(int i = 0;i < E;i++){
	                int b = sc.nextInt();
	                int c = sc.nextInt();
	                cost[b][c] = sc.nextInt();
	            }
	            int costall = Integer.MAX_VALUE;
	            int ans = 0;
	            for(int i = 0;i < V;i++){
	                int cnt = 0;
	                dijkstra(r,cost,d,used,V);
	                for(int j = 0;j < V;j++){
	                    if(d[j] != Integer.MAX_VALUE){
	                        cnt = cnt + d[j];
	                    }
	                }
	            }
	            for(int i = 0;i < V;i++){
	            	if(d[i] == Integer.MAX_VALUE){
	            		System.out.println("INF");
	            	}else{
	            		System.out.println(d[i]);
	            	}
	            }
	        }
	     }
	}
}