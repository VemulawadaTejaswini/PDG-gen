	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();	
	        int M = sc.nextInt();	
	        int Q = sc.nextInt();	
	        long[] a = new long[Q];
	        long[] b = new long[Q];
	        long[] c = new long[Q];
	        long[] d = new long[Q];
	        for (int i=0 ; i<Q; i++) {
	            a[i] = Long.parseLong(sc.next());
	            b[i] = Long.parseLong(sc.next());
	            c[i] = Long.parseLong(sc.next());
	            d[i] = Long.parseLong(sc.next());
	        }	        
	        long ans=0;
	        LinkedList<Integer[]> q= new LinkedList<Integer[]>();
	        Integer[] t = new Integer[N];
	        for(int i=0;i<N;i++)t[i]=1;
	        		
	        q.add(t);
	        while(!q.isEmpty()){
	        	Integer[] node = q.poll();
	        	long cnt=0;
	        	for(int i=0;i<Q;i++) {
        			if(node[(int)b[i]-1]-node[(int)a[i]-1]==c[i]) {
        				cnt=cnt+d[i];
        			}
	        	}
	        	ans=Math.max(ans, cnt);
	        	if(node[N-1]==M) {
	        		for(int i=N-1;i>=0;i--) {
	        			if(node[i]!=M) {
	        				node[i]++;
	        				int tmp=node[i];
	        				for(int j=i+1;j<N;j++) {
	        					node[j]=tmp;
	        				}
	        				q.add(node);
	        				break;
	        			}
	        		}
	        	} else {
	        		node[N-1]++;
	        		q.add(node);
	        	}
	        }
	        
	    	System.out.println(ans);
	    	
	        		
	    }
	    

	}