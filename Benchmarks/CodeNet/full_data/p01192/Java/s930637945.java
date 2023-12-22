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

	int caze;
	int n;
	int[] c;

	void run(){
		for(caze=1;; caze++){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			c=new int[n];
			for(int i=0; i<n; i++){
				c[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		String ans;
		sort(c);
		if(c[0]!=1){
			ans="Cannot pay some amount";
		}else{
			int n=c.length;
			for(int i=0; i<n/2; i++){
				int t=c[i];
				c[i]=c[n-1-i];
				c[n-1-i]=t;
			}

			int minW=-1;
			int[] minMw=null;
			for(int i=1; i<n; i++){
				int x=c[i-1]-1;
				int[] gi=new int[n];
				for(int k=0; k<n; k++){
					gi[k]=x/c[k];
					x%=c[k];
				}
				for(int j=i; j<n; j++){
					int[] mw=new int[n];
					int mwSum=0;
					int w=0;
					for(int k=0; k<n; k++){
						if(k<j)
							mw[k]=gi[k];
						else if(k==j)
							mw[k]=gi[k]+1;
						else
							mw[k]=0;
						w+=mw[k]*c[k];
						mwSum+=mw[k];
					}
					int[] gw=new int[n];
					int gwSum=0;
					int t=w;
					for(int k=0; k<n; k++){
						gw[k]=t/c[k];
						t%=c[k];
						gwSum+=gw[k];
					}
					if(mwSum<gwSum){
						// debug("w", w, "mw", mw, "gw", gw);
					}
					if(mwSum<gwSum&&(minW==-1||w<minW)){
						minW=w;
						minMw=mw.clone();
					}
				}
			}
			if(minW>=0){
				ans="Cannot use greedy algorithm";
			}else{
				ans="OK";
			}
		}
		println("Case #"+caze+": "+ans);
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