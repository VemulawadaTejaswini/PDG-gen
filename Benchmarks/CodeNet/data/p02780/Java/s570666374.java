import java.util.*;

class Main {
	Scanner sc;
	int K, N;
	int[] p;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		p = new int[N];
		long s = 0;
		int size = 0;
		long max = -1;
		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
			s += p[i];
			size++;
			if (size > K) {
				s -= p[i-K];
				size--;
			}
			max = Math.max(max, s);
		}
		System.out.println( ((double)max+K)/2 );
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
