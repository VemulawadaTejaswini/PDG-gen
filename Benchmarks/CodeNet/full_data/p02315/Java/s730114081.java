import java.util.Scanner;

import atcoder.Main;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();
    	int W=sc.nextInt();

    	int[] w=new int[N];
    	int[] v=new int[N];

    	int[] dp=new int[W+1];

    	for(int i=0;i<N;i++) {
    		v[i]=sc.nextInt();
    		w[i]=sc.nextInt();
    	}

    	//dp[i+1][j] i番目までのアイテムで容量jのリュックに詰めれる価値の最大値

    	//dp[0][j]=0;

    	for(int i=0;i<=W;i++) {
    		dp[i]=0;
    	}


    	for(int i=0;i<N;i++) {

    		for(int j=W;j>=0;j--) {

    			if(j-w[i]>=0) {
    				dp[j]=Math.max(dp[j],dp[j-w[i]]+v[i]);
    			}

    		}

    	}

//    	for(int i=0;i<N;i++) {
//    		for(int j=0;j<=W;j++) {
//    			if(j-w[i]<0) {
//    				dp[i+1][j]=dp[i][j];
//    			}else {
//    				dp[i+1][j]=Math.max(dp[i][j],dp[i][j-w[i]]+v[i]);
//    			}
//    		}
//    	}

    	System.out.println(dp[W]);

    }
}

