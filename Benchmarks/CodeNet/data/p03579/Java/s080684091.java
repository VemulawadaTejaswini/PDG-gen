import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer>[] a = new ArrayList[n];
		for(int i=0; i<n; i++){
			a[i] = new ArrayList<Integer>();	
		}
		for(int i=0; i<m; i++){
			int ta = sc.nextInt() - 1;
			int tb = sc.nextInt() - 1;
			a[ta].add(tb);
			a[tb].add(ta);
		}
		sc.close();
		
		int nume = 1, numo = 0;
		boolean[] use = new boolean[n];
		boolean[] odd = new boolean[n];
		boolean[] even = new boolean[n];
		ArrayDeque<Integer[]> que = new ArrayDeque<Integer[]>();
		que.add(new Integer[]{0, 0});
		even[0] = true;
		while(!que.isEmpty()){
			Integer[] cur = que.poll();
			for(int i=0; i<a[cur[0]].size(); i++){
				Integer next = a[cur[0]].get(i);
				if(cur[1] == 0 && !odd[next]){
					que.add(new Integer[]{next, 1});
					numo++;
					odd[next] = true;
				}else if(cur[1] == 1 && !even[next]){
					que.add(new Integer[]{next, 0});
					nume++;
					even[next] = true;
				}
			}
		}

		boolean loop = false;
		for(int i=0; i<n; i++){
			if(odd[i] && even[i]) loop = true;
		}
		if(loop){
			System.out.println((long)(n-1)*(long)n/2 - m);
		}else{
			long ans = 0;			
			for(int i=0; i<n; i++){
				if(odd[i]){
					ans += nume - a[i].size();
				}else{
					ans += numo - a[i].size();
				}
			}
			System.out.println(ans / 2);
		}
	}
}
