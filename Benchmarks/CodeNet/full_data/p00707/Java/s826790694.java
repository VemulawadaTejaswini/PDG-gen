import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj2583().doIt();
    }
    class aoj2583{
    	char map[][] = new char[70][70];
    	String dp[][] = new String[70][70];
    	void clear(int W,int H){
    		for(int i = 0;i < H;i++){
    			for(int j = 0;j < W;j++){
    				dp[i][j] = "";
    			}
    		}
    	}
    	void set(int W,int H){
    		for(int i = 0;i < H;i++){
    			String str = sc.next();
    			char ctr[] = str.toCharArray();
    			for(int j = 0;j < W;j++){
    				map[i][j] = ctr[j];
    			}
    		}
    	}
    	String dp_table(int W,int H){
    		String max = "0";
    		for(int i = 0;i < H;i++){
    			for(int j = 0;j < W;j++){
    				if(i == 0 && j == 0 && (int)map[i][j] <= 57)dp[i][j] = ""+map[i][j];
    				else if(i == 0 && (int)map[i][j] <= 57){
    					dp[i][j] = dp[i][j-1] + map[i][j];
    				}
    				else if(j == 0 && (int)map[i][j] <= 57){
    					dp[i][j] = dp[i-1][j] + map[i][j];
    				}
    				else if((int)map[i][j] <= 57){
    					dp[i][j] = dp[i][j-1] + map[i][j];
    					String str = dp[i-1][j] + map[i][j];
    					String str2 = dp[i-1][j-1] + map[i][j];
    					if(dp[i][j].length() < str.length())dp[i][j] = str;
    					if(dp[i][j].length() < str.length())dp[i][j] = str2;
    					if(dp[i][j].length() == str.length()){
    						if(dp[i][j].compareTo(str) < 0)dp[i][j] = str;
    					}
    					if(dp[i][j].length() == str2.length()){
    						if(dp[i][j].compareTo(str2) < 0)dp[i][j] = str2;
    					}
    				}
    				dp[i][j] = dp[i][j].replaceAll("^0*","");
    				if(max.length() < dp[i][j].length())max = dp[i][j];
    				else if(max.length() == dp[i][j].length()){
    					if(max.compareTo(dp[i][j]) < 0)max = dp[i][j];
    				}
    			}
    		}
    		return max;
    	}
    	void doIt(){
    		while(true){
    			int W = sc.nextInt();
    			int H = sc.nextInt();
    			if(W + H == 0)break;
    			clear(W,H);
    			set(W,H);
    			System.out.println(dp_table(W,H));
//    			for(int i = 0;i < H;i++){
//    				for(int j = 0;j < W;j++){
//    					System.out.print(dp[i][j]+" :");
//    				}
//    				System.out.println();
//    			}
    		}
    	}
    }
}