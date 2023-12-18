import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int[][] table = new int[n+1][n+1];
		for(int i = 0; i < m; i++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    table[x][y]++;
		}
		int[][] query = new int[q][2];
		for(int i = 0; i < q; i++){
		    query[i][0] = sc.nextInt();
		    query[i][1] = sc.nextInt();
		}
		
		// 計算
		int[][] sumTable = new int[n+1][n+1];
		for(int i = 1; i <= n; i++){
		    for(int j = 1; j <= n; j++){
		        sumTable[i][j] = sumTable[i][j-1] + sumTable[i-1][j] - sumTable[i-1][j-1] + table[i][j];
		    }
		}
		int result = 0;
		for(int i = 0; i < q; i++){
		    int x = query[i][0];
		    int y = query[i][1];
		    result = sumTable[y][y] - sumTable[y][x-1] - sumTable[x-1][y] + sumTable[x-1][x-1];
		    System.out.println(result);
		}
	}
}
