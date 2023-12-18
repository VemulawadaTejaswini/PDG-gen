import java.util.*;
import java.lang.*;
import java.io.*;
public class Main{
	static int[]dp=new int[100001];
	static ArrayList<ArrayList<Integer>>al=new ArrayList<ArrayList<Integer>>();
	static int solve(int src){
		if(dp[src]!=0)
			return dp[src];

		boolean leaf=true;
		int bestChild=0;
		for(int child:al.get(src)){
			leaf=false;
			bestChild=Math.max(bestChild,solve(child));
		}
		return dp[src]= leaf?0:1+bestChild;
	}
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String[]s1=s.split(" ");
		int n=Integer.parseInt(s1[0]);
		int m=Integer.parseInt(s1[1]);
		for (int i = 0; i <=n; i++) 
            al.add(new ArrayList<Integer>());
		for(int i=0;i<m;i++){
			String d=br.readLine();
			String[]s2=d.split(" ");
			int x=Integer.parseInt(s2[0]);
			int y=Integer.parseInt(s2[1]);
			al.get(x).add(y);
		}
		int ans=0;
		for(int i=1;i<=n;i++){
			ans=Math.max(ans,solve(i));
		}
		System.out.println(ans);
	}
}