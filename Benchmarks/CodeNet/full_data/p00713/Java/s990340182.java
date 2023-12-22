import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj2151().doIt();
    }
    class aoj2151{
    	Point2D[] p = new Point2D[301];
    	int ans(int n){
    		int result = 0;
    		for(int i = 0;i < n;i++){
    			for(int j = i+1;j < n;j++){
    				double dot = Math.sqrt(p[i].getX() - p[j].getX())*(p[i].getX() - p[j].getX())
    						+ (p[i].getY() - p[j].getY())*(p[i].getY() - p[j].getY());
    				if(dot > 2.0)continue;
    				Point2D m = new Point2D.Double((p[i].getX() + p[j].getX())/2,(p[i].getY() + p[j].getY())/2);
    				Point2D v = new Point2D.Double((p[j].getX() - p[i].getX())/dot,(p[j].getY() - p[i].getY())/dot);
    				double e = Math.sqrt(1.0 - dot*dot/4.0);
    				Point2D rp = new Point2D.Double(m.getX() - e*v.getY(),m.getY() + e*v.getX());
    				Point2D lp = new Point2D.Double(m.getX() + e*v.getY(),m.getY() - e*v.getX());
    				int point = 2;
		            int point2 = 2;
    				for (int k=0; k<n; k++) {
    		            if (k==i || k==j)continue;
    		            double check_rx = (rp.getX()-p[k].getX())*(rp.getX()-p[k].getX());
    		            double check_ry = (rp.getY()-p[k].getY())*(rp.getY()-p[k].getY());
    		            double check_lx = (lp.getX()-p[k].getX())*(lp.getX()-p[k].getX());
    		            double check_ly = (lp.getY()-p[k].getY())*(lp.getY()-p[k].getY());
    		            if (check_rx + check_ry < 1.0) {
    		            	point++;
    		            }
    		            if (check_lx + check_ly < 1.0) {
    		            	point2++;
    		            }
    		        }
    				result = Math.max(result, point);
		            result = Math.max(result, point2);
    			}
    		}
    		return result;
    	}
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			if(n == 0)break;
    			for(int i = 0;i < n;i++){
    				p[i] = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
    			}
    			System.out.println(ans(n));
    		}
    	}
    }
}