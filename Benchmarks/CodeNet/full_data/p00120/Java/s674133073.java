import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			String str=s.nextLine();
			String[]arg=str.split(" ");
			int a=Integer.parseInt(arg[0]);
			int[]b=new int[arg.length-1];
			for(int i=0;i<arg.length-1;i++)b[i]=Integer.parseInt(arg[i+1]);
			double dp[][]=new double[4096][12];
			int n=arg.length-1;
			for(int i=0;i<4096;i++)
				for(int j=0;j<12;j++)
					dp[i][j]=999999999;
			for(int i=0;i<n;i++){
				dp[1<<i][i]=b[i];
			}
			for(int i=0;i<(1<<n)-1;i++){
				for(int j=0;j<n;j++){
					for(int k=0;k<n;k++){
						if((i&(1<<k))==0){
							dp[i+(1<<k)][k]=Math.min(dp[i+(1<<k)][k],dp[i][j]+Math.sqrt((b[j]+b[k])*(b[j]+b[k])-(b[j]-b[k])*(b[j]-b[k])));
						}
					}
				}
			}
			boolean ok=false;
		//	for(int i=0;i<n;i++)System.out.print(dp[(1<<n)-1][i]+" ");
			for(int i=0;i<n;i++)if(dp[(1<<n)-1][i]+b[i]<(double)a+0.000001)ok=true;
			if(ok)System.out.println("OK");
			else System.out.println("NA");
		}
	}
}