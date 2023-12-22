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
	        for(long i=0;i<N;i++)list.add(new ArrayList<Integer>());
	        long[][] a = new long[M][2];
	        for(long i=0;i<M;i++) {
	        	int ai = sc.nextInt()-1;
	        	int bi = sc.nextInt()-1;
	        	list.get(ai).add(bi);
	        	list.get(bi).add(ai);
	        }
	        long ans = 0;
	        boolean[] visited = new boolean[N];
			LinkedList<Integer> q= new LinkedList<Integer>();
			for(int i=0;i<N;i++) {
				if(visited[i]==true)continue;
				int cnt =1;
	        	visited[i]=true;
				q.add(i);
				q.add(-1);
				while(!q.isEmpty()) {
			    	int now=q.poll();
			        int parent=q.poll();
			    	for(int j=0;j<list.get(now).size();j++) {
			    		int next = list.get(now).get(j);
			    		if(next == parent)continue;			    		
			    		if(visited[next]==true)continue;
			    		visited[next]=true;
			    		cnt++;
			    		q.add(next);
			    		q.add(now);
			    	}
		    		
				}
				ans=Math.max(ans,cnt);
	        	
	        }
	        
	        System.out.println(ans);
		 }
		 
	}