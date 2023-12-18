import java.util.*;
import java.io.*;

public class Main {


	static int MOD=(int)1e9+7;
	
	static int n;
	static int[][] matMult(int [][]A,int [][]B)
	{
		int [][]C=new int [n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
			{
				long ans=0;
				for(int k=0;k<n;k++)
					ans=(ans+A[i][k]*1L*B[k][j])%MOD;
				C[i][j]=(int) ans;
			}
		return C;
	}
	static int[][] pow(int [][]A,long e)
	{
		int [][]ans=new int [n][n];
		for(int i=0;i<n;i++)
			ans[i][i]=1;
		while(e>0)
		{
			if((e&1)==1)
				ans=matMult(ans, A);
			e>>=1;
			A=matMult(A,A);
				
		}
		return ans;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		 n=sc.nextInt();
	
		long k=sc.nextLong();
		int [][]B=new int [n][n];
		for(int x=0;x<n;x++)
			for(int y=0;y<n;y++)
		{
			int z=sc.nextInt();
			B[x][y]=z;
			
		}
		int [][]ans=pow(B,k);
		
		int total=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				total+=ans[i][j];
				if(total>=MOD)
					total-=MOD;
				
				
			}
			
		}
		out.println(total);
		out.close();
	}
	
	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(System.in));

		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}
	}

}