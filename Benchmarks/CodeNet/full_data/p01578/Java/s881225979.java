import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Sort by Hand
// 2012/12/29
public class Main{
	Scanner sc=new Scanner(System.in);

	int n;
	int[] a;

	void run(){
		n=sc.nextInt();
		a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt()-1;
		}
		solve();
	}

	int[][] pool;
	int[] dp;

	void solve(){
		pool=new int[n][n];
		dp=new int[n+1];
		for(int i=0; i<=n; i++){
			if(dfs(a, 0, i)){
				println(i+"");
				return;
			}
		}
	}

	boolean dfs(int[] a, int step, int ub){
		int lis=lis(a);
		if(step+n-lis>ub){
			return false;
		}
		if(lis==n){
			return true;
		}

		int s, t;
		for(s=0; a[s]==s; s++);
		for(t=n-1; a[t]==t; t--);
		int[] b=pool[step];
		for(int i=s; i<=t; i++){ // [s, t]
			if(a[i]==i){
				continue;
			}
			System.arraycopy(a, 0, b, 0, n);
			if(a[i]<i){
				System.arraycopy(a, a[i], b, a[i]+1, i-a[i]);
			}
			if(a[i]>i){
				System.arraycopy(a, i+1, b, i, a[i]-i);
			}
			b[a[i]]=a[i];
			if(dfs(b, step+1, ub)){
				return true;
			}
		}
		return false;
	}

	int lis(int[] a){
		int lis=1;
		for(int j=0; j<n; j++){
			dp[j]=1;
			for(int i=0; i<j; i++){
				if(a[i]<a[j]){
					dp[j]=max(dp[j], dp[i]+1);
				}
			}
			lis=max(lis, dp[j]);
		}
		return lis;
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}