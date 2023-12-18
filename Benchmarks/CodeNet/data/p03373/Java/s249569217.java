import java.util.Scanner;

public class Main {
	//half and half


	public static void main(String[] args){
		int dp1[];//dp[a][b]
		int dp2[];//dp[a][b]
		int A,B,C,X,Y;
		Scanner sc = new Scanner(System.in);
		A= sc.nextInt();
		B= sc.nextInt();
		C= sc.nextInt();
		X= sc.nextInt();
		Y= sc.nextInt();
		dp1=new int[X+1];
		dp2=new int[X+1];
		//if(A>C*2)A=C*2;
		//if(B>C*2)B=C*2;

		//    		dp[0][0]=0;
		//    		dp[1][0]=A;
		//    		dp[0][1]=B;
		//    		dp[1][1]=Math.min(A+B, C*2);


		for(int a=0;a<=X;a++) {
			dp1[a]=A*a;
		}
		for(int b=1;b<=Y;b++) {
			for(int a=0;a<=X;a++) {
				int t1=dp1[a]+B;
				if(a==0) {dp2[a]=t1;continue;}
				int t2=dp2[a-1]+A;
				int t3=dp1[a-1]+C*2;
//				System.err.println("t1\t"+t1);
//				System.err.println("t2\t"+t2);
//				System.err.println("t3\t"+t3);


				dp2[a]=Math.min(t1, Math.min(t2, t3));

			}
			for(int k=0;k<=X;k++) {
				dp1[k]=dp2[k];
				dp2[k]=0;
			}
		}

		System.out.println(dp1[X]);
	}
}