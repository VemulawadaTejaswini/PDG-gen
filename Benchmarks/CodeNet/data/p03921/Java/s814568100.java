import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int n;
	static boolean[] flag;
	static boolean[][] edge;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt();
		int[] mnum = new int[m];
		int [] k = new int[n];
		boolean[][] l = new boolean[n][m];
		edge = new boolean[n][n];
		
		for(int i=0; i<n; i++){
			k[i] = sc.nextInt();
			for(int j=0; j<k[i]; j++){
				int ml = sc.nextInt()-1;
				l[i][ml] = true;
				mnum[ml]++;
			}
		}
		sc.close();
		
		for(int i=0; i<m; i++){
			/*if(mnum[i] <= 1){
				break;
			}*/
			
			int fir = 0;
			for(int j=0; j<n; j++){
				if(l[j][i]){
					fir = j;
					break;
				}
			}
			for(int j=fir; j<n; j++){
				if(l[j][i]){
					edge[j][fir] = true;
					edge[fir][j] = true;
				}
			}
		}
		
		flag = new boolean[n];
		
		dfs(0);
		
		for(int i=0; i<n; i++){
			if(!flag[i]){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
	
	public static void dfs(int vertex){
		if(flag[vertex]){
			return;
		}
		
		flag[vertex] = true;
		
		for(int i=0; i<n; i++){
			if(edge[vertex][i]){
				dfs(i);
			}
		}
	}

}
