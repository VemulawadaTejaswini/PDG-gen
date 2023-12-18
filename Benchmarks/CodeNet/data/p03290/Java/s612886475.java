import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] dg = br.readLine().split(" ");
		int d = Integer.parseInt(dg[0]);
		int g = Integer.parseInt(dg[1]);

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < d; i++) {
			map.put(new Integer((i + 1) * 100), br.readLine());
		}

		ArrayList<Integer> list = new ArrayList<Integer>();

		defs(map, list, g, 0);

		Collections.sort(list);

		System.out.println(list.get(0));

	}

	public static void defs(HashMap<Integer, String> map, ArrayList<Integer> list, int g, int count) {
		Set<Integer> set = map.keySet();
		for (Integer point : set) {
			int gc = g;
			int countc = count;
			String[] pointinfo = map.get(point).split(" ");
			int monsuu = Integer.parseInt(pointinfo[0]);
			int bonus = Integer.parseInt(pointinfo[1]);
			for (int i = 0; i < monsuu; i++) {
				gc -= point;
				countc++;
				if (gc <= 0) {
					list.add(countc);
					continue;
				}
			}
			gc -= bonus;
			if (gc <= 0) {
				list.add(countc);
				continue;
			}
			HashMap<Integer, String> newmap = new HashMap<Integer, String>(map);
			newmap.remove(point);
			defs(newmap, list, gc, countc);
		}
	}

}