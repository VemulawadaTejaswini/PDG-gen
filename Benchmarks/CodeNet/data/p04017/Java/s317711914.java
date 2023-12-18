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
        new E().doIt();
    }
    class E{
    	void doIt(){
    		int n = sc.nextInt();
    		int x[] = new int[n];
    		for(int i = 0;i < n;i++)x[i] = sc.nextInt();
    		int L = sc.nextInt();
    		int Q = sc.nextInt();
    		for(int i = 0;i < Q;i++){
    			int s = sc.nextInt() - 1;
    			int g = sc.nextInt() - 1;
    			if(s > g){
    				int temp = s;
    				s = g;
    				g = temp;
    			}
    			int pos = s;
    			int cnt = 0;
    			while(pos < g){
    				for(int j = pos;j < n;j++){
    					if(j == n - 1){
    						pos = g;
    						break;
    					}
    					if(x[j] - x[pos] > L){
    						pos = j - 1;
    						break;
    					}
    				}
    				cnt++;
    			}
    			System.out.println(cnt);
    		}
    	}
    }
}