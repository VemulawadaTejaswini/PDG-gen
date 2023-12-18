import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(bf.readLine());

			Map<String, Integer> sMap = new TreeMap<String, Integer>();
			List<Map<Integer, Integer>> pMapList = new ArrayList<Map<Integer, Integer>>();
			for (int i = 1; i <= n; i++) {
				String[] input = bf.readLine().split(" ");
				String s = input[0];
				int p = Integer.parseInt(input[1]);

				Map<Integer, Integer> pMap;
				if (sMap.containsKey(s)) {
					pMap = pMapList.get(sMap.get(s));
				} else {
					pMap = new TreeMap<Integer, Integer>(new Comparator<Integer>() {

						@Override
						public int compare(Integer o1, Integer o2) {
							return o2.compareTo(o1);
						}
					});
					sMap.put(s, pMapList.size());
					pMapList.add(pMap);
				}
				pMap.put(p, i);
			}

			for (Map.Entry<String, Integer> sEnt : sMap.entrySet()) {
				for (Map.Entry<Integer, Integer> pEnt : pMapList.get(sEnt.getValue()).entrySet()) {
					System.out.println(pEnt.getValue());
				}
			}
		} catch (Exception e) {
		}
	}
}
