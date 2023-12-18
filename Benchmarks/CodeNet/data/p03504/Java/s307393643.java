import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws Throwable {
		MyScanner sc=new MyScanner();
		PrintWriter pw=new PrintWriter(System.out);
		
		int n=sc.nextInt();
		int c=sc.nextInt();
		int max=(int)1e5+5;
		int [] cnt=new int [max];
		while(n-->0){
			int s=sc.nextInt();
			int e=sc.nextInt();
			int cc=sc.nextInt()-1;
			cnt[s-1]++;
			cnt[e]--;
		}
		
		int ans=0;
		for(int i=0;i<max;i++){
			if(i>0)
				cnt[i]+=cnt[i-1];
			ans=Math.max(ans, cnt[i]);
		}
		pw.println(ans);
		pw.flush();
		pw.close();
	}
	
	static class pair implements Comparable<pair>{
		int x,y;
		pair(int a,int b){
			x=a;
			y=b;
		}
		public int compareTo(pair o){
			return x-o.x;
		}
	}
	
	static class MyScanner {
		BufferedReader br;
		StringTokenizer st;
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {while (st == null || !st.hasMoreElements()) {
			try {st = new StringTokenizer(br.readLine());}
			catch (IOException e) {e.printStackTrace();}}
		return st.nextToken();}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());}
		double nextDouble() {return Double.parseDouble(next());}
		String nextLine(){String str = "";
		try {str = br.readLine();}
		catch (IOException e) {e.printStackTrace();}
		return str;}
	}
}