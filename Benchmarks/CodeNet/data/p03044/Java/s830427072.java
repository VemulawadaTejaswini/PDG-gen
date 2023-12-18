import java.util.*;
import java.util.Map.Entry;

 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] u = new int[N];
        int[] v = new int[N];
        int[] w = new int[N];
        long[] weight = new long[N];
		ArrayList<HashMap<Integer, Integer>> adj = new ArrayList<HashMap<Integer, Integer>>();
		for(int i = 0; i < N; i++) { adj.add(new HashMap<Integer, Integer>()); }
		for(int i=0;i<N-1;i++) {
            u[i] = sc.nextInt()-1;        	
            v[i] = sc.nextInt()-1;        	
            w[i] = sc.nextInt()%2;
            adj.get(u[i]).put(v[i],w[i]);
            adj.get(v[i]).put(u[i],w[i]);
        }
        
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		queue.add(-1);
		queue.add(0);
		int[] answers = new int[N];
		while(!queue.isEmpty()) {
			int node = queue.poll();
			int parent = queue.poll();
			int value = queue.poll();
		
			answers[node] = value;
			for(Entry<Integer, Integer> entry : adj.get(node).entrySet()) {
				int next_node = entry.getKey();
				int next_w = entry.getValue();
				
				if(next_node == parent) { continue; }
				queue.add(next_node); queue.add(node); queue.add((value+next_w)%2);
			}
		}
		
		for(int i=0;i<N;i++) {
	        System.out.println(answers[i]);			
		}
    }
}