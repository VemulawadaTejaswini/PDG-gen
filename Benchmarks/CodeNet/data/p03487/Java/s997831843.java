import java.util.*;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();
		Map<Integer, Integer> numCountMap = new HashMap<>();
		for (int i = 0; i < inN; i++) {
			int inA = stdin.nextInt();
			int count = numCountMap.getOrDefault(inA, 0) + 1;
			numCountMap.put(inA, count);
		}

		int sum = 0;
		for (Map.Entry<Integer, Integer> element : numCountMap.entrySet()) {
			int num = element.getKey();
			int count = element.getValue();

			if (num > count) {
				sum += count;
			}
			else if (num < count) {
				sum += (count - num);
			}
		}

		System.out.println(sum);
	}

}
