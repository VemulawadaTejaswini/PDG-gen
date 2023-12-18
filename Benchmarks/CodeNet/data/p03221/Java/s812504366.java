import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Map<Integer, int[]> id = new TreeMap<>();
		
		for(int i = 0; i < M; i++) {
			int[] a = new int[2];
			a[0] = sc.nextInt();
			a[1] = i;
			int b = sc.nextInt();
			id.put(b, a);
		}
		
		String[] ans = new String[M];
		int[] num = new int[N + 1];
		
		for(int[] c : id.values()) {
			num[c[0]]++;
			ans[c[1]] = String.format("%06d%06d", c[0], num[c[0]]);
			
		}
		for(int i = 0; i < M; i++) {
			System.out.println(ans[i]);
		}
	}
}

