import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] dx = new long[n-1];
		long[] dy = new long[m-1];
		long tmp = sc.nextLong();
		for(int i = 0; i < n-1; i++){
		    long x = sc.nextLong();
		    dx[i] = x - tmp;
		    tmp = x;
		}
		tmp = sc.nextLong();
		for(int i = 0; i < m-1; i++){
		    long y = sc.nextLong();
		    dy[i] = y - tmp;
		    tmp = y;
		}
		
		// 計算
		long result = 0;
		int MOD = 1000000007;
		long sumX = 0;
		long sumY = 0;
		for(int i = 0; i < n-1; i++){
		    sumX += dx[i]*(i+1)%MOD*(n-1-i)%MOD;
		    sumX %= MOD;
		}
		for(int j = 0; j < m-1; j++){
		    sumY += dy[j]*(j+1)%MOD*(m-1-j)%MOD;
		    sumY %= MOD;
		}
		result = sumX*sumY%MOD;
		
		// 出力
		System.out.println(result);
	}
}

