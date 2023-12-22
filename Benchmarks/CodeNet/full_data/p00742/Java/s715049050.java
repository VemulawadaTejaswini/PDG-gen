import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int n;
	String[] ss;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			ss=new String[n];
			for(int i=0; i<n; i++){
				ss[i]=sc.next();
			}
			solve();
		}
	}

	int size;
	int[] cs;
	int[] map;
	boolean[] used;
	int ans;

	void solve(){
		int[] a=new int[256];
		fill(a, -1);
		size=0;
		for(String s : ss){
			for(int i=0; i<s.length(); i++){
				if(a[s.charAt(i)]==-1){
					size++;
					a[s.charAt(i)]=INF;
				}
				a[s.charAt(i)]=min(a[s.charAt(i)], s.length()-1-i);
			}
		}
		cs=new int[size];
		for(int k=0, i=0; i<256; i++){
			if(a[i]>=0){
				cs[k++]=i+1000*a[i];
			}
		}
		sort(cs);

		for(int i=0; i<size; i++){
			//debug(i, (char)(cs[i]%1000), cs[i]/1000);
		}

		used=new boolean[10];
		map=new int[256];
		fill(map, -1);
		ans=0;
		dfs(0);
		// debug(ans);
		println(""+ans);
	}

	void dfs(int k){
		if(k==size){
			if(ok(8)){
				ans++;
			}
			return;
		}
		for(int i=0; i<10; i++){
			if(!used[i]){
				used[i]=true;
				map[cs[k]%1000]=i;
				if(ok(cs[k]/1000)){
					dfs(k+1);
				}
				map[cs[k]%1000]=-1;
				used[i]=false;
			}
		}
	}

	boolean ok(int d){
		int sum=0;
		for(int j=0; j<n; j++){
			if(map[ss[j].charAt(0)]==0&&ss[j].length()>1){
				return false;
			}
			int num=0;
			for(int i=max(0, d-ss[j].length()); i<d; i++){
				num=num*10+map[ss[j].charAt(ss[j].length()-d+i)];
			}
			// debug(j, num);
			if(j==n-1){
				sum-=num;
			}else{
				sum+=num;
			}
		}
		int mod=1;
		for(int i=0; i<d; i++){
			mod*=10;
		}
		return sum%mod==0;
	}

	boolean ok(){
		int sum=0;
		for(int j=0; j<n; j++){
			if(map[ss[j].charAt(0)]==0&&ss[j].length()>1){
				return false;
			}
			int num=0;
			for(int i=0; i<ss[j].length(); i++){
				num=num*10+map[ss[j].charAt(i)];
			}
			if(j==n-1){
				sum-=num;
			}else{
				sum+=num;
			}
		}
		return sum==0;
	}

	void swap(int[] is, int i, int j){
		int t=is[i];
		is[i]=is[j];
		is[j]=t;
	}

	void rev(int[] is, int i, int j){
		for(j--; i<j; i++, j--){
			int t=is[i];
			is[i]=is[j];
			is[j]=t;
		}
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
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}