import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<List<Integer>> g = new ArrayList();

        for (int i=0; i<N; i++) {
        	g.add(new ArrayList());
        }

        for (int i=0; i<M; i++) {
        	st  = new StringTokenizer(br.readLine());

	        int A = Integer.parseInt(st.nextToken())-1;
	        int B = Integer.parseInt(st.nextToken())-1;

	        g.get(A).add(B);
	        g.get(B).add(A);
        }
        
        HashSet<Integer> vis = new HashSet();

        Queue<Integer> q = new LinkedList();
        q.offer(0);
        int[] signPost = new int[N];
        signPost[0]=1;
        vis.add(0);
        while(!q.isEmpty()){
        	int cur = q.poll();
        	for (int neigh: g.get(cur)) {
        		if(!vis.contains(neigh)){
        			vis.add(neigh);
        			q.offer(neigh);
        			signPost[neigh]=cur+1;
        		}
        	}
        }
        if (vis.size()<N) {
        	System.out.println("No");
        }
        else{
        	System.out.println("Yes");
        	for (int i=1; i<N; i++) {
        		System.out.println(signPost[i]);
        	}
        }

    }

}