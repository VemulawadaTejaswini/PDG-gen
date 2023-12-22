import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
    	new B().doIt();
    }
    class B{
    	int dp[] = new int[301];
    	void dp_table(){
    		dp[0] = 1;
			for(int i = 1;i < 17;i++){
				for(int j = 0;j < 301;j++){
					if(j+(i*i) > 300)break;
					dp[j+(i*i)] = dp[j+(i*i)] + dp[j];
				}
			}
		}
    	void doIt(){
    		dp_table();
            while(true){
            	int n = sc.nextInt();
            	if(n == 0)break;
            	System.out.println(dp[n]);
            }
        }
    }
}