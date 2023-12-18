import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
     static int[] weight;
     static int N;
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(long i=0;i<N*N;i++)list.add(new ArrayList<Integer>());
        int[] first = new int[N];
        
        weight= new int[N*N];
        for(int i=0;i<N;i++) {
            int pre=0;
        	for(int j=0;j<N-1;j++){
        		int a=sc.nextInt();
        		int tmp=Math.min(a, i+1)*N+Math.max(a, i+1)-1;
        		if(pre!=0) {
                	list.get(pre).add(tmp);
        		} else {
        			first[i]=tmp;
        		}
        		pre=tmp;
        	}
        }
        
        for(int i=0;i<first.length;i++) {
//        	if(list.get(first[i]).isEmpty()) {
        		if(weight[first[i]]==0) {
        			dfs(first[i],1);
        		}
//        	}
        }
        
        int max=0;
        for(int i=0;i<N*N;i++) {
        	max=Math.max(max,weight[i]);
        }
        if(max==N*N)max=-1;
        System.out.println(max);  	

               		
    }

    	static void dfs(int now, int cnt) {
    		if(cnt>N*N)return;
			if(cnt>weight[now]) {
				weight[now]=cnt;
			} else {
				//cnt = weight[now];
				return;
			}
    		for(int i=0;i<list.get(now).size();i++) {
    			int next = list.get(now).get(i);
    			dfs(next, cnt+1);
    		}
    		return;
    	}
}