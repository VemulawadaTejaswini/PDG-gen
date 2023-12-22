import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static int gcd(int x, int y){
		if(y == 0){
			return x;
		}else{
			return gcd(y, x % y);
		}
	}
	
	public static boolean search_matching(int cur, int size, boolean[][] adj, boolean[] visited, LinkedList<Integer> stack){
		if(cur == size - 1){
			stack.add(cur);
			return true;
		}
		
		for(int to = 0; to < size; to++){
			if(!adj[cur][to]){
				continue;
			}else if(visited[to]){
				continue;
			}
			
			visited[to] = true;
			
			if(search_matching(to, size, adj, visited, stack)){
				stack.add(cur);
				return true;
			}
			//prev[to] = -1;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int m = sc.nextInt();
			final int n = sc.nextInt();
			
			if(m == 0 && n == 0){
				break;
			}
			
			int[] blue = new int[m];
			int[] red = new int[n];
			
			for(int i = 0; i < m; i++){
				blue[i] = sc.nextInt();
			}
			
			for(int i = 0; i < n; i++){
				red[i] = sc.nextInt();
			}
			
			boolean[][] adj = new boolean[n + m + 2][m + n + 2];
			for(int i = 0; i < m; i++){
				adj[0][i + 1] = true;
			}
			for(int i = 0; i < n; i++){
				adj[m + i + 1][n + m + 1] = true;
			}
			
			for(int i = 0; i < m; i++){
				for(int j = 0; j < n; j++){
					
					if(gcd(blue[i], red[j]) != 1){
						adj[i + 1][m + j + 1] = true;
					}
				}
			}
			
			int count = 0;
			while(true){
				boolean[] visited = new boolean[n + m + 2];
				LinkedList<Integer> stack = new LinkedList<Integer>();
				if(!search_matching(0, n + m + 2, adj, visited, stack)){
					break;
				}
				
				//System.out.println(stack);
				
				int prev = stack.poll();
				while(!stack.isEmpty()){
					int cur = stack.poll();
					
					adj[prev][cur] = true;
					adj[cur][prev] = false;
					prev = cur;
				}
				
				count++;
			}
			
			System.out.println(count);
		}
	}

}