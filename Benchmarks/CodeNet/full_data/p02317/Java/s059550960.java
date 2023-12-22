import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int[] num=new int[a];
		for(int i=0;i<a;++i){
			num[i]=sc.nextInt();
		}
		int[] dp=new int[a];
		dp[0]=1;
		for(int i=1;i<a;++i){
			int max=0;
			int key=0;
			boolean flag=false;
			for(int j=i-1;j>=0;--j){
				if(num[i]>num[j]&&num[j]>max){
					max=num[j];
					key=j;
					flag=true;
				}
			}
			if(flag==false){
				dp[i]=dp[key];
			} else {
				dp[i]=dp[key]+1;
			}
		}
		int maxdp=dp[0];
		for(int i=1;i<a;++i){
			if(maxdp<dp[i]){
				maxdp=dp[i];
			}
		}
		System.out.println(maxdp);
	}

}