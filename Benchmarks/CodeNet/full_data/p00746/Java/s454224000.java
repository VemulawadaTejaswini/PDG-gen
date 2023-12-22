import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int INF=1<<26;
	final int[] vx={0,1,0,-1}, vy={1,0,-1,0};
	public static void main(String[] args) {
		new Main().A();
	}
	void A(){
		final int[] xdis={-1,0,1,0}, ydis={0,-1,0,1};
		while(true){
			int n= sc.nextInt();
			if(n == 0) break;
			HashMap<Integer, Integer[] > map = new HashMap<Integer, Integer[]>();
			Integer [] first = {0,0};
			map.put(0, first);
			for(int i=1; i < n; i++){
				int ni = sc.nextInt();
				int di = sc.nextInt();
				Integer [] now = map.get(ni);
				int newx = now[0] + xdis[di];
				int newy = now[1] + ydis[di];
				Integer [] newarray = {newx, newy};
				map.put(i, newarray);
			}
			first = map.get(0);
			int minx =first[0];
			int maxx = minx;
			int miny = first[1];
			int maxy = first[1];
			for(Integer now: map.keySet()){
				Integer [] nowarray = map.get(now);
				int x = nowarray[0];
				int y = nowarray[1];
				minx = Math.min(minx, x);
				maxx = Math.max(maxx, x);
				miny = Math.min(miny, y);
				maxy = Math.max(maxy, y);
				
			}
			int resx = maxx - minx +1;
			int resy = maxy - miny + 1;
			System.out.println(resx + " " + resy );
		}
	}
	
	void B(){
		while(true){
			int W=sc.nextInt(),H=sc.nextInt();
			boolean[][] ww=new boolean[W*2+2][H*2+2],hh=new boolean[W*2+2][2*H+2];
			for(int i=1; i<=H; i++){
				for(int x=1; x<W; x++)	ww[2*x+1][2*i]=sc.nextInt()==0;
				if(i<H)	for(int y=1; y<=W; y++)	hh[2*y][2*i+2]=sc.nextInt()==0;
			}
			
			
			PriorityQueue<CB> open=new PriorityQueue<CB>();
			open.add(new CB(1,1,0));
			int[][] close=new int[W][H];
			for(int i=0; i<W; i++)	for(int j=0; j<H; j++)	close[i][j]=INF;
			int ans=INF;
			while(!open.isEmpty()){
				CB now=open.poll();
				for(int i=0; i<4; i++){
					int xx=now.x+vx[i],yy=now.y+vy[i];
					if(!(0<xx && xx<=W && 0<yy && yy<=H))	continue;
					int x2=(now.x+xx)/2,y2=(now.y+yy)/2;
					if(!(ww[x2][y2] && hh[x2][y2]))	continue;
					if(xx==W && yy==H){
						ans=min(ans,now.s+1);
						continue;
					}
					open.add(new CB(xx,yy,now.s+1));
					close[xx][yy]=now.s+1;
				}
			}
			System.out.println((ans>=INF?0:ans));
		}
	}
	class CB implements Comparable<CB>{
		int x,y,s;
		CB(int x,int y,int s){this.x=x; this.y=y;this.s=s;}
		@Override public int compareTo(CB o) {
			if(this.s<o.s)	return -1;
			if(this.s>o.s)	return 1;
			return 0;
		}
	}
	
}