import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] grid = new char[h][w];
		for(int i = 0; i < h; i++){
		    String s = sc.next();
		    grid[i] = s.toCharArray();
		}
		
		
		// 計算
		char[][] result = new char[h][w];
		for(int i = 0; i < h; i++){
		    Arrays.fill(result[i], '0');
		}
		int[] dx = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
		int[] dy = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        if(grid[i][j] == '#'){
		            for(int k = 0; k < dx.length; k++){
		                int ni = i + dy[k];
		                int nj = j + dx[k];
		                if(0 <= ni && ni < h && 0 <= nj && nj < w){
		                    if(grid[ni][nj] != '#'){
		                        result[ni][nj] += 1;
		                    }else{
		                        result[ni][nj] = '#';
		                    }
		                }
		            }
		        }
		    }
		}
		
		// 出力
		for(int i = 0; i < h; i++){
		    String s = String.valueOf(result[i]);
		    System.out.println(s);
		}
	}
}

