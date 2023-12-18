import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt();
		Map<Integer,String> ac = new TreeMap<>();
		Map<Integer,String> wa = new TreeMap<>();
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
				if (!wa.containsKey(num)) {
					if (!ac.containsKey(num)) {
						wrong++;
					}
					wa.put(num, val);
				}
			}
		}
		System.out.println(accepted+" "+wrong);
	}

}
