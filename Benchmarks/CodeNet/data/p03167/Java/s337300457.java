import java.util.*;


import java.io.*;



public class Main 
{   
	
	static long dp[][];
	static long mod=1000000007;
	public static void main(String[] args) throws IOException 
	{ 
		 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer s=new StringTokenizer(br.readLine());
		int r=Integer.parseInt(s.nextToken());
		int c=Integer.parseInt(s.nextToken());
		char arr[][]=new char[r][c];
		for(int i=0;i<r;i++) {
			s=new StringTokenizer(br.readLine());
			String st=s.nextToken();
			for(int j=0;j<c;j++) {
				arr[i][j]=st.charAt(j);
			}
		}
//		for(int i=0;i<r;i++) {
//			
//			for(int j=0;j<c;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		dp=new long[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
				dp[i][j]=-1;
		}
		long ans=grid(arr,0,0,r,c)%mod;
		pw.println(ans);
		
		pw.close();
	}
	private static long grid(char[][] arr, int i, int j, int r, int c) {
		// TODO Auto-generated method stub
		if(i==r-1 && j==c-1) {
			
			return 1;
		}
		
		
		if(i>=r || j>=c || arr[i][j]=='#')
			return 0;
		
		if(dp[i][j]!=-1)
			return dp[i][j];
		
		long op1=grid(arr,i+1, j, r, c);
		long op2=grid(arr,i, j+1, r, c);
		
		return dp[i][j]= op1+op2;
	}
	
	
	
	
}