import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();

        int[][]a=new int[N][2];
        for(int i=0;i<N;i++) {
        	a[i][0]=sc.nextInt();
        	a[i][1]=sc.nextInt();
        }
        
 //       Arrays.sort(a);
        Arrays.sort(a, (b, c) -> Integer.compare(b[0], c[0]));
        int[][] dp=new int[6005][N+1];
        int[] max=new int[6005];
        for(int i=0;i<6005;i++) {
        	for(int j=0;j<N;j++) {
        		if(i<a[j][0]) {
        			dp[i][j+1]=dp[i][j];
        		} else {
        			if(dp[i-a[j][0]][j]+a[j][1]>=dp[i][j]) {
        				dp[i][j+1]=dp[i-a[j][0]][j]+a[j][1];
        				max[i]=a[j][0];
        			} else {
        				dp[i][j+1]=dp[i][j];
        			}
        		}
        	}
        }
        
        long ans=0;
        for(int i=0;i<6005;i++) {
        	if(i-max[i]<=T-1) {
        		ans=Math.max(ans,dp[i][N]);
        	}
        }

        System.out.println(ans);        	
                		
    }

}