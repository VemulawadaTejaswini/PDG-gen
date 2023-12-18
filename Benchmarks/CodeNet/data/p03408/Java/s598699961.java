import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] s = new String[N];
		for(int i = 0;i < N;++i)
			s[i] = sc.next();
		int M = sc.nextInt();
		String[] t = new String[M];
		for(int i = 0;i < M;++i)
			t[i] = sc.next();
		sc.close();
		
		Map<String, Integer> sMap = new HashMap<>();
		for(int i = 0;i < N;++i) {
			if(sMap.containsKey(s[i])) {
				Integer cap = sMap.get(s[i]) + 1;
				sMap.remove(s[i]);
				sMap.put(s[i], cap);
			} else {
				sMap.put(s[i], 1);
			}
		}
		Map<String, Integer> tMap = new HashMap<>();
		for(int i = 0;i < M;++i) {
			if(tMap.containsKey(t[i])) {
				Integer cap = tMap.get(t[i]) + 1;
				tMap.remove(t[i]);
				tMap.put(t[i], cap);
			} else {
				tMap.put(t[i], 1);
			}
		}
		
		int ans = 0;
		for(String key : sMap.keySet()) {
			if(tMap.containsKey(key)) {
				if(ans < sMap.get(key) - tMap.get(key))
					ans = sMap.get(key) - tMap.get(key);
			} else {
				if(sMap.get(key) > ans)
					ans = sMap.get(key);
			}
		}
		System.out.println(ans);
	}
}
