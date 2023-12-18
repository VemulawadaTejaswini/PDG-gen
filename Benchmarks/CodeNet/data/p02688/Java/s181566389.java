	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        int K = sc.nextInt();
	        boolean[] m = new boolean[N];
	        for(int i=0;i<K;i++) {
	        	int d = sc.nextInt();
	        	for(int j=0;j<d;j++) {
	        		m[sc.nextInt()-1]=true;
	        	}
	        }
	        
	        long ans=0;
	        for(int i=0;i<N;i++) {
	        	if(m[i]==false)ans++;
	        }
	        System.out.println(ans);
	        
	    }
	}
