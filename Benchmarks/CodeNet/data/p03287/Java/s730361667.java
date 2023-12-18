import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

	public class Main {

		static long mod = 1000000007;

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String[] t = sc.nextLine().split(" ");
			int  n = Integer.parseInt(t[0]);
			long m = Long.parseLong(t[1]);

			String[] r = sc.nextLine().split(" ");
			long[] list = new long[n];
			long amari  = 0;
			Map<Long, Long> map = new HashMap<>();
			map.put(0L, 1L);
			long sum = 0;
			for(int i = 0 ; i < n; i ++) {
				list[i] = Integer.parseInt(r[i]);
				sum  += list[i];
				amari = sum % m;

				if(map.containsKey(amari)) {
					map.put(amari, map.get(amari) + 1);
				}else {
					map.put(amari,1L);
				}
			}

			int cnt = 0;
			for(Entry<Long, Long> e : map.entrySet()){

				long x = e.getValue();
				cnt += (x  * (x - 1)) / 2;
				System.out.println(x);
			}
			System.out.println(cnt);
		}
	}