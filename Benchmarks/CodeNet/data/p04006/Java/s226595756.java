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
    		int N = sc.nextInt();
    		long x = sc.nextLong();
    		long a[][] = new long[N][N];
    		for(int i = 0;i < N;i++){
    			a[i][0] = sc.nextLong();
    		}
    		long sum = 0;
    		for(int j = 0;j < N;j++){
    			for(int i = 0;i < N;i++){
    				a[(j+i) % N][i] = a[j][0];
    			}
    		}
    		int cnt = 0;
    		for(int j = 0;j < N;j++){
    			int pos = 0;
    			for(int i = 0;i < N;i++){
    				if(a[j][pos] > a[j][i] + (x * i)){
    					pos = i;
    					cnt = Math.max(cnt, i);
    				}
//    				System.out.print(a[j][i]+" ");
    			}
    			sum = sum + a[j][pos];
//    			System.out.println();
    		}
    		sum = sum + (x * (long)cnt);
    		System.out.println(sum);
    	}
    }
}