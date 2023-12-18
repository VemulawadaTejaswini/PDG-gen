import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		boolean [][]g = new boolean [n][n];
		
		for(int i = 0; i < n-1 ;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			g[a-1][b-1] = true;
			g[b-1][a-1] = true;  
		}
		boolean []visit = new boolean [n];
		
		int []sum  = new int [n];
		
		for(int i = 0; i < q ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			sum[x-1] += y;
		}
		
		visit[0] = true;
		dfs(n,0,g,visit,sum);
		
		for(int i = 0; i < n ;i++) {
			System.out.print(sum[i]+" ");
		}
		
		
		}
	private static void dfs(int n , int v ,boolean[][]g, boolean[]visit,int []a) {
		
		boolean allvisit = true;
		
		for(int i = 0 ; i < n-1 ; i++) {
			if(!visit[i]) {
				allvisit = false;
				break;
			}
		}
		
		if(allvisit) {
			return;
		}
		
		for(int i = 0; i < n ; i++) {
			if(!visit[i] && g[v][i]) {
				visit[i] = true;;
				a[i] += a[v];
				dfs(n,i,g,visit,a);
				visit[i] = false;
			}
		}
		return;
		
	}

}
