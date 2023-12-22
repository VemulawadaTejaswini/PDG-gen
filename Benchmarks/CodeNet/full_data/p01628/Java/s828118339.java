import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Amidakuji
// 2013/09/10
public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n, m;
	int[] a;

	void run(){
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[m];
		for(int i=0; i<m; i++){
			a[i]=sc.nextInt()-1;
		}
		solve();
	}

	void solve(){
		int[] _=new int[m];
		for(int i=0; i<m; i++){
			_[i]=i;
		}
		int min=m;
		for(;;){
			int[] b=new int[m];
			for(int i=0; i<m; i++){
				b[i]=a[_[i]];
			}
			if(Arrays.equals(f(a), f(b))){
				min=min(min, height(b));
			}
			if(!nextPermutation(_)){
				break;
			}
		}
		println(min+"");
	}

	int height(int[] a){
		int[] last=new int[n];
		for(int i : a){
			int max=last[i];
			if(i-1>=0){
				max=max(max, last[i-1]);
			}
			if(i+1<n){
				max=max(max, last[i+1]);
			}
			last[i]=max+1;
		}
		int max=0;
		for(int i : last){
			max=max(max, i);
		}
		return max;
	}

	int[] f(int[] a){
		int[] is=new int[n];
		for(int i=0; i<n; i++){
			is[i]=i;
		}
		for(int i : a){
			swap(is, i, i+1);
		}
		return is;
	}

	boolean nextPermutation(int[] is){
		int n=is.length;
		for(int i=n-1; i>0; i--){
			if(is[i-1]<is[i]){
				int j=n;
				for(; is[i-1]>=is[--j];);
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
		for(j--; i<j; i++, j--)
			swap(is, i, j);
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