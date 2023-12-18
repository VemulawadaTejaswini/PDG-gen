
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int count = 0;

		Map<Integer, Integer> nedan = new HashMap<>();
		Map<Integer, Integer> arugo1 = new HashMap<>();
		Map<Integer, Integer> arugo2 = new HashMap<>();
		Map<Integer, Integer> arugo3 = new HashMap<>();
		Map<Integer, Integer> arugo4 = new HashMap<>();
		Map<Integer, Integer> arugo5 = new HashMap<>();
		Map<Integer, Integer> arugo6 = new HashMap<>();
		Map<Integer, Integer> arugo7 = new HashMap<>();
		Map<Integer, Integer> arugo8 = new HashMap<>();
		Map<Integer, Integer> arugo9 = new HashMap<>();
		Map<Integer, Integer> arugo10 = new HashMap<>();
		Map<Integer, Integer> arugo11 = new HashMap<>();
		Map<Integer, Integer> arugo12 = new HashMap<>();
		List<Map<Integer, Integer>> array = Arrays.asList(arugo1, arugo2, arugo3, arugo4, arugo5, arugo6, arugo7,
				arugo8, arugo9, arugo10, arugo11, arugo12);

		for (int ii = 0; ii < n; ii++) {
			nedan.put(ii, sc.nextInt());
			for (int ll = 0; ll < m; ll++) {
				seta(array.get(ll), ii, sc);
			}
			count = count + 1;
		}

		Set<Integer> set = new HashSet<>();

		for (int l = 0; l < m; l++) {
			Map<Integer, Integer> aru = array.get(l);

			aru = aru.entrySet().stream().sorted(Entry.<Integer, Integer> comparingByValue().reversed())
					.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

			int kei = 0;
			for (Entry<Integer, Integer> obj : aru.entrySet()) {
				set.add(obj.getKey());
				kei = kei + obj.getValue();
				if (kei >= x) {
					break;
				}
			}
			if (kei < x) {
				System.out.println("-1");
				sc.close();
				return;
			}
		}

		int kingaku = 0;
		for (Integer i : set) {
			kingaku = kingaku + nedan.get(i);
		}
		System.out.println(kingaku);
		sc.close();
	}

	static void seta(Map<Integer, Integer> arugo, int i, Scanner sc) {
		arugo.put(i, sc.nextInt());
	}

}