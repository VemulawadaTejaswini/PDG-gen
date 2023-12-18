import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Tuple {
		int l, r;

		Tuple(String line) {
			String[] tokens = line.split(" ");
			this.l = Integer.parseInt(tokens[0]);
			this.r = Integer.parseInt(tokens[1]);
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int Q = Integer.parseInt(in.readLine());
		Tuple[] tuples = new Tuple[Q];
		for (int i = 0; i < Q; ++i) {
			tuples[i] = new Tuple(in.readLine());
		}
		// rの最大を求める
		int max = Integer.MIN_VALUE;
		for (Tuple tuple : tuples) {
			max = Math.max(max, tuple.r);
		}
		// ふるいでprimesを求める
		List<Integer> primes = getPrimes(max);
		Set<Integer> set = new HashSet<>();
		set.addAll(primes);
		for (int i = 0; i < tuples.length; ++i) {
			System.out.println(calc(tuples[i], primes, set));
		}

	}

	static int calc(Tuple tuple, List<Integer> primes, Set<Integer> primeSet) {
		int result = 0;
		for (int i = 0; i < primes.size(); ++i) {
			int prime = primes.get(i);
			if (prime < tuple.l || prime > tuple.r) {
				continue;
			}
			if (primeSet.contains((prime + 1) / 2)) {
				++result;
			}
		}
		return result;
	}

	static List<Integer> getPrimes(int max) {
		boolean[] conds = new boolean[max + 1];
		Arrays.fill(conds, true);
		conds[0] = false;
		conds[1] = false;
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= max; ++i) {
			if (!conds[i]) {
				continue;
			}
			primes.add(i);
			// ふるい
			for (int j = i + i; j <= max; j += i) {
				conds[j] = false;
			}
		}
		return primes;
	}
}
