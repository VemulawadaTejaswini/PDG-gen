import java.util.List;
import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    int V,E,r;
    List<ArrayList<Edge>> G;
    long[] ans;
 
    private class Edge{
        int n,c;
        public Edge(int n,int c){
            this.n = n;
            this.c = c;
        }
    }
 
    private class Com implements Comparable<Com>{
        int n;
        long c;
        public Com(int n,long c){
            this.n = n;
            this.c = c;
        }
 
        public int compareTo(Com d){
            if(this.c - d.c < 0){
                return -1;
            }else if(this.c - d.c > 0){
                return 1;
            }else{
                return 0;
            }
        }
    }
 
    public void dijkstra(int s){
        boolean[] used = new boolean[V];
 
        PriorityQueue<Com> pq = new PriorityQueue<Com>();
        pq.add(new Com(r,0));
        while(pq.size() > 0){
        	Com d = pq.poll();
 
            used[d.n] = true;
            ans[d.n] = Math.min(ans[d.n],d.c);
 
            for(Edge i : G.get(d.n)){
                if(used[i.n])continue;
                pq.add(new Com(i.n,d.c + i.c));
            }
        }
    }
    public static void main(String[] args) throws IOException {
    	Main m = new Main();
    	int r = m.init();
        m.dijkstra(r);
        m.display();
    }
    public void display(){
    	 for(int i = 0;i < V;i++){
             if(ans[i] == Long.MAX_VALUE)
             	System.out.println("INF");
             else 
             	System.out.println(ans[i]);
         }
    }
    public int init() throws IOException{
    	BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String str = BR.readLine();
		String [] arr = str.split("\\s+");
		V = Integer.parseInt(arr[0]);
		E = Integer.parseInt(arr[1]);
		r = Integer.parseInt(arr[2]);
		G = new ArrayList<ArrayList<Edge>>();
		ans = new long[V];
		for(int i = 0;i < V;i++){
            G.add(new ArrayList<Edge>());
        }
 
        for(int i = 0;i < V;i++){
            ans[i] = Long.MAX_VALUE;
        }
        for(int i = 0;i < E;i++){
            String tempstr = BR.readLine();
			String [] temparr = tempstr.split("\\s+");
            G.get(Integer.parseInt(temparr[0])).add(new Edge(Integer.parseInt(temparr[1]),Integer.parseInt(temparr[2])));
        }
        return r;
    }
    
}