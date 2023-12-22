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
	        for (int i=1 ; i<N; i++) {
	        	int a = sc.nextInt();
	        	int b = sc.nextInt();
	        	ans=ans+i*(i+1)/2;
	        	ans=ans-Math.min(a, b)*(N-Math.max(a, b)+1);
	        }
	        ans=ans+N*(N+1)/2;

	        
	        System.out.println(ans);

		 }
	}