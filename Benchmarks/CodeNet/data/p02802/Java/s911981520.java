import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt();
		Map<Integer,String> ac = new TreeMap<>();
		Map<Integer,String> wa = new TreeMap<>();
		List<String> waList = new ArrayList<>();
		int wrong = 0, accepted = 0;
		for(int i=0;i<m;i++) {
			int num = s.nextInt();
			String val = s.next();
			if (val.equals("AC")) {
				if (!ac.containsKey(num)) {
					accepted++;
					ac.put(num, val);
				}
			}else {
				waList.add(num+"WA");
				if (!ac.containsKey(num)) {
					wrong++;
				}
				if (!wa.containsKey(num)) {
					wa.put(num, val);
				}
			}
		}
		for(Integer x : wa.keySet()) {
			if (!ac.containsKey(x)) {
				wrong -= find(x+"WA", waList);
			}
		}
		System.out.println(accepted+" "+wrong);
	}

	static int find(String x, List<String> list) {
		int r = 0;
		for (String zString : list) {
			if (zString.equals(x)) {
				r++;
			}
		}
		return r;
	}
}
