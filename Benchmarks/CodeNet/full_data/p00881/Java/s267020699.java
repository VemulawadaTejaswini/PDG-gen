import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int len, n;
	String[] ss;

	void run(){
		for(;;){
			len=sc.nextInt();
			n=sc.nextInt();
			if((len|n)==0){
				break;
			}
			ss=new String[n];
			for(int i=0; i<n; i++){
				ss[i]=sc.next();
			}
			solve();
		}
	}

	void solve(){
		boolean[] used=new boolean[len];
		boolean[] f=new boolean[n];
		int ans=rec3(used, f);
		println(""+ans);
	}

	int rec(boolean[] used, boolean[] f){
		// println("f:"+Arrays.toString(f));
		// println("used:"+Arrays.toString(used));
		int c=0;
		for(int i=0; i<n; i++){
			if(!f[i]){
				c++;
			}
		}
		// println("c="+c);
		if(c==1){
			return 0;
		}

		int k=0;
		int max=-1;
		for(int i=0; i<len; i++){
			if(used[i]){
				continue;
			}
			int c0=0, c1=0;
			for(int j=0; j<n; j++){
				if(f[j]){
					continue;
				}
				if(ss[j].charAt(i)=='0'){
					c0++;
				}else{
					c1++;
				}
			}
			if(max<Math.min(c0, c1)){
				max=Math.min(c0, c1);
				k=i;
			}
		}

		// kツ氾板姪堋づーツ催個用
		used[k]=true;
		boolean[] f0=new boolean[n];
		boolean[] f1=new boolean[n];
		System.arraycopy(f, 0, f0, 0, n);
		System.arraycopy(f, 0, f1, 0, n);

		// println("k="+k);

		for(int i=0; i<n; i++){
			if(ss[i].charAt(k)=='0'){
				f1[i]=true;
			}else{
				f0[i]=true;
			}
		}
		int ret=Math.max(rec(used, f0), rec(used, f1))+1;
		used[k]=false;
		return ret;
	}

	int rec2(boolean[] used, boolean[] f){
		// println("f:"+Arrays.toString(f));
		// println("used:"+Arrays.toString(used));
		int c=0;
		for(int i=0; i<n; i++){
			if(!f[i]){
				c++;
			}
		}
		// println("c="+c);
		if(c==1){
			return 0;
		}

		int k=0;
		int max=-1;
		for(int i=0; i<len; i++){
			if(used[i]){
				continue;
			}
			int c0=0, c1=0;
			for(int j=0; j<n; j++){
				if(f[j]){
					continue;
				}
				if(ss[j].charAt(i)=='0'){
					c0++;
				}else{
					c1++;
				}
			}
			if(max<Math.min(c0, c1)){
				max=Math.min(c0, c1);
				k=i;
			}
		}

		int ret=INF;
		for(int i=0; i<len; i++){
			if(used[i]){
				continue;
			}
			int c0=0, c1=0;
			for(int j=0; j<n; j++){
				if(f[j]){
					continue;
				}
				if(ss[j].charAt(i)=='0'){
					c0++;
				}else{
					c1++;
				}
			}

			// kツ氾板姪堋づーツ催個用ツつキツづゥツつゥツづつ、ツつゥ
			if(Math.min(c0, c1)!=max){
				continue;
			}

			used[k]=true;
			boolean[] f0=new boolean[n];
			boolean[] f1=new boolean[n];
			System.arraycopy(f, 0, f0, 0, n);
			System.arraycopy(f, 0, f1, 0, n);
			for(int j=0; j<n; j++){
				if(ss[j].charAt(k)=='0'){
					f1[j]=true;
				}else{
					f0[j]=true;
				}
			}
			ret=Math.min(ret, Math.max(rec2(used, f0), rec2(used, f1))+1);
			used[k]=false;
		}
		return ret;
	}

	int rec3(boolean[] used, boolean[] f){
		// println("f:"+Arrays.toString(f));
		// println("used:"+Arrays.toString(used));
		int c=0;
		for(int i=0; i<n; i++){
			if(!f[i]){
				c++;
			}
		}
		// println("c="+c);
		if(c==1){
			return 0;
		}

		int k=0;
		int max=-1;
		for(int i=0; i<len; i++){
			if(used[i]){
				continue;
			}
			int c0=0, c1=0;
			for(int j=0; j<n; j++){
				if(f[j]){
					continue;
				}
				if(ss[j].charAt(i)=='0'){
					c0++;
				}else{
					c1++;
				}
			}
			if(max<Math.min(c0, c1)){
				max=Math.min(c0, c1);
				k=i;
			}
		}

		// kツ氾板姪堋づーツ催個用
		used[k]=true;
		boolean[] f0=new boolean[n];
		boolean[] f1=new boolean[n];
		System.arraycopy(f, 0, f0, 0, n);
		System.arraycopy(f, 0, f1, 0, n);

		// println("k="+k);

		for(int i=0; i<n; i++){
			if(ss[i].charAt(k)=='0'){
				f1[i]=true;
			}else{
				f0[i]=true;
			}
		}
		int ret=Math.max(rec3(used, f0), rec3(used, f1))+1;
		used[k]=false;
		return ret;
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