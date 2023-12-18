import java.util.*;

class Main {
	Scanner sc;
	int N, X, Y;
	void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		X = sc.nextInt();
		Y = sc.nextInt();
		for (int K = 1; K < N; K++) {
			solve(K);
		}
	}
	
	private void solve(int K) {
		int c = 0;
		for (int a = 1; a <= N; a++) c += sub(K, a);
		System.out.println(c);
	}
	
	private int sub(int K, int a) {
		int c = 0;
		if (a <= X) {
			if (a+K <= X) {
				c++;
			} else {
				if (Y-(K+a-X-1) > K+a) {
					c+=2;
				} else if (Y-(K+a-X-1) == K+a) {
					c++;
				} else {
				}
				if (K+a-X-1 > 0 && Y+(K+a-X-1) <= N) c++;
			}
		} else if (a < Y) {
			if (a-X >= K) {
				if (a+K <= N) c++;
			} else {
				if (Y-(K-a+X-1) > K+a) {
					c+=2;
				} else if (Y-(K-a+X-1) == K+a) {
					c++;
				} else {
				}
				if (a+K < Y+(K-a+X-1) ) {
					if ((K-a+X-1) > 0 && Y+(K-a+X-1) <= N) c++;
				} else {
					if (a+K > Y && a+K <= N) c++;
				}
			}
		} else {
			if (a+K <= N) c++;
		}
		return c;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
