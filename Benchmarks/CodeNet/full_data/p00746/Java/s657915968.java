import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ4
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1,-1,1,1,-1}, vy={-1,0,1,0,-1,-1,1,1};
	final int INF=1<<26;
	final double EPS=1.0e-08;
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
		new Main().AOJ1165();
		//out.println((System.currentTimeMillis()-s)+"msec");
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
}