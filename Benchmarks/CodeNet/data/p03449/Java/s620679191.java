import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();// 列数

		int[][] a = new int[2][n];
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}

		// 計算
		int maxCandies = 0;

		for(int m = 0; m < n; m++){
			int temp = 0;
			for(int k = 0; k <= m; k++){
				temp = temp + a[0][k];
			}
			for(int k = m; k < n; k++){
				temp = temp + a[1][k];
			}
			maxCandies = max(maxCandies, temp);
		}
		// 出力
		System.out.println(maxCandies);
	}
}


