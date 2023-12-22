import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj2011().doIt();
    }
    class aoj2011{
    	boolean map[][] = new boolean[50][30];
    	long dp[][] = new long[50][30];
    	int dp_table(int n){
    		int result = -1;
    		for(int i = 0;i < n;i++)dp[i][0] = 1 << i;
            for(int j = 1;j <= 30;j++){
                if(result != -1)break;
                for(int i = 0;i < n;i++){
                    if(!map[i][j]){
                        dp[i][j] = dp[i][j-1]; 
                        continue;
                    }
                    for(int k = 0;k < n;k++){
                        if(!map[k][j])continue;
                        dp[i][j]|=dp[k][j-1];
                        
                    }
                    if(dp[i][j]==(1 << n)-1){
                        result = j;
                        break;
                    }
                }
            }
            return result;
    	}
    	void set(int n){
    		for(int i = 0;i < n;i++){
    			for(int j = 0;j < 30;j++){
    				map[i][j] = false;
    				dp[i][j] = 0;
    			}
    		}
    	}
         void doIt(){
        	 while(true){
        		 int n = sc.nextInt();
        		 if(n == 0)break;
        		 set(n);
        		 for(int i = 0;i < n;i++){
        			 int num = sc.nextInt();
        			 for(int j = 0;j < num;j++){
        				 int pos = sc.nextInt();
        				 map[i][pos] = true;
        			 }
        		 }
                 System.out.println(dp_table(n));
//                 for(int i = 0;i < n;i++){
//                	 for(int j = 0;j < 30;j++){
//                		 System.out.print(dp[i][j]+" ");
//                	 }
//                	 System.out.println();
//                 }
             }
         }
     }
}