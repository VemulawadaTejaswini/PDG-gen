	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
//		 static int mod =  (int) 998244353;
		 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		 static int a_dist[];
		 public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        int M = sc.nextInt();	
	        long[][] a = new long[M][2];
	        for (int i=0 ; i<M; i++) {
	            a[i][0] = Long.parseLong(sc.next());
	            a[i][1] = Long.parseLong(sc.next());
	        }

	        Arrays.sort(a, (b, c) -> Long.compare(b[1], c[1]));
	        long now=0;
	        long ans=0;
	        for(int i=0;i<M;i++) {
	        	if(a[i][0]>=now) {
	        		now=a[i][1];
	        		ans++;
	        	}
	        }
	        
	        System.out.println(ans);
		 }
		 
	}