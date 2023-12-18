
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	private static Map<Integer, Integer> vMap_odd = new HashMap<Integer, Integer>();
	private static Map<Integer, Integer> vMap_evn = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[] v_evn = new int[n / 2];
		int[] v_odd = new int[n / 2];
		for (int i = 0; i < n / 2; i++) {
			v_odd[i] = Integer.parseInt(scan.next());
			v_evn[i] = Integer.parseInt(scan.next());
		}
		createModeMap(v_odd, "odd");
		createModeMap(v_evn, "evn");
		int mode_odd = (int) vMap_odd.keySet().toArray()[0];
		int mode_evn = (int) vMap_evn.keySet().toArray()[0];
		int freq_odd = (int) vMap_odd.values().toArray()[0];
		int freq_evn = (int) vMap_evn.values().toArray()[0];
		//最頻値が異なる場合
		if (mode_odd != mode_evn) {
			System.out.println(n - (freq_odd + freq_evn));
			return;
		}
		//すべて同じ値の場合
		if (freq_odd == freq_evn && freq_odd == n / 2) {
			System.out.println(n / 2);
			return;
		}
		//最頻値が同じで、出現回数が異なる場合
		int count_odd; // 奇数列の2番目の最頻値を用いた場合
		int count_evn; // 偶数列の2番目の最頻値を用いた場合
		int freq_odd_second;
		int freq_evn_second;
		if (freq_odd != n / 2) {
			freq_odd_second = (int) vMap_odd.values().toArray()[1];
			count_odd = n - (freq_odd_second + freq_evn);
		} else { //奇数列の最頻値が１種類であった場合
			count_odd = n - (int) vMap_evn.values().toArray()[1];
		}
		if (freq_evn != n / 2) {
			freq_evn_second = (int) vMap_evn.values().toArray()[1];
			count_evn = n - (freq_odd + freq_evn_second);
		} else { //偶数列の最頻値が１種類であった場合
			count_evn = n - (int) vMap_odd.values().toArray()[1];
		}
		System.out.println(Math.min(count_odd, count_evn));
	}

	private static void createModeMap(int[] vArray, String str) {
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
		if (str.equals("odd")) {
			vMap_odd = vMap.entrySet().stream()
					.sorted(Entry.<Integer, Integer> comparingByValue().reversed())
					.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		} else {
			vMap_evn = vMap.entrySet().stream()
					.sorted(Entry.<Integer, Integer> comparingByValue().reversed())
					.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		}
	}
}
