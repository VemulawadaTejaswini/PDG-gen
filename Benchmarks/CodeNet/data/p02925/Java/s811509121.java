import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
     static int N;
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(long i=0;i<N*N;i++)list.add(new ArrayList<Integer>());
        int[] first = new int[N];
        
        int[] weight= new int[N*N];
        boolean[] firstbaket=new boolean[N*N];
        for(int i=0;i<N;i++) {
            int pre=0;
        	for(int j=0;j<N-1;j++){
        		int a=sc.nextInt();
        		int tmp=Math.min(a, i+1)*N+Math.max(a, i+1)-1;
        		if(pre!=0) {
                	list.get(pre).add(tmp);
                	firstbaket[tmp]=true; 
        		} else {
        			first[i]=tmp;
        		}
        		pre=tmp;
        	}
        }
        
        boolean[] visited=new boolean[N*N];
        boolean[] culced=new boolean[N*N];
        for(int i=0;i<first.length;i++) {
//        	if(list.get(first[i]).isEmpty()) {
        		if(weight[first[i]]==0&&firstbaket[first[i]]==false) {
        			if(!dfs(first[i],1,visited,culced,weight)) {
        				System.out.println(-1);
        				return;
        			}
        		}
//        	}
        }
 
/*		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int i=0;i<first.length;i++) {
        	if(list.get(first[i]).isEmpty()) {
 //       		if(weight[first[i]]==0) {
        	queue.add(first[i]);
        	queue.add(1);
//        		}
//        	}
        }
    	while(!queue.isEmpty()) {
    		int n = queue.poll();
    		int w = queue.poll();
			if(w>weight[n]) {
				weight[n]=w;
			} else {
				continue;
			}
    		if(w==N*N/2)break;
    		for(int i=0;i<list.get(n).size();i++) {
    			queue.add(list.get(n).get(i));
    			queue.add(w+1);
    		}
    	}*/
        
        int max=0;
        for(int i=0;i<N*N;i++) {
        	max=Math.max(max,weight[i]);
        }
        if(max==0)max=-1;
        System.out.println(max);  	
 
               		
    }
 
    	static boolean dfs(int now, int cnt,boolean[] visited,boolean[] culced ,int[] weight ) {
    		if(visited[now]==true&&culced[now]==false) {
    			return false;
    		}
    		visited[now]=true;
			if(cnt>weight[now]) {
				weight[now]=cnt;
			} else {
				return true;
			}
    		for(int i:list.get(now)) {
    			if(!dfs(i, cnt+1, visited, culced, weight))return false;
    		}
    		culced[now]=true;
    		return true;
    	}
}