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

	int m, n;

	int[][] al, ar;

	void run(){
		for(;;){
			m=sc.nextInt();
			n=sc.nextInt();
			if((m|n)==0){
				break;
			}
			al=new int[n][m];
			ar=new int[n][m];
			for(int j=0; j<n; j++){
				String sl=sc.next();
				for(int i=0; i<m; i++){
					al[j][i]=c2i(sl.charAt(i));
				}
				String sr=sc.next();
				for(int i=0; i<m; i++){
					ar[j][i]=c2i(sr.charAt(i));
				}
				// debug(al[j], ar[j]);
			}
			solve();
		}
	}

	void solve(){
		// boolean[][][][] visited=new boolean[m][n][m][n];
		HashSet<Integer> visited=new HashSet<Integer>();
		int xl0=0, yl0=0, xr0=0, yr0=0;
		for(int j=0; j<n; j++){
			for(int i=0; i<m; i++){
				if(al[j][i]==-1){
					xl0=i;
					yl0=j;
					al[j][i]=0;
				}
				if(ar[j][i]==-1){
					xr0=i;
					yr0=j;
					ar[j][i]=0;
				}
			}
		}
		LinkedList<P> que=new LinkedList<P>();
		que.offer(new P(xl0, yl0, xr0, yr0));
		visited.add(hash(xl0, yl0, xr0, yr0));
		int[] dxl={0, 0, -1, 1};
		int[] dyl={-1, 1, 0, 0};
		int[] dxr={0, 0, 1, -1};
		int[] dyr={-1, 1, 0, 0};
		boolean yes=false;
		for(; !que.isEmpty()&&!yes;){
			P p=que.poll();
			// debug(p.xl, p.yl, p.xr, p.yr);
			for(int i=0; i<4; i++){
				P q=new P(p.xl+dxl[i], p.yl+dyl[i], p.xr+dxr[i], p.yr+dyr[i]);
				if(!in(q.xl, q.yl)||al[q.yl][q.xl]==1){
					q.xl=p.xl;
					q.yl=p.yl;
				}
				if(!in(q.xr, q.yr)||ar[q.yr][q.xr]==1){
					q.xr=p.xr;
					q.yr=p.yr;
				}
				// debug("\t", q.xl, q.yl, q.xr, q.yr);
				// q.xr=max(min(q.xr, m-1), 0);
				// q.yr=max(min(q.yr, n-1), 0);
				boolean ll=al[q.yl][q.xl]==2;
				boolean rr=ar[q.yr][q.xr]==2;
				if(ll^rr){
					continue;
				}
				if(ll&&rr){
					yes=true;
				}
				int hash=hash(q.xl, q.yl, q.xr, q.yr);
				// if(!visited[q.xl][q.yl][q.xr][q.yr]){
				// visited[q.xl][q.yl][q.xr][q.yr]=true;
				// que.offer(q);
				// }
				if(!visited.contains(hash)){
					visited.add(hash);
					que.offer(q);
				}
			}
		}
		println(yes?"Yes":"No");
	}

	int hash(int xl, int yl, int xr, int yr){
		return (xl*50+yl)*2500+(xr*50+yr);
	}

	boolean in(int x, int y){
		return x>=0&&x<m&&y>=0&&y<n;
	}

	class P{
		byte xl, yl, xr, yr;

		P(int xl, int yl, int xr, int yr){
			this.xl=(byte)xl;
			this.yl=(byte)yl;
			this.xr=(byte)xr;
			this.yr=(byte)yr;
		}
	}

	int c2i(char c){
		switch(c){
		case '.':
			return 0;
		case '#':
			return 1;
		case '%':
			return 2;
		case 'L':
			return -1;
		case 'R':
			return -1;
		default:
			return 0;
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
		new Main().run();
	}
}