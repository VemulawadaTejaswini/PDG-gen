import java.util.*;

public class Main {
	Scanner sc;
	int N, T;
	
	int[][] nodes;
	int[] starts;
	int maxOrder = -1;

	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		T = N*(N-1)/2;
		nodes = new int[N*N][3];
		starts = new int[N];
		for (int i = 0; i < N; i++) {
			int last = -1;
			for (int j = 0; j < N-1; j++) {
				int a = i;
				int b = sc.nextInt()-1;
				if (a < b) { a = b; b = i; }
				int n = N*a + b;
				if (j == 0) starts[i] = n;
				if (last > -1) {
					if (nodes[last][0] == 0) nodes[last][0] = n;
					else nodes[last][1] = n;
				}
				last = n;
			}
		}
		
		try {
			for (int i = 0; i < N; i++) setOrder(starts[i], 1);
			System.out.println(maxOrder);
		} catch (RuntimeException loop) {
			System.out.println(-1);
		}
	}
	
	void setOrder(int n, int order) {
		if (nodes[n][2] >= order) return;
		if (order > T) throw new RuntimeException("loop");
		nodes[n][2] = order;
		if (order > maxOrder) maxOrder = order;
		int n1 = nodes[n][0];
		if (n1 > 0) setOrder(n1, order+1);
		int n2 = nodes[n][1];
		if (n2 > 0) setOrder(n2, order+1);
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}