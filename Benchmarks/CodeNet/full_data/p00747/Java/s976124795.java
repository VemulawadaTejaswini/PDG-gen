import java.util.*;
import java.io.*;

public class Main {

	static int my[]= {1,0,-1,0}, mx[]= {0,1,0,-1};//n,e,s,w
	static int h,w;
	static int d[][],sidew[][],udw[][];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		while(true) {
			w=Integer.parseInt(in.next()); h=Integer.parseInt(in.next());
			if(h==0)break;
			
			d=new int[h][w];sidew=new int[h][w-1]; udw=new int[h-1][w];

			for(int i=0;i<h;i++) {
				for(int j=0;j<w-1;j++)sidew[i][j]=Integer.parseInt(in.next());
				if(i!=h-1)for(int j=0;j<w;j++)udw[i][j]=Integer.parseInt(in.next());
			}
			
			Stack<point> stk=new Stack<>();
			point p=new point();
			p.x=0; p.y=0; stk.push(p);
			d[0][0]=1;
			DFS(0,0);
			
			System.out.println(d[h-1][w-1]);
		}
		
	}
	
	static void DFS(int x,int y) {
		
		//n,e,s,w
		if(y+1<h && udw[y][x]!=1 && (d[y+1][x]==0 || d[y+1][x]>d[y][x]+1)) {
			d[y+1][x]=d[y][x]+1;
			DFS(x,y+1);
		}
		if(x+1<w && sidew[y][x]!=1 && (d[y][x+1]==0 || d[y][x+1]>d[y][x]+1)) {
			d[y][x+1]=d[y][x]+1;
			DFS(x+1,y);
		}
		if(y-1>=0 && udw[y-1][x]!=1 && (d[y-1][x]==0 || d[y-1][x]>d[y][x]+1)) {
			d[y-1][x]=d[y][x]+1;
			DFS(x,y-1);
		}
		if(x-1>=0 && sidew[y][x-1]!=1 && (d[y][x-1]==0 || d[y][x-1]>d[y][x]+1)) {
			d[y][x-1]=d[y][x]+1;
			DFS(x-1,y);
		}
	}

}

class point{
	int x,y;
}

