import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S[] = new String[N];
		Map<String, Integer> map = new HashMap<String, Integer>();
		int max_cnt = 1;
		for(int i = 0; i < N; i++) {
			S[i] = sc.next();
			if(map.containsKey(S[i])) {
				map.put(S[i], map.get(S[i]) + 1);
				max_cnt = Math.max(max_cnt, map.get(S[i]));
			} else {
				map.put(S[i], 1);
			}
		}
		
		ArrayList<String> ary = new ArrayList<String>();
		for(String key : map.keySet()) {
			if(map.get(key) == max_cnt) {
				ary.add(key);
			}
		}
		Collections.sort(ary);
		for(int i = 0; i < ary.size(); i++) {
			System.out.println(ary.get(i));
		}
	}
}
