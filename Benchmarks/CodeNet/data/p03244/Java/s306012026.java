import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


	public class Main {

		static long mod = 1000000007;

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String[] t = sc.nextLine().split(" ");
			int  n = Integer.parseInt(t[0]);
			//long m = Long.parseLong(t[1]);

			Map<Integer, Integer> amap = new TreeMap<>( new Comparator<Integer>() {
		        public int compare(Integer m, Integer n){
		            return ((Integer)m).compareTo(n) * -1;
		        }
		    });
			Map<Integer, Integer> bmap = new TreeMap<>( new Comparator<Integer>() {
		        public int compare(Integer m, Integer n){
		            return ((Integer)m).compareTo(n) * -1;
		        }
		    });
			String[] list       = sc.nextLine().split(" ");
			for(int i = 0; i < n; i ++) {

				int x = Integer.parseInt(list[i]);

				if(i % 2 != 0) {
					if(amap.containsKey(x)) {
						amap.put(x, amap.get(x) + 1);
					}else {
						amap.put(x, 1);
					}
				}else {
					if(bmap.containsKey(x)) {
						bmap.put(x, bmap.get(x) + 1);
					}else {
						bmap.put(x, 1);
					}
				}
			}

			if(amap.size() == 1) {
				amap.put(0, 0);
			}
			if(bmap.size() == 1) {
				bmap.put(0, 0);
			}

			int cnt  = 0;
			int[] ab = new int[4];
			for(int e : amap.keySet()) {

				if(cnt == 2) break;
				else if(cnt == 0)ab[0] = e;
				else ab[1] = e;

				cnt++;
			}
			for(int e : bmap.keySet()) {

				if(cnt == 4) break;
				else if(cnt == 2)ab[2] = e;
				else ab[3] = e;

				cnt++;
			}
			int ans = 0;
			if(ab[0] != ab[2]) {

				ans = n - amap.get(ab[0]) - bmap.get(ab[2]);

			}else if(ab[0] == ab[2]) {
				ans = Math.min(n - amap.get(ab[0]) - bmap.get(ab[3]) , n - amap.get(ab[1]) - bmap.get(ab[2]));
			}

			System.out.println(ans);



		}


	}
