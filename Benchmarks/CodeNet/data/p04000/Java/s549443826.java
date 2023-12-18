import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextInt();
		long w = sc.nextInt();
		int n = sc.nextInt();
		HashMap<Long, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
		    int hh = sc.nextInt() - 1;
		    int ww = sc.nextInt() - 1;
		    for (int j = 0; j < 3 && hh - j >= 0; j++) {
		        if (hh - j >= h - 2) {
		            continue;
		        }
		        for (int k = 0; k < 3 && ww - k >= 0; k++) {
		            if (ww - k >= w - 2) {
		                continue;
		            }
		            long key = (hh - j) * w + ww - k;
		            if (map.containsKey(key)) {
		                map.put(key, map.get(key) + 1);
		            } else {
		                map.put(key, 1);
		            }
		        }
		    }
		}
		long[] values = new long[10];
		for (int x : map.values()) {
		    values[x]++;
		}
		values[0] = (h - 2) * (w - 2) - map.size();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
		    sb.append(values[i]).append("\n");
		}
		System.out.print(sb);
   }
}


