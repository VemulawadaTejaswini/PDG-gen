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
	int[] d, p, q;

	// d:1¡C2c
	// p:1~5
	// q:¶[©ç1~5

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			d=new int[n];
			p=new int[n];
			q=new int[n];
			for(int i=0; i<n; i++){
				d[i]=sc.nextInt()-1;
				p[i]=sc.nextInt();
				q[i]=sc.nextInt()-1;
			}
			solve();
		}
	}

	void solve(){
		// 1000ÂÈàCÅå·5
		int[][] a=new int[5000][5];
		for(int k=0; k<n; k++){
			// ¶ãð(x,y)Æ·éD
			int[][] b=new int[p[k]][p[k]];
			for(int i=0; i<p[k]; i++){
				b[i*d[k]][i*(1-d[k])]=1;
			}
			int x=q[k], y=0;
			for(;; y++){
				boolean collision=false;
				for(int j=0; j<p[k]; j++){
					for(int i=0; i<p[k]; i++){
						if(b[j][i]==1){
							if(y+j>=a.length){
								collision=true;
							}else if(a[y+j][x+i]==1){
								collision=true;
							}
						}
					}
				}
				if(collision){
					break;
				}
			}
			y--;
			for(int j=0; j<p[k]; j++){
				for(int i=0; i<p[k]; i++){
					if(b[j][i]==1){
						a[y+j][x+i]=1;
					}
				}
			}
			for(int j=0; j<a.length; j++){
				// debug(a[j]);
			}
			// debug();
		}

		int ans=0;
		for(int j=0; j<a.length; j++){
			int sum=a[j][0]+a[j][1]+a[j][2]+a[j][3]+a[j][4];
			ans+=sum%5;
		}
		println(""+ans);
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