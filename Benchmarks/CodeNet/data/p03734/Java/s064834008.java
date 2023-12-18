import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		
		int base = sc.nextInt();
		ArrayList<ArrayList<Integer>> value = new ArrayList<>();
		for(int i=0; i<4; i++)
			value.add(new ArrayList<>());
		value.get(0).add(sc.nextInt());
		for(int i=1; i<N; i++) {
			int w = sc.nextInt();
			value.get(w-base).add(sc.nextInt());
		}
		for(int i=0; i<4; i++)
			Collections.sort(value.get(i), Comparator.reverseOrder());
		
		long ans = 0;
		HashMap<Long, Integer> used = new HashMap<>();
		used.put(0l, 0);
		for(int i=0; i<4; i++) {
			HashMap<Long, Integer> next = new HashMap<>();
			Iterator<Long> it = used.keySet().iterator();
			while(it.hasNext()) {
				long w = it.next();
				int v = used.get(w);
				next.put(w, v);
				for(int vv : value.get(i)) {
					w += base+i;
					if(w>W)
						break;
					v += vv;
					next.put(w, v);
					ans = Math.max(ans, v);
				}
					
			}
			used = next;
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
