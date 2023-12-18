import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		Map<Integer, Integer> map = new TreeMap<>();
		for(int i=0;i<N;i++) {
			int ai = in.nextInt();
			int bi = in.nextInt();
			if(map.containsKey(ai) == false) {
				map.put(ai,bi);
			} else {
				map.put(ai, map.get(ai) + bi);
			}
		}
		Iterator<Integer> it = map.keySet().iterator();
		int num = 0;
		int ans = 0;
		while(it.hasNext()) {
			Integer key = it.next();
			num += map.get(key);
			ans = key;
			if(num >= K) {
				break;
			}
		}
		System.out.println(ans);
	}
}