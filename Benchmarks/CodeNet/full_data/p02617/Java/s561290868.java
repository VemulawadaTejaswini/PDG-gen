	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();	
	        long ans=0;
	        long sum=0;
	        for (int i=1 ; i<N; i++) {
	        	long a = sc.nextInt();
	        	long b = sc.nextInt();
	        	if(a>b) {
	        		long t = b;
	        		b=a;a=t;
	        	}
	        	sum=sum+i;
	        	ans=ans+sum;
	        	ans=ans-a*(N-b+1);
	        }
	        sum=sum+N;
	        ans=ans+sum;

	        
	        System.out.println(ans);

		 }
	}