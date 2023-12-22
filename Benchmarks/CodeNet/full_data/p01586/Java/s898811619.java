import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	int n;
	int[] a;
	int max=42;

	// [1, 42]

	void run(){
		n=sc.nextInt();
		a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		solve();
	}

	long end;
	int ub;

	void solve(){
		end=0;
		for(int i=0; i<n; i++){
			end|=1L<<a[i];
		}
		// a+b
		// a-b
		// a*2^k
		for(int t=n-1; t<42; t++){
			ub=t;
//			debug(ub);
			if(dfs(1L<<1, 0)){
				println(ub+"");
				break;
			}
		}
	}

	boolean dfs(long s, int step){
		// テヲツ楪敕、ツサツョ
		// debug("dfs");
		// debug(Long.toBinaryString(s), Long.toBinaryString(end), step,
		// Long.toBinaryString(end&~s), Long.bitCount(end&~s));
		if(step+Long.bitCount(end&~s)>ub){
			return false;
		}
		if((end&s)==end){
			// debug("ok");
			return true;
		}
		// debug("??");
		for(long s1=s; s1!=0; s1&=s1-1){
			// debug(s1);
			int i=Long.numberOfTrailingZeros(s1);
			for(; i<=max; i<<=1){
				if((s>>i&1)==0){
					if(dfs(s|(1L<<i), step+1)){
						return true;
					}
				}
			}
		}
		// debug("a");
		for(long s1=s; s1!=0; s1&=s1-1){
			int i=Long.numberOfTrailingZeros(s1);
			for(long s2=s; s2!=0; s2&=s2-1){
				// debug("s2", s2);
				int j=Long.numberOfTrailingZeros(s2);
				if(i+j<=max&&(s>>(i+j)&1)==0){
					if(dfs(s|(1L<<(i+j)), step+1)){
						return true;
					}
				}
				if(abs(i-j)>0&&(s>>abs(i-j)&1)==0){
					if(dfs(s|(1L<<abs(i-j)), step+1)){
						return true;
					}
				}
				// debug("??");
			}
		}
		// debug("hogepi");
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