import java.io.*;
import java.util.*;
class custom{
    int val;
    int distance;
    custom(int val, int distance){
        this.val = val;
        this.distance = distance;
    }
}
public class Main
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().trim().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[] dist = new int[n+1];
		int[][] graph = new int[n+1][n+1];
		for(int i = 0; i < m; i++){
		    String[] str = br.readLine().trim().split(" ");
		    int u = Integer.parseInt(str[0]);
		    int v = Integer.parseInt(str[1]);
		    graph[u][v] = 1;
		    graph[v][u] = 1; 
		}
		boolean[] visited = new boolean[n+1];
        Queue<custom> q = new LinkedList<>();
        q.add(new custom(1, 0));
        visited[1] = true;
        while(!q.isEmpty()){
            custom parent = q.poll();
            int val = parent.val;
            for(int i = 2; i <= n; i++){
                if(graph[val][i] == 1 && visited[i] == false){
                    q.add(new custom(i, parent.distance+1));
                    visited[i] = true;
                    dist[i] = parent.distance + 1;
                }
            }
        }
        boolean ans = false;
        for(int i = 2; i <= n; i++){
            if(dist[i] == 0){
                System.out.println("No");
                ans = true;
            }
        }
        if(ans != true){
            System.out.println("Yes");
            for(int i = 2; i <= n; i++){
                System.out.println(dist[i]);
            }
        }
	}
}

