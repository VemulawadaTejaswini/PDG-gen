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

	int[][] a;
	int m, n;

	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			a=new int[n][m];
			for(int j=0; j<n; j++){
				String s=sc.next();
				for(int i=0; i<m; i++){
					a[j][i]=s.charAt(i)=='.'?0:1;
				}
			}
			solve();
		}
	}

	void solve(){
		TreeSet<P>[][] dp=new TreeSet[n][m];

		int[][] vert=new int[n][m]; // ãÉ
		int[][] hori=new int[n][m];// ¶É

		for(int j=0; j<n; j++){
			int e=0;
			for(int i=0; i<m; i++){
				if(a[j][i]==0){
					e++;
				}else{
					e=0;
				}
				hori[j][i]=e;
			}
		}
		for(int i=0; i<m; i++){
			int e=0;
			for(int j=0; j<n; j++){
				if(a[j][i]==0){
					e++;
				}else{
					e=0;
				}
				vert[j][i]=e;
			}
		}

		int max=0;

		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				dp[j][i]=new TreeSet<P>();
				if(a[j][i]==0){
					TreeSet<P> set=new TreeSet<P>();
					set.add(new P(1, 1));
					if(i>0){
						for(P p : dp[j][i-1]){
							int w2=p.w+1;
							int h2=Math.min(p.h, vert[j][i]);
							set.add(new P(w2, h2));
						}
					}
					if(j>0){
						for(P p : dp[j-1][i]){
							int w2=Math.min(p.w, hori[j][i]);
							int h2=p.h+1;
							set.add(new P(w2, h2));
						}
					}

					for(P p : set){
						boolean f=true;
						for(P q : set){
							if((p.w<q.w&&p.h<=q.h)||(p.w<=q.w&&p.h<q.h)){
								f=false;
								break;
							}
						}
						if(f){
							dp[j][i].add(p);
							max=Math.max(max, p.w*p.h);
						}
					}
					// debug(set);
					// debug(dp[j][i]);
				}
			}
		}
		println(""+max);
	}

	class P implements Comparable<P>{
		int w, h;

		P(int w, int h){
			this.w=w;
			this.h=h;
		}

		@Override
		public int compareTo(P p){
			if(h!=p.h){
				return h-p.h;
			}else{
				return w-p.w;
			}
		}

		@Override
		public String toString(){
			return w+","+h;
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