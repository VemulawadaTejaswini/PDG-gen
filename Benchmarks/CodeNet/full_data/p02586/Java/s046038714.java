import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int[] r = new int[K];
		int[] c = new int[K];
		int[] k = new int[K];
      	int[][] values = new int[3000][3000];
      	for(int i=0;i<K;i++){
          r[i] = sc.nextInt();
          c[i] = sc.nextInt();
          k[i] = sc.nextInt();
          r[i]--;
          c[i]--;
          values[r[i]][c[i]] = k[i];
        }
		int[][][]dp = new int[3000][3000][4];
		dp[0][0][1] = values[0][0];
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				for(int m=0;m<4;m++){
                  //System.out.println(i+":"+j+":"+m+":"+dp[i][j][m]);
					if( i+1 < R ){
						dp[i+1][j][0] = Math.max( dp[i+1][j][0],dp[i][j][m] );
						dp[i+1][j][1] = Math.max( dp[i+1][j][1] , dp[i][j][m] + values[i+1][j] );
					}
					if( j+1 < C ){
						dp[i][j+1][m] = Math.max( dp[i][j+1][m] , dp[i][j][m] );
                      	if( m+1 <= 3 )
						dp[i][j+1][m+1] = Math.max( dp[i][j+1][m+1] , dp[i][j][m] + values[i][j+1] );
					}
				}
			}
		}
      int max = 0;
      for(int i=0;i<4;i++){
        if( max < dp[R-1][C-1][i] ){
          max = dp[R-1][C-1][i];
        }
      }
      System.out.println(max);
	}
}