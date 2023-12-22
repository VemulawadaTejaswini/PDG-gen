import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		new Main();
	}

	public Main() throws Exception {
		while(in.hasNext())new AOJ1023().doIt();
	}

	class AOJ1023{
		final double EPS=1.0e-8;
		void doIt() throws Exception{
			int gn = in.nextInt();
			int en = in.nextInt();
			int r = in.nextInt();
			if(gn+en+r==0)return;
			Point2D[] graze = new Point2D[gn];
			Point2D[] ene = new Point2D[en];
			for(int i=0;i<gn;i++)graze[i] = new Point2D.Double(in.nextDouble(),in.nextDouble());
			for(int i=0;i<en;i++)ene[i] = new Point2D.Double(in.nextDouble(), in.nextDouble());
			HashMap<String,Integer> map = new HashMap<String, Integer>();
			try {
				for(int i=0;i<en;i++)map.put(((int)ene[i].getX())+" "+((int)ene[i].getY()),i);
			} catch (Exception e) {
				throw e;
			}
			int result = 0;
			int lim = 4*r*4*r;
			for(int i=0;i<gn;i++){
				int minx = (int)graze[i].getX()-4*r;
				int maxx = (int)graze[i].getX()+4*r;
				int miny = (int)graze[i].getY()-4*r;
				int maxy = (int)graze[i].getY()+4*r;
				for(int s=minx;s<=maxx;s++)for(int j=miny;j<=maxy;j++)if(map.containsKey(s+" "+j)){
					if(ene[map.get(s+" "+j)].distanceSq(graze[i])-lim<EPS)result++;
				}
			}
			System.out.println(result);
		}

	}


} 