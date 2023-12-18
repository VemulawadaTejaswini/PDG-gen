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
        new D().doIt();
    }
    class D{	
    	ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
    	void doIt(){
    		String str = sc.next();
    		int length = str.length();
    		for(int c = 0;c < 26;c++){
    			array.add(new ArrayList<Integer>());
    		}
    		for(int i = 0;i < length;i++){
    			array.get(str.charAt(i) - 'a').add(i);
    		}
    		int s = -1;int g = -1;
    		for(int c = 0;c < 26;c++){
    			ArrayList<Integer> array2 = new ArrayList<Integer>();
    			array2 = array.get(c);
//    			System.out.println(array2.toString());
    			int length2 = array2.size();
    			if(length2 > 1){
    				for(int i = 1;i < length2;i++){
    					if(array2.get(i) - array2.get(i-1) < 2){
    						s = array2.get(i-1)+1;
    						g = array2.get(i)+1;
    					}
    				}
    			}
    		}
    		System.out.println(s+" "+g);
    	}
    }
}