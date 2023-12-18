import java.util.*;
public class Main {
	static int N;
	static int M;
	static int a[];
	static int b[];
	static long c[];
	static long v[];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		a = new int[M];
		b = new int[M];
		c = new long[M];
		v = new long[N];
		Arrays.fill(v, Long.MAX_VALUE / 4 * 3);
		v[0] = 0;
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			c[i] = sc.nextLong() * -1;
		}
		if(Bellmanford()) {
			System.out.println(-1 * v[N - 1]);
		} else {
			System.out.println("inf");
		}
	}
	
	public static boolean Bellmanford() {
		long pre = 0;
		for(int k = 0; k <= 2 * N; k++) {
			boolean flag = false;
			for(int i = 0; i < M; i++) {
				if(v[a[i]] + c[i] < v[b[i]]) {
					if(k == N - 2) {
						pre = v[N - 1];
					}
					if(k == 2 * N && v[N - 1] < pre) {
						return false;
					} else if(k == 2 * N){
						return true;
					}
					flag = true;
					v[b[i]] = v[a[i]] + c[i];
				}
			}
			if(!flag) {
				break;
			}
		}
		return true;
	}
}
