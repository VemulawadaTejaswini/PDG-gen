import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		ArrayList<Integer> list = new ArrayList<>();
		str = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(str[i]));
		}

		List<?> ret = combination(list, k);

		long sum = 0;
		for (int i = 0; i < ret.size(); i++) {
			long max = Integer.MIN_VALUE;
			long min = Integer.MAX_VALUE;

			String s = ret.get(i).toString();
			s = s.substring(1, s.length() - 1);
			s = s.replaceAll(" ", "");

			str = s.split(",");
			for (int j = 0; j < str.length; j++) {
				max = Math.max(max, Long.parseLong(str[j]));
				min = Math.min(min, Long.parseLong(str[j]));
			}

			sum += (max - min) % 1000000007;
		}

		System.out.println(sum % 1000000007);

	}

	public static List<List<String>> combination(List list, int count) {
		List ret = new ArrayList<List<String>>();
		for (int i = 0; i < list.size(); i++) {
			if (i + count > list.size()) {
				break;
			}
			Stack stack = new Stack<String>();
			stack.push(list.get(i));
			_combination(ret, list, stack, i + 1, count);
		}
		return ret;
	}

	private static void _combination(List ret, List list, Stack stack, int index, int count) {
		for (int i = index; i < list.size(); i++) {
			stack.push(list.get(i));
			if (stack.size() == count) {
				ret.add(Arrays.asList(stack.toArray()));
				stack.pop();
				continue;
			}
			_combination(ret, list, stack, i + 1, count);
			stack.pop();
		}
	}

}