import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	void run(){
		for(;;){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int k=sc.nextInt();
			if((n|m|k)==0){
				break;
			}
			solve(n, m, k);
		}
	}

	void test(){
		int m=4;
		int[] a=new int[m*3+1];
		for(int i=1; i<=m; i++){
			// a[i]++;
			for(int j=1; j<=m; j++){
				// a[i+j]++;
				for(int k=1; k<=m; k++){
					a[i+j+k]++;
				}
			}
		}
		for(int i=0; i<a.length; i++){
			debug(i, a[i]);
		}
	}

	void solve(int n, int m, int cut){
		int[] a=new int[n*m+2];
		int[] b=new int[n*m+2];
		for(int i=1; i<=m; i++){
			a[i]=1;
		}
		for(int j=1; j<n; j++){
			System.arraycopy(a, 0, b, 0, n*m+1);
			Arrays.fill(a, 0);
			for(int i=1; i<=m; i++){
				for(int k=j;; k++){
					if(b[k]==0){
						break;
					}
					a[i+k]+=b[k];
				}
			}
		}

		double sum=Math.pow(m, n);
		double ans=0;
		for(int i=0; i<a.length; i++){
			int bill=Math.max(1, i-cut);
			ans+=a[i]*bill/sum;
		}
		println(ans+"");
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