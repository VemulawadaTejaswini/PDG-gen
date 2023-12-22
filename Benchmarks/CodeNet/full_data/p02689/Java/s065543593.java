	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        int M = sc.nextInt();
	        long[] H = new long[N];
	        for(int i=0;i<N;i++) {
	        	H[i] = Long.parseLong(sc.next());
	        }
	        for(long i=0;i<N;i++)list.add(new ArrayList<Integer>());
	        for(int i=0;i<M;i++) {
	        	int a=sc.nextInt()-1;
	        	int b=sc.nextInt()-1;
	        	list.get(a).add(b);
	        	list.get(b).add(a);
	        }
        	
        	
	        long ans=0;
	        for(int i=0;i<N;i++) {
	        	boolean highest=true;
	        	for(int k:list.get(i)) {
	        		if(H[k]>=H[i])highest=false;
	        	}
	        	if(highest==true)ans++;
	        }
	        System.out.println(ans);
	        
	    }
	}