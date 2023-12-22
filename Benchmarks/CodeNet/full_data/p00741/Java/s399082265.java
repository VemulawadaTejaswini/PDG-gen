import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	static class P{
		int x;
		int y;
		public P(int x,int y){
			this.x=x;this.y=y;
		}

		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof P))return false;
			P p=(P)obj;
			return p.x==x && p.y==y;
		}
		@Override
		public String toString() {
			return "("+x+","+y+")";
		}
	}

	public void run() {
		Test:while(true){
			int W=sc.nextInt(),H=sc.nextInt();
			if(W==0 && H==0)return;
			int[][] map=new int[H][W];
			for(int h=0;h<H;h++)for(int w=0;w<W;w++){
				map[h][w]=sc.nextInt();
			}

			int res=0;
			int[][] d=new int[][]{{0,1},{1,0},{0,-1},{-1,0},
					{1,1},{1,-1},{-1,-1},{-1,1}};

			while(true){
				//1を探す。

				Queue<P> pq=new LinkedList<P>();
				S1:for(int h=0;h<H;h++)for(int w=0;w<W;w++){
					if(map[h][w]==1){
						res++;
						pq.add(new P(w,h));
						map[h][w]=0;
						break S1;
					}
				}
				if(pq.isEmpty()){
					ln(res);
					continue Test;
				}

				while(!pq.isEmpty()){
					P p=pq.poll();
					for(int i=0;i<8;i++){
						int x=p.x+d[i][0];
						int y=p.y+d[i][1];
						if(0<=x && x<W && 0<=y && y<H){
							if(map[y][x]==1){
								map[y][x]=0;
								pq.add(new P(x,y));
							}
						}
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	public int[] nextIntArray(int n){
		int[] res=new int[n];
		for(int i=0;i<n;i++){
			res[i]=sc.nextInt();
		}
		return res;
	}
	public static void pr(Object o) {
		out.print(o);
	}
	public static void ln(Object o) {
		out.println(o);
	}
	public static void ln() {
		out.println();
	}
}