import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] t=new int[n+1];
		for(int i=1;i<n+1;i++) {
			t[i]=sc.nextInt();
		}
		
		int [] dp=new int[n+1];
		dp[0]=0;
		dp[1]=0;
		dp[2]=abs(t[1],t[2]);
	
		
		for (int j=3;j<n+1;j++) {
			int t1=abs(t[j],t[j-1]);
			int t2=abs(t[j],t[j-2]);
			if((t1+dp[j-1])<=(t2+dp[j-2])) {
				dp[j]=t1+dp[j-1];
				
			}else {
				dp[j]=t2+dp[j-2];
			}
			
		}
		
		
		
		System.out.println(dp[n]);

	}
	public static int abs(int b,int c) {
		
		if(b-c>=0) {
			return b-c;
		} else
		
		return c-b;
		
	}
	

}
