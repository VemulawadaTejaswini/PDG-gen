import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		Map<Integer, TreeMap<Integer, Integer>> map = new LinkedHashMap<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int P = sc.nextInt();
			int Y = sc.nextInt();
			list.add(new Point(P, Y));
			TreeMap<Integer, Integer> treeMap;
			if (map.containsKey(P)) {
				treeMap = map.get(P);
			} else {
				treeMap = new TreeMap<Integer, Integer>();
			}
			treeMap.put(Y, 0);
			map.put(P, treeMap);
		}
		for (Entry<Integer, TreeMap<Integer, Integer>> item : map.entrySet()) {
			int index = 0;
			Iterator<Entry<Integer, Integer>> iterator = item.getValue().entrySet().iterator();
			while (iterator.hasNext()) {
				iterator.next().setValue(++index);
			}
		}
		for (Point point : list) {
			System.out.println(String.format("%06d%06d", point.x, map.get(point.x).get(point.y)));
		}
	}
}
