import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N], B = new int[N];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			map.put(B[i], A[i]);
		}
		sc.close();
		map = map.entrySet().stream()
				.sorted(Entry.<Integer,Integer>comparingByValue())
				.collect(Collectors.toMap(Entry::getKey,Entry::getValue,(e1, e2)->e1,LinkedHashMap::new));
		Set<Integer> B2 = map.keySet();
		int M2 = 0;
		int m = 0;
		int[] B3 = new int[N];
        for (int i = 0; i < N; i++) {
        	B3[i] = B2.iterator().next();
			M2 += B3[i];
			if(M2 <= M) {
				m += B3[i] * map.get(B3[i]);
			}else {
				m += (B3[i]-M2+M) * map.get(B3[i]);
			}
		}
		System.out.println(m);
	}

}

