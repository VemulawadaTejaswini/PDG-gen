
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		for(int i=0; i<n; i++) {
			long v = sc.nextLong();
			if(map.containsKey(v)) {
				map.put(v, map.get(v)+1);
			} else {
				map.put(v, 1L);
			}
		}
		long cnt = 0;
		for(Entry<Long, Long> v : map.entrySet()) {
			if(v.getValue() < v.getKey()) {
				cnt += v.getValue();
			} else {
				cnt += v.getValue()-v.getKey();
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
