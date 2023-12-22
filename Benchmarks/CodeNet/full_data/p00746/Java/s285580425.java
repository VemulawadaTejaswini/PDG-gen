import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(true) {
			int n=in.nextInt();
			
			if(n==0)break;
			point p[]=new point[n];
			p[0]=new point(); p[0].x=0; p[0].y=0;
			int S=0,N=0,E=0,W=0;;


			for(int i=1;i<n;i++) {
				p[i]=new point();
				int prev=Integer.parseInt(in.next()), d=Integer.parseInt(in.next());

				if(d==0) {
					p[i].x=p[prev].x-1;
					p[i].y=p[prev].y;
					if(p[i].x<W)W=p[i].x;
				}
				else if(d==1) {
					p[i].y=p[prev].y-1;
					p[i].x=p[prev].x;
					if(p[i].y<N)N=p[i].y;
				}
				else if(d==2) {
					p[i].x=p[prev].x+1;
					p[i].y=p[prev].y;
					if(p[i].x>E)E=p[i].x;
				}
				else if(d==3) {
					p[i].y=p[prev].y+1;
					p[i].x=p[prev].x;
					if(p[i].y>S)S=p[i].y;
				}
			}
			
			//System.out.printf("%d %d %d %d\n",W,E,N,S);
			System.out.println((E-W+1)+" "+(S-N+1));
		}

		

	}

}

class point{
	int x,y;
}

