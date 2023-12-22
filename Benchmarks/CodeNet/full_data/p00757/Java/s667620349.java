import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ4thJun
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1,-1,1,1,-1}, vy={-1,0,1,0,-1,-1,1,1};
	final int INF=1<<26;
	final double EPS=1.0e-08;
	public static void main(String[] args) {
		//long s=System.currentTimeMillis();
		new Main().doIt();
		//out.println((System.currentTimeMillis()-s)+"msec");
	}
	void doIt(){
		new AOJ1169();
	}
	
	class AOJ1169{
		int s,W,H,sum;
		int[][] a,aa;
		AOJ1169(){
			while(true){
				H=sc.nextInt();	W=sc.nextInt();	s=sc.nextInt();
				if((H|W)==0)	break;
				a=new int[W+1][H+1];	aa=new int[W+1][H+1];
				for(int y=1; y<=H; y++){
					for(int x=1; x<=W; x++)	a[x][y]=sc.nextInt();
				}
				aa[1][1]=a[1][1];
				for(int i=2; i<=W; i++)	aa[i][1]=aa[i-1][1]+a[i][1];
				for(int i=2; i<=H; i++)	aa[1][i]=aa[1][i-1]+a[1][i];
				for(int x=2; x<=W; x++){
					for(int y=2; y<=H; y++)	aa[x][y]=aa[x-1][y]+aa[x][y-1]+a[x][y]-aa[x-1][y-1];
				}
				sum=aa[W][H];
				pair[][][][] dp=new pair[W+1][H+1][W+1][H+1];
				
//				for(int y=1; y<=H; y++){
//					for(int x=1; x<=W; x++)	System.out.printf("%4d",aa[x][y]);
//					System.out.println();
//				}
				
				//System.out.print("ANS=");
				System.out.println(solve(dp,new pair(0,INF),1,1,W,H));
			}
		}
		pair solve(pair[][][][] dp,pair p,int lx,int ly,int rx,int ry){
			if(dp[lx][ly][rx][ry]!=null)	return dp[lx][ly][rx][ry];
			else{
				int region=aa[rx][ry]-(aa[lx-1][ry]+aa[rx][ly-1])+aa[lx-1][ly-1];
				pair r1=new pair(),r2=new pair(),ret=new pair(p.depth+1,s-(sum-region));
				for(int x=lx; x<rx; x++){
					int rr1=aa[x][ry]-(aa[lx-1][ry]+aa[x][ly-1])+aa[lx-1][ly-1];
					int rr2=aa[rx][ry]-(aa[x][ry]+aa[rx][ly-1])+aa[x][ly-1];
					if(sum-rr1<=s && sum-rr2<=s){
						r1=solve(dp,p,lx,ly,x,ry);
						dp[lx][ly][x][ry]=r1;
						r2=solve(dp,p,x+1,ly,rx,ry);
						dp[x+1][ly][rx][ry]=r2;
						ret=pmax(ret,new pair(r1.depth+r2.depth-p.depth,min(r1.margin,r2.margin)));
					}
				}
				for(int y=ly; y<ry; y++){
					int rr1=aa[rx][y]-(aa[lx-1][y]+aa[rx][ly-1])+aa[lx-1][ly-1];
					int rr2=aa[rx][ry]-(aa[lx-1][ry]+aa[rx][y])+aa[lx-1][y];
					if(sum-rr1<=s && sum-rr2<=s){
						r1=solve(dp,p,lx,ly,rx,y);
						dp[lx][ly][rx][y]=r1;
						r2=solve(dp,p,lx,y+1,rx,ry);
						dp[lx][y+1][rx][ry]=r2;
						ret=pmax(ret,new pair(r1.depth+r2.depth-p.depth,min(r1.margin,r2.margin)));
					}
				}
				//System.out.println(ret);
				return ret;
			}
		}
		pair pmax(pair r1, pair r2) {
			if(r1.depth<r2.depth)	return r2;
			if(r1.depth>r2.depth)	return r1;
			if(r1.margin<r2.margin)	return r2;
			if(r1.margin>r2.margin)	return r1;
			return r1;
		}
		class pair{
			int depth,margin;
			pair(int d,int m){this.depth=d; this.margin=m;}
			pair(int d){this.depth=d; this.margin=0;}
			pair(){this.depth=-1;this.margin=-1;}
			pair(pair p){this.depth=p.depth; this.margin=p.margin;}
			@Override public pair clone(){	return new pair(this);}
			@Override public String toString(){return this.depth+" "+this.margin;}
		}
	}

	
	void AOJ2200(){
		int c=0;
		while(true){
			int N=sc.nextInt(),M=sc.nextInt();
			if((N|M)==0)	break;
			int[][] L=new int[N+1][N+1],S=new int[N+1][N+1];
			for(int i=0; i<=N; i++){
				for(int j=0; j<=N; j++){
					if(i==j)	continue;
					L[i][j]=INF;	S[i][j]=INF;
				}
			}
			for(int i=0; i<M; i++){
				int x=sc.nextInt(),y=sc.nextInt(),t=sc.nextInt();
				if(sc.next().equals("L")){
					L[x][y]=min(L[x][y], t);	L[y][x]=min(L[y][x], t);
				}else{
					S[x][y]=min(S[x][y], t);	S[y][x]=min(S[y][x], t);
				}
			}
			for(int i=1; i<=N; i++){
				for(int j=1; j<=N; j++){
					for(int k=1; k<=N; k++){
						L[j][k]=min(L[j][k],L[j][i]+L[i][k]);
						S[j][k]=min(S[j][k],S[j][i]+S[i][k]);
					}
				}
			}
			
			//debug
//			for(int i=1; i<=N; i++){
//				for(int j=1; j<=N; j++){
//					System.out.print(L[i][j]+" ");
//				}
//				System.out.println();
//			}
			
			int R=sc.nextInt();
			int[] d=new int[R];
			for(int i=0; i<R; i++)	d[i]=sc.nextInt();
			LinkedList<C2200> open=new LinkedList<C2200>();
			//PriorityQueue<C2200> open=new PriorityQueue<C2200>();
			open.add(new C2200(0,d[0],0));
			int[][] close=new int[R][N+1];
			for(int i=0; i<R; i++){
				for(int j=0; j<=N; j++)	close[i][j]=INF;
			}
			int ans=INF;
			close[0][d[0]]=0;
			
			System.err.print(++c+" ");
			System.err.print("R "+R+" N "+N+" M"+M+" ANS=");
			
			while(!open.isEmpty()){
				C2200 now=open.poll();
				if(now.now==R-1){
					ans=min(ans,now.time);
					continue;
				}
				//System.err.println("STEP"+now.now+" NOW"+d[now.now]+" BOAT"+now.boat+" TIME"+now.time+" NEXT"+d[now.now+1]);
				boolean goal=now.now+1==R-1;
				if(now.boat==d[now.now]){	// S
					if(S[d[now.now]][d[now.now+1]]<INF){
						int nt=now.time+S[d[now.now]][d[now.now+1]];
						if(goal)	ans=min(ans,nt);
						else if(close[now.now+1][d[now.now+1]]>nt){
							open.add(new C2200(now.now+1, d[now.now+1], nt));
							close[now.now+1][d[now.now+1]]=nt;
						}
					}
				}
				
				for(int i=1; i<=N; i++){
					// S > L
					if(now.boat==d[now.now] && S[d[now.now]][i]<INF && L[i][d[now.now+1]]<INF && d[now.now]!=i && d[now.now+1]!=i){
						int nt=now.time+S[d[now.now]][i]+L[i][d[now.now+1]];
						if(goal)	ans=min(ans,nt);
						else if(close[now.now+1][i]>nt){
							open.add(new C2200(now.now+1, i, nt));
							close[now.now+1][i]=nt;
						}
					}
					// L > S > L
					if(L[d[now.now]][now.boat]<INF && S[now.boat][i]<INF && L[i][d[now.now+1]]<INF && d[now.now]!=i && d[now.now+1]!=i && now.boat!=i){
						int nt=now.time+L[d[now.now]][now.boat]+S[now.boat][i]+L[i][d[now.now+1]];
						if(goal)	ans=min(ans,nt);
						else if(close[now.now+1][i]>nt){
							open.add(new C2200(now.now+1, i, nt));
							close[now.now+1][i]=nt;
						}
					}
				}
				
				if(L[d[now.now]][now.boat]<INF){
					if(S[now.boat][d[now.now+1]]<INF){	// L > S
						int nt=now.time+L[d[now.now]][now.boat]+S[now.boat][d[now.now+1]];
						if(goal)	ans=min(ans,nt);
						else if(close[now.now+1][d[now.now+1]]>nt){
							open.add(new C2200(now.now+1, d[now.now+1], nt));
							close[now.now+1][d[now.now+1]]=nt;
						}
					}
				}
				if(L[d[now.now]][d[now.now+1]]<INF){	// L
					int nt=now.time+L[d[now.now]][d[now.now+1]];
					if(goal)	ans=min(ans,nt);
					else if(close[now.now+1][now.boat]>nt){
						open.add(new C2200(now.now+1, now.boat, nt));
						close[now.now+1][now.boat]=nt;
					}
				}
			}
			System.out.println(ans);
		}
	}
	class C2200 implements Comparable<C2200>{
		int now,boat,time;
		C2200(int n,int b,int t){this.now=n; this.boat=b; this.time=t;}
		@Override public int compareTo(C2200 o) {
			if(this.time<o.time)	return -1;
			if(this.time>o.time)	return 1;
			if(this.now<o.now)	return -1;
			if(this.now>o.now)	return 1;
			if(this.boat<o.boat)	return -1;
			if(this.boat>o.boat)	return 1;
			return 0;
		}
	}
	
	void AOJ2021(){
		while(true){
			int N=sc.nextInt(),M=sc.nextInt(),L=sc.nextInt(),K=sc.nextInt(),A=sc.nextInt(),H=sc.nextInt();
			if(N==0)	break;
			int[][] d=new int[N][N];
			int[] l=new int[L+1];
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					if(i==j)	continue;
					d[i][j]=INF;
				}
			}
			for(int i=0; i<L; i++)	l[i]=sc.nextInt();
			l[L]=H;
			for(int i=0; i<K; i++){
				int x=sc.nextInt(),y=sc.nextInt(),t=sc.nextInt();
				d[x][y]=t;	d[y][x]=t;
			}
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					for(int k=0; k<N; k++)	d[j][k]=min(d[j][k],d[j][i]+d[i][k]);
				}
			}
			PriorityQueue<C2021> open=new PriorityQueue<C2021>();
			open.add(new C2021(A,M,0));
			int[][] close=new int[N][M+1];
			for(int i=0; i<N; i++){
				for(int j=0; j<=M; j++)	close[i][j]=INF;
			}
			close[A][M]=0;
			int ans=INF;
			while(!open.isEmpty()){
				C2021 now=open.poll();
				for(int i=0; i<=L; i++){
					if(now.now==l[i])	continue;
					if(d[now.now][l[i]]>M)	continue;
					int t=now.time+d[now.now][l[i]],r=now.remain-d[now.now][l[i]];
					if(r<0){
						t+=-1*r;
						r=0;
					}
					if(close[l[i]][r]<=t)	continue;
					if(l[i]==H){
						ans=min(ans,t);
						continue;
						//break;
					}
					open.add(new C2021(l[i],r,t));
					close[l[i]][r]=t;
				}
			}
			System.out.println((ans>=INF?"Help!":ans));
		}
	}
	class C2021 implements Comparable<C2021>{
		int now,remain,time;
		C2021(int n,int r,int t){this.now=n; this.remain=r; this.time=t;}
		@Override public int compareTo(C2021 o) {
			if(this.time<o.time)	return -1;
			if(this.time>o.time)	return 1;
			return 0;
		}
	}
	
	void AOJ2151(){
		while(true){
			int N=sc.nextInt(),M=sc.nextInt(),L=sc.nextInt();
			if(N==0)	break;
			int[][] cost=new int[N+1][N+1],robber=new int[N+1][N+1];
			for(int i=0; i<=N; i++){
				for(int j=0; j<=N; j++){
					if(i==j)	continue;
					cost[i][j]=INF;	robber[i][j]=INF;
				}
			}
			for(int i=0; i<M; i++){
				int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
				cost[a][b]=c;	cost[b][a]=c;
				robber[a][b]=d;	robber[b][a]=d;
			}
			PriorityQueue<C2151> open=new PriorityQueue<C2151>();
			open.add(new C2151(1,L,0));
			int[][] close=new int[N+1][L+1];
			for(int i=0; i<=N; i++){
				for(int j=0; j<=L; j++)	close[i][j]=INF;
			}
			close[1][L]=0;
			int ans=INF;
			while(!open.isEmpty()){
				C2151 now=open.poll();
				for(int i=1; i<=N; i++){
					if(now.now==i)	continue;
					if(cost[now.now][i]>=INF)	continue;
					if(now.remains>=cost[now.now][i]){
						int re2=now.remains-cost[now.now][i];
						if(close[i][re2]>now.robbers){
							if(i==N){
								ans=min(ans,now.robbers);
								continue;
							}else{
								open.add(new C2151(i,re2,now.robbers));
								close[i][re2]=now.robbers;
							}
						}
					}
					int rob2=now.robbers+robber[i][now.now];
					if(close[i][now.remains]<=rob2)	continue;
					if(i==N)	ans=min(ans,rob2);
					else{
						open.add(new C2151(i,now.remains,rob2));
						close[i][now.remains]=rob2;
					}
				}
			}
			System.out.println(ans);
		}
	}
	class C2151 implements Comparable<C2151>{
		int now,remains,robbers;
		C2151(int n,int r,int r2){this.now=n; this.remains=r; this.robbers=r2;}
		@Override public int compareTo(C2151 o) {
			if(this.robbers<o.robbers)	return -1;
			if(this.robbers>o.robbers)	return 1;
			return 0;
		}
	}
	
	void AOJ1144(){
		while(true){
			int W=sc.nextInt(),H=sc.nextInt(),sx=0,sy=0;
			if((W|H)==0)	break;
			int[][] b=new int[W][H];
			for(int y=0; y<H; y++){
				for(int x=0; x<W; x++){
					b[x][y]=sc.nextInt();
					if(b[x][y]==2){
						sx=x;	sy=y;
					}
				}
			}
			PriorityQueue<C1144> open=new PriorityQueue<C1144>();
			int[] temp=new int[10];
			Arrays.fill(temp, -1);
			open.add(new C1144(sx,sy,0,temp,temp));
			TreeSet<C1144> close=new TreeSet<C1144>();
			close.add(new C1144(sx,sy,0,temp,temp));
			int ans=INF;
			while(!open.isEmpty()){
				C1144 now=open.poll();
				for(int i=0; i<4; i++){
					int xx=now.x,yy=now.y;
					if((0<=xx+vx[i] && xx+vx[i]<W && 0<=yy+vy[i] && yy+vy[i]<H) && b[xx+vx[i]][yy+vy[i]]==1 && !now.stone(xx+vx[i], yy+vy[i]))	continue;
					while(true){
						xx+=vx[i];	yy+=vy[i];
						if(!(0<=xx && xx<W && 0<=yy && yy<H))	break;
						if(b[xx][yy]==3){
							ans=min(ans,now.step+1);
							break;
						}
						if(b[xx][yy]==1 && !now.stone(xx, yy)){
							if(now.step==9)	break;
							int[] tx=now.x2.clone(),ty=now.y2.clone();
							for(int j=0; j<10; j++){
								if(tx[j]<0 && ty[j]<0){
									tx[j]=xx;	ty[j]=yy;
									break;
								}
							}
							xx-=vx[i];	yy-=vy[i];
							C1144 next=new C1144(xx,yy,now.step+1,tx,ty);
							if(close.contains(next))	break;
							open.add(next);
							close.add(next);
						}
					}
				}
			}
			System.out.println((ans>=INF?"-1":ans));
		}
	}
	class C1144 implements Comparable<C1144>{
		int x,y,step;
		int[] x2,y2;
		C1144(int x,int y,int step,int[] x2,int[] y2){this.x=x; this.y=y; this.step=step; this.x2=x2; this.y2=y2;}
		@Override public int compareTo(C1144 o) {
			if(this.step<o.step)	return -1;
			if(this.step>o.step)	return 1;
			if(Arrays.equals(this.x2, o.x2) && Arrays.equals(this.y2, o.y2))	return 0;
			return -1;
		}
		boolean stone(int x,int y){
			for(int i=0; i<10; i++){
				if(x2[i]<0 && y2[i]<0)	return false;
				if(x2[i]==x && y2[i]==y)	return true;
			}
			return false;
		}
	}
	
	void AOJ1145(){
		while(true){
			StringBuilder line=new StringBuilder(sc.next());
			int n=sc.nextInt();
			if(line.toString().equals("0"))	break;
			char last=line.charAt(0);
			for(int i=1; i<line.length(); i++){
				if(Character.isDigit(last)){
					if(Character.isUpperCase(line.charAt(i)))	line.insert(i++, '*');
					else if(line.charAt(i)=='(')	line.insert(i++, '*');
				}else if(Character.isUpperCase(last)){
					if(Character.isUpperCase(line.charAt(i)))	line.insert(i++, '+');
					else if(Character.isDigit(line.charAt(i)))	line.insert(i++, '+');
				}else if(last==')' && line.charAt(i)!=')')	line.insert(i++, '+');
				last=line.charAt(i);
			}
			line.append("#");
			//System.out.println("L: "+line);
			try{
				System.out.println(new parsed1145(line.toString(), n).toString().charAt(n));
			}catch(Exception e){
				System.out.println(0);
			}
		}
	}
	class parsed1145{
		String line,ans;
		int pos=0,n;
		public parsed1145(String line, int n) { this.line=line; this.n=n; ans=expr();}
		private String expr(){
			String res=term();
			if(res.length()>n)	return res;
			while(true){
				char op=line.charAt(pos);
				if(op=='+'){
					pos++;
					res+=term();
				}else	break;
			}
			return res;
		}
		private String term(){
			String res=fact();
			//if(res.length()>n)	return res;
			while(true){
				char op=line.charAt(pos);
				if(op=='*'){
					int t=Integer.parseInt(res);
					pos++;
					res=fact();
					if(res.length()>n)	return res;
					StringBuilder sb=new StringBuilder();
					while(--t>=0 && sb.length()<=n)	sb.append(res);
					res=sb.toString();
				}else	break;
			}
			return res;
		}
		private String fact(){
			if(Character.isDigit(line.charAt(pos))){
				String t=""+(line.charAt(pos)-'0');
				pos++;
				while(Character.isDigit(line.charAt(pos))){
					t+=(line.charAt(pos)-'0');
					pos++;
				}
				return t;
			}else if(line.charAt(pos)=='('){
				pos++;
				String res=expr();
				pos++;
				return res;
			}else if(Character.isUpperCase(line.charAt(pos))){
				return ""+line.charAt(pos++);
			}
			return "";
		}
		@Override public String toString() {	return ans;}
	}
	
	void AOJ1165(){
		final int[] vx2={-1,0,1,0}, vy2={0,-1,0,1};
		while(true){
			int N=sc.nextInt();
			if(N==0)	break;
			int[] x=new int[N],y=new int[N];
			for(int i=1; i<N; i++){
				int n=sc.nextInt(),d=sc.nextInt();
				x[i]=x[n]+vx2[d];	y[i]=y[n]+vy2[d];
			}
			Arrays.sort(x);	Arrays.sort(y);
			System.out.println((x[N-1]-x[0]+1)+" "+(y[N-1]-y[0]+1));
		}
	}
	
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){	return (min<=x&&x<X)&&(min<=y&&y<Y);}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
}