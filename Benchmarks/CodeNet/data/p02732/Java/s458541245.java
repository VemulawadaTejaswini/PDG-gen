
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
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		for(int i=0; i<n; i++) {
			long l = sc.nextLong();
			a[i]=l;
			m.put(l, m.containsKey(l) ? m.get(l)+1 : 1);
		}
		for(Map.Entry<Long, Long> e : m.entrySet()) {
			long key = e.getKey();
			long value = e.getValue();
			ansm.put(key, (value)*(value-1)/2);
		}
		for(int i=0; i<n; i++) {
			long l = a[i];
			long ans = 0;
			for(Map.Entry<Long, Long> e : ansm.entrySet()) {
				if(e.getKey()!=l) {
					ans += e.getValue();
				}else {
					long value = m.get(e.getKey()) ;
					value--;
					ans += (value)*(value-1)/2;
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}


}
