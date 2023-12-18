import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long K = sc.nextInt();

		int[] a = new int[N];
		int[] b = new int[N];
		Map<Integer, Long> map = new HashMap<Integer, Long>();
		
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			long value = b[i];
			if (map.containsKey(a[i])) {
				value += (long)map.get(a[i]);
			}
			map.put(a[i], value);
		}
		
		Object[] keys = map.keySet().toArray();
		Arrays.sort(keys);
		
		for (int i = 0; i < keys.length; i++) {
			
			K -= (long)map.get(keys[i]);
			if (K <= 0) {
				System.out.println(keys[i]);
				return;
			}
		}		
	}
}