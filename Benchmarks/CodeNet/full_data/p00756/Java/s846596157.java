import java.util.*;

public class Main {
	int n, max;
	int[] c;
	boolean[] f;
	boolean[][] a;

	void dfs(int d){
		boolean flag;
		for(int i=0;i<n;i++){
			if(f[i]==true) continue;
			flag = false;
			for(int j=i-1;j>=0;j--){
				if(f[j]==false && a[i][j]==true){
					flag = true;
					break;
				}
			}
			if(flag==false){
				for(int j=i+1;j<n;j++){	
					if(f[j]==true || c[i]!=c[j]) continue;
					for(int k=j-1;k>=0;k--){
						if(f[k]==false && a[j][k]==true){
							flag = true;
							break;
						}
					}
					if(flag==false){
						f[i] = true;
						f[j] = true;
						dfs(d+1);
						f[i] = false;
						f[j] = false;
					}
				}
			}
		}
		max = Math.max(max, d);
	}
	
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			if(n==0) break;
			
			f = new boolean[n];
			a = new boolean[n][n];
			c = new int[n];
			
			int[][] b = new int[n][3];
			for(int i=0;i<n;i++){
				for(int j=0;j<3;j++) b[i][j] = sc.nextInt();
				c[i] = sc.nextInt();
				for(int j=i-1;j>=0;j--){
					if(Math.sqrt((b[i][0]-b[j][0])*(b[i][0]-b[j][0])+(b[i][1]-b[j][1])*(b[i][1]-b[j][1]))<b[i][2]+b[j][2]){
						a[i][j] = true; //jがiの上にのってる
					}
				}
			}
			
			max = 0;
			dfs(0);
			System.out.println(max*2);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}