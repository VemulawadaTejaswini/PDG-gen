import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[][] gridD = new int[c+1][c+1];
		int[][] gridC = new int[n+1][n+1];
		for(int i = 1; i < c+1; i++){
		    for(int j = 1; j < c+1; j++){
		        gridD[i][j] = sc.nextInt();
		    }
		}
		for(int i = 1; i < n+1; i++){
		    for(int j = 1; j < n+1; j++){
		        gridC[i][j] = sc.nextInt();
		    }
		}
		
		// 計算
		int result = Integer.MAX_VALUE;
		int[][] d0 = new int[c+1][2];
		d0[0][1] = Integer.MAX_VALUE;
		d0[1][0] = c+1;
		int[][] d1 = new int[c+1][2];
		d1[0][1] = Integer.MAX_VALUE;
		d1[1][0] = c+2;
		int[][] d2 = new int[c+1][2];
		d2[0][1] = Integer.MAX_VALUE;
		d2[1][0] = c+3;
		for(int k = 1; k < c+1; k++){
		    for(int i = 1; i < n+1; i++){
		        for(int j = 1; j < n+1; j++){
		            if((i+j)%3 == 0){
		                d0[k][0] = k;
		                d0[k][1] += gridD[gridC[i][j]][k];
		            }else if((i+j)%3 == 1){
		                d1[k][0] = k;
		                d1[k][1] += gridD[gridC[i][j]][k];
		            }else{
		                d2[k][0] = k;
		                d2[k][1] += gridD[gridC[i][j]][k];
		            }
		        }
		    }
		}
		Arrays.sort(d0, (s, t) -> Integer.compare(s[1], t[1]));
		Arrays.sort(d1, (s, t) -> Integer.compare(s[1], t[1]));
		Arrays.sort(d2, (s, t) -> Integer.compare(s[1], t[1]));
		for(int i = 0; i < c; i++){
		    for(int j = 0; j < c; j++){
		        for(int k = 0; k < c; k++){
		            if(d0[i][0] == d1[j][0] || d1[j][0] == d2[k][0] || d2[k][0] == d0[i][0]) continue;
		            result = min(result, d0[i][1] + d1[j][1] + d2[k][1]);
		        }
		    }
		}
		// 出力
		System.out.println(result);
	}
}
