
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public void fall(char[][] tmp){
		for(int x=0;x<w;x++)
			for(int y=h-1;y>=0;y--)if(tmp[y][x]=='.')
				for(int dy=y-1;dy>=0;dy--)if(tmp[dy][x]!='.'){
					tmp[y][x]=tmp[dy][x];
					tmp[dy][x]='.';
					break;
				}
	}
	public boolean check(char[][] tmp){
		boolean change=true;
		while(change){
			change=false;
			fall(tmp);
			boolean[][] dels=new boolean[h][w];
			for(int y=0;y<h;y++)for(int x=0;x<w;x++){
				for(int i=0;i<4;i++){
					int px=x,py=y;
					char s=tmp[py][px];
					if(s=='.')continue;
					int l=1;
					px+=d[i][0];
					py+=d[i][1];
					//連結数
					while((0<=px && px < w && 0<=py && py<h)
								&& tmp[py][px]==s){
						l++;
						px+=d[i][0];
						py+=d[i][1];
					}
					if(l>=n){
						//back
						px-=d[i][0];
						py-=d[i][1];
						while(!(px==x && py ==y)){
							dels[py][px]=true;
							px-=d[i][0];
							py-=d[i][1];
						}
						dels[py][px]=true;
					}
				}
			}
			for(int y=0;y<h;y++)for(int x=0;x<w;x++){
				if(dels[y][x]){
					tmp[y][x]='.';
					change=true;
				}
			}
		}
		for(int y=0;y<h;y++)for(int x=0;x<w;x++){
			if(tmp[y][x]!='.')return false;
		}
		return true;

	}

	int h,w,n;
	int[][] d=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};

	public void run() {
		h=sc.nextInt();
		w=sc.nextInt();
		n=sc.nextInt();

		char[][] map=new char[h][w];
		char[][] tmp=new char[h][w];
		for(int i=0;i<h;i++){
			map[i]=sc.next().toCharArray();
		}
		for(int y=0;y<h;y++)for(int x=0;x<w;x++)for(int i=0;i<4;i+=2){//0,2
			for(int dy=0;dy<h;dy++)for(int dx=0;dx<w;dx++)
				tmp[dy][dx]=map[dy][dx];

			int px=x+d[i][0];
			int py=y+d[i][1];
			if(0<=px && px<w && 0<=py && py<h
				&& tmp[py][px]!=tmp[y][x]){
				char tm=tmp[py][px];
				tmp[py][px]=tmp[y][x];
				tmp[y][x]=tm;
				if(check(tmp)){
					ln("YES");
					return;
				}
			}
		}
		ln("NO");
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