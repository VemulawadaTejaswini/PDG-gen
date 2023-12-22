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

	int m, n;
	P[] ps, qs;

	void run(){
		for(;;){
			m=sc.nextInt();
			if(m==0){
				break;
			}
			ps=new P[m];
			for(int i=0; i<m; i++){
				int x=sc.nextInt();
				int y=sc.nextInt();
				ps[i]=new P(x, y);
			}
			n=sc.nextInt();
			qs=new P[n];
			for(int i=0; i<n; i++){
				int x=sc.nextInt();
				int y=sc.nextInt();
				qs[i]=new P(x, y);
			}
			solve();
		}
	}

	void solve(){
		// ps[0]ðqs[j]É í¹é
		// d=qs[j]-ps[0]
		TreeSet<P> set=new TreeSet<P>();
		for(P q : qs){
			set.add(q);
		}

		for(P q : qs){
			P d=q.sub(ps[0]);
			boolean match=true;
			for(P p : ps){
				match&=set.contains(p.add(d));
			}
			if(match){
				println(d.x+" "+d.y);
			}
		}

	}

	class P implements Comparable<P>{
		int x, y;

		P(int x, int y){
			this.x=x;
			this.y=y;
		}

		P add(P p){
			return new P(x+p.x, y+p.y);
		}

		P sub(P p){
			return new P(x-p.x, y-p.y);
		}

		@Override
		public int compareTo(P p){
			if(y!=p.y){
				return y-p.y;
			}else{
				return x-p.x;
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