import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	
	List<Integer>[] link;
	boolean[] used;
	int H[];
	void doIt() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		used = new boolean[N];
		Arrays.fill(used, false);
		link = new ArrayList[N];
		for(int i = 0; i < N; i++) {
			link[i] = new ArrayList<>();
		}
		H = new int[N];
		for(int i = 0; i < N; i++) H[i] = sc.nextInt();
		for(int i = 0; i < M; i++) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			link[A].add(B);
			link[B].add(A);
		}
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			if(!used[i]) {
				cnt += search(i);
			}
		}
		System.out.println(cnt);
	}
	
	int search(int cur) {
		if(used[cur]) return 0;
		used[cur] = true;
		int ans = 1;
		for(int i : link[cur]) {
			if(H[i] > H[cur]) {
				ans = 0;
			}
			else {
				search(i);
				
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
