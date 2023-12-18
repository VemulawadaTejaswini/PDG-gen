import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int N = sc.nextInt(),
				ans[] = new int[N],
				M =sc.nextInt() ;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		Arrays.fill(ans, 0);
		boolean f = true;
		for (int i = 0; i < M; i++) {
			int temp = sc.nextInt(),
					temp1 = sc.nextInt();
			if (m.containsKey(temp)) {
				if(m.get(temp) != temp1) {
					f = false;
					break;
				}
			}else
			m.put(temp, temp1);
		}
		m.forEach((k, v) -> {
			ans[k - 1] = v;
		});
		if (ans[0] == 0)
			f = false;
		if (f) {
			for (int i = 0; i < N; i++) {
				System.out.print(ans[i]);
			}
		} else {
			System.out.println(-1);
		}
	}
}