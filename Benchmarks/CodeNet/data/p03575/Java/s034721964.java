
import java.util.Scanner;

public class Main {
	
	static boolean [][]node;
	static boolean []visit;
	static int n;
	static int m;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 n = Integer.parseInt(sc.next());
		 m = Integer.parseInt(sc.next());
		
		node = new boolean [n][n];
		visit = new boolean [n];
		
		int []a = new int [m];
		int []b = new int [m];
		
		for(int i = 0 ; i < m ;i++) {
			a[i] = Integer.parseInt(sc.next())-1;
			b[i] = Integer.parseInt(sc.next())-1;
			
			node[a[i]][b[i]] = true;
			node[b[i]][a[i]] = true;
		}
		int cnt = 0;
				
		for(int i = 0 ;i < m ;i++) {
			
			node[a[i]][b[i]] = false;
			node[b[i]][a[i]] = false;
			
			for(int j = 0; j < n ;j++) {
				visit[j] = false; 
			}
			
			dfs(0);
			
			boolean bridge = false;;
			
			for(int j = 0 ;j < n ;j++) {
				
				if(!visit[j]) {
				    bridge = true;
				}
			}
			
			if(bridge) {
				cnt++;
			}
			
			node[a[i]][b[i]] = true;
			node[b[i]][a[i]] = true;
			
		}
		
		System.out.println(cnt);
		
		
	}
	
	static void dfs(int s) {
		
		visit[s] = true;
		
		for(int i = 0 ; i < n ;i++) {
			if(!node[s][i] || !node[i][s]) {
				continue;
			}
			if(visit[i]) { 
				continue;
			}
			dfs(i);
			
		}
	}
	
}
