import java.util.Scanner;

public class Main {
	//half and half


	public static void main(String[] args){
		int dp[][];//dp[a][b]
		int A,B,C,X,Y;
		Scanner sc = new Scanner(System.in);
		A= sc.nextInt();
		B= sc.nextInt();
		C= sc.nextInt();
		X= sc.nextInt();
		Y= sc.nextInt();
		System.err.println("d0");
		dp=new int[X+1][Y+1];
		System.err.println("d1");
		//if(A>C*2)A=C*2;
		//if(B>C*2)B=C*2;
		for(int a=0;a<=X;a++) {
			for(int b=0;b<=Y;b++) {
				dp[a][b]=1000000;
			}
		}
		dp[0][0]=0;
		dp[1][0]=A;
		dp[0][1]=B;
		dp[1][1]=Math.min(A+B, C*2);
		for(int a=0;a<=1;a++)
			for(int b=0;b<=1;b++) {
				//System.err.println(a+"\t"+b+"\t"+dp[a][b]);
			}
		//System.err.println("--------");
		
		System.err.println("d2");
		for(int a=1;a<=X;a++) {
			dp[a][0]=A*a;
		}
		for(int b=1;b<=Y;b++) {
			dp[b][0]=B*b;
		}
		for(int a=1;a<=X;a++)
			for(int b=1;b<=Y;b++) {
				int t0=dp[a-1][b]+A;
				int t1=dp[a][b-1]+B;
				int t2=dp[a-1][b-1]+C*2;
				//System.err.println(t0+"\t"+t1+"\t"+t2);

				int tmp=Math.min(t0,t1);
				dp[a][b]=Math.min(tmp, t2);

				//System.err.println(a+"\t"+b+"\t"+dp[a][b]);
				//System.err.println("--");
			}

		System.out.println(dp[X][Y]);
	}
}
