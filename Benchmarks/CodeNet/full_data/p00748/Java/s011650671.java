import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int INF=1<<26;
	final int[] vx={0,1,0,-1}, vy={1,0,-1,0};
	public static void main(String[] args) {
		new Main().C();
	}
	
	void C(){
		ArrayList<Integer> in=new ArrayList<Integer>();
		int max=0;
		while(true){
			int n=sc.nextInt();
			if(n==0)	break;
			in.add(n);
			max=max(max,n);
		}
		
		int[] k=new int[max+1],a=new int[max+1];
		Arrays.fill(k, INF);	Arrays.fill(a, INF);
		for(int n=1;;n++){
			int temp=n*(n+1)*(n+2)/6;
			if(temp>max)	break;
			a[temp]=1;
			if(temp%2==1)	k[temp]=1;
		}
		
		for(int i=2; i<=max; i++){
			for(int j=1; j*2<=i; j++){
				a[i]=min(a[i],a[j]+a[i-j]);
				k[i]=min(k[i],k[j]+k[i-j]);
			}
		}
		
//		System.out.println("K");
//		for(int i=1; i<=max; i++)	System.out.print(k[i]+" ");
		
		for(int i:in){
			System.out.println(a[i]+" "+k[i]);
		}
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
			if((W|H)==0)	break;
			boolean[][] ww=new boolean[W*2+2][2*H+1],hh=new boolean[2*W+1][2*H+2];
			for(int i=1; i<=H; i++){
				for(int x=1; x<W; x++)	ww[2*x+1][i]=sc.nextInt()==1;
				if(i<H)	for(int y=1; y<=W; y++)	hh[y][2*i+1]=sc.nextInt()==1;
			}
			
			//disp(hh);
			
			PriorityQueue<CB> open=new PriorityQueue<CB>();
			open.add(new CB(1,1,1));
			int[][] close=new int[W+1][H+1];
			for(int i=0; i<=W; i++)	for(int j=0; j<=H; j++)	close[i][j]=INF;
			int ans=INF;
			while(!open.isEmpty()){
				CB now=open.poll();
				for(int i=0; i<4; i++){
					int xx=now.x+vx[i],yy=now.y+vy[i];
					if(!(0<xx && xx<=W && 0<yy && yy<=H))	continue;
					int x2=(2*now.x+2*xx)/2,y2=(2*now.y+2*yy)/2;
					if(ww[x2][now.y] || hh[now.x][y2]){
						//System.out.println(x2+" "+y2);
						continue;
					}
					if(now.s+1>=close[xx][yy])	continue;
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
	void disp(boolean[][] b){
		for(int y=0; y<b[0].length; y++){
			for(int x=0; x<b.length; x++)	System.out.print(b[x][y]?1:0);
			System.out.println();
		}
	}
	
}