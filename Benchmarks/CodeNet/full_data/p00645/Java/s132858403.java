import java.io.*;
import java.util.*;
public class Myon
{
    public static void main(String args[]) throws Exception
    { new Myon();}
  
    static int MAX = 9999;
    
    Myon(){
    	Scanner cin = new Scanner(System.in);
    	int i,j,k,num;
    	while(true){
    		int n;
    		n = cin.nextInt();
    		if(n==0) break;
    		int input[] = new int[n];
    		for(i=0;i<n;i++){
    			input[i] = 0;
    			for(j=0;j<n;j++){
    				if(cin.nextInt()!=0) input[i] += 1<<j;
    			}
    		}
    		
    		num = n*(n+1)/2;
    		int range[] = new int[num];
    		int count = 0;
    		for(i=0;i<=n;i++){
    			for(j=i+1;j<=n;j++){
    				range[count++] = (1<<j)- (1<<i);
    			}
    		}
    		int memo[] = new int[1<<num];
    		int plus[] = new int[1<<num];
    		for(i=0;i<(1<<num);i++){
    			memo[i] = 0;
    			plus[i] = 0;
    			for(j=0;j<num;j++){
    				if(((1<<j)&i)!=0){
    					memo[i] ^= range[j];
    					plus[i]++;
    				}
    			}
    		}
    		//System.out.println("start!");
    		int dp[] = new int[1<<num];
    		for(j=0;j<(1<<num);j++) dp[j] = MAX;
    		dp[0] = 0;
    		for(i=0;i<n;i++){
    			int newdp[] = new int[1<<num];
    			for(j=0;j<(1<<num);j++) newdp[j] = MAX;
    			for(j=0;j<(1<<num);j++){
    				if(dp[j]==MAX) continue;
    				int need = memo[j] ^ input[i];
    				//System.out.println("test");
    				for(k=0;k<(1<<num);k++){
    					if(need != memo[k]) continue;
    					//System.out.println("test");
    					newdp[j ^ k] = Math.min(newdp[j ^ k], dp[j]+plus[k]);
    				}
    			}
    			dp = newdp.clone();
    		}
    		int res = MAX;
    		for(j=0;j<(1<<num);j++) res = Math.min(res, dp[j]+Integer.bitCount(j));
    		//System.out.println(res);
    		for(j=0;j<res/2;j++) System.out.print("myon");
    		System.out.println();
    	}
    }
}