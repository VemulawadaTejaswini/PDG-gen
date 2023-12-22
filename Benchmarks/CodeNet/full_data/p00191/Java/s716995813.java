import java.util.*;
public class Main {
	static int day;
	static int Hn;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			Hn=in.nextInt();
			day=in.nextInt();
			if(day+Hn==0)break;
			double[][] hyou=new double[Hn][Hn];
			for(int s=0;s<Hn;s++)for(int i=0;i<Hn;i++)hyou[s][i]=in.nextDouble();
			double[][] dp=new double[Hn][day];
			for(int i=0;i<Hn;i++)dp[i][0]=1.0;
			for(int hi=1;hi<day;hi++){
				for(int i=0;i<Hn;i++){
					//dp[i][hi]を考える
					double max=0;
					for(int k=0;k<Hn;k++){
						max=Math.max(max,hyou[k][i]*dp[k][hi-1]);
					}
					dp[i][hi]=max;
				}
			}
			double max=0;
			for(int i=0;i<Hn;i++)max=Math.max(max,dp[i][day-1]);
			System.out.printf("%.2f\n", max);
		}
	}
}