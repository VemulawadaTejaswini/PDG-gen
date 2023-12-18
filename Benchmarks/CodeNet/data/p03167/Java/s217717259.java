import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
	static int [][]dp;
	static int row, col;
	static String []grid;
	static int MOD = (int)1e9 + 7;
	static int back(int x, int y){
		if(x == row - 1 && y == col - 1)return 1;
		if(x >= row || y >= col || grid[x].charAt(y) == '#')return 0;
		if(dp[x][y] != -1)return dp[x][y];
		return dp[x][y] = ((back(x + 1, y) % MOD)  + (back(x, y + 1) % MOD)) % MOD;
	}
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			 row = sc.nextInt();
			 col = sc.nextInt();
			 dp = new int[row + 1][col + 1];
			 grid = new String[row + 1];
			 grid[0] = sc.nextLine();
			 for(int i = 0; i < row; ++i){
			 	for(int j = 0; j < col; ++j){
			 		dp[i][j] = -1;
			 	}
			 }
			for(int i = 0; i < row; ++i){
				grid[i] = sc.nextLine();
			}
			System.out.println(back(0, 0));
		}		
	}
}
