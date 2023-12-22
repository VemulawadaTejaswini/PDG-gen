import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pr[]=new int[n*n];
		int pc[]=new int[n*n];
		int num[][]=new int[n][n];
		int ans=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				num[i][j]=1;
			}
		}
		for(int i=0;i<n*n;i++) {
			int a=sc.nextInt();
			pr[i]=(a-1)/n;
			pc[i]=(a-1)%n;
		}
		
		for(int i=0;i<n*n;i++) {
			int Smin=1001001001;
			num[pr[i]][pc[i]]=0;
		int sum[]=new int[4];
		sum[0]=0;
		sum[1]=0;
		sum[2]=0;
		sum[3]=0;
		for(int j=pc[i];j>=0;j--) {
			sum[0]+=num[pr[i]][j];
		}
		for(int j=pr[i];j>=0;j--) {
			sum[1]+=num[j][pc[i]];
		}
		for(int j=pc[i];j<n;j++) {
			sum[2]+=num[pr[i]][j];
		}
		for(int j=pr[i];j<n;j++) {
			sum[3]+=num[j][pc[i]];
		}
		for(int j=0;j<4;j++) {
			if(Smin>sum[j]) {
				Smin=sum[j];
			}
		}
		ans+=Smin;
		}
		System.out.println(ans);
	}
}
