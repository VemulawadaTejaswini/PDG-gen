import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		Map<Integer, Integer> m = new HashMap<>();
		for(int i = 0; i < N-1; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			m.put(b, a);
		}
		int[] ans = new int[N];
		for(int i = 0; i < Q; i++) {
			int p = sc.nextInt()-1;
			int x = sc.nextInt();
			ans[p] += x;
		}
		for(int i = N-1; i >= 0; i--) {
			int r = i;
			while(m.get(r) != null) {
				r = m.get(r);
				ans[i] += ans[r];
			}
		}
		for(int i = 0; i < N; i++)
			System.out.print(ans[i] + " ");
		System.out.println();

	}

}