import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] H = new int[N];
		for (int i = 0; i < H.length; i++) {
			H[i] = sc.nextInt();
		}
		Map<Integer, List<Integer>> conn = new HashMap<>();
		for (int i = 0; i < M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (conn.get(A) == null) {
				List<Integer> list = new ArrayList<>();
				list.add(B);
				conn.put(A, list);
			} else {
				conn.get(A).add(B);
			}
			if (conn.get(B) == null) {
				List<Integer> list = new ArrayList<>();
				list.add(A);
				conn.put(B, list);
			} else {
				conn.get(B).add(A);
			}
		}
		int res = 0;
		loop: for (int i = 0; i < N; i++) {
			if (conn.get(H[i]) == null) {
				res++;
				continue;
			}
			for (Integer integer : conn.get(H[i])) {
				if (H[i] < integer) {
					continue loop;
				}
			}
			res++;
		}
		System.out.println(res);
	}
}
