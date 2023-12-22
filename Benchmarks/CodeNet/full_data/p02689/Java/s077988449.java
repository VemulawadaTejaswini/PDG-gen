import java.util.*;
public class Main {// Main
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n+1];
		HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			h[i+1] = sc.nextInt();
			map.put(i+1, new HashSet<>());
		}
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			map.get(x).add(y);
			map.get(y).add(x);
		}
		
		int ans = 0 ;
		for(int i = 1 ; i <= n; i++ ) {
			boolean ch  =true;
			for(int key : map.get(i)) {
				if(h[key] >= h[i]) {
					ch = false;
				}
			}
			if(ch)
				ans++;
		}
		System.out.println(ans);       
}
}
