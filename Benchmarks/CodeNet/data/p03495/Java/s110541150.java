import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i < N;i++) {
			if(map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i])+1);
			}else {
				map.put(A[i], 1);
			}
		}
		int j = 0;
		int[] cnt = new int[map.size()];
		for(Map.Entry<Integer, Integer> bar: map.entrySet()) {
			cnt[j] = bar.getValue();
			j++;
		}
		Arrays.sort(cnt);
		int ans = 0;
		if(N - K - cnt.length > 0) {
			for(int i = 0;i < N - K - cnt.length;i++) {
				ans += cnt[i];
			}
		}else if(N - K - cnt.length == 0) {
			ans += cnt[0];
		}
		System.out.println(ans);
	}
}