	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
	//	 static int mod =  (int) (Math.pow(10,9)+7);
		 static int mod =  2019;
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        long N = sc.nextLong();
	        for(long i=0;i<N;i++)list.add(new ArrayList<Integer>());
	        long M = sc.nextLong();
	        int[] a = new int[(int) M];
	        int[] b = new int[(int) M];
	        for(int i=0;i<M;i++) {
	        	a[i]=sc.nextInt()-1;
	        	b[i]=sc.nextInt()-1;
	        	list.get(a[i]).add(b[i]);
	        	list.get(b[i]).add(a[i]);
	        }
	        long ans=0;
	        for(int i=0;i<M;i++){
		        boolean[] visited = new boolean[(int)N];
				LinkedList<Integer> q= new LinkedList<Integer>();
				q.add(0);
				q.add(-1);
				visited[0]=true;
		        while(!q.isEmpty()) {
		        	int now=q.poll();
		        	int parent=q.poll();
		    		for(int j=0;j<list.get(now).size();j++) {
		    			int next = list.get(now).get(j);
		    			if(next == parent)continue;
		    			if(next == a[i] && now == b[i])continue;	
		    			if(next == b[i] && now == a[i])continue;
		    			if(visited[next]==true)continue;
		    			visited[next]=true;
		    			q.add(next);
		    			q.add(now);
		    		}
		        }
	        	
	        	for(int j=0;j<N;j++) {
	        		if(visited[j]==false) {
	        			ans++;
	        			break;
	        		}
	        	}
	        }
	        
	    	System.out.println(ans);
	    	
	        		
	    }
	    

	}