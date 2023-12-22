import java.util.BitSet;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int m = in.nextInt();
			int n = in.nextInt();
			if(n == 0) break;
			Point[] table = new Point[m+1];
			int[][] map = new int[1001][1001];
			int x = 500;
			int y = 500;
			int[] dx = {1, 0, -1, 0};
			int[] dy = {0, -1, 0, 1};
			int dir = 3;
			BitSet p = prime(m);
			for(int i=1; i<=m; i++){
				map[y][x] = i;
				table[i] = new Point(x, y);
				if(map[y+dy[(dir+1)%4]][x+dx[(dir+1)%4]] == 0){
					dir = (dir+1)%4;
				}
				x += dx[dir];
				y += dy[dir];
			}
			int[][] dp = new int[1001][1001];
			for(int i=0; i<=1000; i++){
				for(int j=0; j<=1000; j++){
					dp[i][j] = -1;
				}
			}
			dp[table[n].y][table[n].x] = p.get(map[table[n].y][table[n].x])?1:0;
			for(int i=table[n].y; i<1000; i++){
				for(int j=0; j<=1000; j++){
					int max = -1;
					for(int k=-1; k<=1; k++){
						if(j+k < 0 || j+k > 1000 || map[i][j+k] == -1) continue;
						max = Math.max(max, dp[i][j+k]);
					}
					if(max == -1) continue;
					dp[i+1][j] = max + (p.get(map[i+1][j])?1:0);
				}
			}
			int res = 0;
			int resId = 0;
			for(int i=0; i<=1000; i++){
				for(int j=0; j<=1000; j++){
					if((dp[i][j] > res || dp[i][j] == res && resId < map[i][j]) && p.get(map[i][j])){
						res = dp[i][j];
						resId = map[i][j];
					}
				}
			}
			System.out.println(res+" "+resId);
		}
	}
	
	public static String dump(int[][] map, int s, int t){
		StringBuilder sb = new StringBuilder();
		for(int i=s; i<=t; i++){
			for(int j=s; j<=t; j++){
				sb.append(map[i][j]+"\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static BitSet prime(int max){
		// 10^7: 93ms
		// 4*10^7: 687ms
		// 5*10^7: 922ms
		// 10^8: 2016ms
		BitSet isPrime = new BitSet(max+1);
		isPrime.set(2, max+1);
		for(long i=2; i*i<=max; i=isPrime.nextSetBit((int)i+1)){
//			if(i==-1) break; // iが小さいとき必要?
			for(int j=(int)(i<<1); j<=max; j+=i){
				isPrime.clear(j);
			}
		}
		return isPrime;
	}
}

class Point{
	int x, y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}