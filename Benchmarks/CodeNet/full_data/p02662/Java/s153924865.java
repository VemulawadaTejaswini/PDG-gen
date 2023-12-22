import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		long A[] = new long[S];
		List<Map<Integer, Integer>> list = new ArrayList<Map<Integer, Integer>>();
		long sum = 0;
		for (int i = 0; i < N; i++) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			list.add(map);
			int temp = sc.nextInt();
			A[i] = temp;
			if (temp > S) {
				continue;
			}
			for (int j = i - 1; j >= 0; j--) {
				Map<Integer, Integer> t = list.get(j);
				Set<Integer> set = t.keySet();
				for (Integer in : set) {
					int s = t.get(in);
					if (in + temp <= S) {
						Map<Integer, Integer> t1 = list.get(j + 1);
						if (t1.get(in + temp) != null) {
							Integer in2 = t1.get(in + temp);
							t1.put(in + temp, in2 + s);
						} else {
							t1.put(in + temp, s);
						}
					}
				}
			}
			Map<Integer, Integer> zero = list.get(0);
			if (zero.get(temp) != null) {
				Integer in2 = zero.get(temp);
				zero.put(temp, in2 + 1);
			} else {
				zero.put(temp, 1);
			}
		}
		for (int i=0;i<N;i++) {
			Map<Integer, Integer> t = list.get(i);
			if (t.get(S)!=null) {
				Integer in = t.get(S);
				sum = (sum + (in *Main.count(N-i-1))%998244353)%998244353;
			}
		}
		System.out.println(sum);
	}

	public static long count(long a) {
		long temp = 1;
		for (int i = 0; i < a; i++) {
			temp = (temp * 2) % 998244353;
		}
		return temp;
	}
}