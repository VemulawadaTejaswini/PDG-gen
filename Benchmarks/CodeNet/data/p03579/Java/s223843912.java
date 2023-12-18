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
		
		int nume = 0, numo = 0;
		boolean[] use = new boolean[n];
		boolean[] odd = new boolean[n];
		boolean[] even = new boolean[n];
		ArrayDeque<Integer[]> que = new ArrayDeque<Integer[]>();
		que.add(new Integer[]{0, 0});
		while(!que.isEmpty()){
			Integer[] cur = que.poll();
			use[cur[0]] = true;
			if(cur[1] == 0){
				numo++;
				odd[cur[0]] = true;
			}else{
				nume++;
				even[cur[0]] = true;
			}
			for(int i=0; i<a[cur[0]].size(); i++){
				Integer next = a[cur[0]].get(i);
				if(cur[1] == 0 && !even[next]){
					que.add(new Integer[]{next, 1});
				}else if(cur[1] == 1 && !odd[next]){
					que.add(new Integer[]{next, 0});
				}
			}
		}

		if(odd[0] && even[0]){
			System.out.println((long)(n-1)*(long)n/2 - m);
		}else{
			long ans = 0;			
			for(int i=0; i<n; i++){
				if(odd[i]){
					ans += numo - a[i].size();
				}else{
					ans += nume - a[i].size();
				}
			}
			System.out.println(ans / 2);
		}
	}
}
