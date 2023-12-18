 import java.io.*;
import java.util.*;
class GFG {static String k;static int d;
static int dp[][][]=new int [10001][101][2];
static int mod=1000000007;
public static int solve(int pos,int sm,int tight){
    if(pos==k.length()){
        return (sm==0)?1:0;
    }
    if(dp[pos][sm][tight]!=-1)return dp[pos][sm][tight];
    int ans=0;
    int end=((tight==1)?(k.charAt(pos)-'0'):9);
    for(int i=0;i<=end;i++){
        ans=(ans+solve(pos+1,(sm+i)%d,(i==end)?tight:0))%mod;
        
        
    }
    return dp[pos][sm][tight]=ans;
    
}





	public static void main (String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    k=sc.next();
	     d=sc.nextInt();
	     for(int i=0;i<10001;i++){
	         for(int j=0;j<101;j++){
	             for(int l=0;l<2;l++){
	                 dp[i][j][l]=-1;
	             }
	         }
	     }
		System.out.println(solve(0,0,1)-1);
	    }
 
 }