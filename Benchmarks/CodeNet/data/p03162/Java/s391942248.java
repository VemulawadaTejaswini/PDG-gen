import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		
		int N=sc.nextInt();
		//int k=sc.nextInt();
		int a[][]=new int[N][3];
		for(int i=0;i<N;i++)
			for(int j=0;j<3;j++)a[i][j]=sc.nextInt();

		
		int dp[]=new int[3];
		dp[0]=a[0][0];
		dp[1]=a[0][1];
		dp[2]=a[0][2];
		int key=0;
	
		
		
		int f=0;
		if(N==1)	{int max=Math.max(dp[0], dp[1]);
		max=Math.max(max, dp[2]);
		System.out.println(max);}
		else {
		
			int m[]=new int[3];
		for(int i=1;i<N;i++) {

			
			
			
			//for(int j=1;j<;j++) {if(f==a[i-1][j]) {key=j;break;}}
			m[0]=a[i][0]+Math.max(dp[2],dp[1]);
			m[1]=a[i][1]+Math.max(dp[2],dp[0]);
			m[2]=a[i][2]+Math.max(dp[1],dp[0]);
		//	System.out.println(m[2]);
	//		System.out.println(m[1]);
			
			for(int j=0;j<3;j++) {
				dp[i]=m[i];
			}
			
		}
		int max=Math.max(dp[0], dp[1]);
		max=Math.max(max, dp[2]);
		System.out.println(max);
	}
		
}
	}
