import java.io.*;
import java.util.*;
class cell{
    int x;
    int y;
    int distance;
    cell(int x, int y, int distance){
        this.x = x; 
        this.y = y;
        this.distance = distance;
    }
    public int getDistance(){
        return this.distance;
    }
}
public class Main
{
    static int n;
    static int m;
    static int[][] visited;
    static int[][] dist;
    public static boolean isValid(int x, int y){
        return (x >= 0 && y >= 0 && x < n && y < m);
    } 
    
    
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().trim().split(" ");
        n = Integer.parseInt(in[0]);
        m = Integer.parseInt(in[1]);
	    in = br.readLine().trim().split(" ");
        int s1 = Integer.parseInt(in[0]);
        int s2 = Integer.parseInt(in[1]);
        s1--;
        s2--;
	    in = br.readLine().trim().split(" ");
        
        int e1 = (Integer.parseInt(in[0]));
        int e2 = (Integer.parseInt(in[1]));
        e1--;
        e2--;
	    char[][] grid = new char[n][m];
	    dist = new int[n][m];
	    for(int i = 0; i < n; i++){
            grid[i] = br.readLine().trim().toCharArray();
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
	    dist[s1][s2] = 0;
	    visited = new int[n][m];
	    Comparator<cell> cmp = Comparator.comparing(cell::getDistance);
	    PriorityQueue<cell> pq = new PriorityQueue<>(cmp);
	    cell c1 = new cell(s1, s2, 0);
	    int[] dx = {0, 1, 0, -1};
	    int[] dy = {-1, 0, 1, 0};
	    pq.add(c1);
	    while(!pq.isEmpty()){
	        cell c = pq.poll();
	        int x = c.x;
	        int y = c.y;
	        int d = c.distance;
	        visited[x][y] = 1;
	        for(int i = 0; i < 4; i++){
	            int newx = x+dx[i];
	            int newy = y+dy[i];
	            if(isValid(newx, newy) && grid[newx][newy] == '.' && visited[newx][newy] != 1){
	                int newd = dist[x][y];
	                if(newd < dist[newx][newy]){
	                    dist[newx][newy] = newd;
	                    pq.add(new cell(newx, newy, newd));
	                }
	            }
	        }
	        int irow = x-2;
	        int jcol = y-2;
	        for(int i = irow; i < irow+5; i++){
	            for(int j = jcol; j < jcol+5; j++){
	                if(isValid(i, j) && grid[i][j] == '.' && visited[i][j] != 1){
    	                int newd = dist[x][y] + 1;
    	                if(newd < dist[i][j]){
    	                    dist[i][j] = newd;
    	                    pq.add(new cell(i, j, newd));
    	                }
    	            }
	            }
	        }
	    }
	    if(dist[e1][e2] != Integer.MAX_VALUE){
	        System.out.println(dist[e1][e2]);
	    }
	    else{
	        System.out.println(-1);
	    }
	}
	
}