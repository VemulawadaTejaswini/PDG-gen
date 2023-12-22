import java.util.*;
import static java.lang.Math.*;

public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ2426();
	}
	
	class AOJ2426{
		AOJ2426(){
			while(sc.hasNext()){
				int N=sc.nextInt(),M=sc.nextInt();
				if(N==0 && M==0)	break;
				solve(N,M);
			}
		}
		void solve(int N,int M){
			TreeSet<Integer> xs=new TreeSet<Integer>(),ys=new TreeSet<Integer>();
			int[] x1=new int[N],y1=new int[N];
			for(int i=0; i<N; i++){
				x1[i]=sc.nextInt();
				y1[i]=sc.nextInt();
				xs.add(x1[i]);
				ys.add(y1[i]);
			}
			int[] x2=new int[xs.size()],y2=new int[ys.size()];
			//System.out.println(ys.size()+"\n"+ys);
			int idx=0;
			for(int i:xs)	x2[idx++]=i;
			idx=0;
			for(int i:ys)	y2[idx++]=i;
			int[][] sum=new int[xs.size()][ys.size()];
			for(int i=0; i<N; i++){
				int xidx=0,yidx=0;
				for(; xidx<xs.size(); xidx++)if(x1[i]==x2[xidx])	break;
				for(; yidx<ys.size(); yidx++)if(y1[i]==y2[yidx])	break;
				for(int x=xidx; x<xs.size(); x++)for(int y=yidx; y<ys.size(); y++)sum[x][y]++;
			}
			
			// TODO debug
//			System.out.print("   ");
//			for(int x=0; x<xs.size(); x++)System.out.printf("%3d",x2[x]);
//			System.out.println();
//			for(int y=ys.size()-1; y>=0; y--){
//				System.out.printf("%3d",y2[y]);
//				for(int x=0; x<xs.size(); x++)System.out.printf("%3d",sum[x][y]);
//				System.out.println();
//			}
			
			for(int i=0; i<M; i++){
				int xm1=sc.nextInt(),ym1=sc.nextInt(),xm2=sc.nextInt(),ym2=sc.nextInt();
				int tmp=Arrays.binarySearch(x2, xm1);
				int xidx1=(tmp>=0?tmp: abs(tmp)-1);
				tmp=Arrays.binarySearch(y2, ym1);
				int yidx1=(tmp>=0?tmp: abs(tmp)-1);
				tmp=Arrays.binarySearch(x2, xm2);
				int xidx2=(tmp>=0?tmp:min(x2.length-1, abs(tmp)-2));
				tmp=Arrays.binarySearch(y2, ym2);
				int yidx2=(tmp>=0?tmp:min(y2.length-1, abs(tmp)-2));
				//System.out.println(xidx1+","+yidx1+" "+xidx2+","+yidx2);
				System.out.println(sum[xidx2][yidx2]-(xidx1>0?sum[xidx1-1][yidx2]:0)-(yidx1>0?sum[xidx2][yidx1-1]:0)+(xidx1>0&&yidx1>0?sum[xidx1-1][yidx1-1]:0));
			}
		}
	}
	
	class AOJ2429{
		int N;
		int[][] W,E;
		AOJ2429(){
			N=sc.nextInt();
			W=new int[N][N];
			E=new int[N][N];
			for(int y=0; y<N; y++){
				for(int x=0; x<N; x++)	W[x][y]=sc.nextInt();
			}
			for(int y=0; y<N; y++){
				for(int x=0; x<N; x++)	E[x][y]=sc.nextInt();
			}
			StringBuilder init=new StringBuilder();
			int[] w=new int[N],h=new int[N];
			for(int y=0; y<N; y++){
				String str=sc.next();
				for(int x=0; x<N; x++){
					init.append(str);
					if(str.charAt(x)=='o'){
						w[x]++;
						h[y]++;
					}
				}
			}
			
			for(int lim=0; ; lim++){
				State1 res=IDDFS(w.clone(),h.clone(),new StringBuilder(init.toString()),0,0,lim,new ArrayList<State2>(),-1,-1);
				if(res!=null){
					System.out.println(res.cost);
					System.out.println(res.depth);
					for(State2 st2:res.rec)	System.out.println(st2);
				}
			}
		}
		State1 IDDFS(int[] w,int[] h,StringBuilder map,int depth,int cost,int lim,ArrayList<State2> rec,int lx,int ly){
			int nw=0,nh=0;
			for(int i=0; i<N; i++){
				if(w[i]!=1)	nw++;
				if(h[i]!=1)	nh++;
			}
			if(nw==0 && nh==0){
				return new State1(cost,depth,rec);
			}
			int hs=max(nw,nh);
			if(depth+hs>lim)	return null;
			
			//for(int )
			
			return null;
		}
		class State1{
			int cost,depth;
			ArrayList<State2> rec;
			State1(int cost,int depth,ArrayList<State2> rec){
				this.cost=cost;	this.depth=depth;
				this.rec=rec;
			}
		}
		class State2{
			int x,y;
			boolean e;
			State2(int x,int y,boolean e){
				this.x=x;	this.y=y;	this.e=e;
			}
			@Override public String toString(){
				return x+" "+y+(e? " erase": " write");
			}
		}
	}
	
	// JAG SummerCamp2012 Day2#B - A Holiday of Miss Brute Force
	class AOJ2425{
		final int OFFSET=200, MAX=OFFSET*2, INF=Integer.MAX_VALUE/4;
		final int[] vx={0,1,1,0,-1,-1,0},	vy2={1,0,-1,-1,-1,0,0},
											vy1={1,1,0,-1,0,1,0};
		AOJ2425(){
			int sx=sc.nextInt()+OFFSET, sy=sc.nextInt()+OFFSET,
				gx=sc.nextInt()+OFFSET, gy=sc.nextInt()+OFFSET,
				N=sc.nextInt();
			int[] x=new int[N],y=new int[N];
			for(int i=0; i<N; i++){
				x[i]=sc.nextInt()+OFFSET;
				y[i]=sc.nextInt()+OFFSET;
			}
			int LX=sc.nextInt(),LY=sc.nextInt();
			boolean[][] b=new boolean[MAX][MAX];
			for(int i=0; i<N; i++)	b[x[i]][y[i]]=true;
			
			PriorityQueue<State1> open=new PriorityQueue<State1>();
			open.add(new State1(sx,sy,0,0));
			int[][][] close=new int[MAX][MAX][6];
			for(int i=0; i<MAX; i++)for(int j=0; j<MAX; j++)for(int k=0; k<6; k++)close[i][j][k]=INF;
			close[sx][sy][0]=0;
			
			int ans=INF;
			while(!open.isEmpty()){
				State1 now=open.poll();
				//System.out.println(now);
				if(now.x==gx && now.y==gy){
					ans=now.cost;
					break;
				}
				int d=(abs(now.x-OFFSET)*abs(now.y-OFFSET)*now.step)%6;
				for(int i=0; i<7; i++){
					int xx=now.x+vx[i], yy=now.y+(now.x%2==0? vy2[i]: vy1[i]);
					if(abs(xx-OFFSET)>LX || abs(yy-OFFSET)>LY)	continue;
					if(b[xx][yy])	continue;
					int next=now.cost+(d==i? 0: 1);
					if(close[xx][yy][(now.step+1)%6]<=next)	continue;
					open.add(new State1(xx,yy,(now.step+1)%6,next));
					close[xx][yy][(now.step+1)%6]=next;
				}
			}
			System.out.println(ans>=INF? -1: ans);
		}
		class State1 implements Comparable<State1>{
			int x,y,step,cost;
			State1(int x,int y,int step,int cost){
				this.x=x;	this.y=y;	this.step=step;	this.cost=cost;
			}
			@Override public int compareTo(State1 o){
				return (this.cost!=o.cost? this.cost-o.cost: this.step-o.step);
			}
			@Override public String toString(){
				return x+","+y+" "+cost+" "+step+"steps";
			}
		}
	}
}