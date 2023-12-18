import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		String A[] = new String[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.next();
		}
		String B[] = new String[N];
		for(int i = 0; i < M; i++) {
			B[i] = sc.next();
		}
		
		boolean flag = false;
		int h = 0;
		int w = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(B[h].substring(w, w + 1).equals(A[i].substring(j, j + 1))) {
					w++;
					if(w >= M) {
						w = 0;
						h++;
						if(h >= M) {
							System.out.println("Yes");
							return;
						}
					}
				}
			}
		}
		System.out.println("No");
	}
}
