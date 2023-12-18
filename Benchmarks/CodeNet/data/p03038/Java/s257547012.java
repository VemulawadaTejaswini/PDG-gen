


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i=0;i<n;i++) {
			int a = sc.nextInt();
			int x = map.containsKey(a) ? map.get(a) : 0;

			map.put(a, x+1);
		}

		for (int i=0;i<m;i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();

			int pos = map.firstKey();
			while (b>0 && pos<c) {
				int d = map.get(pos);
				if (b>=d) {
					
					map.remove(pos);
					int x = map.containsKey(c) ? map.get(c) : 0;
					map.put(c, x+d);
					pos=map.higherKey(pos);
					b-=d;
				} else {
					
					map.put(pos, d-b);
					int x = map.containsKey(c) ? map.get(c) : 0;
					map.put(c, x+b);
					
					b=0;
				}
			}
		}
		
		long ans = 0;
		
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			ans += (long)e.getKey() * (long)e.getValue();
		}

		System.out.println(ans);
	}
}




