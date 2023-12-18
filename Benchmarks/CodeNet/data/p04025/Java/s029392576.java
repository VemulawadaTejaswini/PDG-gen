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
        new C().doIt();
    }
    class C{	
    	void doIt(){
    		int n = sc.nextInt();
    		int a[] = new int[n];
    		for(int i = 0;i < n;i++){
    			a[i] = sc.nextInt();
    		}
    		int min = Integer.MAX_VALUE;
    		for(int i = -100;i <= 100;i++){
    			int num = 0;
    			for(int j = 0;j < n;j++){
    				num = num + (i-a[j])*(i-a[j]);
    			}
    			min = Math.min(min, num);
    		}
    		System.out.println(min);
    	}
    }
}