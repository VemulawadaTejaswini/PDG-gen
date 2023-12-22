import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args)throws Exception{
		new Main().solve();
	}
	void solve(){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();//the number of cities
			int m=sc.nextInt();//the number of paths
			if(n==0&&m==0)break;
			int INF=Integer.MAX_VALUE/4;
			int[][] ldis=new int[n][n];
			int[][] sdis=new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(i==j)continue;
					ldis[i][j]=INF;
					sdis[i][j]=INF;
				}
			}
			for(int i=0;i<m;i++){
				int x=sc.nextInt()-1;
				int y=sc.nextInt()-1;
				int t=sc.nextInt();
				String str=sc.next();
				if(str.equals("L")){
					ldis[x][y]=t;
					ldis[y][x]=t;
				}else if(str.equals("S")){
					sdis[x][y]=t;
					sdis[y][x]=t;
				}
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(i==j)continue;
					for(int k=0;k<n;k++){
						ldis[i][j]=Math.min(ldis[i][j],ldis[i][k]+ldis[k][j]);
						sdis[i][j]=Math.min(sdis[i][j],sdis[i][k]+sdis[k][j]);
					}
				}
			}
			int r=sc.nextInt();
			int[] destination=new int[r];
			for(int i=0;i<r;i++){
				destination[i]=sc.nextInt()-1;
			}
			int[][] dp=new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					dp[i][j]=INF;
				}
			}
			dp[0][destination[0]]=0;//dp[i][j]???i???????????§?¨?????????????j????????????????????´???????????????
			for(int i=1;i<r;i++){
				for(int j=0;j<n;j++){
					for(int k=0;k<n;k++){
						if(k==j){
							dp[i][j]=Math.min(dp[i][j],ldis[destination[i]][destination[i-1]]+dp[i-1][j]);
							continue;
						}
						dp[i][j]=Math.min(dp[i][j],ldis[destination[i]][j]+sdis[j][k]+ldis[k][destination[i-1]]+dp[i-1][k]);
					}
				}
			}
			int min=9999999;
			for(int i=0;i<n;i++){
				min=Math.min(dp[r-1][i],min);
			}
			System.out.println(min);
		}
	}
	void tr(Object...o){System.out.println(Arrays.deepToString(o));}
}