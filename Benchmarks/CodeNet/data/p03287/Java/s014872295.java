
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		long[] a = new long[n + 1];
		long[] sum = new long[n + 1];
		sum[0] = 0;
		for(int i = 1; i < n + 1; i++) {
			a[i] = sc.nextLong();
			sum[i] = sum[i - 1] + a[i];
		}
		Map<Long, Long> div = new HashMap<>();
		for(int i = 1; i < n + 1; i++) {
			long x = sum[i] % m;
			if(div.containsKey(x)) {
				long val = div.get(x);
				val++;
				div.put(x, val);
			} else {
				div.put(x, (long) 1);
			}
		}
		long cnt = 0;
		for(Map.Entry<Long, Long> e : div.entrySet()) {
			long num = e.getValue();
			if(num >= 2) {
				cnt += num * (num - 1) / 2;
			}
		}
		System.out.println(cnt);
	}

}
