import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.*;

public class Main{
	static boolean temp[]=new boolean[24];
	static int time[]=new int[13];
	static int ans=0;
	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;
		time[0]=1;
		boolean judge=true;
		for(int i=0;i<n;i++){
			in.nextToken();
			int t=(int)in.nval;
			time[t]++;
			if((t==12||t==0)&&time[t]>1)judge=false;
			else if(time[t]>2)judge=false;
		}
		if(judge){
			Arrays.fill(temp, false);
			temp[0]=true;
			dfs(1);
			out.println(ans);
		}else out.println(0);
		out.flush();
	}
	static void dfs(int now){
		if(now==13){
			int ans1=Integer.MAX_VALUE;
			int pos=0;
			for(int i=1;i<24;i++){
				if(temp[i]){
					ans1=Math.min(ans1, i-pos);
					pos=i;
				}
			}
			ans=Math.max(ans, ans1);
		}else if(time[now]==1){
			temp[now]=true;
			dfs(now+1);
			temp[now]=false;
			temp[24-now]=true;
			dfs(now+1);
			temp[24-now]=false;
		}else if(time[now]==2){
			temp[now]=true;
			temp[24-now]=true;
			dfs(now+1);
		}else dfs(now+1);
	}
}
