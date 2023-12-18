import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		Grid grid = new Grid(h, w);
		for(int i = 0; i < h; i++){
		    String s = sc.next();
		    grid.set(i, s);
		}
		
		// 計算
		int result = 0;
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        if(grid.get(i, j) == '#') continue;
		        int[][] dist = grid.shortestDistGrid(i, j);
		        for(int k = 0; k < h; k++){
		            for(int l = 0; l < w; l++){
		                result = max(result, dist[k][l]);
		            }
		        }
		        
		    }
		}
		
		
		// 出力
		System.out.println(result);
	}
	
}

class Grid {
    int h;
    int w;
    char[][] grid;
    //int[] dx = {-1, 0, 1, -1, 0, 1, -1, 0, 1}; // 9
    //int[] dy = {-1, -1, -1, 0, 0, 0, 1, 1, 1}; // 9
    //int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1}; // 8
    //int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1}; // 8
    int[] dx = {0, -1, 1, 0}; // 4
    int[] dy = {-1, 0, 0, 1}; // 4
    
    public Grid(int h, int w){
        this.h = h;
        this.w = w;
        this.grid = new char[h][w];
    }
    
    public Grid(int h, int w, char c){
        this.h = h;
        this.w = w;
        this.grid = new char[h][w];
        init(c);
    }
    
    public void init(char c){
        for(int i = 0; i < h; i++){
            Arrays.fill(grid[i], c);
        }
    }
    
    public void set(int indexH, String s){
        grid[indexH] = s.toCharArray();
    }
    
    public void set(int indexH, int indexW, char c){
        grid[indexH][indexW] = c;
    }
    
    public void set(int index, char c){
        int indexH = index/w;
        int indexW = index%w;
        grid[indexH][indexW] = c;
    }
    
    public char get(int indexH, int indexW){
        return grid[indexH][indexW];
    }
    
    public char get(int index){
        int indexH = index/w;
        int indexW = index%w;
        return grid[indexH][indexW];
    }
    
    public boolean isValid(int indexH, int indexW){
        return 0 <= indexH && indexH < h && 0 <= indexW && indexW < w;
    }
    
    public int size(){
        return h*w;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < h; i++){
            sb.append(grid[i]);
            sb.append('\n');
        }
        return sb.toString();
    }
    
    public void proc(java.util.function.BiFunction<Integer, Integer, java.util.function.BiConsumer<Integer, Integer>> proc){
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                for(int k = 0; k < dx.length; k++){
                    int ni = i + dy[k];
                    int nj = j + dx[k];
                    if(isValid(ni, nj)){
                        proc.apply(i, j).accept(ni, nj);
                    }
                }
            }
        }
    }
    
    public int[][] shortestDistGrid(int si, int sj){
        int[][] dist = new int[h][w];
        for(int i = 0; i < h; i++){
            Arrays.fill(dist[i], -1);
        }
        boolean[][] visited = new boolean[h][w];
        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        int startId = si*w + sj;
        dist[si][sj] = 0;
        visited[si][sj] = true;
        q.add(startId);
        while(!q.isEmpty()){
            int id = q.poll();
            int i = id/w;
            int j = id%w;
            for(int k = 0; k < dx.length; k++){
                int ni = i + dy[k];
                int nj = j + dx[k];
                if(isValid(ni, nj)){
                    if(visited[ni][nj]) continue;
                    if(grid[ni][nj] == '#') continue;
                    visited[ni][nj] = true;
                    dist[ni][nj] = dist[i][j] + 1;
                    int nextId = ni*w + nj;
                    q.add(nextId);
                }
            }
        }
        return dist;
    }
    
}
