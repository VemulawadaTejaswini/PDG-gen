import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;
import java.lang.Object;
 
public class Main {
    Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        new Main(); 
    }
   
    public Main() {
        new aoj1216().doIt();
    }
    class aoj1216{	
    	double distance(double a,double b,double c,double a2,double b2,double c2){
    		return Math.sqrt((a-a2)*(a-a2)+(b-b2)*(b-b2)+(c-c2)*(c-c2));
    	}
    	void doIt(){
    		int n = sc.nextInt();
    		for(int i = 0;i < n;i++){
    			double P = sc.nextDouble();
    			double R = sc.nextDouble();
    			double Q = sc.nextDouble();
    			int m = sc.nextInt();
    			double p[] = new double[m];
    			double r[] = new double[m];
    			double q[] = new double[m];
    			for(int j = 0;j < m;j++){
    				p[j] = sc.nextDouble();
    				r[j] = sc.nextDouble();
    				q[j] = sc.nextDouble();
    			}
    			for(int j = 0;j < m;j++){
    				for(int k = 0;k < m;k++){
    					double t = distance(p[j],r[j],q[j],p[k],r[k],q[k]);
    					for(int l = 0;l < m;l++){
    						if(j == k || k == l || l == j)continue;
    						if(Math.abs(distance(p[j],r[j],q[j],p[l],r[l],q[l])/t - R/P) < 1e-3){
    							if(Math.abs(distance(p[k],r[k],q[k],p[l],r[l],q[l])/t - Q/P) < 1e-3){
    								System.out.println((l+1)+" "+(k+1)+" "+(j+1));
    								j = k = l = m; 
    							}
    						}
    					}
    				}
    			}
    		}
    	}
    }
}