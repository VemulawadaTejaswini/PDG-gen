import java.util.ArrayList;
import java.util.HashMap;
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
		Map<String, Integer> waMap = new HashMap<String, Integer>();
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
				if (waMap.containsKey(num+"WA")) {
					waMap.put(num+"WA", waMap.get(num+"WA") + 1);
				}else {
					waMap.put(num+"WA", 1);
				}
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
				wrong -= waMap.get(x+"WA");
			}
		}
		System.out.println(accepted+" "+wrong);
	}
}
