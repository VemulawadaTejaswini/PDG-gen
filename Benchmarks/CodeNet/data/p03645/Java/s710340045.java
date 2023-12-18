import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		Map<Integer ,Integer> map = new IdentityHashMap<Integer ,Integer>(m);
		ArrayList<Integer> list = new ArrayList<Integer>(m);
		for (int i = 0; i < m; i++) {
			Integer a = new Integer(sc.nextInt());
			Integer b = new Integer(sc.nextInt());
			if (b < a) {
				map.put(b, a);
				list.add(b);
			} else {
				map.put(a, b);
				list.add(a);
			}
			sc.nextLine();
		}
		sc.close();
		String result = "IMPOSSIBLE";
		boolean stopFlag = false;
		for (Integer intI : list) {
			if (intI == 1) {
				int middle = map.get(intI);
				for (Integer intSubI : list) {
					if (intSubI == middle) {
						int end = map.get(intSubI);
						if (end == n) {
							result = "POSSIBLE";
							stopFlag = true;
							break;
						}
					}
					if (stopFlag) {
						break;
					}
				}
			}
			if (stopFlag) {
				break;
			}
		}
		System.out.println(result);
	}
}