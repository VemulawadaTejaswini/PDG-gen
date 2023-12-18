import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean [][]g = new boolean [n][n];
		
		for(int i = 0 ; i < n ; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			g[a][b] = true;
			g[b][a] = true;
			
		}
		boolean visit [] = new boolean [n];
		
		visit[0] = true;
		int count = dfs(n,0,g,visit);
		System.out.println(count);

	}
		private static int dfs(int n,int v ,boolean [][]g,boolean []visit) {
			
			boolean Allvisit = true;
			
			for(int i = 0 ;i < n ; i++) {
				if(!visit[i]) {
					Allvisit = false;
				}
			}
			
			if(Allvisit) {
				return 1;
			}
			int sum = 0;
			
			for(int i = 0; i < n ; i++) {
				if(!visit[i] && g[v][i]) {
					visit[i] = true;
					sum += dfs(n,i,g,visit);
					visit[i] = false;
				}
				
			}
			
			return sum;
			
			
			}
}




