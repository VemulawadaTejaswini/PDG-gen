import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		Map<Integer,Integer> map = new HashMap<>();
		int N = in.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = in.nextInt();
			int a = map.getOrDefault(A[i], -1);
			map.put(A[i], a+1);
		}

		Map<Integer,Long> answers = new HashMap<>();
		for(int target: map.keySet()) {
			long answer =0L;
			for(int key:map.keySet()) {
				long val = map.get(key);
				if(key == target) {
					val -= 2;
				}else {
					val -= 1;
				}
				if(val <= 0) continue;
				answer += val * (val+1L) /2L;
			}
			answers.put(target, answer);
		}

		for(int a: A) {
			System.out.println(answers.get(a));
		}
	}

	static BigInteger bigFactorial (int n) {
		BigInteger[] ar = new BigInteger[n];
		for (int i=0; i<n; i++) {
			ar[i] = BigInteger.valueOf(i+1);
		}
		int t = 1, length = ar.length;
		while (t <= length) {
			for (int i=0; i<length; i+=(t<<1)) {
				if (t+i < length) {
					ar[i] = ar[i].multiply(ar[i+t]);
				}
			}
			t = t<<1;
		}
		return ar[0];
	}

	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}