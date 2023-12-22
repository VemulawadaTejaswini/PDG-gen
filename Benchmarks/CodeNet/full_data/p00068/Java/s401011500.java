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
	P[] ps;

	void run(){
		sc.useDelimiter(",|\r\n");
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			ps=new P[n];
			for(int i=0; i<n; i++){
				double x=sc.nextDouble();
				double y=sc.nextDouble();
				ps[i]=new P(x, y);
			}
			solve();
		}
	}

	void solve(){
		Arrays.sort(ps, new Comparator<P>(){
			@Override
			public int compare(P p1, P p2){
				return (int)((p1.x-p2.x)*10000);
			}
		});
		int i=0;
		boolean[] used=new boolean[n];
		int ans=n-1;
		for(int k=0; k<n-1; k++){
			// debug(i, ps[i].x, ps[i].y);
			used[i]=true;
			for(int j=0; j<n; j++){
				if(!used[j]&&check(i, j)){
					i=j;
					ans--;
					break;
				}
			}
		}
		println(""+ans);
	}

	boolean check(int i, int j){
		double a=(ps[j].y-ps[i].y)/(ps[j].x-ps[i].x);
		double b=-a*ps[i].x+ps[i].y;
		TreeSet<Integer> set=new TreeSet<Integer>();
		for(int k=0; k<n; k++){
			if(k!=i&&k!=j){
				int sign=0;
				if(Math.abs(ps[j].x-ps[i].x)<EPS)
					sign=(int)Math.signum(ps[k].x-ps[i].x);
				else
					sign=(int)Math.signum(ps[k].y-(a*ps[k].x+b));
				set.add(sign);
			}
		}
		return set.size()==1;
	}

	class P{
		double x, y;

		P(){
			this(0, 0);
		}

		P(double x, double y){
			this.x=x;
			this.y=y;
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