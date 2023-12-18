import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<Integer ,Integer> map = new IdentityHashMap<Integer ,Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Integer[] array = new Integer[m];
		sc.nextLine();
		for (int i = 0; i < m; i++) {
			Integer a = new Integer(sc.nextInt());
			Integer b = new Integer(sc.nextInt());
			if (a == 1 || a == n || b == 1 || b == n) {
				if (b < a) {
					map.put(b, a);
					array[i] = b;
				} else {
					map.put(a, b);
					array[i] = a;
				}
			} else {
				array[i] = 100;
			}
			sc.nextLine();
		}
		sc.close();
		Arrays.sort(array);
		String result = "IMPOSSIBLE";
		boolean stopFlag = false;
		for (Integer intI : array) {
			if (intI == 1) {
				int middle = map.get(intI);
				for (Integer intSubI : array) {
					if (intSubI == middle) {
						int end = map.get(intSubI);
						if (end == n) {
							result = "POSSIBLE";
							stopFlag = true;
							break;
						}
					}
				}
			} else {
				break;
			}
			if (stopFlag) {
				break;
			}
		}
		System.out.println(result);
	}
}