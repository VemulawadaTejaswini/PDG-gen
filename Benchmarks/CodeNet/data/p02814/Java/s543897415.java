import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	long M;
	List<Long> A;
	Map<Long, List<Long>> soinsuu;
	long result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Long.parseLong(tokens[1]);
		tokens = in.readLine().split(" ");
		A = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			A.add(Long.parseLong(tokens[i]));
		}
		A = A.stream().distinct().sorted().collect(Collectors.toList());
	}

	List<Long> soinnsuuBunkai(Long val) {
		if (val == 2 || val == 3 || val == 5) {
			List<Long> list = new ArrayList<>();
			list.add(val);
			return list;
		} else {
			for (long i = 2; i < Math.sqrt(val) + 1; ++i) {
				if (val % i == 0) {
					List<Long> list = soinnsuuBunkai(val / i);
					list.add(i);
					return list;
				}
			}
			List<Long> list = new ArrayList<>();
			list.add(val);
			return list;
		}
	}

	boolean check() {
		Set<Integer> counts = new HashSet<>();
		for (List<Long> list : this.soinsuu.values()) {
			int count = 0;
			for (int i = 0; i < list.size(); ++i) {
				if (list.get(i) == 2) {
					++count;
				} else {
					break;
				}
			}
			counts.add(count);
		}
		if(counts.size() > 1) {
			return false;
		}else {
			return true;
		}
	}

	Map<Integer, Integer> count(List<Long> soinsuu) {
		Map<Integer, Integer> result = new HashMap<>();
		for (long val : soinsuu) {
			int key = (int) val;
			if (!result.containsKey(key)) {
				result.put(key, 1);
			} else {
				result.put(key, result.get(key) + 1);
			}
		}
		return result;
	}

	long getGcd() {
		Map<Integer, Integer> soinsuues = new HashMap<>();
		for (List<Long> list : this.soinsuu.values()) {
			Map<Integer, Integer> map = this.count(list);
			for (Integer key : map.keySet()) {
				if (!soinsuues.containsKey(key)) {
					soinsuues.put(key, map.get(key));
				} else {
					soinsuues.put(key, Math.max(soinsuues.get(key), map.get(key)));
				}
			}
		}
		long result = 1;
		for (Integer key : soinsuues.keySet()) {
			result *= (long) Math.pow(key, soinsuues.get(key));
		}
		return result;
	}

	void calc() {
		this.soinsuu = new HashMap<>();
		for (Long a : A) {
			List<Long> list = soinnsuuBunkai(a);
			Collections.sort(list);
			this.soinsuu.put(a, list);
		}
		boolean enable = check();
		if (!enable) {
			return;
		}

		long gcd = getGcd();
		result = (M + gcd / 2) / gcd;

	}

	void showResult() {
		System.out.println(result);
	}
}