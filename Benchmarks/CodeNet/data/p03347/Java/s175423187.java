	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();	
	        long[] a = new long[N];
	        for (int i=0 ; i<N; i++) {
	            a[i] = Long.parseLong(sc.next());
	        }
	        long ans =0;
	        long pre =-1;
	        for(int i=0;i<N;i++) {
	        	if(a[i]>pre+1) {
	        		System.out.println(-1);
	        		return;
	        	} else if(a[i]==pre+1){
	        		ans++;
	        	} else {
	        		ans=ans+a[i];
	        	}
	        	pre=a[i];
	        }
	        
	        
	        System.out.print(ans-1);
		 }
	}