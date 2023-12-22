import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n== 0) break;
			int [] xlist = new int[n];
			int [] ylist = new int[n];
			boolean [] visited = new boolean[n];
			for(int i=0; i < n; i++){
				xlist[i] = sc.nextInt();
				ylist[i] = sc.nextInt();
			}
			int nowx = 0, nowy = 0;
			double dis = 0, nowdeg = 0.0;
			for(int i=0; i < n; i++){
				double degmin = 720.0;
				int ind = -1;
				for(int j = 0; j < n; j++){
					if(! visited[j] && ! isinLine(nowx, nowy, xlist[j], ylist[j], xlist,ylist)){
						//calc deg
						double res = getDeg(nowx, nowy, xlist[j], ylist[j]);
						//System.out.println("j=" + j +" degmin= " + degmin + " " + res + "ind= " + ind);
						if(res < nowdeg){
							res+= 360;
						}
						if(degmin > res){
							degmin = res;
							ind = j;
						}
					}
				}
				visited[ind] = true;
				dis += Point2D.Double.distance(nowx, nowy, xlist[ind], ylist[ind]);
				nowx = xlist[ind];
				nowy = ylist[ind];
				nowdeg =degmin % 360;
				//System.out.printf("ind= %d nowdeg= %.3f degmin= %.3f \n",ind+1, nowdeg, degmin);
			}
			System.out.printf("%1.1f\n",dis);
			
		}
	}

	private boolean isinLine(int nowx, int nowy, int nextx, int nexty, int[] xlist,int[] ylist) {
		Line2D.Double line =new Line2D.Double(nowx,nowy,nextx,nexty);
		for(int i=0; i < xlist.length; i++){
			if(line.contains(xlist[i],ylist[i])){
				return true;
			}
		}
		return false;
	}

	private double getDeg(int nowx, int nowy, int nextx, int nexty) {
		double dis = Point2D.Double.distance(nowx, nowy, nextx, nexty);
		double sin = (double)(nextx - nowx) / dis;
		double asin = Math.asin(sin);
		double deg = Math.toDegrees(asin);
		double degRevision = revision(nowx,nowy,nextx,nexty,deg);
		return degRevision;
	}
	
	private double revision(int nowx, int nowy, int nextx, int nexty,double deg){
		if(nowx <= nextx && nowy <= nexty){
			return deg;
		}
		if(nowx <= nextx && nowy >= nexty){
			return ((double)180 - deg);
		}
		if(nowx >= nextx && nowy <= nexty){
			return ((double)360+deg);
		}
		if(nowx >= nextx && nowy >= nexty){
			return ((double)180-deg);
		}
		else{
			return deg;
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}