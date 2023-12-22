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

	int n=10;
	int[][] a;

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			a=new int[n][n];
			for(int j=0; j<n; j++){
				String s=sc.next();
				for(int i=0; i<n; i++){
					a[j][i]=s.charAt(i)=='.'?0:1;
				}
			}
			solve();
		}
	}

	void solve(){
		int[][] hor=new int[n][n];
		int[][] ver=new int[n][n];
		@SuppressWarnings("unchecked")
		TreeSet<P>[][] sets=new TreeSet[n][n];
		for(int j=0; j<n; j++){
			int k=0;
			for(int i=0; i<n; i++){
				if(a[j][i]==0){
					k++;
				}else{
					k=0;
				}
				hor[j][i]=k;
			}
		}
		for(int i=0; i<n; i++){
			int k=0;
			for(int j=0; j<n; j++){
				if(a[j][i]==0){
					k++;
				}else{
					k=0;
				}
				ver[j][i]=k;
			}
		}

		int max=0;

		for(int j=0; j<n; j++){
			for(int i=0; i<n; i++){
				sets[j][i]=new TreeSet<P>();
				if(a[j][i]==0){
					sets[j][i].add(new P(1, 1));
					if(i>0){
						for(P p : sets[j][i-1]){
							if(ver[j][i]>=p.h){
								sets[j][i].add(new P(p.w+1, p.h));
							}
						}
					}
					if(j>0){
						for(P p : sets[j-1][i]){
							if(hor[j][i]>=p.w){
								sets[j][i].add(new P(p.w, p.h+1));
							}
						}
					}
					for(P p : sets[j][i]){
						if(p.w==p.h&&p.w>max){
							max=p.w;
						}
					}
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