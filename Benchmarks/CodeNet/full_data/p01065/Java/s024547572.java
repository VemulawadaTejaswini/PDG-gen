
import java.awt.geom.Point2D;
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1157().doIt();
    }
    class aoj1157{
    	int U[],UK[],C[],CK[];
    	int DP_UU[];
    	int DP_CC[];
        void doIt(){
        	int n = sc.nextInt();
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	U = new int[n];UK = new int [n];
        	C = new int[n];CK = new int [n];
        	DP_UU = new int [x+1];
        	for(int i = 0;i < n;i++){
        		U[i] = sc.nextInt();
        		UK[i] = sc.nextInt();
        		C[i] = sc.nextInt();
        		CK[i] = sc.nextInt();
        	}
        	for(int i = 0;i < n;i++){
        		for(int j = 0;j < x+1;j++){
        			if(j+U[i] > x)break;
        			DP_UU[j+U[i]] = Math.max(DP_UU[j+U[i]] , DP_UU[j] + UK[i]);
        		}
        	}
        	int max = 0;
        	for(int i = 0;i < x+1;i++){
        		max = Math.max(max,DP_UU[i]);
        	}
        	y = y + max;
        	DP_CC = new int [y+1];
        	for(int i = 0;i < n;i++){
        		for(int j = 0;j < y+1;j++){
        			if(j+C[i] > y)break;
        			DP_CC[j+C[i]] = Math.max(DP_CC[j+C[i]] , DP_CC[j] + CK[i]);
        		}
        	}
        	int ans = 0;
        	for(int i = 0;i < y+1;i++){
        		ans = Math.max(ans,DP_CC[i]);
        	}
        	System.out.println(ans);
        }
    }
}