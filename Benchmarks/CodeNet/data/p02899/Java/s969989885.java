import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i < N;i++) {
			map.put(i+1, A[i]);
		}
		Map<Integer,Integer> resultMap = map.entrySet().stream()
				.sorted(Map.Entry.<Integer,Integer>comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		for(Map.Entry<Integer, Integer> sorted : resultMap.entrySet()) {
			System.out.print(sorted.getKey() + " ");
		}
	}
}