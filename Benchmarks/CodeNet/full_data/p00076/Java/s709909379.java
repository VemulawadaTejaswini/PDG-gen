
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	new aoj0076().doIt();
    }
    class aoj0076{
    	void doIt(){
    		double mapx[] = new double[1001];
    		double mapy[] = new double[1001];
    		mapx[1] = 1;
    		mapy[1] = 0;
    		int rand = 90;
    		for(int i = 2;i < 1001;i++){
    			mapx[i] = (1/Math.sqrt(i-1))*(mapx[i-1]*Math.cos(Math.toRadians(rand)) - mapy[i-1]*Math.sin(Math.toRadians(rand))) + mapx[i-1];
    			mapy[i] = (1/Math.sqrt(i-1))*(mapx[i-1]*Math.sin(Math.toRadians(rand)) + mapy[i-1]*Math.cos(Math.toRadians(rand))) + mapy[i-1];
    		}
    		while(true){
    			int n = sc.nextInt();
    			if(n == -1)break;
    			System.out.printf("%.2f\n",mapx[n]);
    			System.out.printf("%.2f\n",mapy[n]);
    		}
    	}
    }
}