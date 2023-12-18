import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	static List<String> values = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String sn = r.readLine();
		String sp = r.readLine();
		String sq = r.readLine();

		int n = Integer.parseInt(sn);
		int[] p = Arrays.stream(sp.split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
		int[] q = Arrays.stream(sq.split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();

		init(n);

		int a = order(p);
		int b = order(q);
//		System.out.println(a);
//		System.out.println(b);
		System.out.println(Math.abs(a - b));

		r.close();
	}

	public static void init(int num) {
		List<Integer> ary = IntStream.range(1, num + 1).mapToObj(i -> Integer.valueOf(i)).collect(Collectors.toList());
		make(ary);
		values.sort(Comparator.naturalOrder());
	}

	public static void make(List<Integer> data) {
		// 候補の配列
		List<Integer> candidate = new ArrayList<>(data);
		// 順列の配列
		List<Integer> perm = new ArrayList<>();
		_make(candidate, perm);
	}

	private static void _make(List<Integer> candidate, List<Integer> perm) {
		if (candidate.size() == 0) {
			// 候補が無くなったらpermに順列が出来ているので
//			System.out.println(perm.toString());
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < perm.size(); ++i) {
				sb.append(perm.get(i));
			}
			values.add(sb.toString());
		}

		// candidateの全ての文字を一つずつピックアップして
		for (int i = 0; i < candidate.size(); i++) {
			List<Integer> p = new ArrayList<>(perm);
			List<Integer> c = new ArrayList<>(candidate);
			p.add(c.get(i));
			c.remove(i);
			_make(c, p);
		}
	}

	public static int order(int[] nums) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nums.length; ++i) {
			sb.append(nums[i]);
		}
		String key = sb.toString();

		return values.indexOf(key);
	}
}