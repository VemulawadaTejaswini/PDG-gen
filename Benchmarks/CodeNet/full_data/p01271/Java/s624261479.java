import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Mirror Cave
// 2013/05/12
public class Main{
	Scanner sc=new Scanner(System.in);

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
			}
			solve();
		}
	}

	int B=50;
	boolean[][][][] visited=new boolean[B][B][B][B];

	void solve(){
		for(int a=0; a<B; a++){
			for(int b=0; b<B; b++){
				for(int c=0; c<B; c++){
					for(int d=0; d<B; d++){
						visited[a][b][c][d]=false;
					}
				}
			}
		}
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
		LinkedList<Integer> que=new LinkedList<Integer>();
		que.offer(hash(xl0, yl0, xr0, yr0));
		int[] dxl={0, 0, -1, 1};
		int[] dyl={-1, 1, 0, 0};
		int[] dxr={0, 0, 1, -1};
		int[] dyr={-1, 1, 0, 0};

		boolean yes=false;

		for(; !que.isEmpty()&&!yes;){
			int p=que.poll();
			int xl=p/B/B/B%B, yl=p/B/B%B, xr=p/B%B, yr=p%B;
			for(int i=0; i<4; i++){
				int xl2=xl+dxl[i], yl2=yl+dyl[i], xr2=xr+dxr[i], yr2=yr+dyr[i];
				if(!in(xl2, yl2)||al[yl2][xl2]==1){
					xl2=xl;
					yl2=yl;
				}
				if(!in(xr2, yr2)||ar[yr2][xr2]==1){
					xr2=xr;
					yr2=yr;
				}
				boolean ll=al[yl2][xl2]==2;
				boolean rr=ar[yr2][xr2]==2;
				if(ll^rr){
					continue;
				}
				if(ll&&rr){
					yes=true;
				}
				if(!visited[xl2][yl2][xr2][yr2]){
					visited[xl2][yl2][xr2][yr2]=true;
					que.offer(hash(xl2, yl2, xr2, yr2));
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

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}