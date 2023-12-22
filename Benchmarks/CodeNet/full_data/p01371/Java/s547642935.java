import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ4
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1,-1,1,1,-1}, vy={-1,0,1,0,-1,-1,1,1};
	final int[] vvx={0,1,0,-1,-1,1}, vvy={-1,0,1,0,-1,1};
	final int INF=1<<24;
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){	return (min<=x&&x<X)&&(min<=y&&y<Y);}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
	public static void main(String[] args) {
		//long s=System.currentTimeMillis();
		new Main().B();
		//out.println((System.currentTimeMillis()-s)+"msec");
	}
	void B(){
		while(sc.hasNext()){
			int t=sc.nextInt(),n=sc.nextInt(),ans=0;
			if((t|n)==0)	break;
			boolean[][] b=new boolean[210][210];
			for(int i=0; i<n; i++)	b[sc.nextInt()+100][sc.nextInt()+100]=true;
			int sx=sc.nextInt()+100,sy=sc.nextInt()+100;
			LinkedList<ClassB> open=new LinkedList<ClassB>();
			open.add(new ClassB(sx,sy,0));
			boolean[][] close=new boolean[210][210];
			close[sx][sy]=true;
			while(!open.isEmpty()){
				ClassB now=open.poll();
				ans++;
				if(now.t>=t)	continue;
				for(int i=0; i<6; i++){
					int xx=now.x+vvx[i],yy=now.y+vvy[i];
					//if(!Point.ok(0xx, yy, 100, 100))	continue;
					if(close[xx][yy])	continue;
					if(b[xx][yy])	continue;
					open.add(new ClassB(xx,yy,now.t+1));
					close[xx][yy]=true;
				}
			}
			out.println(ans);
		}
	}
	class ClassB{
		int x,y,t;
		ClassB(int x,int y,int t){this.x=x; this.y=y; this.t=t;}
	}
}