import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			scanner.nextLine();
			char[] s = scanner.nextLine().toCharArray();
			List<Result> list = new ArrayList<>();
			int max = 0;
			boolean isOne;
			if (s[0] == '0') {
				list.add(new Result(k, 0, 0));
				isOne = true;
			} else {
				isOne = false;
			}
			for (int i = 0; i < s.length; i++) {
				if (isOne && ('0' == s[i])) {
					for (int j = 0; j < list.size(); j++) {
						Result result = list.get(j);
						if (result.k > 0) {
							result.k--;
						} else {
							result.count = i - result.start;
							if (result.count > max) {
								max = result.count;
							}
							list.remove(j);
							j--;
						}
					}
					isOne = false;
				} else if (!isOne && ('1' == s[i])) {
					if (i < n - max) {
						list.add(new Result(k, i, 0));
					}
					isOne = true;
				}
			}
			if (!list.isEmpty()) {
				Result result = list.get(0);
				result.count = n - result.start;
				if (result.count > max) {
					max = result.count;
				}
			}
			System.out.println(max);
		}
	}

	private static class Result {
		int k;
		int start;
		int count;

		Result(int k, int start, int count) {
			super();
			this.k = k;
			this.start = start;
			this.count = count;
		}

		@Override
		public String toString() {
			return "k=" + k + ",start=" + start + ",count=" + count;
		}
	}
}
