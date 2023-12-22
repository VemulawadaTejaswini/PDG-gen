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

	int[] map;

	void solve(){
		TreeSet<Character> set=new TreeSet<Character>();
		for(String s : ss){
			for(char c : s.toCharArray()){
				set.add(c);
			}
		}
		int size=set.size();
		char[] cs=new char[size];
		for(int i=0; i<size; i++){
			cs[i]=set.pollFirst();
		}
		sort(cs);

		debug(size, cs);

		boolean[] illegal=new boolean[256];
		for(String s : ss){
			if(s.length()>1){
				illegal[s.charAt(0)]=true;
			}
		}

		int[] a={0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		map=new int[256];
		int ans=0;
		for(;;){

			for(int i=0; i<size; i++){
				map[cs[i]]=a[i];
			}
			if(ok()){
				ans++;
			}
			if(!nextPermutation(a)){
				break;
			}
		}

		int div=1;
		for(int i=1; i<=10-size; i++){
			div*=i;
		}
		debug(ans, div, ans/div);
		ans/=div;
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
			if(j<n-1){
				sum+=num;
			}else{
				sum-=num;
			}
		}
		return sum==0;
	}

	boolean nextPermutation(int[] is){
		int n=is.length;
		for(int i=n-1; i>0; i--){
			if(is[i-1]<is[i]){
				int j=n;
				while(is[i-1]>=is[--j]);
				swap(is, i-1, j);
				rev(is, i, n);
				return true;
			}
		}
		rev(is, 0, n);
		return false;
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