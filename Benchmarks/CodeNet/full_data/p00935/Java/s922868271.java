import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] seq = new int[n];
		long ret = 0;
		HashMap<String, Integer> subseq = new HashMap<String, Integer>();

		for (int i = 0; i < seq.length; i++) {
			seq[i] = in.nextInt();
		}

		for (int k = 1; k <= n; k++) {
			ret = 0;
			int left = 0;
			int right = left + k - 1;
			//System.out.println("<??????" + k + "?????¨????????????>");
			while (right < n) {
				String sub = subseq(seq, left, right);
				subseq.put(sub, 0);
				//System.out.println("sub : " + sub);
				left++;
				right++;
			}

		}

		while (true) {
			if (!subseq.containsKey(String.valueOf(ret))) {
				System.out.println(ret);
				return;
			}
			ret++;
		}
	}

	static String subseq(int[] seq, int left, int right) {
		String ret = "";
		StringBuilder sb = new StringBuilder("");
		for (int i = left; i <= right; i++) {
			sb.append(String.valueOf(seq[i]));
		}
		return sb.toString();
	}
}