import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        
        int[] a = new int[N];
        int[] b = new int[N];
        long[] dp = new long [H+100];
        for(int i=0;i<N;i++) {
        	a[i]=sc.nextInt();
        	b[i]=sc.nextInt();
        }
        dp[0]=0;
        long pre=0;
        long min=0;
        //ダメージiの時の最小魔力を計算
        for(int i=1;i<H+100;i++) {
    		min=dp[i]+100000000;
        	for(int j=0;j<N;j++) {
        		if(i-a[j]<0) {
        			pre=0;
        		} else {
        			pre=dp[i-a[j]];
        		}
        		    min=Math.min(min, pre+b[j]);
        	}
        	dp[i]=min;
        }
        
        System.out.println(dp[H]);
        		
    }
}