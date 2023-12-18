import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] aArray = new int[n];
		for (int i = 0; i < n; i++) {
			aArray[i] = scan.nextInt();
		}
		scan.close();

		int count = 0;
		long sum = 0L;
		Map<Long, Integer> sumMap = new HashMap<>();
		sumMap.put(0L, 1);
		for (int i = 0; i < n; i++) {
			sum += aArray[i];
			if (sumMap.containsKey(sum)) {
				count += sumMap.get(sum);
			} else {
				sumMap.put(sum, 0);
			}
			sumMap.put(sum, sumMap.get(sum) + 1);
		}
		System.out.println(count);
	}
}
