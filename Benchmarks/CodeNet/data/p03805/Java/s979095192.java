import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		ABC054CSolve solve = new ABC054CSolve();
		solve.main();
	}
}

class ABC054CSolve {
	
	int N;
	int M;
	int[][] adj;
	
	int[] p;
	int count = 0;
	
	ABC054CSolve() {
		Scanner cin = new Scanner(System.in);
		this.N = cin.nextInt();
		this.M = cin.nextInt();
		this.adj = new int[N][N];
		for (int i = 0; i < M; i++) {
			int a = cin.nextInt() - 1;
			int b = cin.nextInt() - 1;
			adj[a][b] = 1;
			adj[b][a] = 1;
		}
	}
	
	void main() {
		this.p = new int[N];
		for (int i = 0; i < N; i++) { p[i] = i; }
		dfs(0, (1 << N) - 1);
		System.out.println(count);
	}
	
	void dfs(int pos, int mask) {
		if (pos == N) {
			if (isExistPath()) {
				count++;
			}
			return;
		} 
		for (int i = 0; i < N; i++) {
			if ((mask & 1 << i) >> i == 1) {
				p[pos] = i;
				dfs(pos + 1, (mask ^ (1 << i)));
			}
		}
	}
	
	boolean isExistPath() {
		if (p[0] != 0) return false;
		int curr = p[0];
		for (int i = 1; i < N; i++) {
			int next = p[i];
			if (adj[curr][next] != 1) {
				return false;
			}
			curr = next;
		}
		return true;
	}
}
