
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	Map<Long, Long> m = new HashMap<Long,Long>();
	Map<Long, Long> ansm = new HashMap<Long,Long>();
	Map<Long, Long> ansm2 = new HashMap<Long,Long>();
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		long sum = 0;
		for(int i=0; i<n; i++) {
			long l = sc.nextLong();
			a[i]=l;
			m.put(l, m.containsKey(l) ? m.get(l)+1 : 1);
		}
		for(Map.Entry<Long, Long> e : m.entrySet()) {
			long key = e.getKey();
			long value = e.getValue();
			sum += (value)*(value-1)/2;
			ansm.put(key, (value)*(value-1)/2);
			ansm2.put(key, (value-1)*(value-2)/2);
		}
		for(int i=0; i<n; i++) {
			long l = a[i];
			long ans = sum;
			ans -= ansm.get(l);
			ans += ansm2.get(l);
			System.out.println(ans);
		}
		sc.close();
	}


}
