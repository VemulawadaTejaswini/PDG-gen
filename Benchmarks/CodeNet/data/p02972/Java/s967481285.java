import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N+1];
		A[0]=0;
		for(int i=1;i<=N;i++){
			A[i]=sc.nextInt();
		}
		int[] dp=new int[N+1];
		
		if(A[N]==0){
			dp[N]=0;
		}else{
			dp[N]=1;
		}
		
		for(int i=N-1;i>=1;i--){
			int sum=0;
			for(int j=i+1;j<=N;j++){
				if(j%i==0&&dp[j]==1)
				sum++;
			}
			if(sum%2==A[i]){
				dp[i]=0;
			}else{
				dp[i]=1;
			}
		}
		int count=0;
		for(int i=1;i<=N;i++){
			if(dp[i]==1)
				count++;
		}
		
		if(count==0){
			System.out.println(0);
			System.out.println(0);
		}else{
			System.out.println(count);
			for(int i=1;i<=N;i++){
				if(dp[i]==1){
					System.out.print(i);
					System.out.print(" ");
				}
			}
		}
	}
}		
