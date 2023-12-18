import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		Map<Integer, Integer> countMap = new HashMap<>();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			arr[i] = a;
			if (countMap.containsKey(a)) {
				countMap.replace(a, (countMap.get(a) + 1));
			} else {
				countMap.put(a, 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			long res = 0;
			for (int k : countMap.keySet()) {
				int c = countMap.get(k);
				c = (k == arr[i]) ? c - 1: c;
				
				for (int j = 1; j < c; j++) {
					res += j;
				}
			}
			System.out.println(res);
		}
	}

}
