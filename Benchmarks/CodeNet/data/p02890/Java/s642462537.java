import java.util.*;

class Main {
	Scanner sc;
	int N;
	int[] A, C, D, skD, sD;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		C = new int[N+1];
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			C[a]++;
		}
		D = new int[N+1];
		for (int i = 0; i <= N; i++) D[C[i]]++;
		
		sD = new int[N+1];
		skD = new int[N+1];
		
		sD[0] = D[0]; skD[0] = 0;
		for (int i = 1; i <= N; i++) {
			sD[i] = sD[i-1] + D[i];
			skD[i] = skD[i-1] + i*D[i];
		}
		int K = 1;
		int lastK = -1;
		for (int X = N; X > 0; X--) {
			int f = f(X);
			if (f != lastK) {
				for (; K <= f; K++) System.out.println(X);
				lastK = f;
			}
		}
		for (; K <= N; K++) System.out.println(0);
	}
	
	private int f(int X) {
		return (skD[X]+sD[N]-sD[X])/X;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
