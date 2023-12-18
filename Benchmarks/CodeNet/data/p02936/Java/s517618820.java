import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int i=0; i<n-1; i++) {
		    int a = Integer.parseInt(sc.next());
		    int b = Integer.parseInt(sc.next());
		    if(map.containsKey(a)) { map.get(a).add(b);}
		    else {
		        map.put(a, new ArrayList<Integer>()); 
		        map.get(a).add(b);
		    }
		}
		
		long[] count = new long[n+1];
		for(int i=0; i<q; i++) {
		    int p = Integer.parseInt(sc.next());
		    int x = Integer.parseInt(sc.next());
		    count[p] += x;
		}
		
		Deque<Integer> que = new ArrayDeque<>();
		que.add(1);
		
		while(que.size() != 0) {
		    int a = que.poll();
		    if(map.containsKey(a)) {
    		    for(int x : map.get(a)) {
    		        que.add(x);
    		        count[x] += count[a];
    		    }
		    }
		}
		
		for(int i=1; i<=n; i++) {
		    System.out.print(count[i]+" ");
		}
		System.out.println();
	}
	
	
}