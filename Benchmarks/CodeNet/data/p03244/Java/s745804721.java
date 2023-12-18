
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	private static final Map<Integer, Integer> vMap_odd = new TreeMap<Integer, Integer>();
	private static final Map<Integer, Integer> vMap_evn = new TreeMap<Integer, Integer>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[] v_evn = new int[n / 2];
		int[] v_odd = new int[n / 2];
		for (int i = 0; i < n / 2; i++) {
			v_odd[i] = Integer.parseInt(scan.next());
			v_evn[i] = Integer.parseInt(scan.next());
		}
		int mode_odd = getMode(v_odd, "odd");
		int mode_evn = getMode(v_evn, "evn");
		if (mode_odd != mode_evn) {
			System.out.println(n-((int)vMap_odd.values().toArray()[0]+(int)vMap_evn.values().toArray()[0]));
			return;
		}
		if (vMap_odd.values().toArray()[0] == vMap_evn.values().toArray()[0]) {
			System.out.println(n / 2);
			return;
		}
		int count_odd = n-((int)vMap_odd.values().toArray()[1]+(int)vMap_evn.values().toArray()[0]);
		int count_evn = n-((int)vMap_odd.values().toArray()[0]+(int)vMap_evn.values().toArray()[1]);
		System.out.println(Math.min(count_odd, count_evn));
	}

	private static int getMode(int[] vArray, String str) {
		Map<Integer, Integer> vMap;
		if (str.equals("odd")) {
			vMap = vMap_odd;
		} else {
			vMap = vMap_evn;
		}
		Integer count = null;
		for (Integer v : vArray) {
			count = vMap.get(v);
			if (count == null) {
				vMap.put(v, new Integer(1));
			} else {
				vMap.put(v, ++count);
			}
		}
		return (int) vMap.keySet().toArray()[0];
	}
}
