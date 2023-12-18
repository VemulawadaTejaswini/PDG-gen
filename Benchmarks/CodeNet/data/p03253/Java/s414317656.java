
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static long N;
	public static long M;
	public static long divide = 1000000007;
	public static Map<Long, Long> div = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextLong();
		while(M != 1) {
			for(long i = 2; i < M + 1; i++) {
				if(M % i == 0) {
					if(div.containsKey(i)) {
						long value = div.get(i);
						div.put(i, value + 1);
					} else {
						div.put(i, 1l);
					}
					M /= i;
					break;
				}
			}
		}
		long ans = 1;
		for(Map.Entry<Long, Long> e : div.entrySet()) {
			ans = (((long) Comb(N + e.getValue() - 1, e.getValue()) % divide) * ans) % divide;
		}
		System.out.println(ans);
	}

	public static double Comb(long i, long j) {
		return Fact(i) / Fact(j) / Fact(i - j);
	}

	public static long Fact(long i) {
		if(i == 1) {
			return 1;
		} else {
			return (i * Fact(i - 1)) % divide;
		}
	}

}
