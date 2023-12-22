	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        int M = sc.nextInt();
	        long K = sc.nextLong();
	        long[] a = new long[N+1];
	        for (int i=0 ; i<N+1; i++) {
	        	if(i==0) {
		            a[i] = 0;	        		
	        	} else {
	        		a[i] = a[i-1]+Long.parseLong(sc.next());
	        	}
	        }	        
	        long[] b = new long[M+1];
	        b[0]=0;
	        for (int i=1 ; i<M+1; i++) {
	            b[i] = Long.parseLong(sc.next());
	            if(i!=0)b[i]=b[i]+b[i-1];
	        }
	        long ans=0;
	        for(int i=0;i<N+1;i++) {
	        	int left=-1;
	        	int right=M+1;
	        	while(right-left>1) {
		        	int mid =(left+right)/2;
	        		if(a[i]+b[mid]<=K) {
	        			left=mid;
	        		} else {
	        			right=mid;
	        		}

	        	}
        		if(right>0) {
        			ans=Math.max(ans, i+left);
        		}
	        }
	        System.out.println(ans);
		 }
	}