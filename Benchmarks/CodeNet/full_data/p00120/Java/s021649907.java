import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNextLine()) {
				String str=sc.nextLine();
				String[] tokens=str.split(" ");
				int W=0;
				int[] r=new int[13];
				int n=0;
				for(String s:tokens) {
					if(W==0) W=Integer.parseInt(s);
					else r[n-1]=Integer.parseInt(s);
					n++;
				}
				n--;
				//dp[今までの頂点][現在地]=左からどこにいるか
				double[][] dp=new double[1<<n][n];
				double INF=1<<28;
				for(int i=0; i<(1<<n); i++) {
					for(int j=0; j<n; j++) {
						dp[i][j]=INF;
					}
				}
				for(int i=0; i<n; i++) {
					dp[1<<i][i]=2*r[i];
				}
				for(int i=0; i<(1<<n); i++) {
					for(int j=0; j<n; j++) {
						if(dp[i][j]==INF)	continue;
						for(int k=0; k<n; k++) {
							if((1&i>>k)==1)	continue;
							int nexti=i|(1<<k);
							double nextdp=dp[i][j]-r[j]+Math.sqrt((r[j]+r[k])*(r[j]+r[k])-(r[j]-r[k])*(r[j]-r[k]))+r[k];
							dp[nexti][k]=Math.min(dp[nexti][k], nextdp);
						}
					}
				}
				double min=INF;
				for(int i=0; i<n; i++) {
					min=Math.min(min, dp[(1<<n)-1][i]);
				}
				System.out.println(min<=W? "OK":"NA");
			}
		}
	}	
}
