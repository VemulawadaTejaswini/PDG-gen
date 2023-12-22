import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			long stair[]=new long[n+1];
			stair[0]=1;
			for(int i=1;i<=n;i++){
				int sum=0;
				for(int j=1;j<=3;j++){
					if(0<=i-j){
						sum+=stair[i-j];
					}
				}
				stair[i]=sum;
			}
			
//			for(int i=0;i<=n;i++){
//				System.out.println(dp[i]);
//			}
			
			System.out.println((long)Math.ceil(Math.ceil(stair[n]/10)/365));
		}

	}

}