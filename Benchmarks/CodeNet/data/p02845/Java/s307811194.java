	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        long[] a = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	        }
	        long ans=1;
	        int[] m = new int[3];
	        for(int i=0;i<N;i++) {
	        	int tmp =0;
	        	for(int j=0;j<3;j++) {
	        		if(m[j]==a[i])tmp++;
	        	}
	        	for(int j=0;j<N;j++) {
	        		if(m[j]==a[i]) {
	        			m[j]++;
	        			break;
	        		}
	        	}
	        	ans=(ans*tmp)%mod;
	        }
	        
	        
	        System.out.println(ans);
	        

	    }
	    
	    

	}