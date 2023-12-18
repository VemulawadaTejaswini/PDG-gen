import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		Map<String, Map<Integer, Integer>> cities = new TreeMap<>();
 		for(int i = 0; i < N; i++) {
 			String city = sc.next();
 			int score = Integer.parseInt(sc.next());
			if(!(cities.containsKey(city))) {
				cities.put(city, new TreeMap<>(Comparator.reverseOrder()));
			}
			cities.get(city).put(score, i + 1);
		}
 		sc.close();

 		 for (final Map.Entry<String, Map<Integer, Integer>> e : cities.entrySet()) {
 			 for (Map.Entry<Integer, Integer> e2 : e.getValue().entrySet()) {
 				 System.out.println(e2.getValue());
 			}
 		}

	}
}