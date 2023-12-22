import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int z=0;z<n;z++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int[][] dp = new int[y+2][x+2];
			boolean[][] xx = new boolean[y+2][x+2];
			boolean[][] yy = new boolean[y+2][x+2];
			int p = sc.nextInt();
			int[] a = new int[4];
			int b;
			for(int i=0;i<p;i++){
				for(int j=0;j<4;j++) a[j] = sc.nextInt()+1;
				if(a[0]==a[2]){
					b = Math.max(a[1], a[3]);
					yy[b][a[0]] = true;
				}else{
					b = Math.max(a[0], a[2]);
					xx[a[1]][b] = true;
				}
			}
			
			dp[1][0] = 1;
			for(int i=1;i<=y+1;i++){
				for(int j=1;j<=x+1;j++){
					if(yy[i][j]==false) dp[i][j]+=dp[i-1][j];
					if(xx[i][j]==false) dp[i][j]+=dp[i][j-1];
				}
			}
			
			b = dp[y+1][x+1];
			if(b==0) System.out.println("Miserable Hokusai!");
			else System.out.println(b);
		}
	}	
}