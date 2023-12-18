
import java.util.Scanner;

public class Main {
	
	static int n,R;
	static long [][]d;
	static int []r;
	static boolean []visit;
	static long ans;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		R = Integer.parseInt(sc.next());
		
		r = new int [R];
		
		for(int i = 0 ; i < R ;i++) {
			r[i] = Integer.parseInt(sc.next())-1;
		}
		
		d = new long [n][n];
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < n ;j++) {
				d[i][j] = 100000000000000000L;
			}
		}
		
		for(int i = 0 ; i < m ;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			int cost = Integer.parseInt(sc.next());
			d[a-1][b-1] = cost;
			d[b-1][a-1] = cost;
		}
		
		Floyd_Warshall();
		
		ans = 10000000000000000L;
		cnt = 1;
		visit = new boolean [n];
		visit[r[0]] = true;
		dfs(r[0], 0L);
		
		System.out.println(ans);
	}
		static void dfs(int now ,long dist) {
			
			if(cnt == R) {
				ans = Math.min(dist, ans);
				//System.out.println(ans);
				return;
			}
			
			for(int i = 1 ; i < R ;i++) {
				if(!visit[r[i]]) {
					visit[r[i]] = true;
					cnt++;
					//System.out.println(r[i] +" "+(dist + d[now][r[i]]) +" "+cnt);
					dfs(r[i],dist + d[now][r[i]]);
					cnt--;
					visit[r[i]] = false;
				}
			}
			
		}
		static void  Floyd_Warshall() {
			
			for(int i = 0 ; i < n ;i++) {
				for(int j = 0 ; j < n ; j++) {
					for(int k = 0 ; k < n ;k++) {
						d[j][k] = Math.min(d[j][k], d[j][i] + d[i][k]);
					}
				}
			}
		}
	}
