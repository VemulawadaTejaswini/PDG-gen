import java.util.*;
import java.util.Map.Entry;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pow = new int[30];
		for (int i = 0; i < pow.length; i++) {
			pow[i] = (int) Math.pow(2, i + 1);
		}

		int k = sc.nextInt();
		int[] arr = nextArr(k);
		int res = 0;
		Map<Integer, Integer> m = new HashMap();
		for (int i : arr) {
			m.put(i, 1 + m.getOrDefault(i, 0));
		}

		for (int i : arr) {
			if (m.get(i) == 0)
				continue;
			m.put(i, m.get(i) - 1);

			for (int pp = pow.length - 1; pp >= 0; pp--) {
				int p = pow[pp];
				int j = p - i;
				if (m.containsKey(j) && m.get(j) != 0) {
					m.put(j, m.get(j) - 1);
					res++;
					break;
				}
			}
		}
		System.out.println(res);

	}

	private static int[] nextArr(int k) {
		// TODO Auto-generated method stub
		int[] res = new int[k];
		for (int i = 0; i < k; i++) {

			res[i] = sc.nextInt();
		}
		return res;
	}

}
