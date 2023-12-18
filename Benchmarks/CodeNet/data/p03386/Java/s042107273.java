import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		in.close();
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);
		int K = Integer.parseInt(tokens[2]);
		Set<Integer> vals = new HashSet<>();
		for (int i = A; i < A + K; ++i) {
			if (i > B) {
				break;
			}
			vals.add(i);
		}
		for (int i = B; i > B - K; --i) {
			if (i < A) {
				break;
			}
			vals.add(i);
		}
		List<Integer> results = new ArrayList<>(vals.size());
		results.addAll(vals);
		Collections.sort(results);
		for (Integer result : results) {
			System.out.println(result);
		}

	}

}