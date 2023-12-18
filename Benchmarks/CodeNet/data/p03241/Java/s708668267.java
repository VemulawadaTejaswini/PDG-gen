import java.util.*;

/**
 * Mの素因数分解をする．
 * 
 * 
 * @author glycine
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);

		List<Integer> yakusuu = new ArrayList<>();
		yakusuu.addAll(getSoinsuu(M));
		Collections.sort(yakusuu);
		Collections.reverse(yakusuu);

		if (yakusuu.size() == 1) {
			// 素数
			System.out.println("1");
		} else {
			int result = -1;
			for (int i = 0; i < yakusuu.size(); ++i) {
				if (M / yakusuu.get(i) >= N) {
					result = yakusuu.get(i);
					break;
				}
			}
			// result = calc(M, N);
			System.out.println(result);
		}
		in.close();
	}

	private static int calc(int M, int N) {
		int max = Math.floorDiv(M, N) + 1;
		for (int i = max; i >= 1; --i) {
			if (M % i == 0) {
				return i;
			}
		}
		return max;
	}

	private static Set<Integer> getSoinsuu(int M) {
		Set<Integer> result = new HashSet<>();
		for (int i = 2; i <= Math.sqrt((double) M) + 1; ++i) {
			if (M % i == 0) {
				result.add(i);
				result.addAll(getSoinsuu(M / i));
			}
		}
		return result;
	}
}