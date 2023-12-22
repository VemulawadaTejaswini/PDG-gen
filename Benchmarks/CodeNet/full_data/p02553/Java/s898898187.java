import java.util.Scanner;
public class Main {
	public static Scanner sc = new Scanner(System.in);
    public void run() throws Exception {

    	Scanner sc = new Scanner(System.in);
    	long aa[] = new long[4];
    	long a = sc.nextLong();
    	long b = sc.nextLong();
    	long c = sc.nextLong();
    	long d = sc.nextLong();
    	aa[0] = a*c;
    	aa[1] = a*d;
    	aa[2] = b*c;
    	aa[3] = b*d;

    	long res = Long.MIN_VALUE;
    	for(int i=0; i<4;i++){
    		if(res<aa[i]){
    			res = aa[i];
    		}
    	}

/*    	int n = 5;
    			int []aaa = {2, 0, 9, 0, -5};
    			int res = -10000000;
    			for(int i=0; i<n;i++){
    				if(res<aaa[i]){
    					res = aaa[i];
    				}
    			}*/
		System.out.println(res);
		
		
    }
    //再帰
    static long fib(int n){
	    if (n <= 1){
	    	return 1;
	    }else{
	    	return fib(n-1) + fib(n-2);
	    }
	}


    //動的計画法 DP
    static long nCr(int n,int r) {
    	  int dp[][]=new int[2001][2001];
    	  for(int i=0;i<2001;i++) {
    	    dp[0][i]=0;
    	  }
    	  for(int i=0;i<2001;i++) {
    	    dp[i][0]=1;
    	  }
    	  for(int i=1;i<2001;i++) {
    	    for(int j=1;j<2001;j++) {
    	      if(i==j) {
    	        dp[i][j]=1;
    	      }else {
    	        dp[i][j]=dp[i-1][j-1]+dp[i][j-1];
    	      }
    	    }
    	  }
    	  return dp[n][r];
    	}

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
    //2 つの Key をもつ Map.pair は二つの要素を入れる入れ物
    class pair{
    	  int wt,val;
    	  pair(int wt,int val){
    	    this.wt=wt;
    	    this.val=val;
    	  }
    }
}
