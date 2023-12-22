import java.util.*;
public class Main {

	static int N, M, Q;
	static List<Integer> A = new ArrayList<>();
	static int[] a, b, c, d;
	static int ans = 0;
	
	static void dfs(List<Integer> A) {
		if(A.size() == N) {
			int temp = 0;
			for(int i = 0; i < Q; i++) {
				if(A.get(b[i]-1)-A.get(a[i]-1) == c[i])
					temp += d[i];
			}
			ans = Math.max(ans, temp);
			return;
		}
		int x = A.get(A.size()-1);
		for(int i = x; i <= M; i++){
			A.add(i);
			dfs(A);
			A.remove(A.size()-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		Q = sc.nextInt();
		a = new int[Q];
		b = new int[Q];
		c = new int[Q];
		d = new int[Q];
		for(int i = 0; i < Q; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		A.add(1);
		dfs(A);
		System.out.println(ans);
	}

}
