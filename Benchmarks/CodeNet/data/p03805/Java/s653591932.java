import java.util.Scanner;
public class Main{
	static int ans;
	static int[][] e;
	static int n;
	static int[] c;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		e = new int[n+1][n+1];
		c = new int[n+1];
		for(int i = 0; i < m; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			e[a][b]=1;
			e[b][a]=1;
		}
		c[1]=1;
		dfs(1,n);
		System.out.println(ans);
	}
	public static void dfs(int number,int q){
		if(q==1){
			ans++;
			return;
		}
		for(int i = 1; i <= n; i++){
			if(e[number][i]==1 && c[i]!=1){
				c[i]=1;
				dfs(i,q-1);
				c[i]=0;
			}
		}
	}
}