import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static long[][] dp ;
    static int K;
    static long to =Long.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     int k = in.nextInt();
	     K =k;
	     int[] arr = new int[n+1];
	     int[] cost = new int[n+1];
	     dp = new long[n+1][k+1];
	     for(int i =1; i<= n; i++)
	    	 arr[i] = in.nextInt();
	     
	     for(int i =1; i<= n ; i++) {
	    	 cost[i] = in.nextInt();
	     }
	     
	    // long to =Long.MIN_VALUE;
	     for(int i =1; i<=n; i++) {
	    	long re = cal(arr, cost, i, 0, 0);
	    //	System.out.println(re);
	     }
	     if(k==0){
	    	 System.out.println(0);
	     }
	     else System.out.println(to);

	}
	
	static long cal(int[] arr, int[] cost, int i, int k, long c) {
		if(k>0)
		  to = Math.max(to, c);
		if(k==K) {
			return 0;
		}
	    long re =0;
	    int next = arr[i];
	    re = cost[next] + cal(arr, cost, next, k+1, c+cost[next]);
	    
	    return re;
	}
	

}
