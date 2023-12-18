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
        new B().doIt();
    }
    class B{
    	void doIt(){
    		int n = sc.nextInt();
    		int a[] = new int[n+1];
    		int sum = 0;
    		int cnt = 0;
    		for(int i = 1;i < n+1;i++){
    			a[i] = sc.nextInt();
    			sum = sum + (a[i] / 2);
    			if(a[i] % 2 == 1 && cnt == 1){
    				sum = sum + 1;
    				cnt = 0;
    			}else cnt = a[i] % 2;
//    			System.out.println(i+" "+cnt+" "+sum);
    		}
    		System.out.println(sum);
    	}
    }
}