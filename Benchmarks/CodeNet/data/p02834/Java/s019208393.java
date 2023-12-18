import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	long LEN = (long) 1e18;
	
	List<Integer>[] link;
	int[] unum, vnum;
	int diff = -1;
	
	void doIt() {
		int n = sc.nextInt();
		int u = sc.nextInt() - 1;
		int v = sc.nextInt() - 1;
		int goal = -1, dem = -1;
		link = new List[n];
		for(int i = 0; i < n; i++) {
			link[i] = new ArrayList<>();
		}
		unum = new int[n];
		vnum = new int[n];
		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1; 
			int b = sc.nextInt() - 1;
			link[a].add(b);
			link[b].add(a);
		}
		udfs(u, u, 0, v);
		vdfs(v, v, 0);
		int max = 0;
		for(int i = 0; i < n; i++) {
			max = Math.max(max, Math.min(unum[i], vnum[i]));
		}
		if(diff % 2 == 0)max--;
		System.out.println(max);
	}
	
	void udfs(int par, int cur, int num, int v) {
		if(cur == v) {
			diff = num;
			return;
		}
		unum[cur] = num;
		for(int i : link[cur]) {
			if(i == par)continue;
			udfs(cur, i, num + 1, v);
		}
		return;
	}
	
	void vdfs(int par, int cur, int num) {
		vnum[cur] = num;
		for(int i : link[cur]) {
			if(i == par)continue;
			vdfs(cur, i, num + 1);
		}
		return;
	}
	

	long gcd(long a, long b) {
		return (b != 0) ? gcd(b, a % b) : a;
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
	
}
