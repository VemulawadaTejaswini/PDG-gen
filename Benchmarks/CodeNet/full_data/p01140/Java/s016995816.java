import java.util.*;
import java.util.regex.*;

import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ2
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().AOJ2015();
	}
	class Point{
		int x, y;
		Point(int x, int y){
			this.x=x;	this.y=y;
		}
		Point(){
			this.x=0; this.y=0;
		}
		@Override public String toString(){
			return "("+this.x+","+this.y+")";
		}
	}
	int[] vx={1,0,-1,0};	int[] vy={0,1,0,-1};
	
	void AOJ2015(){
		while(sc.hasNext()){
			int H=sc.nextInt(), W=sc.nextInt();
			if((H|W)==0)	break;
			Point[][] road=new Point[W+1][H+1];
			
			for(int x=0; x<=W; x++){
				for(int y=0; y<=H; y++){
					road[x][y]=new Point();
				}
			}
			
			for(int h=1; h<=H; h++){
				int temp=sc.nextInt();
				for(int x=0; x<=W; x++)	road[x][h].y=road[x][h-1].y+temp;
			}
			for(int w=1; w<=W; w++){
				int temp=sc.nextInt();
				for(int y=0; y<=H; y++)	road[w][y].x=road[w-1][y].x+temp;
			}
			
			// TODO debug
			//D2015(road,W,H);
			int ans=0;
			for(int i=0; i<=W; i++){
				for(int j=0; j<=H; j++){
					for(int k=i+1; k<=W; k++){
						for(int l=j+1; l<=H; l++){
							int xx=(road[k][l].x-road[i][j].x), yy=(road[k][l].y-road[i][j].y);
							if(xx==yy)	ans++;
							if(yy>xx)	break;
						}
					}
				}
			}
			out.println(ans);
			
		}
	}
	void D2015(Point[][] road, int W, int H){
		for(int y=0; y<H+1; y++){
			for(int x=0; x<W+1; x++)	out.print(road[x][y]+" ");
			out.println();
		}
		out.println("----------------");
	}
	
	
	void AOJ2014(){
		while(sc.hasNext()){
			int W=sc.nextInt(), H=sc.nextInt();
			if((W|H)==0)	break;
			char[][] c=new char[W+2][H+2];
			for(int i=0; i<W+2; i++){
				c[i][0]='A';
				c[i][H+1]='A';
			}
			for(int i=0; i<H+2; i++){
				c[0][i]='A';
				c[W+1][i]='A';
			}
			for(int y=0; y<H; y++){
				String line=sc.next();
				for(int x=0; x<W; x++){
					c[x+1][y+1]=line.charAt(x);
				}
			}
			
			// TODO debug
			//D2012(c,W,H);
			
			boolean[][] b=new boolean[W+2][H+2];
			boolean[][] w=new boolean[W+2][H+2];
			
			// B
			for(int x=1; x<W+1; x++){
				for(int y=1; y<H+1; y++){
					if(c[x][y]!='B')	continue;
					LinkedList<Point> open=new LinkedList<Point>();
					boolean[][] close = new boolean[W+2][H+2];
					open.add(new Point(x,y));
					while(!open.isEmpty()){
						Point now=open.poll();
						close[now.x][now.y]=true;
						b[now.x][now.y]=(c[now.x][now.y]=='.'?true:false);
						for(int i=0; i<4; i++){
							int xx=now.x+vx[i], yy=now.y+vy[i];
							if(!(0<xx&&xx<W+2 && 0<yy&&yy<H+2))	continue;
							if(c[xx][yy]=='.' && !b[xx][yy] && !close[xx][yy]){
								open.add(new Point(xx,yy));
								close[xx][yy]=true;
							}
						}
					}
				}
			}
			
			// W
			for(int x=1; x<W+1; x++){
				for(int y=1; y<H+1; y++){
					if(c[x][y]!='W')	continue;
					LinkedList<Point> open=new LinkedList<Point>();
					boolean[][] close = new boolean[W+2][H+2];
					open.add(new Point(x,y));
					while(!open.isEmpty()){
						Point now=open.poll();
						close[now.x][now.y]=true;
						w[now.x][now.y]=(c[now.x][now.y]=='.'?true:false);
						for(int i=0; i<4; i++){
							int xx=now.x+vx[i], yy=now.y+vy[i];
							if(!(0<xx&&xx<W+2 && 0<yy&&yy<H+2))	continue;
							if(c[xx][yy]=='.' && !w[xx][yy] && !close[xx][yy]){
								open.add(new Point(xx,yy));
								close[xx][yy]=true;
							}
						}
					}
				}
			}
			
			// TODO debug
			//D2012(b,W,H);
			//D2012(w,W,H);
			
			
			int ansB=0, ansW=0;
			for(int x=0; x<W+2; x++){
				for(int y=0; y<H+2; y++){
					if(b[x][y] && !w[x][y])	ansB++;
					if(!b[x][y] && w[x][y])	ansW++;
				}
			}
			
			out.println(ansB+" "+ansW);
			
			
			
			
			
		}
	}
	void D2012(boolean[][] c, int W, int H){
		out.println("\n\n");
		for(int y=0; y<H+2; y++){
			for(int x=0; x<W+2; x++){
				out.print(c[x][y]?"T":".");
			}
			out.println();
		}
	}
	void D2012(char[][] c, int W, int H){
		out.println("\n-------------");
		for(int y=0; y<H+2; y++){
			for(int x=0; x<W+2; x++){
				out.print(c[x][y]);
			}
			out.println();
		}
		out.println("\n-------------");
	}
	
	void AOJ2012(){
		while(sc.hasNext()){
			int e=sc.nextInt(), ans=Integer.MAX_VALUE;
			if(e==0)	break;
			for(int i=0; i*i*i<=e; i++){
				for(int j=0; j*j+i*i*i<=e; j++){
					int k=e-(i*i*i+j*j);
					if(i*i*i+j*j+k==e)	ans=min(ans,i+j+k);
				}
			}
			out.println(ans);
		}
	}
}