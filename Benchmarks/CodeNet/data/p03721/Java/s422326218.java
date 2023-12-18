import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		Map<Long, Long> map = new TreeMap<>();
		for(int i=0;i<N;i++) {
			Long ai = in.nextLong();
			Long bi = in.nextLong();
			if(map.containsKey(ai) == false) {
				map.put(ai,bi);
			} else {
				map.put(ai, map.get(ai) + bi);
			}
		}
		Iterator<Long> it = map.keySet().iterator();
		Long num = new Long(0);
		Long ans = new Long(0);
		while(it.hasNext()) {
			Long key = it.next();
			num += map.get(key);
			ans = key;
			if(num >= K) {
				break;
			}
		}
		System.out.println(ans);
	}
}