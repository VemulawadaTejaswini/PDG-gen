import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

public class Main{
	Scanner sc=new Scanner(System.in);
	int INF=1<<28;
	double EPS=1e-9;

	int n;
	byte[][] a;
	int x0, y0;
	char[] obj={'.', '#', '@'};

	void run(){
		for(;;){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			a=new byte[n][n];
			for(int j=0; j<n; j++){
				String s=sc.next();
				for(int i=0; i<n; i++){
					char c=s.charAt(i);
					if(c=='.')
						a[j][i]=0;
					else if(c=='#')
						a[j][i]=1;
					else if(c=='@'){
						a[j][i]=2;
						x0=i;
						y0=j;
					}
				}
			}
			solve();
		}
	}

	void solve(){
		Queue<S> que=new LinkedList<S>();
		TreeSet<S> memo=new TreeSet<S>();

		S s0=new S(x0, y0, 0);
		for(int j=0; j<n; j++)
			System.arraycopy(a[j], 0, s0.a[j], 0, n);

		que.offer(s0);
		memo.add(s0);

		for(; !que.isEmpty();){
			S s=que.poll();
			if(s.nInfect()==0){
				println(s.step+"");
				return;
			}
			if(s.step>15){
				println("-1");
				return;
			}
			LinkedList<S> nexts=s.nextStates();
			for(S t : nexts){
				if(!memo.contains(t)){
					que.offer(t);
					memo.add(t);
				}
			}
		}
		println("-1");
	}

	class S implements Comparable<S>{
		byte[][] a;
		int x, y;
		int step;

		S(int x, int y, int step){
			a=new byte[n][n];
			this.x=x;
			this.y=y;
			this.step=step;
		}

		int nInfect(){
			int c=0;
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					if(a[j][i]==1){
						c++;
					}
				}
			}
			return c;
		}

		boolean mapEqauls(S s){
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					if(a[j][i]!=s.a[j][i]){
						return false;
					}
				}
			}
			return true;
		}

		LinkedList<S> nextStates(){
			LinkedList<S> ret=new LinkedList<S>();
			int[] dx={-1, 0, 1, -1, 1, -1, 0, 1};
			int[] dy={-1, -1, -1, 0, 0, 1, 1, 1};
			for(int d=0; d<8; d++){
				int nx=x+dx[d];
				int ny=y+dy[d];
				if(nx<0||nx>=n||ny<0||ny>=n)
					continue;
				if(a[ny][nx]==1)
					continue;
				a[ny][nx]=2;
				a[y][x]=0;
				S s=new S(nx, ny, step+1);
				for(int y=0; y<n; y++){
					for(int x=0; x<n; x++){
						int c=0;
						for(int i=0; i<8; i++){
							int x2=x+dx[i];
							int y2=y+dy[i];
							if(x2<0||x2>=n||y2<0||y2>=n)
								continue;
							if(a[y2][x2]!=0){
								c++;
							}
						}
						if(a[y][x]==0){
							if(c==3){
								s.a[y][x]=1;
							}else{
								s.a[y][x]=0;
							}
						}else if(a[y][x]==1){
							if(c==2||c==3){
								s.a[y][x]=1;
							}else{
								s.a[y][x]=0;
							}
						}else{
							s.a[y][x]=2;
						}
					}
				}
				ret.add(s);
				a[ny][nx]=0;
				a[y][x]=2;
			}
			return ret;
		}

		void show(){
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					print(""+obj[a[j][i]]);
				}
				println("");
			}
			println("");
		}

		@Override
		public int compareTo(S s){
			for(int j=0; j<n; j++){
				for(int i=0; i<n; i++){
					if(a[j][i]<s.a[j][i])
						return -1;
					else if(a[j][i]>s.a[j][i])
						return 1;
				}
			}
			return 0;
		}
	}

	void debug(Object... os){
	// System.err.println(Arrays.deepToString(os));
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