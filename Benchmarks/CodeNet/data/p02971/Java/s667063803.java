import java.util.*;

public class Main {
	Scanner sc;
	int N;
	int[] A;
	
	int max;
	int maxIndex; // if dual max, -1
	
//=============
// constructor
//
	public Main() {
		sc = new Scanner(System.in);
	}
	
//==================
// instance methods
//
	void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	int maxExcept(int index) {
		int max = -1;
		for (int i = 0; i < N; i++) {
			if (i == index) continue;
			if (max < A[i]) max = A[i];
		}
		return max;
	}
	
	public void exec() throws Exception {
		N = sc.nextInt();
		A = new int[N]; // 0, 1, ... (N-1)
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int[] copy = Arrays.copyOf(A, N);
		Arrays.sort(copy);
		max = copy[N-1];
		
		int maxcnt = 0;
		maxIndex = -1;
		for (int i = 0; i < N; i++) {
			if (A[i] == max) {
				maxcnt++;
				maxIndex = i;
			}
		}
		if (maxcnt > 1) maxIndex = -1;
		
		for (int i = 0; i < N; i++) {
			if (i == maxIndex) out(copy[N-2]);
			else out(max);
		}
	}
	
//======
// main
//
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.exec();
	}

}