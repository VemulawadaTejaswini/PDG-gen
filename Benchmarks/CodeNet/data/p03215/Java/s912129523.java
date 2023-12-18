import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long []a = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();
		long []b = new long[N + 1];
		for(int i = 1; i <= N; i++) {
			b[i] += b[i - 1] + a[i - 1];
		}
		int l = N * (N + 1) / 2;
		long []c = new long[l];
		int idx = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j <= N; j++) {
				c[idx] = b[j] - b[i];
				idx++;
			}
		}
		Arrays.sort(c);
		String []bit = new String[l];
		for(int i = 0; i < l; i++) {
			bit[i] = Long.toBinaryString(c[i]);
		}
//		for(String s : bit) {
//			System.out.println(s);
//		}
//		System.out.println("---------");
		Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
		List<Integer> key = new ArrayList<Integer>();
		for(int i = 0; i < l; i++) {
			String t = bit[i];
			int len = t.length();
			for(int j = 0; j < t.length(); j++) {
				if(t.charAt(j) == '1') {
					if(map.containsKey(len - j)) {
						map.get(len - j).add(t);
					}else {
						List<String> list = new ArrayList<String>();
						list.add(t);
						map.put(len - j, list);
						key.add(len - j);
					}
				}
			}
		}
		Collections.sort(key, Collections.reverseOrder());
		List<String> d = new ArrayList<String>();
		int g = 1000;
		for(int k : key) {
			if(map.get(k).size() >= K) {
				for(String s : map.get(k)) {
					d.add(s);
					g = Math.min(g, s.length());
				}
				break;
			}
		}
		if(d.size() == 0) {
			System.out.println(0);
		}else {
			List<String> d1 = new ArrayList<String>();
			for(int i = 0; i < d.size(); i++) {
				String t = d.get(i);
				d1.add(t.substring(t.length() - g, t.length()));
			}
			int len = d1.get(0).length();
//			for(String t : d1) {
//				System.out.println(t);
//			}
			boolean []id = new boolean[d1.size()];
			for(int i = 0; i < d1.size(); i++) {
				id[i] = true;
			}
			boolean flag = true;
			for(int i = 1; i < len; i++) {
				int cnt = 0;
				for(int j = 0; j < d1.size(); j++) {
					//System.out.println(d1.get(j));
					if(d1.get(j).charAt(i) == '1' && id[j]) {
						cnt++;
					}
				}
				//System.out.println(cnt);
				if(cnt >= K) {
					flag = false;
					for(int j = 0; j < d1.size(); j++) {
						if(d1.get(j).charAt(i) == '0') {
							id[j] = false;
						}
					}
				}
			}
			if(flag) {
				System.out.println((long)Math.pow(2, len - 1));
			}else {
				long ans = (long)Math.pow(2, 50) - 1;
				for(int i = 0; i < d1.size(); i++) {
					if(id[i]) {
						ans = ans & Long.parseLong(d1.get(i), 2);
					}
				}
				System.out.println(ans);
			}
		}
	}
}