import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0 ; i < n ; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0 ; i < n ; i++) {
			int output = 0;
			Map<Integer, Integer> map = new HashMap<>();
			for (int j = 0; j < a.length ; j++) {
				int count = 1;
				if(i != j) {
					if(map.containsKey(a[j])) {
						count = map.get(a[j])+1;
						map.remove(a[j]);
					}
					map.put(a[j], count);
				}
			}
			for(Map.Entry<Integer, Integer> m : map.entrySet()) {
				if(m.getValue() >= 2) {
					for (int k = 1; k < m.getValue() ; k++) {
						output += k;
					}
				}
			}
			System.out.println(output);
		}

	}
}