import java.util.*;
import java.util.stream.*;

class Main {
	Scanner sc;
	int N;
	int[] L;
	
	Main() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		int N = sc.nextInt();
		L = new int[N];
		for (int i = 0; i < N; i++) L[i] = 2 * sc.nextInt();
		Arrays.sort(L);
		
		int cnt = 0;
		for (int i = 0; i < N-2; i++) {
			int a = L[i];
			for (int j = i+1; j < N-1; j++) {
				int b = L[j]; // b >= a
				
				// acceptable c .. b-a<c<b+a
				int li = Arrays.binarySearch(L, b-a+1);
				int ll = Math.max(j+1, -1-li);
				int ui = Arrays.binarySearch(L, b+a-1);
				int ul = Math.min(N, -1-ui);
				cnt += Math.max(0, ul-ll);
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}