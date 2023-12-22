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
    		int result = 1;
    		for(int i = 0;i < n;i++){
    			for(int j = i+1;j < n;j++){
    				double dot = p[i].distance(p[j]);
//    				System.out.println(dot);
    				if(dot > 2.0 + 0.000001)continue;
    				double e = Math.sqrt(1.0 - dot*dot/4.0);
    				for (int pm = 0; pm < 2; ++pm) {
    					Point2D c = new Point2D.Double(p[i].getX()+p[j].getX()/2.0 + (p[j].getY()-p[i].getY())*e/dot,
    							(p[i].getY()+p[j].getY())/2.0 - (p[j].getX()-p[i].getX())*e/dot);
    					int cnt = 2;
    					for (int k = 0; k < n; ++k) {
    						if (k == i || k == j)continue;
    				        if ((c.getX()-p[k].getX())*(c.getX()-p[k].getX())+(c.getY()-p[k].getY())*(c.getY()-p[k].getY()) <= 1.0 + 0.000001)cnt++;
    				      }
    				      result = Math.max(result, cnt);
    				      e *= -1.0;
    				    }
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