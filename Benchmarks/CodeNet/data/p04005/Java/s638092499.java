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
        new A().doIt();
    }
    class A{
    	void doIt(){
    		long a[] = new long[3];
    		for(int i = 0;i < 3;i++)a[i] = sc.nextLong();
    		Arrays.sort(a);
    		long sum = a[0] * a[1];
    		long Red = a[2] / 2;
    		long Blue = a[2] - Red;
    		long ans = sum * (Blue - Red);
    		System.out.println(ans);
    	}
    }
}