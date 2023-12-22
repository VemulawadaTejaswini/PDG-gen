import java.util.*;
import java.lang.*;
import java.math.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	double EPS=1e-6;

	int n, m;
	// n:black
	// m:white
	int[] xs, ys;

	void run(){
		for(;;){
			n=sc.nextInt();
			m=sc.nextInt();
			if((n|m)==0){
				break;
			}
			xs=new int[n+m];
			ys=new int[n+m];
			for(int i=0; i<n+m; i++){
				xs[i]=sc.nextInt();
				ys[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		int[] s=new int[n+m];
		for(int b=0; b<n; b++){
			for(int w=n; w<n+m; w++){
				double xw=xs[w];
				double yw=ys[w];
				double xb=xs[b];
				double yb=ys[b];

				double a=xb==xw?0:(double)(yb-yw)/(xb-xw);
				double y1=yw;
				double x1=xw;

				boolean f=true;
				for(int i=0; i<n+m; i++){
					double x=xs[i];
					double y=ys[i];
					boolean on=false;
					if(xb!=xw){
						double y2=a*(x-x1)+y1;
						if(y+EPS<y2){
							// º
							s[i]=-1;
						}else if(y2+EPS<y){
							// ã
							s[i]=1;
						}else{
							on=true;
						}
					}else{
						// c
						if(x+EPS<x1){
							// ¶
							s[i]=-1;
						}else if(x1+EPS<x){
							// E
							s[i]=1;
						}else{
							on=true;
						}
					}
					if(on){
						// ¼üó
						boolean fx=false;
						boolean fy=false;
						if(i<n){
							// black
							fx|=c(xw, xb, x);
							fx|=c(x, xb, xw);
							fy|=c(yw, yb, y);
							fy|=c(y, yb, yw);
						}else{
							// white
							fx|=c(xb, xw, x);
							fx|=c(x, xw, xb);
							fy|=c(yb, yw, y);
							fy|=c(y, yw, yb);
						}
						if(fx&&fy){
							s[i]=0;
						}else{
/*
  							println("black:"+xb+","+yb);
							println("white:"+xw+","+yw);
							println("coor:"+x+","+y);
							println("NO");
							return;*/
							f=false;
						}
						// s[i]=(fx&&fy)?0:2;
					}
				}

				// check

				// ã\ÆÈé(Ìóâ)
				int s1=0, s2=0;
				for(int i=0; i<n; i++){
					if(Math.abs(s[i])==1){
						s1=s[i];
					}
				}
				for(int i=n; i<n+m; i++){
					if(Math.abs(s[i])==1){
						s2=s[i];
					}
				}

				// 0©¯ê©Ì¸
				for(int i=0; i<n; i++){
					if(s1*s[i]==-1){
						f=false;
					}
				}
				for(int i=n; i<n+m-1; i++){
					if(s2*s[i]==-1){
						f=false;
					}
				}

				// Ý¢Éá¤
				// Ðûª¼üó
				// 0,1
				// 0,-1
				// 1,-1
				// 1,1
				// -1,-1
				f&=s1*s2!=1;
				if(s1*s2!=1){
					// ok
				}

				if(f){
/*					println("s1:"+s1);
					println("s2:"+s2);
					println("black:"+xb+","+yb);
					println("white:"+xw+","+yw);
					println(Arrays.toString(s));*/
					println("YES");
					return;
				}
			}
		}
		println("NO");
	}

	// a<=b<=c
	boolean c(double a, double b, double c){
		return a<b+EPS&&b<c+EPS;
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