
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.io.IOException;
import java.util.*;

import org.xml.sax.HandlerBase;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj2015().doIt();
    }
    class aoj2015{
    	int map_N[] = new int [1501];
    	int map_M[] = new int [1501];
    	int NN[] = new int [1500001];
    	int MM[] = new int [1500001];
    	void doIt(){
    		while(true){
    			int N = sc.nextInt();
    			int M = sc.nextInt();
    			if(N+M == 0)break;
    			for(int i = 0;i < N;i++)map_N[i] = sc.nextInt();
    			for(int i = 0;i < M;i++)map_M[i] = sc.nextInt();
    			int Max = 0;
    			for(int i = 0;i <= 1500000;i++){	
    				NN[i] = 0;
    				MM[i] = 0;
    			}
    			for(int i = 0;i < N;i++){
    				int sum = 0;
    				for(int j = i;j >= 0;j--){
    					sum = sum + map_N[j];
    					NN[sum]++;
    				}
    				Max = Math.max(Max, sum);
    			}
    			for(int i = 0;i < M;i++){
    				int sum = 0;
    				for(int j = i;j >= 0;j--){
    					sum = sum + map_M[j];
    					MM[sum]++;
    				}
    				Max = Math.max(Max, sum);
    			}
    			int ans = 0;
    			for(int i = 0;i <= Max;i++){
    				ans = ans + NN[i]*MM[i];	
    			}
    			System.out.println(ans);
    		}
    	}
    }
}