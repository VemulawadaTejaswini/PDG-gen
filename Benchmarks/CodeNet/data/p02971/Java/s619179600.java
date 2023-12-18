import java.util.*;

public class Main {
	Scanner sc;
	int N;
	int[] A;
	
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
		
		for (int i = 0; i < N; i++) {
			out(maxExcept(i));
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