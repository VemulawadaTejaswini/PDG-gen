import java.util.*;
import java.util.regex.*;

public class Main {
	
	public static void main(String... args) {
		System.out.println(findNumber(scanInt()));
	}
	
	private static String findNumber(int N) {
		int[] numbers = new int[N];
		find(calcPrimes(55555), numbers, 0, 0);
		return buildString(numbers);
	}

	private static String buildString(int... nums) {
		StringBuilder buff = new StringBuilder();
		for (int n : nums) {
			if (0 < buff.length()) {
				buff.append(' ');
			}
			buff.append(n);
		}
		return buff.toString();
	}

	private static int find(int[] primes, int[] nums, int n, int p) {
		for (int i = p; i < primes.length - (nums.length - n - 1); ++i) {
			nums[n] = primes[i];
			if (n == nums.length - 1) {
				return isSynthesisAll(nums);
			} else {
				int r = find(primes, nums, n + 1, i + 1);
				if (r < 0 || nums[n] != r) {
					return r;
				}
			}
		}
		return nums[n];
	}
	
	private static final int isSynthesisAll(int[] nums) {
		for (int n0 = 0; n0 < nums.length - 4; ++n0) {
			for (int n1 = n0 + 1; n1 < nums.length - 3; ++n1) {
				for (int n2 = n1 + 1; n2 < nums.length - 2; ++n2) {
					for (int n3 = n2 + 1; n3 < nums.length - 1; ++n3) {
						for (int n4 = n3 + 1; n4 < nums.length - 0; ++n4) {
							if (!isSynthesis(nums[n0], nums[n1], nums[n2], nums[n3], nums[n4])) {
								return nums[n4];
							}
						}
					}
				}
			}
		}
		return -1;
	}
	
	private static final boolean isSynthesis(int... nums) {
		return !isPrime(sum(nums));
	}

	private static final int sum(int... nums) {
		int t = 0;
		for (int n : nums) {
			t += n;
		}
		return t;
	}
	
	private static int[] calcPrimes(int max) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(2);
		for (int i = 3; i <= max; i += 2) {
			if (isPrime(i)) {
				l.add(i);
			}
		}
		int[] a = new int[l.size()];
		for (int i = 0; i < a.length; ++i) {
			a[i] = l.get(i);
		}
		return a;
	}
	
	private static boolean isPrime(int n) {
		if (n % 2 == 0) {
			return false;
		}
		int m = n / 3;
		for (int i = 3; i < m; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static final Scanner SC = new Scanner(System.in);

	private static int scanInt() {
		return SC.nextInt();
	}

	private static  String scanString() {
		return SC.next();
	}
}
