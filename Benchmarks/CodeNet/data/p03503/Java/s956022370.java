import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][][] f = new int[n][5][2];
		int[][] p = new int[n][11];
		int[] max = new int[n];
		int[] count = new int[n];
		boolean flag = false;
		Arrays.fill(max, -100000001);
		for(int i=0;i<n;i++){
			for(int j=0;j<5;j++){
				for(int k=0;k<2;k++){
					f[i][j][k] = sc.nextInt();
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<11;j++){
				p[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<n;i++){
			for(int j=0;j<10;j++){
				if(f[i][j/2][j%2]==1){
					count[i]++;
				}
			}
			for(int j=0;j<=count[i];j++){
				if(max[i]<=p[i][j]){
					max[i] = p[i][j];
					if(j!=0){
						flag = true;
					}
				}
			}
		}

		int ans = 0;
		for(int i=0;i<n;i++){
			ans += max[i];
		}
		if(flag){
			System.out.println(ans);
		}
		else{
			int answer = (int)Math.pow(10,7)*(-100)-2;
			for(int i=0;i<n;i++){
				int maxx = -100000001;
				for(int j=1;j<=count[i];j++){
					maxx = (int)Math.max(maxx,p[i][j]);
				}
				answer = (int)Math.max(answer, ans - p[i][0] + maxx);
			}
			System.out.println(answer);
		}

	}
}
