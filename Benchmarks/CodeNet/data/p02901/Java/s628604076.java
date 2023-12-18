import java.util.*;

class Main {
	Scanner sc;
	int N, M;
	int[] a;
	int[] k;
	
	int[] min;
	int n;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		M = sc.nextInt();
		a = new int[M];
		k = new int[M];
		
		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			int b = sc.nextInt();
			for (int j = 0; j < b; j++) k[i] |= (1<<(sc.nextInt()-1));
		}
		n = 1<<N;
		min = new int[n];
		for (int i = 1; i < n; i++) min[i] = Integer.MAX_VALUE/2;
		
		for (int i = 0; i < M; i++)
			for (int j = 0; j < n; j++)
				min[j|k[i]] = Math.min(min[j|k[i]], min[j]+a[i]);
		
		if (min[n-1] >= Integer.MAX_VALUE/2) System.out.println(-1);
		else System.out.println(min[n-1]);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
