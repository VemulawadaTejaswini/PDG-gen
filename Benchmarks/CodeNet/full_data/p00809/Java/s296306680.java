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
        new aoj1230().doIt();
    }
    class aoj1230{	
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			if(n ==0)break;
    			int max = sc.nextInt();
    			int p[] = new int[2*n];
    			for(int i = 0;i < 2*n;i++)p[i] = sc.nextInt();
    			boolean[][]dp = new boolean[2*n][max+1];
    			for(int i = 2;i <= max;i++){
    				for(int j = 0;j < 2*n;j++){
    					for(int k = 1;k <= p[j];k++){
    						if(i-k <= 0)break;
    						if(!dp[(i+1)%(2*n)][i-k])dp[j][i] = true;
    					}
    				}
    			}
    			System.out.println(dp[0][max] ? 1:0);
    		}
    	}
    }
}