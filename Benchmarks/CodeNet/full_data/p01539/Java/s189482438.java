import java.util.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	
	private void init() {
		new B();
	}
	
	class F{
		int N,C;
		int[][] W,E;
		int[] wc,ec;
		ArrayList<State1> recAns;
		int stepAns;
		HashMap<String,Integer> visited;
		HashSet<State2> Er,Wr;
		F(){
			N=sc.nextInt();
			W=new int[N][N];
			E=new int[N][N];
			
			
			// int[] tmp=new int[N*M];
			
			for(int y=0; y<N; y++){
				for(int x=0; x<N; x++){
					W[x][y]=sc.nextInt();
					
				}
			}
			for(int y=0; y<N; y++){
				for(int x=0; x<N; x++)	E[x][y]=sc.nextInt();
			}
			
			boolean[][] init=new boolean[N][N];
			
			int[] w=new int[N], h=new int[N];
			StringBuilder sb=new StringBuilder();
			for(int y=0; y<N; y++){
				String str=sc.next();
				sb.append(str);
				for(int x=0; x<N; x++){
					if(str.charAt(x)=='o'){
						w[x]++;
						h[y]++;
					}
				}
			}
			
			long start=System.currentTimeMillis();
			
			for(int lim=0; lim<50; lim++){
				C=0;
				Er=new HashSet<Main.F.State2>();
				Wr=new HashSet<Main.F.State2>();
				visited=new HashMap<String,Integer>();
				visited.put(sb.toString(),0);
				int[] ww=new int[N], hh=new int[N];
				for(int i=0; i<N; i++){
					ww[i]=w[i];	hh[i]=h[i];
				}
				if(IDDFS(ww, hh, new StringBuilder(sb.toString()), 0, 0, lim, new ArrayList<State1>(), -1, -1)){
					System.out.println(lim);
					//System.out.println(stepAns);
					System.out.println(recAns.size());
					for(State1 s1:recAns)	System.out.println(s1);
					break;
				}
				System.out.println("LIM"+lim+" "+(System.currentTimeMillis()-start)+"msecs "+C+"steps");
			}
		}
		boolean IDDFS(int[] w,int[] h,StringBuilder map,int depth,int cost,int lim,ArrayList<State1> rec,int lx,int ly){
			++C;
			boolean f=true;
			int up=0,down=0;
			for(int i=0; i<N; i++){
				if(w[i]!=1){
					f=false;
					break;
				}
				if(h[i]!=1){
					f=false;
					break;
				}
			}
			if(f){
				// TODO
				System.out.println("END "+cost+"cost "+depth+"steps");
				System.out.println("W "+Arrays.toString(w));
				System.out.println("H "+Arrays.toString(h));
				for(int y=0; y<N; y++)	System.out.println(map.substring(N*y, N*(y+1)));
				recAns=rec;
				stepAns=depth;
				return true;
			}
			
			System.out.println("cost"+cost+" depth"+depth);
			System.out.println("W "+Arrays.toString(w));
			System.out.println("H "+Arrays.toString(h));
			System.out.println(map);

			
			int hs=0;
			
			// TODO hs
			
			if(cost>=lim)	return false;
			
			boolean wf=true;
			for(int x=0; x<N; x++){
				if(w[x]>=1){
					for(int y=0; y<N; y++){
						if(map.charAt(y*N+x)=='o'){
							if(x==lx && y==ly)	continue;
							//if(Wr.contains(new State2(x,y)))	continue;
							wf=false;
							w[x]--;
							h[y]--;
							map.setCharAt(y*N+x, '.');
							rec.add(new State1(x+1, y+1, true));
							//Er.add(new State2(x,y));
							if(!visited.containsKey(map.toString()) || visited.get(map.toString())>cost+E[x][y]){
								visited.put(map.toString(),cost+E[x][y]);
								if(IDDFS(w, h, map, cost+E[x][y], depth+1, lim, rec, x, y))	return true;
							}
							w[x]++;
							h[y]++;
							map.setCharAt(y*N+x, 'o');
							rec.remove(rec.size()-1);
							//Er.remove(new State2(x,y));
						}
					}
				}
				if(h[x]>=1){
					for(int y=0; y<N; y++){
						if(map.charAt(x*N+y)=='o'){
							if(y==lx && x==ly)	continue;
							//if(Wr.contains(new State2(x,y)))	continue;
							wf=false;
							h[x]--;
							w[y]--;
							map.setCharAt(x*N+y, '.');
							rec.add(new State1(y+1, x+1, true));
							//Er.add(new State2(x,y));
							if(!visited.containsKey(map.toString()) || visited.get(map.toString())>cost+E[y][x]){
								visited.put(map.toString(),cost+E[y][x]);
								if(IDDFS(w, h, map, cost+E[y][x], depth+1, lim, rec, y, x))	return true;
							}
							h[x]++;
							w[y]++;
							map.setCharAt(x*N+y, 'o');
							rec.remove(rec.size()-1);
							//Er.remove(new State2(x,y));
						}
					}
				}
			}
			//if(!wf)	return false;
			for(int x=0; x<N; x++){
				if(w[x]<1){
					for(int y=0; y<N; y++){
						if(map.charAt(y*N+x)=='.'){
							//if(Er.contains(new State2(x,y)))	continue;
							if(x==lx && y==ly)	continue;
							w[x]++;
							h[y]++;
							map.setCharAt(y*N+x, 'o');
							rec.add(new State1(x+1, y+1, false));
							//Wr.add(new State2(x,y));
							if(!visited.containsKey(map.toString()) || visited.get(map.toString())>cost+E[y][x]){
								visited.put(map.toString(),cost+W[x][y]);
								if(IDDFS(w, h, map, cost+W[x][y], depth+1, lim, rec, x, y))	return true;
							}
							w[x]--;
							h[y]--;
							map.setCharAt(y*N+x, '.');
							rec.remove(rec.size()-1);
							//Wr.remove(new State2(x,y));
						}
					}
				}
			}
			return false;
		}
		class State1{
			int x, y;
			boolean f;
			State1(int x,int y,boolean f){
				this.x=x;	this.y=y;	this.f=f;
			}
			@Override public String toString(){
				return x+" "+y+" "+(f?" erase":" write");
			}
		}
		class State2{
			int x,y;
			State2(int x,int y){
				this.x=x;	this.y=y;
			}
			@Override public int hashCode(){
				int ret=17;
				ret=ret*31+x;
				ret=ret*31+y;
				return ret;
			}
			@Override public boolean equals(Object obj){
				if(this==obj)	return true;
				if(!(obj instanceof State2))	return false;
				State2 st2=(State2)obj;
				if(this.x==st2.x && this.y==st2.y)	return true;
				return false;
			}
		}
	}

	class B {
		int INF = 1 << 24;
		int [][] vx = {{0,1,1,0,-1,-1,0},  {0, 1,1, 0, -1, -1,0}};
		int [][] vy = {{1,0,-1,-1,-1,0,0}, {1, 1,0,-1, 0, 1,0}};
		int ly, lx;
		int offset = 200;
		
		class C implements Comparable<C>{
			int x, y,step, cost;
			
			public C(int x, int y, int step, int cost) {
				this.x = x;
				this.y = y;
				this.step = step;
				this.cost = cost;
			}
			
			@Override
			public int compareTo(C o) {
				if(this.cost < o.cost) return -1;
				if(this.cost > o.cost) return 1;
				return 0;
			}

			@Override
			public String toString() {
				return "C [x=" + x + ", y=" + y + ", step=" + step + ", cost="
						+ cost + "]";
			}
			
			
		}
		
		
		B(){
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
				int sx = sc.nextInt();
				int sy = sc.nextInt();
				int gx = sc.nextInt();
				int gy = sc.nextInt();
				int n = sc.nextInt();
				int [] xlist = new int[n];
				int [] ylist = new int[n];
				for(int i = 0 ; i < n; i++){
					xlist[i] = sc.nextInt();
					ylist[i] = sc.nextInt();
				}
				lx = sc.nextInt();
				ly = sc.nextInt();
				PriorityQueue<C> open = new PriorityQueue<Main.B.C>();
				open.add(new C(offset,offset,0,0) );
				
				int [][][] close = new int[ly +1 + offset * 2][lx+1 + offset * 2][100];
				for(int i = 0; i <= ly + offset * 2; i++){
					for(int j = 0; j <= lx + offset * 2; j++){
						Arrays.fill(close[i][j], INF);
					}
				}
				//start
				close[sy + offset][sx + offset][0] = 0;
				
				for(int i = 0; i < n; i++){
					int xx = xlist[i] + offset;
					int yy = ylist[i] + offset;
					for(int j = 0; j < 100; j++){
						close[yy][xx][j] = 0;
					}
				}
				int ans = -1;
				
				while(! open.isEmpty()){
					C now = open.poll();
					if(now.x == gx + offset && now.y == gy + offset){
						ans = now.cost;
						break;
					}
					
					for(int i = 0; i < vx[0].length; i++){
						if(now.x == offset || now.y == offset ){
							if(i == 6) continue;
						}
						int xx = now.x + vx[now.x % 2][i];
						int yy = now.y + vy[now.x % 2][i];
						if(! isOK(xx,yy)) continue;
						int nextcost = now.cost;
						long dir = Math.abs((long)(now.x - offset) * (now.y - offset) * (now.step) ) % 6;
						if(i != dir){
							nextcost++;
						}
						//System.out.println("xx = " + xx + " " + yy + " " + now.step + " " + now.x);
						//System.out.println(close[yy][xx][now.step + 1]);
						if(close[yy][xx][now.step + 1] <= nextcost) continue;
						close[yy][xx][now.step + 1] = nextcost;
						open.add(new C(xx, yy, now.step + 1, nextcost));
					}
				}
				System.out.println(ans);
			}
		}

		private boolean isOK(int xx, int yy) {
			if(-lx + offset <= xx && xx <= lx + offset && -ly + offset <= yy && yy <= ly + offset){
				return true;
			}
			return false;
		}
		
	}

}