import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] judge = new boolean[n][m];
		for(int i=0;i<n;i++){
			Arrays.fill(judge[i], true);
		}
		int[] dx = {1,1,1,0,-1,-1,-1,0};
		int[] dy = {1,0,-1,-1,-1,0,1,1};

		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				for(int k=0;k<8;k++){
					if(i+dx[k]<0 || i+dx[k]>=n){
						continue;
					}
					if(j+dy[k]<0 || j+dy[k]>=m){
						continue;
					}
					judge[i+dx[k]][j+dy[k]] = !judge[i+dx[k]][j+dy[k]];
				}
			}
		}
		int count = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(judge[i][j]){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}