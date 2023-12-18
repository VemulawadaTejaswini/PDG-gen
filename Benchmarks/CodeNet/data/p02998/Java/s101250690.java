import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer,Set<Integer>> points = new HashMap<>();
		for (int i = 0; i < n; i++) {
			Integer x = sc.nextInt();
			Set<Integer> ySet = points.get(x);
			if (Objects.isNull(ySet)) {
				ySet = new HashSet<>();
				points.put(x, ySet);
			}
			ySet.add(sc.nextInt());
		}

		addPoint(points);

		int count = 0;
		for (Integer x : points.keySet()) {
			count += points.get(x).size();
		}
		System.out.println(count - n);
	}

	private static void addPoint(Map<Integer,Set<Integer>> points) {
		for (Integer x : points.keySet()) {
			Set<Integer> ySet = points.get(x);
			for (Integer compX : points.keySet()) {
				if (x == compX) continue;
				Set<Integer> compYSet = points.get(compX);
				boolean dupF = false;
				for (Integer compY : compYSet) {
					if (ySet.contains(compY)) {
						dupF = true;
						break;
					}
				}
				if (dupF) {
					ySet.addAll(compYSet);
					compYSet.addAll(ySet);
				}
			}
		}
	}
}
