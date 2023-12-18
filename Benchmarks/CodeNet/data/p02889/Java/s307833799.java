import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static int[][] map = new int[301][301];
	public static int max=987654321;
	public static int[] mark=new int[301];
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int N, M, L;
		N = sc.nextInt();
		M = sc.nextInt();
		L = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int a, b, c;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			map[a][b] = c;
			map[b][a] = c;
		}
		
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			Arrays.fill(mark, 0);
			int s, r;
			s = sc.nextInt();
			r = sc.nextInt();
			int ans=dfs(s,r,L,N+1,0,L);
			if(ans==max)
				System.out.println(-1);
			else
				System.out.println(ans);
		}
	}

	public static int dfs(int s, int r, int l,int n,int c,int cl) {
		int ans=max;
		
		if(s==r)
			return c;
		
		if(mark[s]==1)
			return ans;
		
		mark[s]=1;
		
		for(int i=0;i<n;i++) {
			if(map[s][i]!=0&&mark[i]!=1) {
				
				if(l<map[s][i])
					break;
				if(cl>=map[s][i]) {
					 ans=Math.min(ans, dfs(i,r,l,n,c,cl-map[s][i]));
					
				}
				else {
					ans=Math.min(ans, dfs(i,r,l,n,c+1,l-map[s][i]));
				}
			}
		}
		
		mark[s]=0;
		
		
		return ans;
	}

}
