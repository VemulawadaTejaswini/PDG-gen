import java.util.*;

 class Main {
	static List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	static int t_dist[], a_dist[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long u = sc.nextLong()-1;
        long v = sc.nextLong()-1;
        
        int ai;
        int bi;
        int ans=1;
        
        for(long i=0;i<=N;i++)list.add(new ArrayList<Integer>());
        for(long i=0;i<N-1;i++) {
        	ai = sc.nextInt()-1;
        	bi = sc.nextInt()-1;
        	list.get(ai).add(bi);
        	list.get(bi).add(ai);
        }
        
        t_dist = new int[(int)N+1];
        a_dist = new int[(int)N+1];
        
        adfs((int)u,0,-1);
        adfs((int)v,0,-1);
        
        for(int i=0;i<=N;i++) {
        	if(t_dist[i]<a_dist[i]) {
        		if(ans<a_dist[i]) {
        			ans=a_dist[i];
        		}
        	}	
        }
 
        System.out.println(ans-1);	
        
        
    }
    
	static void adfs(int now, int cnt, int parent) {
		a_dist[now]=cnt;
		for(int i=0;i<list.get(now).size();i++) {
			int next = list.get(now).get(i);
			if(next == parent)continue;
			adfs(next, cnt+1, now);
		}
	}
    
	static void tdfs(int now, int cnt, int parent) {
		t_dist[now]=cnt;
		for(int i=0;i<list.get(now).size();i++) {
			int next = list.get(now).get(i);
			if(next == parent)continue;
			tdfs(next, cnt+1, now);
		}
	}

}