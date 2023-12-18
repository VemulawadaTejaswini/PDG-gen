import java.util.*;

public class Main {
	Scanner sc;
	int N, T;
	
	int[][] nodes;
	int maxOrder = -1;

	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		T = N*(N-1)/2;
		nodes = new int[N*N][3];
		for (int i = 0; i < N; i++) {
			int last = -1;
			for (int j = 0; j < N-1; j++) {
				int a = i;
				int b = sc.nextInt()-1;
				if (a < b) { a = b; b = i; }
				
				int n = N*a + b;
				if (j == 0) nodes[n][2] = 1;
				
				if (last > -1) {
					if (nodes[last][0] == 0) nodes[last][0] = n;
					else nodes[last][1] = n;
				}
				last = n;
			}
		}
		
		boolean updated = false;
		for (int i = 0; i < T; i++) {
			updated = false;
			for (int a = 1; a < N; a++) {
				for (int b = 0; b < a; b++) {
					int n = N*a + b;
					for (int k = 0; k < 2; k++) {
						int next = nodes[n][k];
						if (next > 0 && nodes[n][2] >= nodes[next][2]) {
							nodes[next][2] = nodes[n][2]+1;
							updated = true;
							if (nodes[next][2] > maxOrder) maxOrder = nodes[next][2];
						}
					}
				}
			}
			if (!updated) break;
		}
		if (updated) System.out.println(-1);
		else System.out.println(maxOrder);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}

}