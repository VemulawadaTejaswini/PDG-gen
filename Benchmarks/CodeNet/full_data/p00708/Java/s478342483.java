import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ4
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1,-1,1,1,-1}, vy={-1,0,1,0,-1,-1,1,1};
	final int INF=1<<24;
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){	return (min<=x&&x<X)&&(min<=y&&y<Y);}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
	void disp(char[][] c){
		for(int y=0; y<c[0].length; y++){
			for(int x=0; x<c.length; x++)	out.print(c[x][y]);
			out.println();
		}
	}
	public static void main(String[] args) {
		//long s=System.currentTimeMillis();
		new Main().AOJ1127();
		//out.println((System.currentTimeMillis()-s)+"msec");
	}
	
	void AOJ1127(){
		while(sc.hasNext()){
			int N=sc.nextInt();
			if(N==0)	break;
			double[] xx=new double[N],yy=new double[N],zz=new double[N],rr=new double[N];
			for(int i=0; i<N; i++){
				xx[i]=sc.nextDouble();	yy[i]=sc.nextDouble();
				zz[i]=sc.nextDouble();	rr[i]=sc.nextDouble();
			}
			double[][] d=new double[N][N];
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					if(i==j)	d[i][j]=0;
					double dd=sqrt(pow(xx[i]-xx[j],2)+pow(yy[i]-yy[j],2)+pow(zz[i]-zz[j],2))-rr[i]-rr[j];
					d[i][j]=max(0,dd);	d[j][i]=max(0,dd);
				}
			}
			
			// ari-book p.100-101
			double[] mincost=new double[N];
			Arrays.fill(mincost, (double)INF);
			boolean[] used=new boolean[N];
			mincost[0]=0;
			double res=0;
			while(true){
				int v=-1;
				for(int u=0; u<N; u++)	if(!used[u]&&(v==-1 || mincost[u]<mincost[v]))	v=u;
				if(v==-1)	break;
				used[v]=true;
				res+=mincost[v];
				for(int u=0; u<N; u++)	mincost[u]=min(mincost[u],d[v][u]);
			}
			out.printf("%.3f\n",res);
		}
	}
	
	void AOJ1140(){
		while(sc.hasNext()){
			int W=sc.nextInt(),H=sc.nextInt(),sx=0,sy=0,k=0;
			if((W|H)==0)	break;
			char[][] c=new char[W][H];
			int[][] kk=new int[W][H];
			for(int y=0; y<H; y++){
				String line=sc.next();
				for(int x=0; x<W; x++){
					c[x][y]=line.charAt(x);
					if(c[x][y]=='*'){
						kk[x][y]=k;
						k++;
					}else if(c[x][y]=='o'){
						sx=x;	sy=y;
					}
				}
			}
			//disp(c);
			PriorityQueue<C1140> open=new PriorityQueue<C1140>();
			int[][][][] close=new int[W][H][k+1][(1<<k)];
			for(int i=0; i<W; i++){
				for(int j=0; j<H; j++){
					for(int l=0; l<=k; l++){
						for(int m=0; m<(1<<k); m++)	close[i][j][l][m]=INF;
					}
				}
			}
			open.add(new C1140(sx,sy,0,k,(1<<k)-1,dcopy(c)));
			close[sx][sy][k][(1<<k)-1]=0;
			int ans=INF;
			while(!open.isEmpty()){
				C1140 now=open.poll();
				for(int i=0; i<4; i++){
					boolean flag=false;
					int xx=now.x+vx[i],yy=now.y+vy[i],r=now.r,m=now.m;
					if(!Point.ok(xx, yy, W, H))	continue;
					if(c[xx][yy]=='x')	continue;
					if(now.c[xx][yy]=='*'){
						r--;
						m=now.m^(1<<kk[xx][yy]);
					}
					if(close[xx][yy][r][m]<=now.s+1)	continue;
					if(r==0){
						//out.println("ANS:"+now);
						ans=min(ans,now.s+1);
						//continue;
						open.clear();
						break;
					}
					if(now.c[xx][yy]=='*'){
						now.c[xx][yy]='.';
						flag=true;
						//out.println("DL"+xx+","+yy+" R"+r+" Bit"+Integer.bitCount(m));
						//disp(now.c);
					}
					open.add(new C1140(xx,yy,now.s+1,r,m,dcopy(now.c)));
					close[xx][yy][r][m]=now.s+1;
					if(flag)	now.c[xx][yy]='*';
				}
			}
			out.println((ans>=INF?-1:ans));
		}
	}
	class C1140 implements Comparable<C1140>{
		int x,y,s,r,m;
		char[][] c;
		C1140(int x,int y,int s,int r,int m,char[][] c){	this.x=x; this.y=y; this.s=s; this.r=r; this.m=m; this.c=c;}
		@Override public int compareTo(C1140 o) {
			if(this.s<o.s)	return -1;
			if(this.s>o.s)	return 1;
			if(this.r<o.r)	return -1;
			if(this.r>o.r)	return 1;
			return 0;
		}
		@Override public String toString() {
			return "("+x+","+y+") S:"+s+" R:"+r;
		}
	}
	char[][] dcopy(char[][] c){
		char[][] r=new char[c.length][c[0].length];
		for(int i=0; i<c.length; i++){
			for(int j=0; j<c[0].length; j++)	r[i][j]=c[i][j];
		}
		return r;
	}
}