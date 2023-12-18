import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] grid = new char[h+2][w+2];
		for(int i = 0; i < h; i++){
		    String s = sc.next();
		    for(int j = 0; j < w; j++){
		        grid[i+1][j+1] = s.charAt(j);
		    }
		}

		// 計算
		String result = "Yes";
		for(int i = 1; i <= h; i++){
		    for(int j = 1; j <= w; j++){
		        if(grid[i][j] != '#') continue;
		        if(grid[i-1][j] == '#') continue;
		        if(grid[i][j-1] == '#') continue;
		        if(grid[i][j+1] == '#') continue;
		        if(grid[i+1][j] == '#') continue;
		        result = "No";
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}
