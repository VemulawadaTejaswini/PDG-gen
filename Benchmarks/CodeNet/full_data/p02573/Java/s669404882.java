import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var N = sc.nextInt();
		var M = sc.nextInt();
		var A = new Integer[M];
		var B = new Integer[M];
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
		}
		Map<Integer, Integer> grpCnt = new HashMap<>();

		var grpid = 1;
		var belongs = new Integer[N];

		for (int i = 0; i < M; i++) {
			if ((belongs[A[i]] == null) && (belongs[B[i]] == null)) {
				belongs[A[i]] = grpid;
				belongs[B[i]] = grpid;
				grpCnt.put(grpid, 2);
				grpid++;
			} else {
				if (belongs[A[i]] == null || belongs[B[i]] == null) {
					if (belongs[A[i]] != null) {
						belongs[B[i]] = belongs[A[i]];
					} else {
						belongs[A[i]] = belongs[B[i]];
					}
					var cnt = grpCnt.get(belongs[A[i]]);
					grpCnt.put(belongs[A[i]], cnt + 1);
				} else if (belongs[A[i]] != belongs[B[i]]) {
					var livingId = Math.max(belongs[A[i]], belongs[B[i]]);
					var deathId = Math.min(belongs[A[i]], belongs[B[i]]);
					var deathCnt = grpCnt.get(deathId);
					var livingCnt = grpCnt.get(livingId);
					grpCnt.remove(deathId);
					grpCnt.put(livingId, deathCnt + livingCnt);
					for (int k = 0; k < N; k++) {
						if (belongs[k] == deathId) {
							belongs[k] = livingId;
						}
					}
				}
			}
		}
		var res = 0;
		for (Map.Entry<Integer, Integer> entry : grpCnt.entrySet()) {
			res = Math.max(res, entry.getValue());
		}
		System.out.println(res);
	}
}
