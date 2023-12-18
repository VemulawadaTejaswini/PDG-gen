import java.util.*;
 
 
import java.io.*;
 
 
 
public class Main 
{   
	
	static int dp[][][];
	static long mod=1000000007;
	public static void main(String[] args) throws IOException 
	{ 
		 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
			StringTokenizer s=new StringTokenizer(br.readLine());
			String st=s.nextToken();
			s=new StringTokenizer(br.readLine());
			int d=Integer.parseInt(s.nextToken());		 
			dp=new int[20][105][2];
			
			
			for (int i = 0; i < 20; i++) {
	            for (int j = 0; j < 105; j++) {
	                for (int k = 0; k < 2; k++) {
	                    dp[i][j][k] = -1;
	                }
	            }
	        }
			
			long ans=solveD(st,0,0,d,true);			
			pw.println((ans-1)%mod);
			pw.close();
		
		
	}
	private static int solveD(String s, int pos,int cnt, int d, boolean tight) {
		// TODO Auto-generated method stub
		if(pos==s.length())
			return (cnt==0)?1:0;
		
		if(dp[pos][cnt][(tight)?1:0]!=-1)
			return dp[pos][cnt][(tight)?1:0];
		
		int ans=0;
		
		int end=(tight)?(s.charAt(pos)-'0'):9;
		
		for(int i = 0; i<=end ;i++){
			
				ans = (int) ((ans+ solveD(s,pos+1,(cnt+i)%d,d, tight&(i==end)))%mod);
		}
		return dp[pos][cnt][(tight)?1:0] = ans;
	}
	
	
}