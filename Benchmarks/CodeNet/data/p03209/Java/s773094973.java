	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        long X = sc.nextLong();
	        long[] lp = new long[N+1];
	        long[] lsum =new long[N+1];
	        lp[0]=1;lsum[0]=1;
	        for(int i=1;i<=N;i++) {
	        	lp[i]=2*lp[i-1]+1;
	        	lsum[i]=2*lsum[i-1]+3;
	        }
	        
	        boolean isEat=false;
	        int now =N;
	        long ans=0;
	        while(X>0) {
	        	if(now>=0&&X>=lsum[now]) {
	        		X=X-lsum[now];
	        		ans=ans+lp[now];
	        		if(X>0) {
	        			ans++;
	        			X--;
	        		}
	        	} else {
	        		X--;
	        		now--;
	        	}
	        }
	        System.out.println(ans);
	    }
	}
