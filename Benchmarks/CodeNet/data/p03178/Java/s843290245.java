
import java.io.*;
import java.util.*;

public class Main{

	static int MOD=(int)1e9+7;
	static PrintWriter out=new PrintWriter(System.out);;
	static int [][][]memo;
	static int []x;
	static int D;
	
	static int dp(int idx,int mod,int equal) {
		if(idx==x.length)
			return mod>0?0:1;
		if(memo[equal][mod][idx]!=-1)
			return memo[equal][mod][idx];
		int up=equal==1?x[idx]:9;
		int ans=0;
		for(int d=0;d<=up;d++) {
			int newEqual=equal==0?0:d<up?0:1;
			ans=ans+dp(idx+1,(mod+d)%D,newEqual);
			if(ans>=MOD)
				ans-=MOD;
		}
		return memo[equal][mod][idx]=ans;
	}
	
		
		
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		
		char []tmp=sc.next().toCharArray();
		x=new int [tmp.length];
		for(int i=0;i<x.length;i++)
			x[i]=tmp[i]-'0';
		D=sc.nextInt();
		memo=new int [2][D][x.length];
		for(int [][]a2:memo)
			for(int []a:a2)
				Arrays.fill(a, -1);
		int ans=dp(0, 0, 1)-1;
		if(ans<0)
			ans+=MOD;
		out.println(ans);
		out.close();

	}
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;
		Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		Scanner(String fileName) throws FileNotFoundException{
			br=new BufferedReader(new FileReader(fileName));
		}
		String next() throws IOException {
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		String nextLine() throws IOException {
			return br.readLine();
		}
		int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		long nextLong()  throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
	}
}
