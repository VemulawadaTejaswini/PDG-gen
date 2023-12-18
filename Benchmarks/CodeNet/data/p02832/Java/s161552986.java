import java.util.*;

class Main {
	Scanner sc;
	
	private void calc() {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) A[i] = sc.nextInt();
		
		int i = 1;
		for (int j = 0; j < N; j++) {
			if (A[j] == i) i++;
		}
		if (i == 1) System.out.println(-1);
		else System.out.println(N-i+1);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}