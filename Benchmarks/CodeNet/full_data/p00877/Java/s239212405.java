import java.awt.*;
import java.util.*;
import java.awt.geom.*;

public class Main {
    public static void main(String args[])throws Exception{
        Scanner cin= new Scanner(System.in);
		int n,m;
		for(;;){
			n=cin.nextInt();
			m=cin.nextInt();
			//			System.out.printf("%d %d\n",n,m);
			if(n==0 && m==0) break;
			
			Point2D.Double[] w = new Point2D.Double[200];
			Point2D.Double[] b = new Point2D.Double[200];
			
			for(int i=0;i<n;i++){
				w[i].x= cin.nextInt();
				w[i].y= cin.nextInt();
			}
			for(int i=0;i<m;i++){
				b[i].x= cin.nextInt();
				b[i].y= cin.nextInt();
			}
			
			int f=0;
		out:
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					int t1=0,t2=0;
					for(int k=0;k<n;k++){
						if(k==i) continue;
						int ccw=Line2D.relativeCCW(w[i].x, w[i].y, b[i].x, b[i].y, w[k].x, w[k].y);
						if(ccw==0) if(w[i].distance(b[j]) + w[i].distance(w[k]) <= w[k].distance(b[j]) + 0.0000000001) ccw=1;
						t1+=ccw;
					}
					for(int k=0;k<m;k++){
						if(k==j) continue;
						int ccw=Line2D.relativeCCW(w[i].x, w[i].y, b[i].x, b[i].y, b[k].x, b[k].y);
						if(ccw==0) if(b[j].distance(w[i]) + b[j].distance(b[k]) <= w[i].distance(b[k]) + 0.0000000001) ccw=-1;
						t1+=ccw;
					}
					if(t1*t2<=0 && Math.abs(t1)==n && Math.abs(t2)==m){
						f=1;
						System.out.println("YES");
						break out;
					}
				}
			}
			if(f==0) System.out.println("NO");
		}
	}
}