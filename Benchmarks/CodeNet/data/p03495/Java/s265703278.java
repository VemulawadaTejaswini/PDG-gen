import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
		Integer[] cnt = new Integer[map.size()];
		for(Map.Entry<Integer, Integer> bar: map.entrySet()) {
			cnt[j] = bar.getValue();
			j++;
		}
		Arrays.sort(cnt);
		List<Integer> list = Arrays.asList(cnt);
		Collections.reverse(list);
		Integer[] cnt2 = (Integer[])list.toArray(new Integer[map.size()]);
		int sum = 0;

		for(int i = 0;i < (K > cnt2.length ? cnt2.length : K);i++) {
			System.out.println(cnt2[i]);
			sum += cnt2[i];
		}
		System.out.println(N - sum);
	}
}