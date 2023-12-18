
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Map<Integer, Long>> list = new HashMap<>();
		for(int i = 1; i < N + 1; i++) {
			list.put(i, new HashMap<>());
		}
		int[] ans = new int[N + 1];
		for(int i = 1; i < N + 1; i++) {
			ans[i] = 0;
		}
		while(sc.hasNext()) {
			int bf = sc.nextInt();
			int af = sc.nextInt();
			long we = sc.nextLong();
			Map<Integer, Long> tmp = list.get(bf);
			tmp.put(af, we);
			for(Map.Entry<Integer, Long> entry : list.get(af).entrySet()) {
				tmp.put(entry.getKey(), entry.getValue() + we);
			}
			list.put(bf, tmp);
			tmp = list.get(af);
			for(Map.Entry<Integer, Long> entry : list.get(bf).entrySet()) {
				tmp.put(entry.getKey(), entry.getValue() + we);
			}
			tmp.put(bf, we);
			list.put(af, tmp);
		}
		for(int i = 1; i < N + 1; i++) {
			if(list.containsKey(i)) {
				Map<Integer, Long> tmp = list.get(i);
				for(Map.Entry<Integer, Long> entry : tmp.entrySet()) {
					if(entry.getValue() % 2 == 1) {
						ans[entry.getKey()] = 1;
					}
					list.remove(entry.getKey());
				}
				list.remove(i);
			}
		}
		for(int i = 1; i < N + 1; i++) {
			System.out.println(ans[i]);
		}
	}

}
