	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        long[] a = new long[N];
	        long[] R = new long[N];
	        long[] L = new long[N];
	        long ans=0;
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	            R[i] = i+a[i];
	            L[i] = i-a[i];
	            //if(R[i]==L[i])ans--;
	        }
	        
	        Arrays.parallelSort(R);
	        Arrays.parallelSort(L);
	        int rcnt=0;
	        int lcnt=0;
	        while(rcnt!=N-1) {
	        	if(lcnt>=N)break;
	        	if(R[rcnt]==L[lcnt]) {
	        		long tmp=R[rcnt];
	        		int rr=0;
	        		int lr=0;
	        		while(R[rcnt]==tmp) {
	        			rr++;
	        			rcnt++;
	        		}
	        		while(lcnt<N&&L[lcnt]==tmp) {
	        			lr++;
	        			lcnt++;
	        		}
	        		ans=ans+rr*lr;
	        		
	        	} else if(R[rcnt]>L[lcnt]) {
	        		lcnt++;
	        	} else {
	        		rcnt++;
	        	}
	        }
	        
	        
	        System.out.println(ans);
	        
	    }
	}