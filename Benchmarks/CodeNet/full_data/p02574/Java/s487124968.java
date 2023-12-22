import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		Map<Integer, Integer> m = new HashMap<>();
		for(int i = 0; i < N; i++) {
			for(int j = 2; j <= Math.sqrt(A[i]); j++)
				if(A[i] % j == 0) {
					while(A[i] % j == 0)
						A[i] /= j;
					m.put(j, m.getOrDefault(j, 0)+1);
				}
			if(A[i] > 1)
				m.put(A[i], m.getOrDefault(A[i], 0)+1);
		}
		int ans = 0;
		for(int k : m.values()) {
			if(k > 1)
				ans = 1;
			if (k == N) {
				ans = 2;
				break;
			}
		}
		if (ans == 0)
			System.out.println("pairwise coprime");
		else if (ans == 1)
			System.out.println("setwise coprime");
		else
			System.out.println("not coprime");
	}

}