import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	// Scanner sc=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int INF=1<<28;
	double EPS=1e-12;

	int n, m;
	int[] a;

	void run(){
		try{
			String[] ss=br.readLine().split(" ");
			n=Integer.parseInt(ss[0]);
			m=Integer.parseInt(ss[1]);
			ss=br.readLine().split(" ");
			a=new int[n];
			for(int i=0; i<n; i++){
				a[i]=Integer.parseInt(ss[i]);
			}
			solve();
		}catch(IOException e){}
	}

	int logM;
	int[] sum;

	void solve(){
		logM=31-Integer.numberOfLeadingZeros(m)+1;
//		debug(m, logM);
		dp=new int[logM][3*n];
		sum=new int[3*n];
		for(int i=0; i<3*n-1; i++){
			sum[i+1]=sum[i]+a[i%n];
		}
		check(4);
		int left=0, right=(int)1e8;
//		if(false)
			for(; right-left>1;){
				int mid=(left+right)/2;
				if(check(mid)){
					right=mid;
				}else{
					left=mid;
				}
			}
//		debug("left", left, "right", right);
		println(right+"");
	}

	int[][] dp;

	boolean check(int t){
		if(t==0){
			return false;
		}
		for(int i=0; i<logM; i++){
			fill(dp[i], -1);
		}
		for(int i=0; i<3*n; i++){
			// dp[0][i]
			// [i,?)
			int index=binarySearch(sum, sum[i]+t);
//			debug(i, sum[i]+t, index);
			if(index<0){
				index=-index-1;
				index--;
			}
			dp[0][i]=index;
		}
//		debug("dp0", dp[0]);
		for(int j=1; j<logM; j++){
			for(int i=0; i<3*n; i++){
				dp[j][i]=dp[j-1][dp[j-1][i]];
			}
//			debug("dp",j,dp[j]);
		}
		for(int i=0; i<n; i++){
			int now=i;
			for(int b=0; b<logM; b++){
				if((m>>b&1)==1){
					now=dp[b][now];
//					debug("b",b,m);
				}
			}
//			debug("i",i,"now",now);
			if(now-i>=n){
				// テ」ツ?イテ」ツつε」ツ?」テ」ツ?サテ」ツ??
				return true;
			}
		}
		// dp[k][i]:iテ」ツ?凝」ツつ嘉・ツァツ凝」ツつ?」ツ?ヲkテ」ツδ。テ」ツδ凝」ツδ・テ」ツδシテ」ツ?ァテ」ツ??」ツ?妥」ツつ凝ヲツ慊?・ツ、ツァ
//		debug("out");
		return false;
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}