import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] H = new int[N];
		Arrays.setAll(H, i -> sc.nextInt());
		Map<Integer, HashSet<Integer>> edge = new HashMap<>();
		for(int i = 1; i <= N; i++)
		        edge.put(i,  new HashSet<>());
		for (int i = 1; i <= M; i++) {
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        edge.get(a).add(b);
		        edge.get(b).add(a);
		}
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			boolean ok = true;
			for(int j : edge.get(i)) {
				if(H[j-1] >= H[i-1]) {
					ok = false;
					break;
				}
			}
			if(ok)
				ans++;
		}
		System.out.println(ans);
	}

}