	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        int K = sc.nextInt();	
	        
	        long ans=0;
	        if(K==0) {
	        	System.out.println(N*N);
	        	return;
	        }
	        for(int i=K+1;i<=N;i++) {
	        	ans=ans+(i-K)*(N/i);
	        	if(N%i>=K) {
	        		ans=ans+(N%i-K+1);
	        	}
	        }
	        System.out.println(ans);
	    }
	}