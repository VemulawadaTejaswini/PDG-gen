import java.util.*;
import java.util.function.*;
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
		Grid result = new Grid(h, w);
		result.init('0');
		result.proc((i, j) -> (ni, nj) -> {
		    if(grid.get(i, j) == '#'){
		        if(grid.get(ni, nj) != '#'){
		            char tmp = result.get(ni, nj);
		            result.set(ni, nj, ++tmp);
		        }else{
		            result.set(ni, nj, '#');
		        }
		    }
		});
		
		// 出力
		System.out.println(result.toString());
	}
}

class Grid {
    int h;
    int w;
    char[][] grid;
    int[] dx = {-1, 0, 1, -1, 0, 1, -1, 0, 1}; // 9
    int[] dy = {-1, -1, -1, 0, 0, 0, 1, 1, 1}; // 9
    //int[] dx = {-1, 0, 1, -1, 0, 1, -1, 0, 1}; // 8
    //int[] dy = {-1, -1, -1, 0, 0, 0, 1, 1, 1}; // 8
    //int[] dx = {0, -1, 1, 0}; // 4
    //int[] dy = {-1, 0, 0, 1}; // 4
    
    public Grid(int h, int w){
        this.h = h;
        this.w = w;
        this.grid = new char[h][w];
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

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < h; i++){
            sb.append(grid[i]);
            sb.append('\n');
        }
        return sb.toString();
    }
    
    public void proc(BiFunction<Integer, Integer, BiConsumer<Integer, Integer>> proc){
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
}
